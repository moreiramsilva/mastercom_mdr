package sdk;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mastercard.api.core.exception.ApiException;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.Retrievals;

import common.CommonMsg;

public class CreateRetrievalSample {

	private static final Logger logger = LogManager.getLogger(CreateRetrievalSample.class.getName());

	public Map<String,Object> start_service(Map<String, Object> mapa) throws Exception {

		logger.info(CommonMsg.INP+mapa);

		if(!"".equals((String) mapa.get("ws060ConsumerKey")) && !"".equals((String) mapa.get("ws060KeyAlias")) && !"".equals((String) mapa.get("ws060KeyStorePassword"))) {
			String consumerKey = (String) mapa.get("ws060ConsumerKey");
			String keyAlias = (String) mapa.get("ws060KeyAlias");
			String keyPassword = (String) mapa.get("ws060KeyStorePassword");

			ClasseDeAutenticacao.Autenticação(consumerKey,keyAlias,keyPassword);			
		}else {
			Map<String,Object> retorno = new HashMap();
			retorno.put("Erro", CommonMsg.COD_STATUS_CRED);
			retorno.put("Message", CommonMsg.MSG_STATUS_CRED);
			return retorno;
		}

		try {

			RequestMap map = new RequestMap();

			if(!"".equals((String) mapa.get("ws060ClaimId"))) {
				map.set("claim-id", (String) mapa.get("ws060ClaimId"));	
			}
			if(!"".equals((String) mapa.get("ws060RetrievalRequestReason"))) {
				map.set("retrievalRequestReason", (String) mapa.get("ws060RetrievalRequestReason"));	
			}
			if(!"".equals((String) mapa.get("ws060DocNeeded"))) {
				map.set("docNeeded", (String) mapa.get("ws060DocNeeded"));	
			}


			Retrievals response = Retrievals.create(map);

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
