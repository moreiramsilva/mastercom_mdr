/**
 * Ws058CaseFilingCreateSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.CaseFilingCreate;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import common.CommonMsg;
import main.resources.MyLogger;
import sdk.CreateCaseSample;

public class Ws058CaseFilingCreateSOAPImpl implements mastercom.app.CaseFilingCreate.CaseFilingCreate_PortType{
    
	private static final Logger logger = MyLogger.getLogger(Ws058CaseFilingCreateSOAPImpl.class);
	
	public mastercom.app.CaseFilingCreate.Ws059 ws058E059(mastercom.app.CaseFilingCreate.Ws058 ws058) throws java.rmi.RemoteException {
        
		
		ObjectMapper oMapper = new ObjectMapper();
    	Map<String, Object> mapa = oMapper.convertValue(ws058, Map.class);
    	
    	Ws059 ws059 = new Ws059();
    	
    	CreateCaseSample instancia = new CreateCaseSample();
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
    		ws059.setWs059Mensagemstatus(map.get("Message").toString().length() > 250 ? map.get("Message").toString().substring(0, 250) : map.get("Message").toString());
    		ws059.setWs059Codigostatus(map.get("Erro").toString());
    	}
    	if(map != null && map.get("Erro") == null) {
    		ws059.setWs059Mensagemstatus(CommonMsg.MSG_STATUS_SUCSS);
    		ws059.setWs059Codigostatus(CommonMsg.COD_STATUS_SUCSS);
    		ws059.setWs059CaseId((String)map.get("caseId"));
    	}
    	
    	return ws059;
    }

}
