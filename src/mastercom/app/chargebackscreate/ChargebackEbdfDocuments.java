/**
 * ChargebackEbdfDocuments.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.chargebackscreate;

public class ChargebackEbdfDocuments  implements java.io.Serializable {
    private mastercom.app.chargebackscreate.TransactionInformation ws056TransactionInformation;

    private mastercom.app.chargebackscreate.FraudDrfDocument ws056FraudDrfDocument;

    private mastercom.app.chargebackscreate.CardholderDisputeChargebackDrfDocument ws056CardholderDisputeChargebackDrfDocument;

    private mastercom.app.chargebackscreate.PointOfInteractionErrorsDrfDocument ws056PointOfInteractionErrorsDrfDocument;

    public ChargebackEbdfDocuments() {
    }

    public ChargebackEbdfDocuments(
           mastercom.app.chargebackscreate.TransactionInformation ws056TransactionInformation,
           mastercom.app.chargebackscreate.FraudDrfDocument ws056FraudDrfDocument,
           mastercom.app.chargebackscreate.CardholderDisputeChargebackDrfDocument ws056CardholderDisputeChargebackDrfDocument,
           mastercom.app.chargebackscreate.PointOfInteractionErrorsDrfDocument ws056PointOfInteractionErrorsDrfDocument) {
           this.ws056TransactionInformation = ws056TransactionInformation;
           this.ws056FraudDrfDocument = ws056FraudDrfDocument;
           this.ws056CardholderDisputeChargebackDrfDocument = ws056CardholderDisputeChargebackDrfDocument;
           this.ws056PointOfInteractionErrorsDrfDocument = ws056PointOfInteractionErrorsDrfDocument;
    }


    /**
     * Gets the ws056TransactionInformation value for this ChargebackEbdfDocuments.
     * 
     * @return ws056TransactionInformation
     */
    public mastercom.app.chargebackscreate.TransactionInformation getWs056TransactionInformation() {
        return ws056TransactionInformation;
    }


    /**
     * Sets the ws056TransactionInformation value for this ChargebackEbdfDocuments.
     * 
     * @param ws056TransactionInformation
     */
    public void setWs056TransactionInformation(mastercom.app.chargebackscreate.TransactionInformation ws056TransactionInformation) {
        this.ws056TransactionInformation = ws056TransactionInformation;
    }


    /**
     * Gets the ws056FraudDrfDocument value for this ChargebackEbdfDocuments.
     * 
     * @return ws056FraudDrfDocument
     */
    public mastercom.app.chargebackscreate.FraudDrfDocument getWs056FraudDrfDocument() {
        return ws056FraudDrfDocument;
    }


    /**
     * Sets the ws056FraudDrfDocument value for this ChargebackEbdfDocuments.
     * 
     * @param ws056FraudDrfDocument
     */
    public void setWs056FraudDrfDocument(mastercom.app.chargebackscreate.FraudDrfDocument ws056FraudDrfDocument) {
        this.ws056FraudDrfDocument = ws056FraudDrfDocument;
    }


    /**
     * Gets the ws056CardholderDisputeChargebackDrfDocument value for this ChargebackEbdfDocuments.
     * 
     * @return ws056CardholderDisputeChargebackDrfDocument
     */
    public mastercom.app.chargebackscreate.CardholderDisputeChargebackDrfDocument getWs056CardholderDisputeChargebackDrfDocument() {
        return ws056CardholderDisputeChargebackDrfDocument;
    }


    /**
     * Sets the ws056CardholderDisputeChargebackDrfDocument value for this ChargebackEbdfDocuments.
     * 
     * @param ws056CardholderDisputeChargebackDrfDocument
     */
    public void setWs056CardholderDisputeChargebackDrfDocument(mastercom.app.chargebackscreate.CardholderDisputeChargebackDrfDocument ws056CardholderDisputeChargebackDrfDocument) {
        this.ws056CardholderDisputeChargebackDrfDocument = ws056CardholderDisputeChargebackDrfDocument;
    }


    /**
     * Gets the ws056PointOfInteractionErrorsDrfDocument value for this ChargebackEbdfDocuments.
     * 
     * @return ws056PointOfInteractionErrorsDrfDocument
     */
    public mastercom.app.chargebackscreate.PointOfInteractionErrorsDrfDocument getWs056PointOfInteractionErrorsDrfDocument() {
        return ws056PointOfInteractionErrorsDrfDocument;
    }


    /**
     * Sets the ws056PointOfInteractionErrorsDrfDocument value for this ChargebackEbdfDocuments.
     * 
     * @param ws056PointOfInteractionErrorsDrfDocument
     */
    public void setWs056PointOfInteractionErrorsDrfDocument(mastercom.app.chargebackscreate.PointOfInteractionErrorsDrfDocument ws056PointOfInteractionErrorsDrfDocument) {
        this.ws056PointOfInteractionErrorsDrfDocument = ws056PointOfInteractionErrorsDrfDocument;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChargebackEbdfDocuments)) return false;
        ChargebackEbdfDocuments other = (ChargebackEbdfDocuments) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ws056TransactionInformation==null && other.getWs056TransactionInformation()==null) || 
             (this.ws056TransactionInformation!=null &&
              this.ws056TransactionInformation.equals(other.getWs056TransactionInformation()))) &&
            ((this.ws056FraudDrfDocument==null && other.getWs056FraudDrfDocument()==null) || 
             (this.ws056FraudDrfDocument!=null &&
              this.ws056FraudDrfDocument.equals(other.getWs056FraudDrfDocument()))) &&
            ((this.ws056CardholderDisputeChargebackDrfDocument==null && other.getWs056CardholderDisputeChargebackDrfDocument()==null) || 
             (this.ws056CardholderDisputeChargebackDrfDocument!=null &&
              this.ws056CardholderDisputeChargebackDrfDocument.equals(other.getWs056CardholderDisputeChargebackDrfDocument()))) &&
            ((this.ws056PointOfInteractionErrorsDrfDocument==null && other.getWs056PointOfInteractionErrorsDrfDocument()==null) || 
             (this.ws056PointOfInteractionErrorsDrfDocument!=null &&
              this.ws056PointOfInteractionErrorsDrfDocument.equals(other.getWs056PointOfInteractionErrorsDrfDocument())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getWs056TransactionInformation() != null) {
            _hashCode += getWs056TransactionInformation().hashCode();
        }
        if (getWs056FraudDrfDocument() != null) {
            _hashCode += getWs056FraudDrfDocument().hashCode();
        }
        if (getWs056CardholderDisputeChargebackDrfDocument() != null) {
            _hashCode += getWs056CardholderDisputeChargebackDrfDocument().hashCode();
        }
        if (getWs056PointOfInteractionErrorsDrfDocument() != null) {
            _hashCode += getWs056PointOfInteractionErrorsDrfDocument().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChargebackEbdfDocuments.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/chargebackscreate/", "chargebackEbdfDocuments"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws056TransactionInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws056-transactionInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/chargebackscreate/", "transactionInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws056FraudDrfDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws056-fraudDrfDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/chargebackscreate/", "fraudDrfDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws056CardholderDisputeChargebackDrfDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws056-cardholderDisputeChargebackDrfDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/chargebackscreate/", "cardholderDisputeChargebackDrfDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws056PointOfInteractionErrorsDrfDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws056-pointOfInteractionErrorsDrfDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/chargebackscreate/", "pointOfInteractionErrorsDrfDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
