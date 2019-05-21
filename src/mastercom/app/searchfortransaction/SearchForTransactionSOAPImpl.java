/**
 * SearchForTransactionSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.searchfortransaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import common.CommonMsg;
import main.resources.MyLogger;
import sdk.TransactionSearchSample;


public class SearchForTransactionSOAPImpl implements mastercom.app.searchfortransaction.SearchForTransaction_PortType{
    
	private static final Logger logger = MyLogger.getLogger(SearchForTransactionSOAPImpl.class);
	
	public mastercom.app.searchfortransaction.Ws049 ws048E049(mastercom.app.searchfortransaction.Ws048 ws048) throws java.rmi.RemoteException {
	         
    	ObjectMapper oMapper = new ObjectMapper();
    	Map<String, Object> mapa = oMapper.convertValue(ws048, Map.class);
    	
    	Ws049 ws049 = new Ws049();
    	
    	TransactionSearchSample instancia = new TransactionSearchSample();
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
    		ws049.setWs049Mensagemstatus(map.get("Message").toString().length() > 250 ? map.get("Message").toString().substring(0, 250) : map.get("Message").toString());
    		ws049.setWs049Codigostatus(map.get("Erro").toString());
    	}
    	if(map != null && map.get("Erro") == null) {
    		
    		ws049.setWs049Mensagemstatus(CommonMsg.MSG_STATUS_SUCSS);
    		ws049.setWs049Codigostatus(CommonMsg.COD_STATUS_SUCSS);
    		
    		ws049.setWs049AuthSumCount((String) map.get("authorizationSummaryCount"));
    		ws049.setWs049AuthMessage((String) map.get("message"));
    		
    		if(map.get("authorizationSummary") instanceof ArrayList<?>) {
    			Ws049AuthSummary[] authSum = new Ws049AuthSummary[((ArrayList<?>) map.get("authorizationSummary")).size()];
    			int j = 0;
    			for(Object item : (ArrayList<?>) map.get("authorizationSummary")) {
    				authSum[j] = new Ws049AuthSummary();
    				authSum[j].setWs049AutOrigMsgTypeIdent(((Map<String, Object>) item).get("originalMessageTypeIdentifier").toString());
    				authSum[j].setWs049AutBanknetDate(((Map<String, Object>) item).get("banknetDate").toString());
    				authSum[j].setWs049AutTrnAmtUsd(((Map<String, Object>) item).get("transactionAmountUsd").toString());
    				authSum[j].setWs049AutPrimAcctNbr(((Map<String, Object>) item).get("primaryAccountNumber").toString());
    				authSum[j].setWs049AutProcCode(((Map<String, Object>) item).get("processingCode").toString());
    				authSum[j].setWs049AutTrnAmtLoc(((Map<String, Object>) item).get("transactionAmountLocal").toString());
    				authSum[j].setWs049AutAuthDateTime(((Map<String, Object>) item).get("authorizationDateAndTime").toString());
    				authSum[j].setWs049AutAuthentId(((Map<String, Object>) item).get("authenticationId").toString());
    				authSum[j].setWs049AutCardAcceptName(((Map<String, Object>) item).get("cardAcceptorName").toString());
    				authSum[j].setWs049AutCardAcceptCity(((Map<String, Object>) item).get("cardAcceptorCity").toString());
    				authSum[j].setWs049AutCardAcceptState(((Map<String, Object>) item).get("cardAcceptorState").toString());
    				authSum[j].setWs049AutCurCode(((Map<String, Object>) item).get("currencyCode").toString());
    				authSum[j].setWs049AutChipPresent(((Map<String, Object>) item).get("chipPresent").toString());
    				authSum[j].setWs049AutAuthTrnId(((Map<String, Object>) item).get("transactionId").toString());
    				authSum[j].setWs049AutTrack1(((Map<String, Object>) item).get("track1").toString());
    				authSum[j].setWs049AutTrack2(((Map<String, Object>) item).get("track2").toString());
    				
    				if(((Map<String, Object>) item).get("clearingSummary") != null && ((Map<String, Object>) item).get("clearingSummary") instanceof ArrayList<?>) {
    					
						Ws049ClearingSummary[] cs =  new Ws049ClearingSummary[((ArrayList<?>) ((Map<String, Object>) item).get("clearingSummary")).size()]; 
    					int i = 0;
    					for(Object cs_item : (ArrayList<?>) ((Map<String, Object>) item).get("clearingSummary")) {
    						cs[i] = new Ws049ClearingSummary();
    						cs[i].setWs049ClePrimAcctNbr(((Map<String, Object>) cs_item).get("primaryAccountNumber").toString());
    						cs[i].setWs049CleTrnAmtLoc(((Map<String, Object>) cs_item).get("transactionAmountLocal").toString());
    						cs[i].setWs049CleDateTimeLoc(((Map<String, Object>) cs_item).get("dateAndTimeLocal").toString());
    						cs[i].setWs049CleCardDataInputCap(((Map<String, Object>) cs_item).get("cardDataInputCapabililty") != null ? ((Map<String, Object>) cs_item).get("cardDataInputCapabililty").toString() : "");
    						cs[i].setWs049CleCardAuthCap(((Map<String, Object>) cs_item).get("cardholderAuthenticationCapability").toString());
    						cs[i].setWs049CleAcqRefNbr(((Map<String, Object>) cs_item).get("acquirerReferenceNumber").toString());
    						cs[i].setWs049CleCardAcceptName(((Map<String, Object>) cs_item).get("cardAcceptorName").toString());
    						cs[i].setWs049CleCurCode(((Map<String, Object>) cs_item).get("currencyCode").toString());
    						cs[i].setWs049CleTrnId(((Map<String, Object>) cs_item).get("transactionId").toString());
    						i += 1;
    					}
    					authSum[j].setWs049ClearingSummary(cs);
    					j += 1;	
    				}
    				
    			}
    			ws049.setWs049AuthSummary(authSum);
    		}
    	}
    	
    	return ws049;
    }

}
