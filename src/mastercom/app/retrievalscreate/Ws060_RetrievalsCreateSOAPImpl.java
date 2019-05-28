/**
 * Ws060_RetrievalsCreateSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.retrievalscreate;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import common.CommonMsg;
import main.resources.MyLogger;
import sdk.CreateRetrievalSample;

public class Ws060_RetrievalsCreateSOAPImpl implements mastercom.app.retrievalscreate.RetrievalsCreate_PortType{
	
	private static final Logger logger = MyLogger.getLogger(Ws060_RetrievalsCreateSOAPImpl.class);
	
    public mastercom.app.retrievalscreate.Ws061 retrievalsCreate(mastercom.app.retrievalscreate.Ws060 ws060) throws java.rmi.RemoteException {
            
    	ObjectMapper oMapper = new ObjectMapper();
    	Map<String, Object> mapa = oMapper.convertValue(ws060, Map.class);
    	
    	Ws061 ws061 = new Ws061(); 
    	
    	CreateRetrievalSample instancia = new CreateRetrievalSample();
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
    		ws061.setWs061MensagemStatus(map.get("Message").toString().length() > 250 ? map.get("Message").toString().substring(0, 250) : map.get("Message").toString());
    		ws061.setWs061CodigoStatus(map.get("Erro").toString());
    	}
    	if(map != null && map.get("Erro") == null) {
    		
    		ws061.setWs061MensagemStatus(CommonMsg.MSG_STATUS_SUCSS);
    		ws061.setWs061CodigoStatus(CommonMsg.COD_STATUS_SUCSS);
    		
    		ws061.setWs061RequestId((String)map.get("requestId"));
    	}
    	return ws061;
    }

}
