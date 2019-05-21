/**
 * Ws074.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.searchfortransaction.claimsretrieve;

public class Ws074  implements java.io.Serializable {
    private java.lang.String ws075ClaimId;

    private java.lang.String ws075KeyAlias;

    private java.lang.String ws075KeyStorePassword;

    private java.lang.String ws075ConsumerKey;

    public Ws074() {
    }

    public Ws074(
           java.lang.String ws075ClaimId,
           java.lang.String ws075KeyAlias,
           java.lang.String ws075KeyStorePassword,
           java.lang.String ws075ConsumerKey) {
           this.ws075ClaimId = ws075ClaimId;
           this.ws075KeyAlias = ws075KeyAlias;
           this.ws075KeyStorePassword = ws075KeyStorePassword;
           this.ws075ConsumerKey = ws075ConsumerKey;
    }


    /**
     * Gets the ws075ClaimId value for this Ws074.
     * 
     * @return ws075ClaimId
     */
    public java.lang.String getWs075ClaimId() {
        return ws075ClaimId;
    }


    /**
     * Sets the ws075ClaimId value for this Ws074.
     * 
     * @param ws075ClaimId
     */
    public void setWs075ClaimId(java.lang.String ws075ClaimId) {
        this.ws075ClaimId = ws075ClaimId;
    }


    /**
     * Gets the ws075KeyAlias value for this Ws074.
     * 
     * @return ws075KeyAlias
     */
    public java.lang.String getWs075KeyAlias() {
        return ws075KeyAlias;
    }


    /**
     * Sets the ws075KeyAlias value for this Ws074.
     * 
     * @param ws075KeyAlias
     */
    public void setWs075KeyAlias(java.lang.String ws075KeyAlias) {
        this.ws075KeyAlias = ws075KeyAlias;
    }


    /**
     * Gets the ws075KeyStorePassword value for this Ws074.
     * 
     * @return ws075KeyStorePassword
     */
    public java.lang.String getWs075KeyStorePassword() {
        return ws075KeyStorePassword;
    }


    /**
     * Sets the ws075KeyStorePassword value for this Ws074.
     * 
     * @param ws075KeyStorePassword
     */
    public void setWs075KeyStorePassword(java.lang.String ws075KeyStorePassword) {
        this.ws075KeyStorePassword = ws075KeyStorePassword;
    }


    /**
     * Gets the ws075ConsumerKey value for this Ws074.
     * 
     * @return ws075ConsumerKey
     */
    public java.lang.String getWs075ConsumerKey() {
        return ws075ConsumerKey;
    }


    /**
     * Sets the ws075ConsumerKey value for this Ws074.
     * 
     * @param ws075ConsumerKey
     */
    public void setWs075ConsumerKey(java.lang.String ws075ConsumerKey) {
        this.ws075ConsumerKey = ws075ConsumerKey;
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
            ((this.ws075ClaimId==null && other.getWs075ClaimId()==null) || 
             (this.ws075ClaimId!=null &&
              this.ws075ClaimId.equals(other.getWs075ClaimId()))) &&
            ((this.ws075KeyAlias==null && other.getWs075KeyAlias()==null) || 
             (this.ws075KeyAlias!=null &&
              this.ws075KeyAlias.equals(other.getWs075KeyAlias()))) &&
            ((this.ws075KeyStorePassword==null && other.getWs075KeyStorePassword()==null) || 
             (this.ws075KeyStorePassword!=null &&
              this.ws075KeyStorePassword.equals(other.getWs075KeyStorePassword()))) &&
            ((this.ws075ConsumerKey==null && other.getWs075ConsumerKey()==null) || 
             (this.ws075ConsumerKey!=null &&
              this.ws075ConsumerKey.equals(other.getWs075ConsumerKey())));
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
        if (getWs075ClaimId() != null) {
            _hashCode += getWs075ClaimId().hashCode();
        }
        if (getWs075KeyAlias() != null) {
            _hashCode += getWs075KeyAlias().hashCode();
        }
        if (getWs075KeyStorePassword() != null) {
            _hashCode += getWs075KeyStorePassword().hashCode();
        }
        if (getWs075ConsumerKey() != null) {
            _hashCode += getWs075ConsumerKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ws074.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/searchfortransaction/claimsretrieve/", "ws074"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws075ClaimId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws075-claim-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws075KeyAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws075-key-alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws075KeyStorePassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws075-key-store-password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws075ConsumerKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws075-consumer-key"));
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
