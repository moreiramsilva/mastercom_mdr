/**
 * FeeCreateSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.FeeCreate;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import common.CommonMsg;
import main.resources.MyLogger;
import mastercom.app.claimscreate.ClaimsCreateSOAPImpl;
import mastercom.app.claimscreate.Ws051;
import sdk.CreateClaimSample;
import sdk.CreateFeeSample;

public class FeeCreateSOAPImpl implements mastercom.app.FeeCreate.FeeCreate_PortType{

	private static final Logger logger = MyLogger.getLogger(ClaimsCreateSOAPImpl.class);

	public mastercom.app.FeeCreate.Ws069 feeCreate(mastercom.app.FeeCreate.Ws068 ws068) throws java.rmi.RemoteException {
	    
		ObjectMapper oMapper = new ObjectMapper();
		Map<String, Object> mapa = oMapper.convertValue(ws068, Map.class);

		Ws069 ws069 = new Ws069();

		CreateFeeSample instancia = new CreateFeeSample();
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
			ws069.setWs069MensagemStatus(map.get("Message").toString().length() > 250 ? map.get("Message").toString().substring(0, 250) : map.get("Message").toString());
			ws069.setWs069CodigoStatus(map.get("Erro").toString());
		}
		if(map != null && map.get("Erro") == null) {

			ws069.setWs069MensagemStatus(CommonMsg.MSG_STATUS_SUCSS);
			ws069.setWs069CodigoStatus(CommonMsg.COD_STATUS_SUCSS);

			ws069.setWs069FeeId(map.get("feeId").toString());
		}
		return ws069;
	}

}
