package sdk;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mastercard.api.core.exception.ApiException;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.Transactions;

import common.CommonMsg;

public class TransactionSearchSample {
	
	private static final Logger logger = LogManager.getLogger(TransactionSearchSample.class.getName());
		
	public Map<String,Object> start_service(Map<String, Object> mapa) throws Exception {
	
		logger.info(CommonMsg.INP+mapa);
		
		if(!"".equals((String) mapa.get("ws048Consumerkey")) && !"".equals((String) mapa.get("ws048Keyalias")) && !"".equals((String) mapa.get("ws048Keystorepassword"))) {		
		
			String consumerKey = (String) mapa.get("ws048Consumerkey");
			String keyAlias = (String) mapa.get("ws048Keyalias");
			String keyPassword = (String) mapa.get("ws048Keystorepassword");

			ClasseDeAutenticacao.Autenticação(consumerKey,keyAlias,keyPassword);
		}else {
			Map<String,Object> retorno = new HashMap();
			retorno.put("Erro", CommonMsg.COD_STATUS_CRED);
			retorno.put("Message", CommonMsg.MSG_STATUS_CRED);
			return retorno;
		}

		try {

			RequestMap map = new RequestMap();
			
			if(!"".equals((String) mapa.get("ws048AcqRefNbr"))) {
				map.set("acquirerRefNumber", (String) mapa.get("ws048AcqRefNbr"));				
			}
			if(!"".equals((String) mapa.get("ws048BanknetRefNbr"))) {
				map.set("bankNetRefNumber", (String) mapa.get("ws048BanknetRefNbr"));				
			}
			if(!"".equals((String) mapa.get("ws048PrimAcctNbr"))) {
				map.set("primaryAccountNum", (String) mapa.get("ws048PrimAcctNbr"));				
			}
			if(!"".equals((String) mapa.get("ws048TrnAmtFrom"))) {
				map.set("transAmountFrom", (String) mapa.get("ws048TrnAmtFrom"));				
			}
			if(!"".equals((String) mapa.get("ws048TrnAmtTo"))) {
				map.set("transAmountTo", (String) mapa.get("ws048TrnAmtTo"));				
			}
			if(!"".equals((String) mapa.get("ws048TrnStartDate"))) {
				map.set("tranStartDate", (String) mapa.get("ws048TrnStartDate"));				
			}
			if(!"".equals((String) mapa.get("ws048TrnEndDate"))) {
				map.set("tranEndDate", (String) mapa.get("ws048TrnEndDate"));				
			}

			Transactions response = Transactions.searchForTransaction(map);    	 
						
			return response;

		} catch (ApiException e) {
			logger.error(CommonMsg.MC_ERR+e.getHttpStatus()+CommonMsg.MC_MSG+e.getMessage()+CommonMsg.MC_REASON+e.getReasonCode()+CommonMsg.MC_SOURCE+e.getSource(), e);
			Map<String,Object> retorno = new HashMap();
			retorno.put("Erro", e.getHttpStatus());
			retorno.put("Message", e.getMessage()+e.getSource());
			return retorno;
		}
	}
}
