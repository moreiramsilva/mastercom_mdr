/**
 * PointOfInteractionErrorsDrfDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.chargebackscreate;

public class PointOfInteractionErrorsDrfDocument  implements java.io.Serializable {
    private java.lang.String ws056TransactionAmount;

    private java.lang.String ws056Type;

    private java.lang.String ws056AlternateMeansOfPaymentDetails;

    private java.lang.String ws056DisputeDetails;

    private java.lang.String ws056ChargebackRepresentative;

    public PointOfInteractionErrorsDrfDocument() {
    }

    public PointOfInteractionErrorsDrfDocument(
           java.lang.String ws056TransactionAmount,
           java.lang.String ws056Type,
           java.lang.String ws056AlternateMeansOfPaymentDetails,
           java.lang.String ws056DisputeDetails,
           java.lang.String ws056ChargebackRepresentative) {
           this.ws056TransactionAmount = ws056TransactionAmount;
           this.ws056Type = ws056Type;
           this.ws056AlternateMeansOfPaymentDetails = ws056AlternateMeansOfPaymentDetails;
           this.ws056DisputeDetails = ws056DisputeDetails;
           this.ws056ChargebackRepresentative = ws056ChargebackRepresentative;
    }


    /**
     * Gets the ws056TransactionAmount value for this PointOfInteractionErrorsDrfDocument.
     * 
     * @return ws056TransactionAmount
     */
    public java.lang.String getWs056TransactionAmount() {
        return ws056TransactionAmount;
    }


    /**
     * Sets the ws056TransactionAmount value for this PointOfInteractionErrorsDrfDocument.
     * 
     * @param ws056TransactionAmount
     */
    public void setWs056TransactionAmount(java.lang.String ws056TransactionAmount) {
        this.ws056TransactionAmount = ws056TransactionAmount;
    }


    /**
     * Gets the ws056Type value for this PointOfInteractionErrorsDrfDocument.
     * 
     * @return ws056Type
     */
    public java.lang.String getWs056Type() {
        return ws056Type;
    }


    /**
     * Sets the ws056Type value for this PointOfInteractionErrorsDrfDocument.
     * 
     * @param ws056Type
     */
    public void setWs056Type(java.lang.String ws056Type) {
        this.ws056Type = ws056Type;
    }


    /**
     * Gets the ws056AlternateMeansOfPaymentDetails value for this PointOfInteractionErrorsDrfDocument.
     * 
     * @return ws056AlternateMeansOfPaymentDetails
     */
    public java.lang.String getWs056AlternateMeansOfPaymentDetails() {
        return ws056AlternateMeansOfPaymentDetails;
    }


    /**
     * Sets the ws056AlternateMeansOfPaymentDetails value for this PointOfInteractionErrorsDrfDocument.
     * 
     * @param ws056AlternateMeansOfPaymentDetails
     */
    public void setWs056AlternateMeansOfPaymentDetails(java.lang.String ws056AlternateMeansOfPaymentDetails) {
        this.ws056AlternateMeansOfPaymentDetails = ws056AlternateMeansOfPaymentDetails;
    }


    /**
     * Gets the ws056DisputeDetails value for this PointOfInteractionErrorsDrfDocument.
     * 
     * @return ws056DisputeDetails
     */
    public java.lang.String getWs056DisputeDetails() {
        return ws056DisputeDetails;
    }


    /**
     * Sets the ws056DisputeDetails value for this PointOfInteractionErrorsDrfDocument.
     * 
     * @param ws056DisputeDetails
     */
    public void setWs056DisputeDetails(java.lang.String ws056DisputeDetails) {
        this.ws056DisputeDetails = ws056DisputeDetails;
    }


    /**
     * Gets the ws056ChargebackRepresentative value for this PointOfInteractionErrorsDrfDocument.
     * 
     * @return ws056ChargebackRepresentative
     */
    public java.lang.String getWs056ChargebackRepresentative() {
        return ws056ChargebackRepresentative;
    }


    /**
     * Sets the ws056ChargebackRepresentative value for this PointOfInteractionErrorsDrfDocument.
     * 
     * @param ws056ChargebackRepresentative
     */
    public void setWs056ChargebackRepresentative(java.lang.String ws056ChargebackRepresentative) {
        this.ws056ChargebackRepresentative = ws056ChargebackRepresentative;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PointOfInteractionErrorsDrfDocument)) return false;
        PointOfInteractionErrorsDrfDocument other = (PointOfInteractionErrorsDrfDocument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ws056TransactionAmount==null && other.getWs056TransactionAmount()==null) || 
             (this.ws056TransactionAmount!=null &&
              this.ws056TransactionAmount.equals(other.getWs056TransactionAmount()))) &&
            ((this.ws056Type==null && other.getWs056Type()==null) || 
             (this.ws056Type!=null &&
              this.ws056Type.equals(other.getWs056Type()))) &&
            ((this.ws056AlternateMeansOfPaymentDetails==null && other.getWs056AlternateMeansOfPaymentDetails()==null) || 
             (this.ws056AlternateMeansOfPaymentDetails!=null &&
              this.ws056AlternateMeansOfPaymentDetails.equals(other.getWs056AlternateMeansOfPaymentDetails()))) &&
            ((this.ws056DisputeDetails==null && other.getWs056DisputeDetails()==null) || 
             (this.ws056DisputeDetails!=null &&
              this.ws056DisputeDetails.equals(other.getWs056DisputeDetails()))) &&
            ((this.ws056ChargebackRepresentative==null && other.getWs056ChargebackRepresentative()==null) || 
             (this.ws056ChargebackRepresentative!=null &&
              this.ws056ChargebackRepresentative.equals(other.getWs056ChargebackRepresentative())));
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
        if (getWs056TransactionAmount() != null) {
            _hashCode += getWs056TransactionAmount().hashCode();
        }
        if (getWs056Type() != null) {
            _hashCode += getWs056Type().hashCode();
        }
        if (getWs056AlternateMeansOfPaymentDetails() != null) {
            _hashCode += getWs056AlternateMeansOfPaymentDetails().hashCode();
        }
        if (getWs056DisputeDetails() != null) {
            _hashCode += getWs056DisputeDetails().hashCode();
        }
        if (getWs056ChargebackRepresentative() != null) {
            _hashCode += getWs056ChargebackRepresentative().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PointOfInteractionErrorsDrfDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/chargebackscreate/", "pointOfInteractionErrorsDrfDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws056TransactionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws056-transactionAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws056Type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws056-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws056AlternateMeansOfPaymentDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws056-alternateMeansOfPaymentDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws056DisputeDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws056-disputeDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws056ChargebackRepresentative");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws056-chargebackRepresentative"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
