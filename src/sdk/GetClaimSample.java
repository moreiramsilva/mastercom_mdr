package sdk;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mastercard.api.core.exception.ApiException;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.Claims;

import common.CommonMsg;

public class GetClaimSample {
	
	private static final Logger logger = LogManager.getLogger(GetClaimSample.class.getName());

	public Map<String,Object> start_service(Map<String, Object> mapa) throws Exception {

		logger.info(CommonMsg.INP+mapa);

		if(!"".equals((String) mapa.get("ws074ConsumerKey")) && !"".equals((String) mapa.get("ws074KeyAlias")) && !"".equals((String) mapa.get("ws074KeyStorePassword"))) {
			String consumerKey = (String) mapa.get("ws074ConsumerKey");
			String keyAlias = (String) mapa.get("ws074KeyAlias");
			String keyPassword = (String) mapa.get("ws074KeyStorePassword");

			ClasseDeAutenticacao.Autenticação(consumerKey,keyAlias,keyPassword);			
		}else {
			Map<String,Object> retorno = new HashMap();
			retorno.put("Erro", CommonMsg.COD_STATUS_CRED);
			retorno.put("Message", CommonMsg.MSG_STATUS_CRED);
			return retorno;
		}

		try {

			RequestMap map = new RequestMap();

			if(!"".equals((String) mapa.get("ws074ClaimId"))) {
				map.set("claim-id", (String) mapa.get("ws074ClaimId"));	
			}
			
			Claims response = Claims.retrieve("", map);

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
