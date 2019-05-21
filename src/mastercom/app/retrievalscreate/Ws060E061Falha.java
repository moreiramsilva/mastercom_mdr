/**
 * Ws060E061Falha.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.retrievalscreate;

public class Ws060E061Falha  implements java.io.Serializable {
    private java.lang.String ws061CodigoStatus;

    private java.lang.String ws061MensagemStatus;

    public Ws060E061Falha() {
    }

    public Ws060E061Falha(
           java.lang.String ws061CodigoStatus,
           java.lang.String ws061MensagemStatus) {
           this.ws061CodigoStatus = ws061CodigoStatus;
           this.ws061MensagemStatus = ws061MensagemStatus;
    }


    /**
     * Gets the ws061CodigoStatus value for this Ws060E061Falha.
     * 
     * @return ws061CodigoStatus
     */
    public java.lang.String getWs061CodigoStatus() {
        return ws061CodigoStatus;
    }


    /**
     * Sets the ws061CodigoStatus value for this Ws060E061Falha.
     * 
     * @param ws061CodigoStatus
     */
    public void setWs061CodigoStatus(java.lang.String ws061CodigoStatus) {
        this.ws061CodigoStatus = ws061CodigoStatus;
    }


    /**
     * Gets the ws061MensagemStatus value for this Ws060E061Falha.
     * 
     * @return ws061MensagemStatus
     */
    public java.lang.String getWs061MensagemStatus() {
        return ws061MensagemStatus;
    }


    /**
     * Sets the ws061MensagemStatus value for this Ws060E061Falha.
     * 
     * @param ws061MensagemStatus
     */
    public void setWs061MensagemStatus(java.lang.String ws061MensagemStatus) {
        this.ws061MensagemStatus = ws061MensagemStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ws060E061Falha)) return false;
        Ws060E061Falha other = (Ws060E061Falha) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ws061CodigoStatus==null && other.getWs061CodigoStatus()==null) || 
             (this.ws061CodigoStatus!=null &&
              this.ws061CodigoStatus.equals(other.getWs061CodigoStatus()))) &&
            ((this.ws061MensagemStatus==null && other.getWs061MensagemStatus()==null) || 
             (this.ws061MensagemStatus!=null &&
              this.ws061MensagemStatus.equals(other.getWs061MensagemStatus())));
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
        if (getWs061CodigoStatus() != null) {
            _hashCode += getWs061CodigoStatus().hashCode();
        }
        if (getWs061MensagemStatus() != null) {
            _hashCode += getWs061MensagemStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ws060E061Falha.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/retrievalscreate/", "ws060e061falha"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws061CodigoStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws061-codigo-status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws061MensagemStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws061-mensagem-status"));
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
