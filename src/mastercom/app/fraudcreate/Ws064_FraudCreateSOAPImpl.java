/**
 * Ws064_FraudCreateSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.fraudcreate;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import common.CommonMsg;
import main.resources.MyLogger;
import sdk.CreateFraudSample;

public class Ws064_FraudCreateSOAPImpl implements mastercom.app.fraudcreate.FraudCreate_PortType{
	private static final Logger logger = MyLogger.getLogger(Ws064_FraudCreateSOAPImpl.class);
	
	public mastercom.app.fraudcreate.Ws065 fraudCreate(mastercom.app.fraudcreate.Ws064 ws064) throws java.rmi.RemoteException {
	    
		ObjectMapper oMapper = new ObjectMapper();
    	Map<String, Object> mapa = oMapper.convertValue(ws064, Map.class);
    	
    	Ws065 ws065 = new Ws065();
    	
    	CreateFraudSample instancia = new CreateFraudSample ();
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
    		ws065.setWs065MensagemStatus(map.get("Message").toString().length() > 250 ? map.get("Message").toString().substring(0, 250) : map.get("Message").toString());
    		ws065.setWs065CodigoStatus(map.get("Erro").toString());
    	}
    	if(map != null && map.get("Erro") == null) {
    		
    		ws065.setWs065MensagemStatus(CommonMsg.MSG_STATUS_SUCSS);
    		ws065.setWs065CodigoStatus(CommonMsg.COD_STATUS_SUCSS);
    		
    		ws065.setWs065FraudId(map.get("fraudId").toString());
    	}
    	return ws065;
    }

}
