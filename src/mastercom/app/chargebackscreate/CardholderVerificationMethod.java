/**
 * CardholderVerificationMethod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.chargebackscreate;

public class CardholderVerificationMethod  implements java.io.Serializable {
    private java.lang.String ws056OnlinePIN;

    private java.lang.String ws056OfflinePIN;

    private java.lang.String ws056Signature;

    private java.lang.String ws056None;

    public CardholderVerificationMethod() {
    }

    public CardholderVerificationMethod(
           java.lang.String ws056OnlinePIN,
           java.lang.String ws056OfflinePIN,
           java.lang.String ws056Signature,
           java.lang.String ws056None) {
           this.ws056OnlinePIN = ws056OnlinePIN;
           this.ws056OfflinePIN = ws056OfflinePIN;
           this.ws056Signature = ws056Signature;
           this.ws056None = ws056None;
    }


    /**
     * Gets the ws056OnlinePIN value for this CardholderVerificationMethod.
     * 
     * @return ws056OnlinePIN
     */
    public java.lang.String getWs056OnlinePIN() {
        return ws056OnlinePIN;
    }


    /**
     * Sets the ws056OnlinePIN value for this CardholderVerificationMethod.
     * 
     * @param ws056OnlinePIN
     */
    public void setWs056OnlinePIN(java.lang.String ws056OnlinePIN) {
        this.ws056OnlinePIN = ws056OnlinePIN;
    }


    /**
     * Gets the ws056OfflinePIN value for this CardholderVerificationMethod.
     * 
     * @return ws056OfflinePIN
     */
    public java.lang.String getWs056OfflinePIN() {
        return ws056OfflinePIN;
    }


    /**
     * Sets the ws056OfflinePIN value for this CardholderVerificationMethod.
     * 
     * @param ws056OfflinePIN
     */
    public void setWs056OfflinePIN(java.lang.String ws056OfflinePIN) {
        this.ws056OfflinePIN = ws056OfflinePIN;
    }


    /**
     * Gets the ws056Signature value for this CardholderVerificationMethod.
     * 
     * @return ws056Signature
     */
    public java.lang.String getWs056Signature() {
        return ws056Signature;
    }


    /**
     * Sets the ws056Signature value for this CardholderVerificationMethod.
     * 
     * @param ws056Signature
     */
    public void setWs056Signature(java.lang.String ws056Signature) {
        this.ws056Signature = ws056Signature;
    }


    /**
     * Gets the ws056None value for this CardholderVerificationMethod.
     * 
     * @return ws056None
     */
    public java.lang.String getWs056None() {
        return ws056None;
    }


    /**
     * Sets the ws056None value for this CardholderVerificationMethod.
     * 
     * @param ws056None
     */
    public void setWs056None(java.lang.String ws056None) {
        this.ws056None = ws056None;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardholderVerificationMethod)) return false;
        CardholderVerificationMethod other = (CardholderVerificationMethod) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ws056OnlinePIN==null && other.getWs056OnlinePIN()==null) || 
             (this.ws056OnlinePIN!=null &&
              this.ws056OnlinePIN.equals(other.getWs056OnlinePIN()))) &&
            ((this.ws056OfflinePIN==null && other.getWs056OfflinePIN()==null) || 
             (this.ws056OfflinePIN!=null &&
              this.ws056OfflinePIN.equals(other.getWs056OfflinePIN()))) &&
            ((this.ws056Signature==null && other.getWs056Signature()==null) || 
             (this.ws056Signature!=null &&
              this.ws056Signature.equals(other.getWs056Signature()))) &&
            ((this.ws056None==null && other.getWs056None()==null) || 
             (this.ws056None!=null &&
              this.ws056None.equals(other.getWs056None())));
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
        if (getWs056OnlinePIN() != null) {
            _hashCode += getWs056OnlinePIN().hashCode();
        }
        if (getWs056OfflinePIN() != null) {
            _hashCode += getWs056OfflinePIN().hashCode();
        }
        if (getWs056Signature() != null) {
            _hashCode += getWs056Signature().hashCode();
        }
        if (getWs056None() != null) {
            _hashCode += getWs056None().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardholderVerificationMethod.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/chargebackscreate/", "cardholderVerificationMethod"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws056OnlinePIN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws056-onlinePIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws056OfflinePIN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws056-offlinePIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws056Signature");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws056-signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws056None");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws056-none"));
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
