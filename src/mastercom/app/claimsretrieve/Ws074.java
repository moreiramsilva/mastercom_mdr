/**
 * Ws074.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.claimsretrieve;

public class Ws074  implements java.io.Serializable {
    private java.lang.String ws074ClaimId;

    private java.lang.String ws074KeyAlias;

    private java.lang.String ws074KeyStorePassword;

    private java.lang.String ws074ConsumerKey;

    public Ws074() {
    }

    public Ws074(
           java.lang.String ws074ClaimId,
           java.lang.String ws074KeyAlias,
           java.lang.String ws074KeyStorePassword,
           java.lang.String ws074ConsumerKey) {
           this.ws074ClaimId = ws074ClaimId;
           this.ws074KeyAlias = ws074KeyAlias;
           this.ws074KeyStorePassword = ws074KeyStorePassword;
           this.ws074ConsumerKey = ws074ConsumerKey;
    }


    /**
     * Gets the ws074ClaimId value for this Ws074.
     * 
     * @return ws074ClaimId
     */
    public java.lang.String getWs074ClaimId() {
        return ws074ClaimId;
    }


    /**
     * Sets the ws074ClaimId value for this Ws074.
     * 
     * @param ws074ClaimId
     */
    public void setWs074ClaimId(java.lang.String ws074ClaimId) {
        this.ws074ClaimId = ws074ClaimId;
    }


    /**
     * Gets the ws074KeyAlias value for this Ws074.
     * 
     * @return ws074KeyAlias
     */
    public java.lang.String getWs074KeyAlias() {
        return ws074KeyAlias;
    }


    /**
     * Sets the ws074KeyAlias value for this Ws074.
     * 
     * @param ws074KeyAlias
     */
    public void setWs074KeyAlias(java.lang.String ws074KeyAlias) {
        this.ws074KeyAlias = ws074KeyAlias;
    }


    /**
     * Gets the ws074KeyStorePassword value for this Ws074.
     * 
     * @return ws074KeyStorePassword
     */
    public java.lang.String getWs074KeyStorePassword() {
        return ws074KeyStorePassword;
    }


    /**
     * Sets the ws074KeyStorePassword value for this Ws074.
     * 
     * @param ws074KeyStorePassword
     */
    public void setWs074KeyStorePassword(java.lang.String ws074KeyStorePassword) {
        this.ws074KeyStorePassword = ws074KeyStorePassword;
    }


    /**
     * Gets the ws074ConsumerKey value for this Ws074.
     * 
     * @return ws074ConsumerKey
     */
    public java.lang.String getWs074ConsumerKey() {
        return ws074ConsumerKey;
    }


    /**
     * Sets the ws074ConsumerKey value for this Ws074.
     * 
     * @param ws074ConsumerKey
     */
    public void setWs074ConsumerKey(java.lang.String ws074ConsumerKey) {
        this.ws074ConsumerKey = ws074ConsumerKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ws074)) return false;
        Ws074 other = (Ws074) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ws074ClaimId==null && other.getWs074ClaimId()==null) || 
             (this.ws074ClaimId!=null &&
              this.ws074ClaimId.equals(other.getWs074ClaimId()))) &&
            ((this.ws074KeyAlias==null && other.getWs074KeyAlias()==null) || 
             (this.ws074KeyAlias!=null &&
              this.ws074KeyAlias.equals(other.getWs074KeyAlias()))) &&
            ((this.ws074KeyStorePassword==null && other.getWs074KeyStorePassword()==null) || 
             (this.ws074KeyStorePassword!=null &&
              this.ws074KeyStorePassword.equals(other.getWs074KeyStorePassword()))) &&
            ((this.ws074ConsumerKey==null && other.getWs074ConsumerKey()==null) || 
             (this.ws074ConsumerKey!=null &&
              this.ws074ConsumerKey.equals(other.getWs074ConsumerKey())));
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
        if (getWs074ClaimId() != null) {
            _hashCode += getWs074ClaimId().hashCode();
        }
        if (getWs074KeyAlias() != null) {
            _hashCode += getWs074KeyAlias().hashCode();
        }
        if (getWs074KeyStorePassword() != null) {
            _hashCode += getWs074KeyStorePassword().hashCode();
        }
        if (getWs074ConsumerKey() != null) {
            _hashCode += getWs074ConsumerKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ws074.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/claimsretrieve/", "ws074"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws074ClaimId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws074-claim-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws074KeyAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws074-key-alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws074KeyStorePassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws074-key-store-password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws074ConsumerKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws074-consumer-key"));
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
