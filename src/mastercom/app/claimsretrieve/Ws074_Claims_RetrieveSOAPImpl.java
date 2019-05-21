/**
 * Ws074_Claims_RetrieveSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.claimsretrieve;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import common.CommonMsg;
import main.resources.MyLogger;
import sdk.GetClaimSample;

public class Ws074_Claims_RetrieveSOAPImpl implements mastercom.app.claimsretrieve.Ws074_Claims_Retrieve{
    
	private static final Logger logger = MyLogger.getLogger(Ws074_Claims_RetrieveSOAPImpl.class);
	
	public mastercom.app.claimsretrieve.Ws075 claims_Retrieve(mastercom.app.claimsretrieve.Ws074 ws074) throws java.rmi.RemoteException {
    	
    	ObjectMapper oMapper = new ObjectMapper();
    	Map<String, Object> mapa = oMapper.convertValue(ws074, Map.class);
    	
    	Ws075 ws075 = new Ws075();
    	
    	GetClaimSample instancia = new GetClaimSample();
		Map<String,Object> map = new HashMap();
    	try {
    		map =  instancia.start_service(mapa);
    		logger.info(CommonMsg.OUTP+map.entrySet());
		} catch (Exception e) {
			logger.error(CommonMsg.EXCPT+e);
			map.put("Erro", CommonMsg.COD_STATUS_UKN);
			map.put("Message", CommonMsg.MSG_STATUS_UKN);
			
		}
    	if(map != null && map.get("Erro") != null) {
    		ws075.setWs075MensagemStatus(map.get("Message").toString().length() > 250 ? map.get("Message").toString().substring(0, 250) : map.get("Message").toString());
    		ws075.setWs075CodigoStatus(map.get("Erro").toString());
    	}
    	if(map != null && map.get("Erro") == null) {
    		
    		ws075.setWs075MensagemStatus(CommonMsg.MSG_STATUS_SUCSS);
    		ws075.setWs075CodigoStatus(CommonMsg.COD_STATUS_SUCSS);
    		    		
    	}
    	
    	return ws075;
    }

}
