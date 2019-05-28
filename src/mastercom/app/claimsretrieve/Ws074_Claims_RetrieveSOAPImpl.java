/**
 * Ws074_Claims_RetrieveSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.claimsretrieve;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.json.JsonArray;

import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;

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

			ws075.setWs075AcquirerId((String)map.get("acquirerId"));
			ws075.setWs075AcquirerRefNum((String)map.get("acquirerRefNum"));
			ws075.setWs075PrimaryAccountNum((String)map.get("primaryAccountNum"));
			ws075.setWs075ClaimId((String)map.get("claimId"));
			ws075.setWs075ClaimType((String)map.get("claimType"));
			ws075.setWs075ClaimValue((String)map.get("claimValue"));

			if(map.get("standardClaims") != null) {
				//verifica se standardClaims é lista ou string, visto que a documentação mastercard afirma que é string padrão exp: 200002020654, 200002020654 
				if((ArrayList<?>)map.get("standardClaims") instanceof ArrayList && (ArrayList<?>)map.get("standardClaims") != null) {
					for(int i = 0 ; i < ((ArrayList) map.get("standardClaims")).size() ; i++) {
						ws075.setWs075StandardClaims(i, (String)((ArrayList) map.get("standardClaims")).get(i));
					}
				}else if (map.get("standardClaims") instanceof String) {
					if(((String) map.get("standardClaims")).contains(",")) {
						String standardClaims[] = ((String) map.get("standardClaims")).split(",");
						for(int i = 0; i < standardClaims.length; i++) {
							ws075.setWs075StandardClaims(i, (String) standardClaims[i]);
						}
					}
				}
			}

			ws075.setWs075ClearingDueDate((String)map.get("clearingDueDate"));
			ws075.setWs075ClearingNetwork((String)map.get("clearingNetwork"));
			ws075.setWs075CreateDate((String)map.get("createDate"));
			ws075.setWs075DueDate((String)map.get("dueDate"));
			ws075.setWs075TransactionId((String)map.get("transactionId"));
			ws075.setWs075IsAccurate((String)map.get("isAccurate"));
			ws075.setWs075IsAcquirer((String)map.get("isAcquirer"));
			ws075.setWs075IsIssuer((String)map.get("isIssuer"));
			ws075.setWs075IsOpen((String)map.get("isOpen"));
			ws075.setWs075IssuerId((String)map.get("issuerId"));
			ws075.setWs075LastModifiedBy((String)map.get("lastModifiedBy"));
			ws075.setWs075LastModifiedDate((String)map.get("lastModifiedDate"));
			ws075.setWs075MerchantId((String)map.get("merchantId"));
			ws075.setWs075QueueName((String)map.get("queueName"));

			if(map.get("caseFilingDetails") != null) { //caseFilingDetails

				Ws075CaseFilingDetails caseFilingDetails = new Ws075CaseFilingDetails(); //caseFilingDetails
				DetCaseFilingRespHistory[] caseFilingRespHistory;

				HashMap<?, ?> caseFilingDetailsMAP = (HashMap<?, ?>) map.get("caseFilingDetails");

				if(caseFilingDetailsMAP.get("caseFilingRespHistory") != null) {
					@SuppressWarnings("unchecked")
					List<Object> jsonarrayCaseFilingRespHistory = (List<Object>) caseFilingDetailsMAP.get("caseFilingRespHistory");
					caseFilingRespHistory = new DetCaseFilingRespHistory[jsonarrayCaseFilingRespHistory.size()];
					if(jsonarrayCaseFilingRespHistory != null) {
						int i = 0;
						for(Object obj : jsonarrayCaseFilingRespHistory) {    						
							HashMap<?, ?> caseHistoryMAP = (HashMap<?, ?>) obj;
							caseFilingRespHistory[i] = new DetCaseFilingRespHistory();
							caseFilingRespHistory[i].setDetHistAction((String)caseHistoryMAP.get("action"));
							caseFilingRespHistory[i].setDetHistMemo((String)caseHistoryMAP.get("memo"));
							caseFilingRespHistory[i].setDetHistResponseDate((String)caseHistoryMAP.get("responseDate"));
							i++;
						}
						caseFilingDetails.setCaseFilingRespHistory(caseFilingRespHistory);//caseFilingDetails
					}
				}
				if(caseFilingDetailsMAP.get("caseFilingStatus")!= null) {
					caseFilingDetails.setCaseFilingStatus((String)caseFilingDetailsMAP.get("caseFilingStatus"));
				}
				if(caseFilingDetailsMAP.get("caseFilingDetails")!= null) {
					HashMap<?, ?> DetCaseFilingDetailsMAP = (HashMap<?, ?>) caseFilingDetailsMAP.get("caseFilingDetails");
					DetCaseFilingDetails detCaseFilingDetails = new DetCaseFilingDetails();
					detCaseFilingDetails.setWs075DetCaseId((String)DetCaseFilingDetailsMAP.get("caseId"));
					detCaseFilingDetails.setWs075DetCaseType((String)DetCaseFilingDetailsMAP.get("caseType"));
					detCaseFilingDetails.setWs075DetChargebackDate((String)DetCaseFilingDetailsMAP.get("chargebackDate"));

					if(DetCaseFilingDetailsMAP.get("chargebackRefNum") instanceof ArrayList<?>) {
						ArrayList<?> objt = (ArrayList<?>) DetCaseFilingDetailsMAP.get("chargebackRefNum");
						if(objt.size() > 0 && objt.size() == 1) {
							String chargebackRefNum[] = ((String) objt.get(0)).split(",");
							detCaseFilingDetails.setWs075DetChargebackRefNum(chargebackRefNum);
						}else {
							detCaseFilingDetails.setWs075DetChargebackRefNum(null);
						}
					}

					detCaseFilingDetails.setWs075DetClaimId((String)DetCaseFilingDetailsMAP.get("claimId"));
					detCaseFilingDetails.setWs075DetClaimType((String)DetCaseFilingDetailsMAP.get("claimType"));
					detCaseFilingDetails.setWs075DetCreditDate((String)DetCaseFilingDetailsMAP.get("creditDate"));
					detCaseFilingDetails.setWs075DetCurrencyCode((String)DetCaseFilingDetailsMAP.get("currencyCode"));
					detCaseFilingDetails.setWs075DetCustomerFilingNumber((String)DetCaseFilingDetailsMAP.get("customerFilingNumber"));
					detCaseFilingDetails.setWs075DetDisputeAmount((String)DetCaseFilingDetailsMAP.get("disputeAmount"));
					detCaseFilingDetails.setWs075DetDueDate((String)DetCaseFilingDetailsMAP.get("dueDate"));
					detCaseFilingDetails.setWs075DetFilingAgaintstIca((String)DetCaseFilingDetailsMAP.get("filingAgaintstIca"));
					detCaseFilingDetails.setWs075DetFilingAs((String)DetCaseFilingDetailsMAP.get("filingAs"));
					detCaseFilingDetails.setWs075DetFilingIca((String)DetCaseFilingDetailsMAP.get("filingIca"));
					detCaseFilingDetails.setWs075DetMerchantName((String)DetCaseFilingDetailsMAP.get("merchantName"));
					detCaseFilingDetails.setWs075DetPrimaryAccountNum((String)DetCaseFilingDetailsMAP.get("primaryAccountNum"));
					detCaseFilingDetails.setWs075DetReasonCode((String)DetCaseFilingDetailsMAP.get("reasonCode"));
					detCaseFilingDetails.setWs075DetRulingDate((String)DetCaseFilingDetailsMAP.get("rulingDate"));
					detCaseFilingDetails.setWs075DetRulingStatus((String)DetCaseFilingDetailsMAP.get("rulingStatus"));
					detCaseFilingDetails.setWs075DetViolationCode((String)DetCaseFilingDetailsMAP.get("violationCode"));
					detCaseFilingDetails.setWs075DetViolationDate((String)DetCaseFilingDetailsMAP.get("violationDate"));

					caseFilingDetails.setCaseFilingDetails(detCaseFilingDetails); //caseFilingDetails
					ws075.setWs075CaseFilingDetails(caseFilingDetails);

				}
			}
			if(map.get("retrievalDetails") != null) {
				HashMap<?, ?> retrievalDetailsMAP = (HashMap<?, ?>)  map.get("retrievalDetails");
				Ws075RetrievalDetails retrievalDetails = new Ws075RetrievalDetails();

				retrievalDetails.setWs075RetAcquirerMemo((String)retrievalDetailsMAP.get("acquirerMemo"));
				retrievalDetails.setWs075RetAcquirerRefNum((String)retrievalDetailsMAP.get("acquirerRefNum"));
				retrievalDetails.setWs075RetAcquirerResponseCd((String)retrievalDetailsMAP.get("acquirerResponseCd"));
				retrievalDetails.setWs075RetAcquirerResponseDt((String)retrievalDetailsMAP.get("acquirerResponseDt"));
				retrievalDetails.setWs075RetAmount((String)retrievalDetailsMAP.get("amount"));
				retrievalDetails.setWs075RetChargebackRefNum((String)retrievalDetailsMAP.get("chargebackRefNum"));
				retrievalDetails.setWs075RetClaimId((String)retrievalDetailsMAP.get("claimId"));	
				retrievalDetails.setWs075RetCreateDate((String)retrievalDetailsMAP.get("createDate"));				
				retrievalDetails.setWs075RetCurrency((String)retrievalDetailsMAP.get("currency"));		
				retrievalDetails.setWs075RetDocNeeded((String)retrievalDetailsMAP.get("docNeeded"));			
				retrievalDetails.setWs075RetImageReviewDecision((String)retrievalDetailsMAP.get("imageReviewDecision"));
				retrievalDetails.setWs075RetImageReviewDt((String)retrievalDetailsMAP.get("imageReviewDt"));
				retrievalDetails.setWs075RetIssuerMemo((String)retrievalDetailsMAP.get("issuerMemo"));				
				retrievalDetails.setWs075RetIssuerRejectRsnCd((String)retrievalDetailsMAP.get("issuerRejectRsnCd"));
				retrievalDetails.setWs075RetIssuerResponseCd((String)retrievalDetailsMAP.get("issuerResponseCd"));
				retrievalDetails.setWs075RetIssuerResponseDt((String)retrievalDetailsMAP.get("issuerResponseDt"));
				retrievalDetails.setWs075RetPrimaryAcctNum((String)retrievalDetailsMAP.get("primaryAcctNum"));
				retrievalDetails.setWs075RetRequestId((String)retrievalDetailsMAP.get("requestId"));			
				retrievalDetails.setWs075RetRetrievalRequestReason((String)retrievalDetailsMAP.get("retrievalRequestReason"));
				ws075.setWs075RetrievalDetails(retrievalDetails);
			}
			if(map.get("feeDetails") != null) {
				List<Object> jsonarrayfeeDetails = (List<Object>) map.get("feeDetails");

				int i = 0;
				Ws075FeeDetails[] feeDetails = new Ws075FeeDetails[jsonarrayfeeDetails.size()];
				for(Object obj : jsonarrayfeeDetails) {    		

					feeDetails[i] = new Ws075FeeDetails();
					HashMap<?, ?> feeDetailsMAP = (HashMap<?, ?>) obj;

					feeDetails[i].setWs075CardAcceptorIdCode((String)feeDetailsMAP.get("cardAcceptorIdCode"));
					feeDetails[i].setWs075CardNumber((String)feeDetailsMAP.get("cardNumber"));
					feeDetails[i].setWs075ChargebackRefNum((String)feeDetailsMAP.get("chargebackRefNum"));
					feeDetails[i].setWs075CountryCode((String)feeDetailsMAP.get("countryCode"));
					feeDetails[i].setWs075CreditReceiver((String)feeDetailsMAP.get("creditReceiver"));
					feeDetails[i].setWs075CreditSender((String)feeDetailsMAP.get("creditSender"));
					feeDetails[i].setWs075Currency((String)feeDetailsMAP.get("currency"));
					feeDetails[i].setWs075DestinationMember((String)feeDetailsMAP.get("destinationMember"));
					feeDetails[i].setWs075FeeAmount((String)feeDetailsMAP.get("feeAmount"));
					feeDetails[i].setWs075FeeDate((String)feeDetailsMAP.get("feeDate"));
					feeDetails[i].setWs075FeeId((String)feeDetailsMAP.get("feeId"));
					feeDetails[i].setWs075Message((String)feeDetailsMAP.get("message"));
					feeDetails[i].setWs075Reason((String)feeDetailsMAP.get("reason"));

					i++;
				}
				ws075.setWs075FeeDetails(feeDetails);

			}

			if(map.get("chargebackDetails") != null) {
				List<Object> jsonarraychargebackDetails = (List<Object>) map.get("chargebackDetails") ;

				int i = 0;
				Ws075ChargebackDetails[] chargebackDetails = new Ws075ChargebackDetails[jsonarraychargebackDetails.size()];
				
				for(Object obj : jsonarraychargebackDetails) { 
					
					chargebackDetails[i] = new Ws075ChargebackDetails();
					HashMap<?, ?> chargebackDetailsMAP = (HashMap<?, ?>) obj;
					
					chargebackDetails[i].setWs075Amount((String)chargebackDetailsMAP.get("amount"));
					chargebackDetails[i].setWs075ChargebackId((String)chargebackDetailsMAP.get("chargebackId"));
					chargebackDetails[i].setWs075ChargebackRefNum((String)chargebackDetailsMAP.get("chargebackRefNum"));
					chargebackDetails[i].setWs075ChargebackType((String)chargebackDetailsMAP.get("chargebackType"));
					chargebackDetails[i].setWs075ClaimId((String)chargebackDetailsMAP.get("claimId"));
					chargebackDetails[i].setWs075CreateDate((String)chargebackDetailsMAP.get("createDate"));
					chargebackDetails[i].setWs075Currency((String)chargebackDetailsMAP.get("currency"));
					chargebackDetails[i].setWs075DocumentIndicator((String)chargebackDetailsMAP.get("documentIndicator"));
					chargebackDetails[i].setWs075IsPartialChargeback(chargebackDetailsMAP.get("isPartialChargeback") != null ? chargebackDetailsMAP.get("isPartialChargeback").toString() : "");
					chargebackDetails[i].setWs075MessageText((String)chargebackDetailsMAP.get("messageText"));
					chargebackDetails[i].setWs075ReasonCode((String)chargebackDetailsMAP.get("reasonCode"));
					chargebackDetails[i].setWs075Reversal(chargebackDetailsMAP.get("reversal") != null ? chargebackDetailsMAP.get("reversal").toString() : "");
					chargebackDetails[i].setWs075Reversed(chargebackDetailsMAP.get("reversed") != null ? chargebackDetailsMAP.get("reversed").toString() : "");
					
					i++;
				}
				ws075.setWs075ChargebackDetails(chargebackDetails);
			}
		}

		return ws075;
	}

}
