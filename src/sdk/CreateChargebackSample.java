package sdk;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mastercard.api.core.exception.ApiException;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.Chargebacks;

import common.CommonMsg;

public class CreateChargebackSample {

	private static final Logger logger = LogManager.getLogger(CreateChargebackSample.class.getName());

	public Map<String,Object> start_service(Map<String, Object> mapa) throws Exception {

		logger.info(CommonMsg.INP+mapa);

		if(!"".equals((String) mapa.get("ws056CosumerKey")) && !"".equals((String) mapa.get("ws056KeyAlias")) && !"".equals((String) mapa.get("ws056KeyStorePassword"))) {
			String consumerKey = (String) mapa.get("ws056CosumerKey");
			String keyAlias = (String) mapa.get("ws056KeyAlias");
			String keyPassword = (String) mapa.get("ws056KeyStorePassword");

			ClasseDeAutenticacao.Autenticação(consumerKey,keyAlias,keyPassword);			
		}else {
			Map<String,Object> retorno = new HashMap();
			retorno.put("Erro", CommonMsg.COD_STATUS_CRED);
			retorno.put("Message", CommonMsg.MSG_STATUS_CRED);
			return retorno;
		}
		try {

			RequestMap map = new RequestMap();

			if(!"".equals((String) mapa.get("ws056ClaimId"))) {
				map.set("claim-id", (String) mapa.get("ws056ClaimId"));	
			}
			if(!"".equals((String) mapa.get("ws056Currency"))) {
				map.set("currency", (String) mapa.get("ws056Currency"));	
			}
			if(!"".equals((String) mapa.get("ws056DocumentIndicator"))) {
				map.set("documentIndicator", (String) mapa.get("ws056DocumentIndicator"));	
			}
			if(!"".equals((String) mapa.get("ws056MessageText"))) {
				map.set("messageText", (String) mapa.get("ws056MessageText"));	
			}
			if(!"".equals((String) mapa.get("ws056Amount"))) {
				map.set("amount", (String) mapa.get("ws056Amount"));	
			}
			if(!"".equals((String) mapa.get("ws056ReasonCode"))) {
				map.set("reasonCode", (String) mapa.get("ws056ReasonCode"));	
			}
			if(!"".equals((String) mapa.get("ws056IsPartialChargeback"))) {
				map.set("isPartialChargeback", (String) mapa.get("ws056IsPartialChargeback"));	
			}
			if(!"".equals((String) mapa.get("ws056ChargebackType"))) {
				map.set("chargebackType", (String) mapa.get("ws056ChargebackType"));	
			}
			if(mapa.get("ws056FileAttachment") != null) {
				HashMap<?,?> file = (HashMap<?, ?>) mapa.get("ws056FileAttachment");
				if(!"".equals((String) file.get("ws056Filename"))) {
					map.set("fileAttachment.filename", file.get("ws056Filename"));
				}
				if(!"".equals((String) file.get("ws056File"))) {
					map.set("fileAttachment.file", (String) file.get("ws056File"));
				}
			}
			if(mapa.get("ws056ChargebackEbdfDocuments") != null) {
				HashMap<?,?> charge = (HashMap<?, ?>) mapa.get("ws056ChargebackEbdfDocuments");
				HashMap<?,?> trns = (HashMap<?, ?>) charge.get("ws056TransactionInformation");
				if(!"".equals((String) trns.get("ws056AcquirerRefDataOrSwitchSerialNum"))) {
					map.set("chargebackEbdfDocuments.transactionInformation.acquirerRefDataOrSwitchSerialNum", (String) trns.get("ws056AcquirerRefDataOrSwitchSerialNum"));
				}
				if(!"".equals((String) trns.get("ws056MerchantName"))) {
					map.set("chargebackEbdfDocuments.transactionInformation.merchantName", (String) trns.get("ws056MerchantName"));
				}
				if(!"".equals((String) trns.get("ws056TransactionOrSettlementDate"))) {
					map.set("chargebackEbdfDocuments.transactionInformation.transactionOrSettlementDate", (String) trns.get("ws056TransactionOrSettlementDate"));
				}
				if(!"".equals((String) trns.get("ws056DisputedAmount"))) {
					map.set("chargebackEbdfDocuments.transactionInformation.disputedAmount", (String) trns.get("ws056DisputedAmount"));
				}
				HashMap<?,?> fraud = (HashMap<?, ?>) charge.get("ws056FraudDrfDocument");
				if(!"".equals((String) fraud.get("ws056NumberOfItems"))) {
					map.set("chargebackEbdfDocuments.fraudDrfDocument.numberOfItems", (String) fraud.get("ws056NumberOfItems"));
				}
				if(!"".equals((String) fraud.get("ws056Types"))) {
					map.set("chargebackEbdfDocuments.fraudDrfDocument.types", (String) fraud.get("ws056Types"));
				}
				if(!"".equals((String) fraud.get("ws056AdditionalInformation"))) {
					map.set("chargebackEbdfDocuments.fraudDrfDocument.additionalInformation", (String) fraud.get("ws056AdditionalInformation"));
				}
				if(!"".equals((String) fraud.get("ws056ChargebackRepresentative"))) {
					map.set("chargebackEbdfDocuments.fraudDrfDocument.chargebackRepresentative", (String) fraud.get("ws056ChargebackRepresentative"));
				}
				if(!"".equals((String) fraud.get("ws056CardIssuerRegion"))) {
					map.set("chargebackEbdfDocuments.fraudDrfDocument.cardIssuerRegion", (String) fraud.get("ws056CardIssuerRegion"));
				}
				HashMap<?,?> verf = (HashMap<?, ?>) fraud.get("ws056CardholderVerificationMethod");
				if(!"".equals((String) verf.get("ws056OnlinePIN"))) {
					map.set("chargebackEbdfDocuments.fraudDrfDocument.cardholderVerificationMethod.onlinePIN", (String) fraud.get("ws056OnlinePIN"));
				}
				if(!"".equals((String) verf.get("ws056OfflinePIN"))) {
					map.set("chargebackEbdfDocuments.fraudDrfDocument.cardholderVerificationMethod.offlinePIN", (String) fraud.get("ws056OfflinePIN"));
				}
				if(!"".equals((String) verf.get("ws056Signature"))) {
					map.set("chargebackEbdfDocuments.fraudDrfDocument.cardholderVerificationMethod.signature", (String) fraud.get("ws056Signature"));
				}
				if(!"".equals((String) verf.get("ws056None"))) {
					map.set("chargebackEbdfDocuments.fraudDrfDocument.cardholderVerificationMethod.none", (String) fraud.get("ws056None"));
				}
				HashMap<?,?> drfDoc = (HashMap<?, ?>) charge.get("ws056CardholderDisputeChargebackDrfDocument");
				if(!"".equals((String) drfDoc.get("ws056TransactionAmount"))) {
					map.set("chargebackEbdfDocuments.cardholderDisputeChargebackDrfDocument.transactionAmount", (String) drfDoc.get("ws056TransactionAmount"));
				}
				if(!"".equals((String) drfDoc.get("ws056Type"))) {
					map.set("chargebackEbdfDocuments.cardholderDisputeChargebackDrfDocument.type", (String) drfDoc.get("ws056Type"));
				}
				if(!"".equals((String) drfDoc.get("ws056DeliveryDateOfGoodsOrServices"))) {
					map.set("chargebackEbdfDocuments.cardholderDisputeChargebackDrfDocument.deliveryDateOfGoodsOrServices", (String) drfDoc.get("ws056DeliveryDateOfGoodsOrServices"));
				}
				if(!"".equals((String) drfDoc.get("ws056ExpectedDeliveryDateOfGoodOrServices"))) {
					map.set("chargebackEbdfDocuments.cardholderDisputeChargebackDrfDocument.expectedDeliveryDateOfGoodOrServices", (String) drfDoc.get("ws056ExpectedDeliveryDateOfGoodOrServices"));
				}
				if(!"".equals((String) drfDoc.get("ws056ReturnDate"))) {
					map.set("chargebackEbdfDocuments.cardholderDisputeChargebackDrfDocument.returnDate", (String) drfDoc.get("ws056ReturnDate"));
				}
				if(!"".equals((String) drfDoc.get("ws056CancellationDate"))) {
					map.set("chargebackEbdfDocuments.cardholderDisputeChargebackDrfDocument.cancellationDate", (String) drfDoc.get("ws056CancellationDate"));
				}
				if(!"".equals((String) drfDoc.get("ws056CardholderParticipation"))) {
					map.set("chargebackEbdfDocuments.cardholderDisputeChargebackDrfDocument.cardholderParticipation", (String) drfDoc.get("ws056CardholderParticipation"));
				}
				if(!"".equals((String) drfDoc.get("ws056DisputeDetails"))) {
					map.set("chargebackEbdfDocuments.cardholderDisputeChargebackDrfDocument.disputeDetails", (String) drfDoc.get("ws056DisputeDetails"));
				}
				if(!"".equals((String) drfDoc.get("ws056ChargebackRepresentative"))) {
					map.set("chargebackEbdfDocuments.cardholderDisputeChargebackDrfDocument.chargebackRepresentative", (String) drfDoc.get("ws056ChargebackRepresentative"));
				}
				HashMap<?,?> point = (HashMap<?, ?>) charge.get("ws056PointOfInteractionErrorsDrfDocument");
				if(!"".equals((String) point.get("ws056TransactionAmount"))) {
					map.set("chargebackEbdfDocuments.pointOfInteractionErrorsDrfDocument.transactionAmount", (String) point.get("ws056TransactionAmount"));
				}
				if(!"".equals((String) point.get("ws056Type"))) {
					map.set("chargebackEbdfDocuments.pointOfInteractionErrorsDrfDocument.type", (String) point.get("ws056Type"));
				}
				if(!"".equals((String) point.get("ws056AlternateMeansOfPaymentDetails"))) {
					map.set("chargebackEbdfDocuments.pointOfInteractionErrorsDrfDocument.alternateMeansOfPaymentDetails", (String) point.get("ws056AlternateMeansOfPaymentDetails"));
				}
				if(!"".equals((String) point.get("ws056DisputeDetails"))) {
					map.set("chargebackEbdfDocuments.pointOfInteractionErrorsDrfDocument.disputeDetails", (String) point.get("ws056DisputeDetails"));
				}
				if(!"".equals((String) point.get("ws056ChargebackRepresentative"))) {
					map.set("chargebackEbdfDocuments.pointOfInteractionErrorsDrfDocument.chargebackRepresentative", (String) point.get("ws056ChargebackRepresentative"));
				}
			}
			Chargebacks response = Chargebacks.create(map);
			return response;

		}catch (ApiException e) {
			logger.error(CommonMsg.MC_ERR+e.getHttpStatus()+CommonMsg.MC_MSG+e.getMessage()+CommonMsg.MC_REASON+e.getReasonCode()+CommonMsg.MC_SOURCE+e.getSource(), e);
			Map<String,Object> retorno = new HashMap();
			retorno.put("Erro", e.getHttpStatus());
			retorno.put("Message", e.getMessage()+e.getSource());
			return retorno;
		}
	}
}
