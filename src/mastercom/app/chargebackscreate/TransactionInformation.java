/**
 * TransactionInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.chargebackscreate;

public class TransactionInformation  implements java.io.Serializable {
    private java.lang.String ws056AcquirerRefDataOrSwitchSerialNum;

    private java.lang.String ws056MerchantName;

    private java.lang.String ws056TransactionOrSettlementDate;

    private java.lang.String ws056DisputedAmount;

    public TransactionInformation() {
    }

    public TransactionInformation(
           java.lang.String ws056AcquirerRefDataOrSwitchSerialNum,
           java.lang.String ws056MerchantName,
           java.lang.String ws056TransactionOrSettlementDate,
           java.lang.String ws056DisputedAmount) {
           this.ws056AcquirerRefDataOrSwitchSerialNum = ws056AcquirerRefDataOrSwitchSerialNum;
           this.ws056MerchantName = ws056MerchantName;
           this.ws056TransactionOrSettlementDate = ws056TransactionOrSettlementDate;
           this.ws056DisputedAmount = ws056DisputedAmount;
    }


    /**
     * Gets the ws056AcquirerRefDataOrSwitchSerialNum value for this TransactionInformation.
     * 
     * @return ws056AcquirerRefDataOrSwitchSerialNum
     */
    public java.lang.String getWs056AcquirerRefDataOrSwitchSerialNum() {
        return ws056AcquirerRefDataOrSwitchSerialNum;
    }


    /**
     * Sets the ws056AcquirerRefDataOrSwitchSerialNum value for this TransactionInformation.
     * 
     * @param ws056AcquirerRefDataOrSwitchSerialNum
     */
    public void setWs056AcquirerRefDataOrSwitchSerialNum(java.lang.String ws056AcquirerRefDataOrSwitchSerialNum) {
        this.ws056AcquirerRefDataOrSwitchSerialNum = ws056AcquirerRefDataOrSwitchSerialNum;
    }


    /**
     * Gets the ws056MerchantName value for this TransactionInformation.
     * 
     * @return ws056MerchantName
     */
    public java.lang.String getWs056MerchantName() {
        return ws056MerchantName;
    }


    /**
     * Sets the ws056MerchantName value for this TransactionInformation.
     * 
     * @param ws056MerchantName
     */
    public void setWs056MerchantName(java.lang.String ws056MerchantName) {
        this.ws056MerchantName = ws056MerchantName;
    }


    /**
     * Gets the ws056TransactionOrSettlementDate value for this TransactionInformation.
     * 
     * @return ws056TransactionOrSettlementDate
     */
    public java.lang.String getWs056TransactionOrSettlementDate() {
        return ws056TransactionOrSettlementDate;
    }


    /**
     * Sets the ws056TransactionOrSettlementDate value for this TransactionInformation.
     * 
     * @param ws056TransactionOrSettlementDate
     */
    public void setWs056TransactionOrSettlementDate(java.lang.String ws056TransactionOrSettlementDate) {
        this.ws056TransactionOrSettlementDate = ws056TransactionOrSettlementDate;
    }


    /**
     * Gets the ws056DisputedAmount value for this TransactionInformation.
     * 
     * @return ws056DisputedAmount
     */
    public java.lang.String getWs056DisputedAmount() {
        return ws056DisputedAmount;
    }


    /**
     * Sets the ws056DisputedAmount value for this TransactionInformation.
     * 
     * @param ws056DisputedAmount
     */
    public void setWs056DisputedAmount(java.lang.String ws056DisputedAmount) {
        this.ws056DisputedAmount = ws056DisputedAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionInformation)) return false;
        TransactionInformation other = (TransactionInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ws056AcquirerRefDataOrSwitchSerialNum==null && other.getWs056AcquirerRefDataOrSwitchSerialNum()==null) || 
             (this.ws056AcquirerRefDataOrSwitchSerialNum!=null &&
              this.ws056AcquirerRefDataOrSwitchSerialNum.equals(other.getWs056AcquirerRefDataOrSwitchSerialNum()))) &&
            ((this.ws056MerchantName==null && other.getWs056MerchantName()==null) || 
             (this.ws056MerchantName!=null &&
              this.ws056MerchantName.equals(other.getWs056MerchantName()))) &&
            ((this.ws056TransactionOrSettlementDate==null && other.getWs056TransactionOrSettlementDate()==null) || 
             (this.ws056TransactionOrSettlementDate!=null &&
              this.ws056TransactionOrSettlementDate.equals(other.getWs056TransactionOrSettlementDate()))) &&
            ((this.ws056DisputedAmount==null && other.getWs056DisputedAmount()==null) || 
             (this.ws056DisputedAmount!=null &&
              this.ws056DisputedAmount.equals(other.getWs056DisputedAmount())));
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
        if (getWs056AcquirerRefDataOrSwitchSerialNum() != null) {
            _hashCode += getWs056AcquirerRefDataOrSwitchSerialNum().hashCode();
        }
        if (getWs056MerchantName() != null) {
            _hashCode += getWs056MerchantName().hashCode();
        }
        if (getWs056TransactionOrSettlementDate() != null) {
            _hashCode += getWs056TransactionOrSettlementDate().hashCode();
        }
        if (getWs056DisputedAmount() != null) {
            _hashCode += getWs056DisputedAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/chargebackscreate/", "transactionInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws056AcquirerRefDataOrSwitchSerialNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws056-acquirerRefDataOrSwitchSerialNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws056MerchantName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws056-merchantName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws056TransactionOrSettlementDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws056-transactionOrSettlementDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws056DisputedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws056-disputedAmount"));
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
