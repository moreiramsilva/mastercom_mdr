/**
 * Ws072.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.Migrated_Disputes;

public class Ws072  implements java.io.Serializable {
    private java.lang.String ws072PageSize;

    private java.lang.String ws072PageNumber;

    private java.lang.String ws072ActivityType;

    private java.lang.String ws072Ica;

    private java.lang.String ws072KeyAlias;

    private java.lang.String ws072KeyStorePassword;

    private java.lang.String ws072ConsumerKey;

    public Ws072() {
    }

    public Ws072(
           java.lang.String ws072PageSize,
           java.lang.String ws072PageNumber,
           java.lang.String ws072ActivityType,
           java.lang.String ws072Ica,
           java.lang.String ws072KeyAlias,
           java.lang.String ws072KeyStorePassword,
           java.lang.String ws072ConsumerKey) {
           this.ws072PageSize = ws072PageSize;
           this.ws072PageNumber = ws072PageNumber;
           this.ws072ActivityType = ws072ActivityType;
           this.ws072Ica = ws072Ica;
           this.ws072KeyAlias = ws072KeyAlias;
           this.ws072KeyStorePassword = ws072KeyStorePassword;
           this.ws072ConsumerKey = ws072ConsumerKey;
    }


    /**
     * Gets the ws072PageSize value for this Ws072.
     * 
     * @return ws072PageSize
     */
    public java.lang.String getWs072PageSize() {
        return ws072PageSize;
    }


    /**
     * Sets the ws072PageSize value for this Ws072.
     * 
     * @param ws072PageSize
     */
    public void setWs072PageSize(java.lang.String ws072PageSize) {
        this.ws072PageSize = ws072PageSize;
    }


    /**
     * Gets the ws072PageNumber value for this Ws072.
     * 
     * @return ws072PageNumber
     */
    public java.lang.String getWs072PageNumber() {
        return ws072PageNumber;
    }


    /**
     * Sets the ws072PageNumber value for this Ws072.
     * 
     * @param ws072PageNumber
     */
    public void setWs072PageNumber(java.lang.String ws072PageNumber) {
        this.ws072PageNumber = ws072PageNumber;
    }


    /**
     * Gets the ws072ActivityType value for this Ws072.
     * 
     * @return ws072ActivityType
     */
    public java.lang.String getWs072ActivityType() {
        return ws072ActivityType;
    }


    /**
     * Sets the ws072ActivityType value for this Ws072.
     * 
     * @param ws072ActivityType
     */
    public void setWs072ActivityType(java.lang.String ws072ActivityType) {
        this.ws072ActivityType = ws072ActivityType;
    }


    /**
     * Gets the ws072Ica value for this Ws072.
     * 
     * @return ws072Ica
     */
    public java.lang.String getWs072Ica() {
        return ws072Ica;
    }


    /**
     * Sets the ws072Ica value for this Ws072.
     * 
     * @param ws072Ica
     */
    public void setWs072Ica(java.lang.String ws072Ica) {
        this.ws072Ica = ws072Ica;
    }


    /**
     * Gets the ws072KeyAlias value for this Ws072.
     * 
     * @return ws072KeyAlias
     */
    public java.lang.String getWs072KeyAlias() {
        return ws072KeyAlias;
    }


    /**
     * Sets the ws072KeyAlias value for this Ws072.
     * 
     * @param ws072KeyAlias
     */
    public void setWs072KeyAlias(java.lang.String ws072KeyAlias) {
        this.ws072KeyAlias = ws072KeyAlias;
    }


    /**
     * Gets the ws072KeyStorePassword value for this Ws072.
     * 
     * @return ws072KeyStorePassword
     */
    public java.lang.String getWs072KeyStorePassword() {
        return ws072KeyStorePassword;
    }


    /**
     * Sets the ws072KeyStorePassword value for this Ws072.
     * 
     * @param ws072KeyStorePassword
     */
    public void setWs072KeyStorePassword(java.lang.String ws072KeyStorePassword) {
        this.ws072KeyStorePassword = ws072KeyStorePassword;
    }


    /**
     * Gets the ws072ConsumerKey value for this Ws072.
     * 
     * @return ws072ConsumerKey
     */
    public java.lang.String getWs072ConsumerKey() {
        return ws072ConsumerKey;
    }


    /**
     * Sets the ws072ConsumerKey value for this Ws072.
     * 
     * @param ws072ConsumerKey
     */
    public void setWs072ConsumerKey(java.lang.String ws072ConsumerKey) {
        this.ws072ConsumerKey = ws072ConsumerKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ws072)) return false;
        Ws072 other = (Ws072) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ws072PageSize==null && other.getWs072PageSize()==null) || 
             (this.ws072PageSize!=null &&
              this.ws072PageSize.equals(other.getWs072PageSize()))) &&
            ((this.ws072PageNumber==null && other.getWs072PageNumber()==null) || 
             (this.ws072PageNumber!=null &&
              this.ws072PageNumber.equals(other.getWs072PageNumber()))) &&
            ((this.ws072ActivityType==null && other.getWs072ActivityType()==null) || 
             (this.ws072ActivityType!=null &&
              this.ws072ActivityType.equals(other.getWs072ActivityType()))) &&
            ((this.ws072Ica==null && other.getWs072Ica()==null) || 
             (this.ws072Ica!=null &&
              this.ws072Ica.equals(other.getWs072Ica()))) &&
            ((this.ws072KeyAlias==null && other.getWs072KeyAlias()==null) || 
             (this.ws072KeyAlias!=null &&
              this.ws072KeyAlias.equals(other.getWs072KeyAlias()))) &&
            ((this.ws072KeyStorePassword==null && other.getWs072KeyStorePassword()==null) || 
             (this.ws072KeyStorePassword!=null &&
              this.ws072KeyStorePassword.equals(other.getWs072KeyStorePassword()))) &&
            ((this.ws072ConsumerKey==null && other.getWs072ConsumerKey()==null) || 
             (this.ws072ConsumerKey!=null &&
              this.ws072ConsumerKey.equals(other.getWs072ConsumerKey())));
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
        if (getWs072PageSize() != null) {
            _hashCode += getWs072PageSize().hashCode();
        }
        if (getWs072PageNumber() != null) {
            _hashCode += getWs072PageNumber().hashCode();
        }
        if (getWs072ActivityType() != null) {
            _hashCode += getWs072ActivityType().hashCode();
        }
        if (getWs072Ica() != null) {
            _hashCode += getWs072Ica().hashCode();
        }
        if (getWs072KeyAlias() != null) {
            _hashCode += getWs072KeyAlias().hashCode();
        }
        if (getWs072KeyStorePassword() != null) {
            _hashCode += getWs072KeyStorePassword().hashCode();
        }
        if (getWs072ConsumerKey() != null) {
            _hashCode += getWs072ConsumerKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ws072.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/Migrated_Disputes/", "ws072"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws072PageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws072-pageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws072PageNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws072-pageNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws072ActivityType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws072-activityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws072Ica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws072-ica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws072KeyAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws072-key-alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws072KeyStorePassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws072-key-store-password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws072ConsumerKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws072-consumer-key"));
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
