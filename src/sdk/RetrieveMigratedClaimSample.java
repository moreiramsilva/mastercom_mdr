package sdk;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mastercard.api.core.exception.ApiException;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.MigratedDisputes;

import common.CommonMsg;

public class RetrieveMigratedClaimSample {
	private static final Logger logger = LogManager.getLogger(RetrieveMigratedClaimSample.class.getName());

	public Map<String,Object> start_service(Map<String, Object> mapa) throws Exception {

		logger.info(CommonMsg.INP+mapa);

		if(!"".equals((String) mapa.get("ws072ConsumerKey")) && !"".equals((String) mapa.get("ws072KeyAlias")) && !"".equals((String) mapa.get("ws072KeyStorePassword"))) {		

			String consumerKey = (String) mapa.get("ws072ConsumerKey");
			String keyAlias = (String) mapa.get("ws072KeyAlias");
			String keyPassword = (String) mapa.get("ws072KeyStorePassword");

			ClasseDeAutenticacao.Autenticação(consumerKey,keyAlias,keyPassword);
		}else {
			Map<String,Object> retorno = new HashMap();
			retorno.put("Erro", CommonMsg.COD_STATUS_CRED);
			retorno.put("Message", CommonMsg.MSG_STATUS_CRED);
			return retorno;
		}

		try {

			RequestMap map = new RequestMap();map.set("pageSize", "4");
			
			if(!"".equals((String) mapa.get("ws072PageSize"))) {
				map.set("pageSize", (String) mapa.get("ws072PageSize"));				
			}
			if(!"".equals((String) mapa.get("ws072PageNumber"))) {
				map.set("pageNumber", (String) mapa.get("ws072PageNumber"));				
			}
			if(!"".equals((String) mapa.get("ws072ActivityType"))) {
				map.set("activityType", (String) mapa.get("ws072ActivityType"));				
			}
			if(!"".equals((String) mapa.get("ws072Ica"))) {
				map.set("ica", (String) mapa.get("ws072Ica"));				
			}


			MigratedDisputes response = MigratedDisputes.retrieve(map);

			return response;

		}catch(ApiException e) {
			logger.error(CommonMsg.MC_ERR+e.getHttpStatus()+CommonMsg.MC_MSG+e.getMessage()+CommonMsg.MC_REASON+e.getReasonCode()+CommonMsg.MC_SOURCE+e.getSource(), e);
			Map<String,Object> retorno = new HashMap();
			retorno.put("Erro", e.getHttpStatus());
			retorno.put("Message", e.getMessage()+e.getSource());
			return retorno;
		}
	}
}
