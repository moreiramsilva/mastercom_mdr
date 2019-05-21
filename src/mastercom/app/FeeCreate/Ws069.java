/**
 * Ws069.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.FeeCreate;

public class Ws069  implements java.io.Serializable {
    private java.lang.String ws069FeeId;

    private java.lang.String ws069CodigoStatus;

    private java.lang.String ws069MensagemStatus;

    public Ws069() {
    }

    public Ws069(
           java.lang.String ws069FeeId,
           java.lang.String ws069CodigoStatus,
           java.lang.String ws069MensagemStatus) {
           this.ws069FeeId = ws069FeeId;
           this.ws069CodigoStatus = ws069CodigoStatus;
           this.ws069MensagemStatus = ws069MensagemStatus;
    }


    /**
     * Gets the ws069FeeId value for this Ws069.
     * 
     * @return ws069FeeId
     */
    public java.lang.String getWs069FeeId() {
        return ws069FeeId;
    }


    /**
     * Sets the ws069FeeId value for this Ws069.
     * 
     * @param ws069FeeId
     */
    public void setWs069FeeId(java.lang.String ws069FeeId) {
        this.ws069FeeId = ws069FeeId;
    }


    /**
     * Gets the ws069CodigoStatus value for this Ws069.
     * 
     * @return ws069CodigoStatus
     */
    public java.lang.String getWs069CodigoStatus() {
        return ws069CodigoStatus;
    }


    /**
     * Sets the ws069CodigoStatus value for this Ws069.
     * 
     * @param ws069CodigoStatus
     */
    public void setWs069CodigoStatus(java.lang.String ws069CodigoStatus) {
        this.ws069CodigoStatus = ws069CodigoStatus;
    }


    /**
     * Gets the ws069MensagemStatus value for this Ws069.
     * 
     * @return ws069MensagemStatus
     */
    public java.lang.String getWs069MensagemStatus() {
        return ws069MensagemStatus;
    }


    /**
     * Sets the ws069MensagemStatus value for this Ws069.
     * 
     * @param ws069MensagemStatus
     */
    public void setWs069MensagemStatus(java.lang.String ws069MensagemStatus) {
        this.ws069MensagemStatus = ws069MensagemStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ws069)) return false;
        Ws069 other = (Ws069) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ws069FeeId==null && other.getWs069FeeId()==null) || 
             (this.ws069FeeId!=null &&
              this.ws069FeeId.equals(other.getWs069FeeId()))) &&
            ((this.ws069CodigoStatus==null && other.getWs069CodigoStatus()==null) || 
             (this.ws069CodigoStatus!=null &&
              this.ws069CodigoStatus.equals(other.getWs069CodigoStatus()))) &&
            ((this.ws069MensagemStatus==null && other.getWs069MensagemStatus()==null) || 
             (this.ws069MensagemStatus!=null &&
              this.ws069MensagemStatus.equals(other.getWs069MensagemStatus())));
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
        if (getWs069FeeId() != null) {
            _hashCode += getWs069FeeId().hashCode();
        }
        if (getWs069CodigoStatus() != null) {
            _hashCode += getWs069CodigoStatus().hashCode();
        }
        if (getWs069MensagemStatus() != null) {
            _hashCode += getWs069MensagemStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ws069.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/FeeCreate/", "ws069"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws069FeeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws069-fee-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws069CodigoStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws069-codigo-status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws069MensagemStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws069-mensagem-status"));
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
