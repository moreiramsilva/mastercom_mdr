package sdk;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mastercard.api.core.exception.ApiException;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.Claims;
import com.mastercard.api.mastercom.Fees;

import common.CommonMsg;

public class CreateFeeSample {
	
	private static final Logger logger = LogManager.getLogger(CreateFeeSample.class.getName());

	public Map<String,Object> start_service(Map<String, Object> mapa) throws Exception {

		logger.info(CommonMsg.INP+mapa);

		if(!"".equals((String) mapa.get("ws068ConsumerKey")) && !"".equals((String) mapa.get("ws068KeyAlias")) && !"".equals((String) mapa.get("ws068KeyStorePassword"))) {
			String consumerKey = (String) mapa.get("ws068ConsumerKey");
			String keyAlias = (String) mapa.get("ws068KeyAlias");
			String keyPassword = (String) mapa.get("ws068KeyStorePassword");

			ClasseDeAutenticacao.Autenticação(consumerKey,keyAlias,keyPassword);			
		}else {
			Map<String,Object> retorno = new HashMap();
			retorno.put("Erro", CommonMsg.COD_STATUS_CRED);
			retorno.put("Message", CommonMsg.MSG_STATUS_CRED);
			return retorno;
		}

		try {

			RequestMap map = new RequestMap();

			if(!"".equals((String) mapa.get("ws068ClaimId"))) {
				map.set("claim-id", (String) mapa.get("ws068ClaimId"));	
			}
			if(!"".equals((String) mapa.get("ws068CardAcepptCode"))) {
				map.set("cardAcceptorIdCode", (String) mapa.get("ws068CardAcepptCode"));	
			}
			if(!"".equals((String) mapa.get("ws068CardNumber"))) {
				map.set("cardNumber", (String) mapa.get("ws068CardNumber"));	
			}
			if(!"".equals((String) mapa.get("ws068CountryCode"))) {
				map.set("countryCode", (String) mapa.get("ws068CountryCode"));	
			}
			if(!"".equals((String) mapa.get("ws068Currency"))) {
				map.set("currency", (String) mapa.get("ws068Currency"));	
			}
			if(!"".equals((String) mapa.get("ws068FeeDate"))) {
				map.set("feeDate", (String) mapa.get("ws068FeeDate"));	
			}
			if(!"".equals((String) mapa.get("ws068DestMember"))) {
				map.set("destinationMember", (String) mapa.get("ws068DestMember"));	
			}
			if(!"".equals((String) mapa.get("ws068FeeAmt"))) {
				map.set("feeAmount", (String) mapa.get("ws068FeeAmt"));	
			}
			if(!"".equals((String) mapa.get("ws068CreditSender"))) {
				map.set("creditSender", (String) mapa.get("ws068CreditSender"));	
			}
			if(!"".equals((String) mapa.get("ws068CreditReceiver"))) {
				map.set("creditReceiver", (String) mapa.get("ws068CreditReceiver"));	
			}
			if(!"".equals((String) mapa.get("ws068Mensage"))) {
				map.set("message", (String) mapa.get("ws068Mensage"));	
			}
			if(!"".equals((String) mapa.get("ws068ReasonCode"))) {
				map.set("reason", (String) mapa.get("ws068ReasonCode"));	
			}

			Fees response = Fees.create(map);

			return response;

		}catch (ApiException e) {
			logger.error(CommonMsg.MC_ERR+e.getHttpStatus()+CommonMsg.MC_MSG+e.getMessage()+CommonMsg.MC_REASON+e.getReasonCode()+CommonMsg.MC_SOURCE+e.getSource(), e);
			Map<String,Object> retorno = new HashMap();
			retorno.put("Erro", e.getHttpStatus());
			retorno.put("Message", e.getMessage()+e.getSource());
			return retorno;
		}
	}
}
