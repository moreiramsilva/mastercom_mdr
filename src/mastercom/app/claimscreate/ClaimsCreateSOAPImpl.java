/**
 * ClaimsCreateSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.claimscreate;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import common.CommonMsg;
import main.resources.MyLogger;
import mastercom.app.searchfortransaction.SearchForTransactionSOAPImpl;
import sdk.CreateClaimSample;

public class ClaimsCreateSOAPImpl implements mastercom.app.claimscreate.ClaimsCreate_PortType{
    
	private static final Logger logger = MyLogger.getLogger(ClaimsCreateSOAPImpl.class);
	
	public mastercom.app.claimscreate.Ws051 ws050E051(mastercom.app.claimscreate.Ws050 ws050) throws java.rmi.RemoteException {
	    	
    	ObjectMapper oMapper = new ObjectMapper();
    	Map<String, Object> mapa = oMapper.convertValue(ws050, Map.class);
    	
    	Ws051 ws051 = new Ws051();
    	ws051.setWs051ClaimId("");
    	
    	CreateClaimSample instancia = new CreateClaimSample();
    	Map<String,Object> map = new HashMap();
    	try {
    		map = instancia.start_service(mapa);
    		logger.info(CommonMsg.OUTP+map.entrySet());
    	}catch (Exception e) {
			logger.error(CommonMsg.EXCPT+e);
			map.put("Erro", CommonMsg.COD_STATUS_UKN);
			map.put("Message", CommonMsg.MSG_STATUS_UKN);
			
		}
    	if(map != null && map.get("Erro") != null) {
    		ws051.setWs051MensagemStatus(map.get("Message").toString().length() > 250 ? map.get("Message").toString().substring(0, 250) : map.get("Message").toString());
    		ws051.setWs051CodigoStatus(map.get("Erro").toString());
    	}
    	if(map != null && map.get("Erro") == null) {
    		
    		ws051.setWs051MensagemStatus(CommonMsg.MSG_STATUS_SUCSS);
    		ws051.setWs051CodigoStatus(CommonMsg.COD_STATUS_SUCSS);
    		
    		ws051.setWs051ClaimId(map.get("claimId").toString());
    	}
    	return ws051;
    }

}
