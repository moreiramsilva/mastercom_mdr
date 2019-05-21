/**
 * FraudDrfDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.chargebackscreate;

public class FraudDrfDocument  implements java.io.Serializable {
    private java.lang.String ws056NumberOfItems;

    private java.lang.String ws056Types;

    private java.lang.String ws056AdditionalInformation;

    private java.lang.String ws056ChargebackRepresentative;

    private java.lang.String ws056CardIssuerRegion;

    private mastercom.app.chargebackscreate.CardholderVerificationMethod ws056CardholderVerificationMethod;

    public FraudDrfDocument() {
    }

    public FraudDrfDocument(
           java.lang.String ws056NumberOfItems,
           java.lang.String ws056Types,
           java.lang.String ws056AdditionalInformation,
           java.lang.String ws056ChargebackRepresentative,
           java.lang.String ws056CardIssuerRegion,
           mastercom.app.chargebackscreate.CardholderVerificationMethod ws056CardholderVerificationMethod) {
           this.ws056NumberOfItems = ws056NumberOfItems;
           this.ws056Types = ws056Types;
           this.ws056AdditionalInformation = ws056AdditionalInformation;
           this.ws056ChargebackRepresentative = ws056ChargebackRepresentative;
           this.ws056CardIssuerRegion = ws056CardIssuerRegion;
           this.ws056CardholderVerificationMethod = ws056CardholderVerificationMethod;
    }


    /**
     * Gets the ws056NumberOfItems value for this FraudDrfDocument.
     * 
     * @return ws056NumberOfItems
     */
    public java.lang.String getWs056NumberOfItems() {
        return ws056NumberOfItems;
    }


    /**
     * Sets the ws056NumberOfItems value for this FraudDrfDocument.
     * 
     * @param ws056NumberOfItems
     */
    public void setWs056NumberOfItems(java.lang.String ws056NumberOfItems) {
        this.ws056NumberOfItems = ws056NumberOfItems;
    }


    /**
     * Gets the ws056Types value for this FraudDrfDocument.
     * 
     * @return ws056Types
     */
    public java.lang.String getWs056Types() {
        return ws056Types;
    }


    /**
     * Sets the ws056Types value for this FraudDrfDocument.
     * 
     * @param ws056Types
     */
    public void setWs056Types(java.lang.String ws056Types) {
        this.ws056Types = ws056Types;
    }


    /**
     * Gets the ws056AdditionalInformation value for this FraudDrfDocument.
     * 
     * @return ws056AdditionalInformation
     */
    public java.lang.String getWs056AdditionalInformation() {
        return ws056AdditionalInformation;
    }


    /**
     * Sets the ws056AdditionalInformation value for this FraudDrfDocument.
     * 
     * @param ws056AdditionalInformation
     */
    public void setWs056AdditionalInformation(java.lang.String ws056AdditionalInformation) {
        this.ws056AdditionalInformation = ws056AdditionalInformation;
    }


    /**
     * Gets the ws056ChargebackRepresentative value for this FraudDrfDocument.
     * 
     * @return ws056ChargebackRepresentative
     */
    public java.lang.String getWs056ChargebackRepresentative() {
        return ws056ChargebackRepresentative;
    }


    /**
     * Sets the ws056ChargebackRepresentative value for this FraudDrfDocument.
     * 
     * @param ws056ChargebackRepresentative
     */
    public void setWs056ChargebackRepresentative(java.lang.String ws056ChargebackRepresentative) {
        this.ws056ChargebackRepresentative = ws056ChargebackRepresentative;
    }


    /**
     * Gets the ws056CardIssuerRegion value for this FraudDrfDocument.
     * 
     * @return ws056CardIssuerRegion
     */
    public java.lang.String getWs056CardIssuerRegion() {
        return ws056CardIssuerRegion;
    }


    /**
     * Sets the ws056CardIssuerRegion value for this FraudDrfDocument.
     * 
     * @param ws056CardIssuerRegion
     */
    public void setWs056CardIssuerRegion(java.lang.String ws056CardIssuerRegion) {
        this.ws056CardIssuerRegion = ws056CardIssuerRegion;
    }


    /**
     * Gets the ws056CardholderVerificationMethod value for this FraudDrfDocument.
     * 
     * @return ws056CardholderVerificationMethod
     */
    public mastercom.app.chargebackscreate.CardholderVerificationMethod getWs056CardholderVerificationMethod() {
        return ws056CardholderVerificationMethod;
    }


    /**
     * Sets the ws056CardholderVerificationMethod value for this FraudDrfDocument.
     * 
     * @param ws056CardholderVerificationMethod
     */
    public void setWs056CardholderVerificationMethod(mastercom.app.chargebackscreate.CardholderVerificationMethod ws056CardholderVerificationMethod) {
        this.ws056CardholderVerificationMethod = ws056CardholderVerificationMethod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FraudDrfDocument)) return false;
        FraudDrfDocument other = (FraudDrfDocument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ws056NumberOfItems==null && other.getWs056NumberOfItems()==null) || 
             (this.ws056NumberOfItems!=null &&
              this.ws056NumberOfItems.equals(other.getWs056NumberOfItems()))) &&
            ((this.ws056Types==null && other.getWs056Types()==null) || 
             (this.ws056Types!=null &&
              this.ws056Types.equals(other.getWs056Types()))) &&
            ((this.ws056AdditionalInformation==null && other.getWs056AdditionalInformation()==null) || 
             (this.ws056AdditionalInformation!=null &&
              this.ws056AdditionalInformation.equals(other.getWs056AdditionalInformation()))) &&
            ((this.ws056ChargebackRepresentative==null && other.getWs056ChargebackRepresentative()==null) || 
             (this.ws056ChargebackRepresentative!=null &&
              this.ws056ChargebackRepresentative.equals(other.getWs056ChargebackRepresentative()))) &&
            ((this.ws056CardIssuerRegion==null && other.getWs056CardIssuerRegion()==null) || 
             (this.ws056CardIssuerRegion!=null &&
              this.ws056CardIssuerRegion.equals(other.getWs056CardIssuerRegion()))) &&
            ((this.ws056CardholderVerificationMethod==null && other.getWs056CardholderVerificationMethod()==null) || 
             (this.ws056CardholderVerificationMethod!=null &&
              this.ws056CardholderVerificationMethod.equals(other.getWs056CardholderVerificationMethod())));
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
        if (getWs056NumberOfItems() != null) {
            _hashCode += getWs056NumberOfItems().hashCode();
        }
        if (getWs056Types() != null) {
            _hashCode += getWs056Types().hashCode();
        }
        if (getWs056AdditionalInformation() != null) {
            _hashCode += getWs056AdditionalInformation().hashCode();
        }
        if (getWs056ChargebackRepresentative() != null) {
            _hashCode += getWs056ChargebackRepresentative().hashCode();
        }
        if (getWs056CardIssuerRegion() != null) {
            _hashCode += getWs056CardIssuerRegion().hashCode();
        }
        if (getWs056CardholderVerificationMethod() != null) {
            _hashCode += getWs056CardholderVerificationMethod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FraudDrfDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/chargebackscreate/", "fraudDrfDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws056NumberOfItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws056-numberOfItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws056Types");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws056-types"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws056AdditionalInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws056-additionalInformation"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws056CardIssuerRegion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws056-cardIssuerRegion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws056CardholderVerificationMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws056-cardholderVerificationMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/chargebackscreate/", "cardholderVerificationMethod"));
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
