/**
 * Ws072_Migrated_DisputesSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.Migrated_Disputes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import common.CommonMsg;
import main.resources.MyLogger;
import sdk.RetrieveMigratedClaimSample;

public class Ws072_Migrated_DisputesSOAPImpl implements mastercom.app.Migrated_Disputes.Migrated_Disputes_PortType{
    
	private static final Logger logger = MyLogger.getLogger(Ws072_Migrated_DisputesSOAPImpl.class);

	public mastercom.app.Migrated_Disputes.Ws073 migrated_Disputes(mastercom.app.Migrated_Disputes.Ws072 ws072) throws java.rmi.RemoteException {

		ObjectMapper oMapper = new ObjectMapper();
		Map<String, Object> mapa = oMapper.convertValue(ws072, Map.class);

		Ws073 ws073 = new Ws073();

		RetrieveMigratedClaimSample instancia = new RetrieveMigratedClaimSample ();

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
			ws073.setWs073MensagemStatus(map.get("Message").toString().length() > 250 ? map.get("Message").toString().substring(0, 250) : map.get("Message").toString());
			ws073.setWs073CodigoStatus(map.get("Erro").toString());
		}
		if(map != null && map.get("Erro") == null) {

			ws073.setWs073MensagemStatus(CommonMsg.MSG_STATUS_SUCSS);
			ws073.setWs073CodigoStatus(CommonMsg.COD_STATUS_SUCSS);

			if(!"".equals(map.get("totalCount")))
				ws073.setWs073TotalCount(map.get("totalCount").toString());
			
			if(map.get("migrationResponseList") instanceof ArrayList<?>) {
				MigrationResponseList[] migre = new MigrationResponseList[((ArrayList<?>) map.get("migrationResponseList")).size()];
    			int j = 0;
    			for(Object item : (ArrayList<?>) map.get("migrationResponseList")) {
    				migre[j] = new MigrationResponseList();
    				migre[j].setWs073ClaimId(((Map<String, Object>) item).get("claimId") != null ? (((Map<String, Object>) item).get("claimId")).toString() : "");
    				migre[j].setWs073ItemId(((Map<String, Object>) item).get("itemId") != null ? ((Map<String, Object>) item).get("itemId").toString() : "");
    				migre[j].setWs073ItemType(((Map<String, Object>) item).get("itemType") != null ? ((Map<String, Object>) item).get("itemType").toString() : "");
    				migre[j].setWs073MastercomId(((Map<String, Object>) item).get("mastercomId") != null ? ((Map<String, Object>) item).get("mastercomId").toString() : "");
    				migre[j].setWs073AcquirerReferenceData(((Map<String, Object>) item).get("acquirerReferenceData") != null ? ((Map<String, Object>) item).get("acquirerReferenceData").toString() : "");
    				migre[j].setWs073IssuerReferenceData(((Map<String, Object>) item).get("issuerReferenceData") != null ? ((Map<String, Object>) item).get("issuerReferenceData").toString() : "");
    				migre[j].setWs073TransactionAmount(((Map<String, Object>) item).get("transactionAmount") != null ? ((Map<String, Object>) item).get("transactionAmount").toString() : "");
    				migre[j].setWs073BanknetReferenceNumber(((Map<String, Object>) item).get("banknetReferenceNumber")!= null ? ((Map<String, Object>) item).get("banknetReferenceNumber").toString() : "");
    				j++;
    			}
    			ws073.setWs073MigrationResponseList(migre);
    		}
		}
		return ws073;
	}
	
}
