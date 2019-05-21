/**
 * ChargebacksCreateSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.chargebackscreate;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import common.CommonMsg;
import main.resources.MyLogger;
import sdk.CreateChargebackSample;

public class ChargebacksCreateSOAPImpl implements mastercom.app.chargebackscreate.ChargebacksCreate_PortType{
    

	private static final Logger logger = MyLogger.getLogger(ChargebacksCreateSOAPImpl.class);
	
	public mastercom.app.chargebackscreate.Ws057 ws056E057(mastercom.app.chargebackscreate.Ws056 ws056) throws java.rmi.RemoteException {
	        
		ObjectMapper oMapper = new ObjectMapper();
    	Map<String, Object> mapa = oMapper.convertValue(ws056, Map.class);
    	    	
    	CreateChargebackSample instancia = new CreateChargebackSample();
    	Map<String,Object> map = new HashMap();
    	
    	Ws057 ws057 = new Ws057();
    	
    	try {
    		map = instancia.start_service(mapa);
    		logger.info(CommonMsg.OUTP+map.entrySet());
    	}catch (Exception e) {
			logger.error(CommonMsg.EXCPT+e);
			map.put("Erro", CommonMsg.COD_STATUS_UKN);
			map.put("Message", CommonMsg.MSG_STATUS_UKN);
			
		}
    	if(map != null && map.get("Erro") != null) {
    		ws057.setWs057MensagemStatus(map.get("Message").toString().length() > 250 ? map.get("Message").toString().substring(0, 250) : map.get("Message").toString());
    		ws057.setWs057CodigoStatus(map.get("Erro").toString());
    	}
    	if(map != null && map.get("Erro") == null) {
    		
    		ws057.setWs057MensagemStatus(CommonMsg.MSG_STATUS_SUCSS);
    		ws057.setWs057CodigoStatus(CommonMsg.COD_STATUS_SUCSS);
    		
    		ws057.setWs057ChargebackId(map.get("chargebackId").toString());
    	}
		return ws057;
    }

}
