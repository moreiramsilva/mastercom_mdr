/**
 * Ws064E065Falha.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.fraudcreate;

public class Ws064E065Falha  implements java.io.Serializable {
    private java.lang.String ws065CodigoStatus;

    private java.lang.String ws065MensagemStatus;

    public Ws064E065Falha() {
    }

    public Ws064E065Falha(
           java.lang.String ws065CodigoStatus,
           java.lang.String ws065MensagemStatus) {
           this.ws065CodigoStatus = ws065CodigoStatus;
           this.ws065MensagemStatus = ws065MensagemStatus;
    }


    /**
     * Gets the ws065CodigoStatus value for this Ws064E065Falha.
     * 
     * @return ws065CodigoStatus
     */
    public java.lang.String getWs065CodigoStatus() {
        return ws065CodigoStatus;
    }


    /**
     * Sets the ws065CodigoStatus value for this Ws064E065Falha.
     * 
     * @param ws065CodigoStatus
     */
    public void setWs065CodigoStatus(java.lang.String ws065CodigoStatus) {
        this.ws065CodigoStatus = ws065CodigoStatus;
    }


    /**
     * Gets the ws065MensagemStatus value for this Ws064E065Falha.
     * 
     * @return ws065MensagemStatus
     */
    public java.lang.String getWs065MensagemStatus() {
        return ws065MensagemStatus;
    }


    /**
     * Sets the ws065MensagemStatus value for this Ws064E065Falha.
     * 
     * @param ws065MensagemStatus
     */
    public void setWs065MensagemStatus(java.lang.String ws065MensagemStatus) {
        this.ws065MensagemStatus = ws065MensagemStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ws064E065Falha)) return false;
        Ws064E065Falha other = (Ws064E065Falha) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ws065CodigoStatus==null && other.getWs065CodigoStatus()==null) || 
             (this.ws065CodigoStatus!=null &&
              this.ws065CodigoStatus.equals(other.getWs065CodigoStatus()))) &&
            ((this.ws065MensagemStatus==null && other.getWs065MensagemStatus()==null) || 
             (this.ws065MensagemStatus!=null &&
              this.ws065MensagemStatus.equals(other.getWs065MensagemStatus())));
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
        if (getWs065CodigoStatus() != null) {
            _hashCode += getWs065CodigoStatus().hashCode();
        }
        if (getWs065MensagemStatus() != null) {
            _hashCode += getWs065MensagemStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ws064E065Falha.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/fraudcreate/", "ws064e065falha"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws065CodigoStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws065-codigo-status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws065MensagemStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws065-mensagem-status"));
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
