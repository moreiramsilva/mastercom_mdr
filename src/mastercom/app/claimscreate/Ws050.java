/**
 * Ws050.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.claimscreate;

public class Ws050  implements java.io.Serializable {
    private java.lang.String ws050DispAmt;

    private java.lang.String ws050DispCurr;

    private java.lang.String ws050ClaimType;

    private java.lang.String ws050CleTrnId;

    private java.lang.String ws050AutTrnId;

    private java.lang.String ws050KeyAlias;

    private java.lang.String ws050KeyStorePassword;

    private java.lang.String ws050ConsumerKey;

    public Ws050() {
    }

    public Ws050(
           java.lang.String ws050DispAmt,
           java.lang.String ws050DispCurr,
           java.lang.String ws050ClaimType,
           java.lang.String ws050CleTrnId,
           java.lang.String ws050AutTrnId,
           java.lang.String ws050KeyAlias,
           java.lang.String ws050KeyStorePassword,
           java.lang.String ws050ConsumerKey) {
           this.ws050DispAmt = ws050DispAmt;
           this.ws050DispCurr = ws050DispCurr;
           this.ws050ClaimType = ws050ClaimType;
           this.ws050CleTrnId = ws050CleTrnId;
           this.ws050AutTrnId = ws050AutTrnId;
           this.ws050KeyAlias = ws050KeyAlias;
           this.ws050KeyStorePassword = ws050KeyStorePassword;
           this.ws050ConsumerKey = ws050ConsumerKey;
    }


    /**
     * Gets the ws050DispAmt value for this Ws050.
     * 
     * @return ws050DispAmt
     */
    public java.lang.String getWs050DispAmt() {
        return ws050DispAmt;
    }


    /**
     * Sets the ws050DispAmt value for this Ws050.
     * 
     * @param ws050DispAmt
     */
    public void setWs050DispAmt(java.lang.String ws050DispAmt) {
        this.ws050DispAmt = ws050DispAmt;
    }


    /**
     * Gets the ws050DispCurr value for this Ws050.
     * 
     * @return ws050DispCurr
     */
    public java.lang.String getWs050DispCurr() {
        return ws050DispCurr;
    }


    /**
     * Sets the ws050DispCurr value for this Ws050.
     * 
     * @param ws050DispCurr
     */
    public void setWs050DispCurr(java.lang.String ws050DispCurr) {
        this.ws050DispCurr = ws050DispCurr;
    }


    /**
     * Gets the ws050ClaimType value for this Ws050.
     * 
     * @return ws050ClaimType
     */
    public java.lang.String getWs050ClaimType() {
        return ws050ClaimType;
    }


    /**
     * Sets the ws050ClaimType value for this Ws050.
     * 
     * @param ws050ClaimType
     */
    public void setWs050ClaimType(java.lang.String ws050ClaimType) {
        this.ws050ClaimType = ws050ClaimType;
    }


    /**
     * Gets the ws050CleTrnId value for this Ws050.
     * 
     * @return ws050CleTrnId
     */
    public java.lang.String getWs050CleTrnId() {
        return ws050CleTrnId;
    }


    /**
     * Sets the ws050CleTrnId value for this Ws050.
     * 
     * @param ws050CleTrnId
     */
    public void setWs050CleTrnId(java.lang.String ws050CleTrnId) {
        this.ws050CleTrnId = ws050CleTrnId;
    }


    /**
     * Gets the ws050AutTrnId value for this Ws050.
     * 
     * @return ws050AutTrnId
     */
    public java.lang.String getWs050AutTrnId() {
        return ws050AutTrnId;
    }


    /**
     * Sets the ws050AutTrnId value for this Ws050.
     * 
     * @param ws050AutTrnId
     */
    public void setWs050AutTrnId(java.lang.String ws050AutTrnId) {
        this.ws050AutTrnId = ws050AutTrnId;
    }


    /**
     * Gets the ws050KeyAlias value for this Ws050.
     * 
     * @return ws050KeyAlias
     */
    public java.lang.String getWs050KeyAlias() {
        return ws050KeyAlias;
    }


    /**
     * Sets the ws050KeyAlias value for this Ws050.
     * 
     * @param ws050KeyAlias
     */
    public void setWs050KeyAlias(java.lang.String ws050KeyAlias) {
        this.ws050KeyAlias = ws050KeyAlias;
    }


    /**
     * Gets the ws050KeyStorePassword value for this Ws050.
     * 
     * @return ws050KeyStorePassword
     */
    public java.lang.String getWs050KeyStorePassword() {
        return ws050KeyStorePassword;
    }


    /**
     * Sets the ws050KeyStorePassword value for this Ws050.
     * 
     * @param ws050KeyStorePassword
     */
    public void setWs050KeyStorePassword(java.lang.String ws050KeyStorePassword) {
        this.ws050KeyStorePassword = ws050KeyStorePassword;
    }


    /**
     * Gets the ws050ConsumerKey value for this Ws050.
     * 
     * @return ws050ConsumerKey
     */
    public java.lang.String getWs050ConsumerKey() {
        return ws050ConsumerKey;
    }


    /**
     * Sets the ws050ConsumerKey value for this Ws050.
     * 
     * @param ws050ConsumerKey
     */
    public void setWs050ConsumerKey(java.lang.String ws050ConsumerKey) {
        this.ws050ConsumerKey = ws050ConsumerKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ws050)) return false;
        Ws050 other = (Ws050) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ws050DispAmt==null && other.getWs050DispAmt()==null) || 
             (this.ws050DispAmt!=null &&
              this.ws050DispAmt.equals(other.getWs050DispAmt()))) &&
            ((this.ws050DispCurr==null && other.getWs050DispCurr()==null) || 
             (this.ws050DispCurr!=null &&
              this.ws050DispCurr.equals(other.getWs050DispCurr()))) &&
            ((this.ws050ClaimType==null && other.getWs050ClaimType()==null) || 
             (this.ws050ClaimType!=null &&
              this.ws050ClaimType.equals(other.getWs050ClaimType()))) &&
            ((this.ws050CleTrnId==null && other.getWs050CleTrnId()==null) || 
             (this.ws050CleTrnId!=null &&
              this.ws050CleTrnId.equals(other.getWs050CleTrnId()))) &&
            ((this.ws050AutTrnId==null && other.getWs050AutTrnId()==null) || 
             (this.ws050AutTrnId!=null &&
              this.ws050AutTrnId.equals(other.getWs050AutTrnId()))) &&
            ((this.ws050KeyAlias==null && other.getWs050KeyAlias()==null) || 
             (this.ws050KeyAlias!=null &&
              this.ws050KeyAlias.equals(other.getWs050KeyAlias()))) &&
            ((this.ws050KeyStorePassword==null && other.getWs050KeyStorePassword()==null) || 
             (this.ws050KeyStorePassword!=null &&
              this.ws050KeyStorePassword.equals(other.getWs050KeyStorePassword()))) &&
            ((this.ws050ConsumerKey==null && other.getWs050ConsumerKey()==null) || 
             (this.ws050ConsumerKey!=null &&
              this.ws050ConsumerKey.equals(other.getWs050ConsumerKey())));
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
        if (getWs050DispAmt() != null) {
            _hashCode += getWs050DispAmt().hashCode();
        }
        if (getWs050DispCurr() != null) {
            _hashCode += getWs050DispCurr().hashCode();
        }
        if (getWs050ClaimType() != null) {
            _hashCode += getWs050ClaimType().hashCode();
        }
        if (getWs050CleTrnId() != null) {
            _hashCode += getWs050CleTrnId().hashCode();
        }
        if (getWs050AutTrnId() != null) {
            _hashCode += getWs050AutTrnId().hashCode();
        }
        if (getWs050KeyAlias() != null) {
            _hashCode += getWs050KeyAlias().hashCode();
        }
        if (getWs050KeyStorePassword() != null) {
            _hashCode += getWs050KeyStorePassword().hashCode();
        }
        if (getWs050ConsumerKey() != null) {
            _hashCode += getWs050ConsumerKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ws050.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/claimscreate/", "ws050"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws050DispAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws050-disp-amt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws050DispCurr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws050-disp-curr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws050ClaimType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws050-claim-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws050CleTrnId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws050-cle-trn-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws050AutTrnId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws050-aut-trn-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws050KeyAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws050-key-alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws050KeyStorePassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws050-key-store-password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws050ConsumerKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws050-consumer-key"));
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
