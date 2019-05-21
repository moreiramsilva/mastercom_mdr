/**
 * Ws051.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.claimscreate;

public class Ws051  implements java.io.Serializable {
    private java.lang.String ws051ClaimId;

    private java.lang.String ws051CodigoStatus;

    private java.lang.String ws051MensagemStatus;

    public Ws051() {
    }

    public Ws051(
           java.lang.String ws051ClaimId,
           java.lang.String ws051CodigoStatus,
           java.lang.String ws051MensagemStatus) {
           this.ws051ClaimId = ws051ClaimId;
           this.ws051CodigoStatus = ws051CodigoStatus;
           this.ws051MensagemStatus = ws051MensagemStatus;
    }


    /**
     * Gets the ws051ClaimId value for this Ws051.
     * 
     * @return ws051ClaimId
     */
    public java.lang.String getWs051ClaimId() {
        return ws051ClaimId;
    }


    /**
     * Sets the ws051ClaimId value for this Ws051.
     * 
     * @param ws051ClaimId
     */
    public void setWs051ClaimId(java.lang.String ws051ClaimId) {
        this.ws051ClaimId = ws051ClaimId;
    }


    /**
     * Gets the ws051CodigoStatus value for this Ws051.
     * 
     * @return ws051CodigoStatus
     */
    public java.lang.String getWs051CodigoStatus() {
        return ws051CodigoStatus;
    }


    /**
     * Sets the ws051CodigoStatus value for this Ws051.
     * 
     * @param ws051CodigoStatus
     */
    public void setWs051CodigoStatus(java.lang.String ws051CodigoStatus) {
        this.ws051CodigoStatus = ws051CodigoStatus;
    }


    /**
     * Gets the ws051MensagemStatus value for this Ws051.
     * 
     * @return ws051MensagemStatus
     */
    public java.lang.String getWs051MensagemStatus() {
        return ws051MensagemStatus;
    }


    /**
     * Sets the ws051MensagemStatus value for this Ws051.
     * 
     * @param ws051MensagemStatus
     */
    public void setWs051MensagemStatus(java.lang.String ws051MensagemStatus) {
        this.ws051MensagemStatus = ws051MensagemStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ws051)) return false;
        Ws051 other = (Ws051) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ws051ClaimId==null && other.getWs051ClaimId()==null) || 
             (this.ws051ClaimId!=null &&
              this.ws051ClaimId.equals(other.getWs051ClaimId()))) &&
            ((this.ws051CodigoStatus==null && other.getWs051CodigoStatus()==null) || 
             (this.ws051CodigoStatus!=null &&
              this.ws051CodigoStatus.equals(other.getWs051CodigoStatus()))) &&
            ((this.ws051MensagemStatus==null && other.getWs051MensagemStatus()==null) || 
             (this.ws051MensagemStatus!=null &&
              this.ws051MensagemStatus.equals(other.getWs051MensagemStatus())));
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
        if (getWs051ClaimId() != null) {
            _hashCode += getWs051ClaimId().hashCode();
        }
        if (getWs051CodigoStatus() != null) {
            _hashCode += getWs051CodigoStatus().hashCode();
        }
        if (getWs051MensagemStatus() != null) {
            _hashCode += getWs051MensagemStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ws051.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/claimscreate/", "ws051"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws051ClaimId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws051-claim-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws051CodigoStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws051-codigo-status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws051MensagemStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws051-mensagem-status"));
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
