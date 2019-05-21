/**
 * Ws057.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.chargebackscreate;

public class Ws057  implements java.io.Serializable {
    private java.lang.String ws057ChargebackId;

    private java.lang.String ws057CodigoStatus;

    private java.lang.String ws057MensagemStatus;

    public Ws057() {
    }

    public Ws057(
           java.lang.String ws057ChargebackId,
           java.lang.String ws057CodigoStatus,
           java.lang.String ws057MensagemStatus) {
           this.ws057ChargebackId = ws057ChargebackId;
           this.ws057CodigoStatus = ws057CodigoStatus;
           this.ws057MensagemStatus = ws057MensagemStatus;
    }


    /**
     * Gets the ws057ChargebackId value for this Ws057.
     * 
     * @return ws057ChargebackId
     */
    public java.lang.String getWs057ChargebackId() {
        return ws057ChargebackId;
    }


    /**
     * Sets the ws057ChargebackId value for this Ws057.
     * 
     * @param ws057ChargebackId
     */
    public void setWs057ChargebackId(java.lang.String ws057ChargebackId) {
        this.ws057ChargebackId = ws057ChargebackId;
    }


    /**
     * Gets the ws057CodigoStatus value for this Ws057.
     * 
     * @return ws057CodigoStatus
     */
    public java.lang.String getWs057CodigoStatus() {
        return ws057CodigoStatus;
    }


    /**
     * Sets the ws057CodigoStatus value for this Ws057.
     * 
     * @param ws057CodigoStatus
     */
    public void setWs057CodigoStatus(java.lang.String ws057CodigoStatus) {
        this.ws057CodigoStatus = ws057CodigoStatus;
    }


    /**
     * Gets the ws057MensagemStatus value for this Ws057.
     * 
     * @return ws057MensagemStatus
     */
    public java.lang.String getWs057MensagemStatus() {
        return ws057MensagemStatus;
    }


    /**
     * Sets the ws057MensagemStatus value for this Ws057.
     * 
     * @param ws057MensagemStatus
     */
    public void setWs057MensagemStatus(java.lang.String ws057MensagemStatus) {
        this.ws057MensagemStatus = ws057MensagemStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ws057)) return false;
        Ws057 other = (Ws057) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ws057ChargebackId==null && other.getWs057ChargebackId()==null) || 
             (this.ws057ChargebackId!=null &&
              this.ws057ChargebackId.equals(other.getWs057ChargebackId()))) &&
            ((this.ws057CodigoStatus==null && other.getWs057CodigoStatus()==null) || 
             (this.ws057CodigoStatus!=null &&
              this.ws057CodigoStatus.equals(other.getWs057CodigoStatus()))) &&
            ((this.ws057MensagemStatus==null && other.getWs057MensagemStatus()==null) || 
             (this.ws057MensagemStatus!=null &&
              this.ws057MensagemStatus.equals(other.getWs057MensagemStatus())));
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
        if (getWs057ChargebackId() != null) {
            _hashCode += getWs057ChargebackId().hashCode();
        }
        if (getWs057CodigoStatus() != null) {
            _hashCode += getWs057CodigoStatus().hashCode();
        }
        if (getWs057MensagemStatus() != null) {
            _hashCode += getWs057MensagemStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ws057.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/chargebackscreate/", "ws057"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws057ChargebackId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws057-chargeback-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws057CodigoStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws057-codigo-status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws057MensagemStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws057-mensagem-status"));
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
