/**
 * Ws056E057Falha.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.chargebackscreate;

public class Ws056E057Falha  implements java.io.Serializable {
    private java.lang.String ws057CodigoStatus;

    private java.lang.String ws057MensagemStatus;

    public Ws056E057Falha() {
    }

    public Ws056E057Falha(
           java.lang.String ws057CodigoStatus,
           java.lang.String ws057MensagemStatus) {
           this.ws057CodigoStatus = ws057CodigoStatus;
           this.ws057MensagemStatus = ws057MensagemStatus;
    }


    /**
     * Gets the ws057CodigoStatus value for this Ws056E057Falha.
     * 
     * @return ws057CodigoStatus
     */
    public java.lang.String getWs057CodigoStatus() {
        return ws057CodigoStatus;
    }


    /**
     * Sets the ws057CodigoStatus value for this Ws056E057Falha.
     * 
     * @param ws057CodigoStatus
     */
    public void setWs057CodigoStatus(java.lang.String ws057CodigoStatus) {
        this.ws057CodigoStatus = ws057CodigoStatus;
    }


    /**
     * Gets the ws057MensagemStatus value for this Ws056E057Falha.
     * 
     * @return ws057MensagemStatus
     */
    public java.lang.String getWs057MensagemStatus() {
        return ws057MensagemStatus;
    }


    /**
     * Sets the ws057MensagemStatus value for this Ws056E057Falha.
     * 
     * @param ws057MensagemStatus
     */
    public void setWs057MensagemStatus(java.lang.String ws057MensagemStatus) {
        this.ws057MensagemStatus = ws057MensagemStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ws056E057Falha)) return false;
        Ws056E057Falha other = (Ws056E057Falha) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        new org.apache.axis.description.TypeDesc(Ws056E057Falha.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/chargebackscreate/", "ws056e057falha"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
