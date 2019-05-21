/**
 * ExpeditedBillingDrfDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.CaseFilingCreate;

public class ExpeditedBillingDrfDocument  implements java.io.Serializable {
    private java.lang.String ws058CardholderName;

    private java.lang.String ws058AcquirerRefData;

    private java.lang.String ws058TransactionDate;

    private java.lang.String ws058TransactionAmount;

    private java.lang.String ws058DisputeDescription;

    private java.lang.String ws058Certification;

    private java.lang.String ws058ChargebackRepresentative;

    public ExpeditedBillingDrfDocument() {
    }

    public ExpeditedBillingDrfDocument(
           java.lang.String ws058CardholderName,
           java.lang.String ws058AcquirerRefData,
           java.lang.String ws058TransactionDate,
           java.lang.String ws058TransactionAmount,
           java.lang.String ws058DisputeDescription,
           java.lang.String ws058Certification,
           java.lang.String ws058ChargebackRepresentative) {
           this.ws058CardholderName = ws058CardholderName;
           this.ws058AcquirerRefData = ws058AcquirerRefData;
           this.ws058TransactionDate = ws058TransactionDate;
           this.ws058TransactionAmount = ws058TransactionAmount;
           this.ws058DisputeDescription = ws058DisputeDescription;
           this.ws058Certification = ws058Certification;
           this.ws058ChargebackRepresentative = ws058ChargebackRepresentative;
    }


    /**
     * Gets the ws058CardholderName value for this ExpeditedBillingDrfDocument.
     * 
     * @return ws058CardholderName
     */
    public java.lang.String getWs058CardholderName() {
        return ws058CardholderName;
    }


    /**
     * Sets the ws058CardholderName value for this ExpeditedBillingDrfDocument.
     * 
     * @param ws058CardholderName
     */
    public void setWs058CardholderName(java.lang.String ws058CardholderName) {
        this.ws058CardholderName = ws058CardholderName;
    }


    /**
     * Gets the ws058AcquirerRefData value for this ExpeditedBillingDrfDocument.
     * 
     * @return ws058AcquirerRefData
     */
    public java.lang.String getWs058AcquirerRefData() {
        return ws058AcquirerRefData;
    }


    /**
     * Sets the ws058AcquirerRefData value for this ExpeditedBillingDrfDocument.
     * 
     * @param ws058AcquirerRefData
     */
    public void setWs058AcquirerRefData(java.lang.String ws058AcquirerRefData) {
        this.ws058AcquirerRefData = ws058AcquirerRefData;
    }


    /**
     * Gets the ws058TransactionDate value for this ExpeditedBillingDrfDocument.
     * 
     * @return ws058TransactionDate
     */
    public java.lang.String getWs058TransactionDate() {
        return ws058TransactionDate;
    }


    /**
     * Sets the ws058TransactionDate value for this ExpeditedBillingDrfDocument.
     * 
     * @param ws058TransactionDate
     */
    public void setWs058TransactionDate(java.lang.String ws058TransactionDate) {
        this.ws058TransactionDate = ws058TransactionDate;
    }


    /**
     * Gets the ws058TransactionAmount value for this ExpeditedBillingDrfDocument.
     * 
     * @return ws058TransactionAmount
     */
    public java.lang.String getWs058TransactionAmount() {
        return ws058TransactionAmount;
    }


    /**
     * Sets the ws058TransactionAmount value for this ExpeditedBillingDrfDocument.
     * 
     * @param ws058TransactionAmount
     */
    public void setWs058TransactionAmount(java.lang.String ws058TransactionAmount) {
        this.ws058TransactionAmount = ws058TransactionAmount;
    }


    /**
     * Gets the ws058DisputeDescription value for this ExpeditedBillingDrfDocument.
     * 
     * @return ws058DisputeDescription
     */
    public java.lang.String getWs058DisputeDescription() {
        return ws058DisputeDescription;
    }


    /**
     * Sets the ws058DisputeDescription value for this ExpeditedBillingDrfDocument.
     * 
     * @param ws058DisputeDescription
     */
    public void setWs058DisputeDescription(java.lang.String ws058DisputeDescription) {
        this.ws058DisputeDescription = ws058DisputeDescription;
    }


    /**
     * Gets the ws058Certification value for this ExpeditedBillingDrfDocument.
     * 
     * @return ws058Certification
     */
    public java.lang.String getWs058Certification() {
        return ws058Certification;
    }


    /**
     * Sets the ws058Certification value for this ExpeditedBillingDrfDocument.
     * 
     * @param ws058Certification
     */
    public void setWs058Certification(java.lang.String ws058Certification) {
        this.ws058Certification = ws058Certification;
    }


    /**
     * Gets the ws058ChargebackRepresentative value for this ExpeditedBillingDrfDocument.
     * 
     * @return ws058ChargebackRepresentative
     */
    public java.lang.String getWs058ChargebackRepresentative() {
        return ws058ChargebackRepresentative;
    }


    /**
     * Sets the ws058ChargebackRepresentative value for this ExpeditedBillingDrfDocument.
     * 
     * @param ws058ChargebackRepresentative
     */
    public void setWs058ChargebackRepresentative(java.lang.String ws058ChargebackRepresentative) {
        this.ws058ChargebackRepresentative = ws058ChargebackRepresentative;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpeditedBillingDrfDocument)) return false;
        ExpeditedBillingDrfDocument other = (ExpeditedBillingDrfDocument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ws058CardholderName==null && other.getWs058CardholderName()==null) || 
             (this.ws058CardholderName!=null &&
              this.ws058CardholderName.equals(other.getWs058CardholderName()))) &&
            ((this.ws058AcquirerRefData==null && other.getWs058AcquirerRefData()==null) || 
             (this.ws058AcquirerRefData!=null &&
              this.ws058AcquirerRefData.equals(other.getWs058AcquirerRefData()))) &&
            ((this.ws058TransactionDate==null && other.getWs058TransactionDate()==null) || 
             (this.ws058TransactionDate!=null &&
              this.ws058TransactionDate.equals(other.getWs058TransactionDate()))) &&
            ((this.ws058TransactionAmount==null && other.getWs058TransactionAmount()==null) || 
             (this.ws058TransactionAmount!=null &&
              this.ws058TransactionAmount.equals(other.getWs058TransactionAmount()))) &&
            ((this.ws058DisputeDescription==null && other.getWs058DisputeDescription()==null) || 
             (this.ws058DisputeDescription!=null &&
              this.ws058DisputeDescription.equals(other.getWs058DisputeDescription()))) &&
            ((this.ws058Certification==null && other.getWs058Certification()==null) || 
             (this.ws058Certification!=null &&
              this.ws058Certification.equals(other.getWs058Certification()))) &&
            ((this.ws058ChargebackRepresentative==null && other.getWs058ChargebackRepresentative()==null) || 
             (this.ws058ChargebackRepresentative!=null &&
              this.ws058ChargebackRepresentative.equals(other.getWs058ChargebackRepresentative())));
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
        if (getWs058CardholderName() != null) {
            _hashCode += getWs058CardholderName().hashCode();
        }
        if (getWs058AcquirerRefData() != null) {
            _hashCode += getWs058AcquirerRefData().hashCode();
        }
        if (getWs058TransactionDate() != null) {
            _hashCode += getWs058TransactionDate().hashCode();
        }
        if (getWs058TransactionAmount() != null) {
            _hashCode += getWs058TransactionAmount().hashCode();
        }
        if (getWs058DisputeDescription() != null) {
            _hashCode += getWs058DisputeDescription().hashCode();
        }
        if (getWs058Certification() != null) {
            _hashCode += getWs058Certification().hashCode();
        }
        if (getWs058ChargebackRepresentative() != null) {
            _hashCode += getWs058ChargebackRepresentative().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpeditedBillingDrfDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/CaseFilingCreate/", "expeditedBillingDrfDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws058CardholderName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws058-cardholderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws058AcquirerRefData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws058-acquirerRefData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws058TransactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws058-transactionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws058TransactionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws058-transactionAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws058DisputeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws058-disputeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws058Certification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws058-certification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws058ChargebackRepresentative");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws058-chargebackRepresentative"));
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
