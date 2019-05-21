package sdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mastercard.api.core.exception.ApiException;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.CaseFiling;

import common.CommonMsg;

public class CreateCaseSample {
	
	private static final Logger logger = LogManager.getLogger(CreateCaseSample.class.getName());
	
	public Map<String,Object> start_service(Map<String, Object> mapa) throws Exception {
		
		logger.info(CommonMsg.INP+mapa);
		
		if(!"".equals((String) mapa.get("ws058Consumerkey")) && !"".equals((String) mapa.get("ws058Keyalias")) && !"".equals((String) mapa.get("ws058Keystorepassword"))) {		
		
			String consumerKey = (String) mapa.get("ws058Consumerkey");
			String keyAlias = (String) mapa.get("ws058Keyalias");
			String keyPassword = (String) mapa.get("ws058Keystorepassword");

			ClasseDeAutenticacao.Autenticação(consumerKey,keyAlias,keyPassword);
		}else {
			Map<String,Object> retorno = new HashMap();
			retorno.put("Erro", CommonMsg.COD_STATUS_CRED);
			retorno.put("Message", CommonMsg.MSG_STATUS_CRED);
			return retorno;
		}

		try {

			RequestMap map = new RequestMap();
			
			if(!"".equals((String) mapa.get("ws058CaseType"))) {
				map.set("caseType", (String) mapa.get("ws058CaseType"));				
			}

			if(mapa.get("ws058ChargebackRefNum") != null) {
				if(mapa.get("ws058ChargebackRefNum") instanceof List) {
					String lista = (((List) mapa.get("ws058ChargebackRefNum")).get(0)).toString().split(",")[0];
					map.set("chargebackRefNum[0]", lista);
				}
			}

			if(!"".equals((String) mapa.get("ws058CustomerFilingNumber"))) {
				map.set("customerFilingNumber", (String) mapa.get("ws058CustomerFilingNumber"));				
			}

			if(!"".equals((String) mapa.get("ws058DisputeAmount"))) {
				map.set("disputeAmount", (String) mapa.get("ws058DisputeAmount"));				
			}

			if(!"".equals((String) mapa.get("ws058CurrencyCode"))) {
				map.set("currencyCode", (String) mapa.get("ws058CurrencyCode"));				
			}

			if(!"".equals((String) mapa.get("ws058DueDate"))) {
				map.set("dueDate", (String) mapa.get("ws058DueDate"));				
			}

			if(!"".equals((String) mapa.get("ws058FileAttachment"))) {
				map.set("fileAttachment", (String) mapa.get("ws058FileAttachment"));				
			}

			if(!"".equals((String) mapa.get("ws058FiledAgainstIca"))) {
				map.set("filedAgainstIca", (String) mapa.get("ws058FiledAgainstIca"));				
			}

			if(!"".equals((String) mapa.get("ws058FilingAs"))) {
				map.set("filingAs", (String) mapa.get("ws058FilingAs"));				
			}

			if(!"".equals((String) mapa.get("ws058FilingIca"))) {
				map.set("filingIca", (String) mapa.get("ws058FilingIca"));				
			}

			if(!"".equals((String) mapa.get("ws058Memo"))) {
				map.set("memo", (String) mapa.get("ws058Memo"));				
			}

			if(!"".equals((String) mapa.get("ws058PrimaryAccountNum"))) {
				map.set("primaryAccountNum", (String) mapa.get("ws058PrimaryAccountNum"));				
			}

			if(!"".equals((String) mapa.get("ws058AcquirerRefNum"))) {
				map.set("acquirerRefNum", (String) mapa.get("ws058AcquirerRefNum"));				
			}

			if(!"".equals((String) mapa.get("ws058ChargebackReasonCode"))) {
				map.set("chargebackReasonCode", (String) mapa.get("ws058ChargebackReasonCode"));				
			}

			if(!"".equals((String) mapa.get("ws058MerchantName"))) {
				map.set("merchantName", (String) mapa.get("ws058MerchantName"));				
			}

			if(!"".equals((String) mapa.get("ws058ViolationCode"))) {
				map.set("violationCode", (String) mapa.get("ws058ViolationCode"));				
			}

			if(!"".equals((String) mapa.get("ws058ViolationDate"))) {
				map.set("violationDate", (String) mapa.get("ws058ViolationDate"));				
			}

			if(!"".equals((String) mapa.get("ws058ChargebackDate"))) {
				map.set("creditDate", (String) mapa.get("ws058ChargebackDate"));				
			}

			if(!"".equals((String) mapa.get("ws058CreditDate"))) {
				map.set("acquirerRefNumber", (String) mapa.get("ws058CreditDate"));				
			}
			
			if(mapa.get("ws058CaseFilingEbdfDocuments") != null) {
				
				LinkedHashMap<?,?> CaseFilingEbdfDocuments = (LinkedHashMap<?, ?>) mapa.get("ws058CaseFilingEbdfDocuments");
				
				LinkedHashMap<?,?> expeditedBillingDrfDocument;
				if (CaseFilingEbdfDocuments.get("expeditedBillingDrfDocument") != null)
					expeditedBillingDrfDocument = (LinkedHashMap<?, ?>) CaseFilingEbdfDocuments.get("expeditedBillingDrfDocument");
				else
					expeditedBillingDrfDocument = null;
				
				
				LinkedHashMap<?,?> smsLinkedCaseFilingDrfDocument;
				if (CaseFilingEbdfDocuments.get("smsLinkedCaseFilingDrfDocument") != null)
					smsLinkedCaseFilingDrfDocument = (LinkedHashMap<?, ?>) CaseFilingEbdfDocuments.get("smsLinkedCaseFilingDrfDocument");
				else
					smsLinkedCaseFilingDrfDocument = null;
				
				
				
				if(expeditedBillingDrfDocument != null) {
					if(!"".equals((String) expeditedBillingDrfDocument.get("ws058CardholderName"))) {
						map.set("caseFilingEbdfDocuments.expeditedBillingDrfDocument.cardholderName", (String) expeditedBillingDrfDocument.get("ws058CardholderName"));				
					}
					if(!"".equals((String) expeditedBillingDrfDocument.get("ws058AcquirerRefData"))) {
						map.set("caseFilingEbdfDocuments.expeditedBillingDrfDocument.acquirerRefData", (String) expeditedBillingDrfDocument.get("ws058AcquirerRefData"));				
					}
					if(!"".equals((String) expeditedBillingDrfDocument.get("ws058TransactionDate"))) {
						map.set("caseFilingEbdfDocuments.expeditedBillingDrfDocument.transactionDate", (String) expeditedBillingDrfDocument.get("ws058TransactionDate"));				
					}
					if(!"".equals((String) expeditedBillingDrfDocument.get("ws058TransactionAmount"))) {
						map.set("caseFilingEbdfDocuments.expeditedBillingDrfDocument.transactionAmount", (String) expeditedBillingDrfDocument.get("ws058TransactionAmount"));				
					}
					if(!"".equals((String) expeditedBillingDrfDocument.get("ws058DisputeDescription"))) {
						map.set("caseFilingEbdfDocuments.expeditedBillingDrfDocument.disputeDescription", (String) expeditedBillingDrfDocument.get("ws058DisputeDescription"));				
					}
					if(!"".equals((String) expeditedBillingDrfDocument.get("ws058Certification"))) {
						map.set("caseFilingEbdfDocuments.expeditedBillingDrfDocument.certification", (String) expeditedBillingDrfDocument.get("ws058Certification"));				
					}
					if(!"".equals((String) expeditedBillingDrfDocument.get("ws058ChargebackRepresentative"))) {
						map.set("caseFilingEbdfDocuments.expeditedBillingDrfDocument.chargebackRepresentative", (String) expeditedBillingDrfDocument.get("ws058ChargebackRepresentative"));				
					}
				}
				if(smsLinkedCaseFilingDrfDocument != null) {	
					if(!"".equals((String) smsLinkedCaseFilingDrfDocument.get("ws058ContactName"))) {
						map.set("caseFilingEbdfDocuments.smsLinkedCaseFilingDrfDocument.contactName", (String) smsLinkedCaseFilingDrfDocument.get("ws058ContactName"));				
					}
					if(!"".equals((String) smsLinkedCaseFilingDrfDocument.get("ws058CompanyOrInstitution"))) {
						map.set("caseFilingEbdfDocuments.smsLinkedCaseFilingDrfDocument.companyOrInstitution", (String) smsLinkedCaseFilingDrfDocument.get("ws058CompanyOrInstitution"));				
					}
					if(!"".equals((String) smsLinkedCaseFilingDrfDocument.get("ws058ContactEmail"))) {
						map.set("caseFilingEbdfDocuments.smsLinkedCaseFilingDrfDocument.contactEmail", (String) smsLinkedCaseFilingDrfDocument.get("ws058ContactEmail"));				
					}
					if(!"".equals((String) smsLinkedCaseFilingDrfDocument.get("ws058ReasonForFilingCase"))) {
						map.set("caseFilingEbdfDocuments.smsLinkedCaseFilingDrfDocument.reasonForFilingCase", (String) smsLinkedCaseFilingDrfDocument.get("ws058ReasonForFilingCase"));				
					}
					if(!"".equals((String) smsLinkedCaseFilingDrfDocument.get("ws058ProcessorId"))) {
						map.set("caseFilingEbdfDocuments.smsLinkedCaseFilingDrfDocument.processorId", (String) smsLinkedCaseFilingDrfDocument.get("ws058ProcessorId"));				
					}
					if(!"".equals((String) smsLinkedCaseFilingDrfDocument.get("ws058AcquirerSwitchSerialNum"))) {
						map.set("caseFilingEbdfDocuments.smsLinkedCaseFilingDrfDocument.acquirerSwitchSerialNum", (String) smsLinkedCaseFilingDrfDocument.get("ws058AcquirerSwitchSerialNum"));				
					}
					if(!"".equals((String) smsLinkedCaseFilingDrfDocument.get("ws058TransactionOrSettlementDate"))) {
						map.set("caseFilingEbdfDocuments.smsLinkedCaseFilingDrfDocument.transactionOrSettlementDate", (String) smsLinkedCaseFilingDrfDocument.get("ws058TransactionOrSettlementDate"));				
					}
					if(!"".equals((String) smsLinkedCaseFilingDrfDocument.get("ws058NumberOfTransactions"))) {
						map.set("caseFilingEbdfDocuments.smsLinkedCaseFilingDrfDocument.numberOfTransactions", (String) smsLinkedCaseFilingDrfDocument.get("ws058NumberOfTransactions"));				
					}	
				}	
			}
			
			CaseFiling response = CaseFiling.create(map);	
			
			return response;

		} catch (ApiException e) {
			logger.error(CommonMsg.MC_ERR+e.getHttpStatus()+CommonMsg.MC_MSG+e.getMessage()+CommonMsg.MC_REASON+e.getReasonCode()+CommonMsg.MC_SOURCE+e.getSource(), e);
			Map<String,Object> retorno = new HashMap();
			retorno.put("Erro", e.getHttpStatus());
			retorno.put("Message", e.getMessage()+e.getSource());
			return retorno;
		}
	}
	
}
