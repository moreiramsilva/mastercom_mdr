package sdk;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mastercard.api.core.exception.ApiException;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.Claims;

import common.CommonMsg;

public class CreateClaimSample {
	
	private static final Logger logger = LogManager.getLogger(CreateClaimSample.class.getName());
	
	public Map<String,Object> start_service(Map<String, Object> mapa) throws Exception {
		
		logger.info(CommonMsg.INP+mapa);
		
		if(!"".equals((String) mapa.get("ws050ConsumerKey")) && !"".equals((String) mapa.get("ws050KeyAlias")) && !"".equals((String) mapa.get("ws050KeyStorePassword"))) {
			String consumerKey = (String) mapa.get("ws050ConsumerKey");
			String keyAlias = (String) mapa.get("ws050KeyAlias");
			String keyPassword = (String) mapa.get("ws050KeyStorePassword");
			
			ClasseDeAutenticacao.Autenticação(consumerKey,keyAlias,keyPassword);			
		}else {
			Map<String,Object> retorno = new HashMap();
			retorno.put("Erro", CommonMsg.COD_STATUS_CRED);
			retorno.put("Message", CommonMsg.MSG_STATUS_CRED);
			return retorno;
		}

		try {

			RequestMap map = new RequestMap();
			
			if(!"".equals((String) mapa.get("ws050DispAmt"))) {
				map.set("disputedAmount", (String) mapa.get("ws050DispAmt"));	
			}
			if(!"".equals((String) mapa.get("ws050DispCurr"))) {
				map.set("disputedCurrency", (String) mapa.get("ws050DispCurr"));	
			}
			if(!"".equals((String) mapa.get("ws050ClaimType"))) {
				map.set("claimType", (String) mapa.get("ws050ClaimType"));	
			}
			if(!"".equals((String) mapa.get("ws050CleTrnId"))) {
				map.set("clearingTransactionId", (String) mapa.get("ws050CleTrnId"));	
			}
			if(!"".equals((String) mapa.get("ws050AutTrnId"))) {
				map.set("authTransactionId", (String) mapa.get("ws050AutTrnId"));	
			}
			
			Claims response = Claims.create(map);
			
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
