/**
 * Ws060.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.retrievalscreate;

public class Ws060  implements java.io.Serializable {
    private java.lang.String ws060ClaimId;

    private java.lang.String ws060RetrievalRequestReason;

    private java.lang.String ws060DocNeeded;

    private java.lang.String ws060KeyAlias;

    private java.lang.String ws060KeyStorePassword;

    private java.lang.String ws060ConsumerKey;

    public Ws060() {
    }

    public Ws060(
           java.lang.String ws060ClaimId,
           java.lang.String ws060RetrievalRequestReason,
           java.lang.String ws060DocNeeded,
           java.lang.String ws060KeyAlias,
           java.lang.String ws060KeyStorePassword,
           java.lang.String ws060ConsumerKey) {
           this.ws060ClaimId = ws060ClaimId;
           this.ws060RetrievalRequestReason = ws060RetrievalRequestReason;
           this.ws060DocNeeded = ws060DocNeeded;
           this.ws060KeyAlias = ws060KeyAlias;
           this.ws060KeyStorePassword = ws060KeyStorePassword;
           this.ws060ConsumerKey = ws060ConsumerKey;
    }


    /**
     * Gets the ws060ClaimId value for this Ws060.
     * 
     * @return ws060ClaimId
     */
    public java.lang.String getWs060ClaimId() {
        return ws060ClaimId;
    }


    /**
     * Sets the ws060ClaimId value for this Ws060.
     * 
     * @param ws060ClaimId
     */
    public void setWs060ClaimId(java.lang.String ws060ClaimId) {
        this.ws060ClaimId = ws060ClaimId;
    }


    /**
     * Gets the ws060RetrievalRequestReason value for this Ws060.
     * 
     * @return ws060RetrievalRequestReason
     */
    public java.lang.String getWs060RetrievalRequestReason() {
        return ws060RetrievalRequestReason;
    }


    /**
     * Sets the ws060RetrievalRequestReason value for this Ws060.
     * 
     * @param ws060RetrievalRequestReason
     */
    public void setWs060RetrievalRequestReason(java.lang.String ws060RetrievalRequestReason) {
        this.ws060RetrievalRequestReason = ws060RetrievalRequestReason;
    }


    /**
     * Gets the ws060DocNeeded value for this Ws060.
     * 
     * @return ws060DocNeeded
     */
    public java.lang.String getWs060DocNeeded() {
        return ws060DocNeeded;
    }


    /**
     * Sets the ws060DocNeeded value for this Ws060.
     * 
     * @param ws060DocNeeded
     */
    public void setWs060DocNeeded(java.lang.String ws060DocNeeded) {
        this.ws060DocNeeded = ws060DocNeeded;
    }


    /**
     * Gets the ws060KeyAlias value for this Ws060.
     * 
     * @return ws060KeyAlias
     */
    public java.lang.String getWs060KeyAlias() {
        return ws060KeyAlias;
    }


    /**
     * Sets the ws060KeyAlias value for this Ws060.
     * 
     * @param ws060KeyAlias
     */
    public void setWs060KeyAlias(java.lang.String ws060KeyAlias) {
        this.ws060KeyAlias = ws060KeyAlias;
    }


    /**
     * Gets the ws060KeyStorePassword value for this Ws060.
     * 
     * @return ws060KeyStorePassword
     */
    public java.lang.String getWs060KeyStorePassword() {
        return ws060KeyStorePassword;
    }


    /**
     * Sets the ws060KeyStorePassword value for this Ws060.
     * 
     * @param ws060KeyStorePassword
     */
    public void setWs060KeyStorePassword(java.lang.String ws060KeyStorePassword) {
        this.ws060KeyStorePassword = ws060KeyStorePassword;
    }


    /**
     * Gets the ws060ConsumerKey value for this Ws060.
     * 
     * @return ws060ConsumerKey
     */
    public java.lang.String getWs060ConsumerKey() {
        return ws060ConsumerKey;
    }


    /**
     * Sets the ws060ConsumerKey value for this Ws060.
     * 
     * @param ws060ConsumerKey
     */
    public void setWs060ConsumerKey(java.lang.String ws060ConsumerKey) {
        this.ws060ConsumerKey = ws060ConsumerKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ws060)) return false;
        Ws060 other = (Ws060) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ws060ClaimId==null && other.getWs060ClaimId()==null) || 
             (this.ws060ClaimId!=null &&
              this.ws060ClaimId.equals(other.getWs060ClaimId()))) &&
            ((this.ws060RetrievalRequestReason==null && other.getWs060RetrievalRequestReason()==null) || 
             (this.ws060RetrievalRequestReason!=null &&
              this.ws060RetrievalRequestReason.equals(other.getWs060RetrievalRequestReason()))) &&
            ((this.ws060DocNeeded==null && other.getWs060DocNeeded()==null) || 
             (this.ws060DocNeeded!=null &&
              this.ws060DocNeeded.equals(other.getWs060DocNeeded()))) &&
            ((this.ws060KeyAlias==null && other.getWs060KeyAlias()==null) || 
             (this.ws060KeyAlias!=null &&
              this.ws060KeyAlias.equals(other.getWs060KeyAlias()))) &&
            ((this.ws060KeyStorePassword==null && other.getWs060KeyStorePassword()==null) || 
             (this.ws060KeyStorePassword!=null &&
              this.ws060KeyStorePassword.equals(other.getWs060KeyStorePassword()))) &&
            ((this.ws060ConsumerKey==null && other.getWs060ConsumerKey()==null) || 
             (this.ws060ConsumerKey!=null &&
              this.ws060ConsumerKey.equals(other.getWs060ConsumerKey())));
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
        if (getWs060ClaimId() != null) {
            _hashCode += getWs060ClaimId().hashCode();
        }
        if (getWs060RetrievalRequestReason() != null) {
            _hashCode += getWs060RetrievalRequestReason().hashCode();
        }
        if (getWs060DocNeeded() != null) {
            _hashCode += getWs060DocNeeded().hashCode();
        }
        if (getWs060KeyAlias() != null) {
            _hashCode += getWs060KeyAlias().hashCode();
        }
        if (getWs060KeyStorePassword() != null) {
            _hashCode += getWs060KeyStorePassword().hashCode();
        }
        if (getWs060ConsumerKey() != null) {
            _hashCode += getWs060ConsumerKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ws060.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/retrievalscreate/", "ws060"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws060ClaimId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws060-claim-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws060RetrievalRequestReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws060-retrievalRequestReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws060DocNeeded");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws060-docNeeded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws060KeyAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws060-key-alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws060KeyStorePassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws060-key-store-password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws060ConsumerKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws060-consumer-key"));
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
