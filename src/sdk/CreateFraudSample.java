package sdk;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mastercard.api.core.exception.ApiException;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.Fraud;
import com.mastercard.api.mastercom.Retrievals;

import common.CommonMsg;

public class CreateFraudSample {
	private static final Logger logger = LogManager.getLogger(CreateFraudSample.class.getName());

	public Map<String,Object> start_service(Map<String, Object> mapa) throws Exception {

		logger.info(CommonMsg.INP+mapa);

		if(!"".equals((String) mapa.get("ws064ConsumerKey")) && !"".equals((String) mapa.get("ws064KeyAlias")) && !"".equals((String) mapa.get("ws064KeyStorePassword"))) {
			String consumerKey = (String) mapa.get("ws064ConsumerKey");
			String keyAlias = (String) mapa.get("ws064KeyAlias");
			String keyPassword = (String) mapa.get("ws064KeyStorePassword");

			ClasseDeAutenticacao.Autenticação(consumerKey,keyAlias,keyPassword);			
		}else {
			Map<String,Object> retorno = new HashMap();
			retorno.put("Erro", CommonMsg.COD_STATUS_CRED);
			retorno.put("Message", CommonMsg.MSG_STATUS_CRED);
			return retorno;
		}

		try {

			RequestMap map = new RequestMap();

			if(!"".equals((String) mapa.get("ws064ClaimId"))) {
				map.set("claim-id", (String) mapa.get("ws064ClaimId"));	
			}
			if(!"".equals((String) mapa.get("ws064AccStatus"))) {
				map.set("acctStatus", (String) mapa.get("ws064AccStatus"));	
			}
			if(!"".equals((String) mapa.get("ws064ChargebackInd"))) {
				map.set("chgbkIndicator", (String) mapa.get("ws064ChargebackInd"));	
			}
			if(!"".equals((String) mapa.get("ws064CvcInvInd"))) {
				map.set("cvcInvalidIndicator", (String) mapa.get("ws064CvcInvInd"));	
			}
			if(!"".equals((String) mapa.get("ws064DeviceType"))) {
				map.set("deviceType", (String) mapa.get("ws064DeviceType"));	
			}
			if(!"".equals((String) mapa.get("ws064FraudType"))) {
				map.set("fraudType", (String) mapa.get("ws064FraudType"));	
			}
			if(!"".equals((String) mapa.get("ws064ReportDate"))) {
				map.set("reportDate", (String) mapa.get("ws064ReportDate"));	
			}
			if(!"".equals((String) mapa.get("ws064SubType"))) {
				map.set("subType", (String) mapa.get("ws064SubType"));	
			}


			Fraud response = Fraud.createForMasterCard(map);

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
