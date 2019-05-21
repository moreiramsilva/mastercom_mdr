/**
 * MigrationResponseList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.Migrated_Disputes;

public class MigrationResponseList  implements java.io.Serializable {
    private java.lang.String ws073ClaimId;

    private java.lang.String ws073ItemId;

    private java.lang.String ws073ItemType;

    private java.lang.String ws073MastercomId;

    private java.lang.String ws073AcquirerReferenceData;

    private java.lang.String ws073IssuerReferenceData;

    private java.lang.String ws073TransactionAmount;

    private java.lang.String ws073BanknetReferenceNumber;

    public MigrationResponseList() {
    }

    public MigrationResponseList(
           java.lang.String ws073ClaimId,
           java.lang.String ws073ItemId,
           java.lang.String ws073ItemType,
           java.lang.String ws073MastercomId,
           java.lang.String ws073AcquirerReferenceData,
           java.lang.String ws073IssuerReferenceData,
           java.lang.String ws073TransactionAmount,
           java.lang.String ws073BanknetReferenceNumber) {
           this.ws073ClaimId = ws073ClaimId;
           this.ws073ItemId = ws073ItemId;
           this.ws073ItemType = ws073ItemType;
           this.ws073MastercomId = ws073MastercomId;
           this.ws073AcquirerReferenceData = ws073AcquirerReferenceData;
           this.ws073IssuerReferenceData = ws073IssuerReferenceData;
           this.ws073TransactionAmount = ws073TransactionAmount;
           this.ws073BanknetReferenceNumber = ws073BanknetReferenceNumber;
    }


    /**
     * Gets the ws073ClaimId value for this MigrationResponseList.
     * 
     * @return ws073ClaimId
     */
    public java.lang.String getWs073ClaimId() {
        return ws073ClaimId;
    }


    /**
     * Sets the ws073ClaimId value for this MigrationResponseList.
     * 
     * @param ws073ClaimId
     */
    public void setWs073ClaimId(java.lang.String ws073ClaimId) {
        this.ws073ClaimId = ws073ClaimId;
    }


    /**
     * Gets the ws073ItemId value for this MigrationResponseList.
     * 
     * @return ws073ItemId
     */
    public java.lang.String getWs073ItemId() {
        return ws073ItemId;
    }


    /**
     * Sets the ws073ItemId value for this MigrationResponseList.
     * 
     * @param ws073ItemId
     */
    public void setWs073ItemId(java.lang.String ws073ItemId) {
        this.ws073ItemId = ws073ItemId;
    }


    /**
     * Gets the ws073ItemType value for this MigrationResponseList.
     * 
     * @return ws073ItemType
     */
    public java.lang.String getWs073ItemType() {
        return ws073ItemType;
    }


    /**
     * Sets the ws073ItemType value for this MigrationResponseList.
     * 
     * @param ws073ItemType
     */
    public void setWs073ItemType(java.lang.String ws073ItemType) {
        this.ws073ItemType = ws073ItemType;
    }


    /**
     * Gets the ws073MastercomId value for this MigrationResponseList.
     * 
     * @return ws073MastercomId
     */
    public java.lang.String getWs073MastercomId() {
        return ws073MastercomId;
    }


    /**
     * Sets the ws073MastercomId value for this MigrationResponseList.
     * 
     * @param ws073MastercomId
     */
    public void setWs073MastercomId(java.lang.String ws073MastercomId) {
        this.ws073MastercomId = ws073MastercomId;
    }


    /**
     * Gets the ws073AcquirerReferenceData value for this MigrationResponseList.
     * 
     * @return ws073AcquirerReferenceData
     */
    public java.lang.String getWs073AcquirerReferenceData() {
        return ws073AcquirerReferenceData;
    }


    /**
     * Sets the ws073AcquirerReferenceData value for this MigrationResponseList.
     * 
     * @param ws073AcquirerReferenceData
     */
    public void setWs073AcquirerReferenceData(java.lang.String ws073AcquirerReferenceData) {
        this.ws073AcquirerReferenceData = ws073AcquirerReferenceData;
    }


    /**
     * Gets the ws073IssuerReferenceData value for this MigrationResponseList.
     * 
     * @return ws073IssuerReferenceData
     */
    public java.lang.String getWs073IssuerReferenceData() {
        return ws073IssuerReferenceData;
    }


    /**
     * Sets the ws073IssuerReferenceData value for this MigrationResponseList.
     * 
     * @param ws073IssuerReferenceData
     */
    public void setWs073IssuerReferenceData(java.lang.String ws073IssuerReferenceData) {
        this.ws073IssuerReferenceData = ws073IssuerReferenceData;
    }


    /**
     * Gets the ws073TransactionAmount value for this MigrationResponseList.
     * 
     * @return ws073TransactionAmount
     */
    public java.lang.String getWs073TransactionAmount() {
        return ws073TransactionAmount;
    }


    /**
     * Sets the ws073TransactionAmount value for this MigrationResponseList.
     * 
     * @param ws073TransactionAmount
     */
    public void setWs073TransactionAmount(java.lang.String ws073TransactionAmount) {
        this.ws073TransactionAmount = ws073TransactionAmount;
    }


    /**
     * Gets the ws073BanknetReferenceNumber value for this MigrationResponseList.
     * 
     * @return ws073BanknetReferenceNumber
     */
    public java.lang.String getWs073BanknetReferenceNumber() {
        return ws073BanknetReferenceNumber;
    }


    /**
     * Sets the ws073BanknetReferenceNumber value for this MigrationResponseList.
     * 
     * @param ws073BanknetReferenceNumber
     */
    public void setWs073BanknetReferenceNumber(java.lang.String ws073BanknetReferenceNumber) {
        this.ws073BanknetReferenceNumber = ws073BanknetReferenceNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MigrationResponseList)) return false;
        MigrationResponseList other = (MigrationResponseList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ws073ClaimId==null && other.getWs073ClaimId()==null) || 
             (this.ws073ClaimId!=null &&
              this.ws073ClaimId.equals(other.getWs073ClaimId()))) &&
            ((this.ws073ItemId==null && other.getWs073ItemId()==null) || 
             (this.ws073ItemId!=null &&
              this.ws073ItemId.equals(other.getWs073ItemId()))) &&
            ((this.ws073ItemType==null && other.getWs073ItemType()==null) || 
             (this.ws073ItemType!=null &&
              this.ws073ItemType.equals(other.getWs073ItemType()))) &&
            ((this.ws073MastercomId==null && other.getWs073MastercomId()==null) || 
             (this.ws073MastercomId!=null &&
              this.ws073MastercomId.equals(other.getWs073MastercomId()))) &&
            ((this.ws073AcquirerReferenceData==null && other.getWs073AcquirerReferenceData()==null) || 
             (this.ws073AcquirerReferenceData!=null &&
              this.ws073AcquirerReferenceData.equals(other.getWs073AcquirerReferenceData()))) &&
            ((this.ws073IssuerReferenceData==null && other.getWs073IssuerReferenceData()==null) || 
             (this.ws073IssuerReferenceData!=null &&
              this.ws073IssuerReferenceData.equals(other.getWs073IssuerReferenceData()))) &&
            ((this.ws073TransactionAmount==null && other.getWs073TransactionAmount()==null) || 
             (this.ws073TransactionAmount!=null &&
              this.ws073TransactionAmount.equals(other.getWs073TransactionAmount()))) &&
            ((this.ws073BanknetReferenceNumber==null && other.getWs073BanknetReferenceNumber()==null) || 
             (this.ws073BanknetReferenceNumber!=null &&
              this.ws073BanknetReferenceNumber.equals(other.getWs073BanknetReferenceNumber())));
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
        if (getWs073ClaimId() != null) {
            _hashCode += getWs073ClaimId().hashCode();
        }
        if (getWs073ItemId() != null) {
            _hashCode += getWs073ItemId().hashCode();
        }
        if (getWs073ItemType() != null) {
            _hashCode += getWs073ItemType().hashCode();
        }
        if (getWs073MastercomId() != null) {
            _hashCode += getWs073MastercomId().hashCode();
        }
        if (getWs073AcquirerReferenceData() != null) {
            _hashCode += getWs073AcquirerReferenceData().hashCode();
        }
        if (getWs073IssuerReferenceData() != null) {
            _hashCode += getWs073IssuerReferenceData().hashCode();
        }
        if (getWs073TransactionAmount() != null) {
            _hashCode += getWs073TransactionAmount().hashCode();
        }
        if (getWs073BanknetReferenceNumber() != null) {
            _hashCode += getWs073BanknetReferenceNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MigrationResponseList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/Migrated_Disputes/", "migrationResponseList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws073ClaimId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws073-claimId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws073ItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws073-itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws073ItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws073-itemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws073MastercomId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws073-mastercomId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws073AcquirerReferenceData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws073-acquirerReferenceData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws073IssuerReferenceData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws073-issuerReferenceData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws073TransactionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws073-transactionAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws073BanknetReferenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws073-banknetReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
