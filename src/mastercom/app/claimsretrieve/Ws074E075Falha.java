/**
 * Ws074E075Falha.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.claimsretrieve;

public class Ws074E075Falha  implements java.io.Serializable {
    private java.lang.String ws075CodigoStatus;

    private java.lang.String ws075MensagemStatus;

    public Ws074E075Falha() {
    }

    public Ws074E075Falha(
           java.lang.String ws075CodigoStatus,
           java.lang.String ws075MensagemStatus) {
           this.ws075CodigoStatus = ws075CodigoStatus;
           this.ws075MensagemStatus = ws075MensagemStatus;
    }


    /**
     * Gets the ws075CodigoStatus value for this Ws074E075Falha.
     * 
     * @return ws075CodigoStatus
     */
    public java.lang.String getWs075CodigoStatus() {
        return ws075CodigoStatus;
    }


    /**
     * Sets the ws075CodigoStatus value for this Ws074E075Falha.
     * 
     * @param ws075CodigoStatus
     */
    public void setWs075CodigoStatus(java.lang.String ws075CodigoStatus) {
        this.ws075CodigoStatus = ws075CodigoStatus;
    }


    /**
     * Gets the ws075MensagemStatus value for this Ws074E075Falha.
     * 
     * @return ws075MensagemStatus
     */
    public java.lang.String getWs075MensagemStatus() {
        return ws075MensagemStatus;
    }


    /**
     * Sets the ws075MensagemStatus value for this Ws074E075Falha.
     * 
     * @param ws075MensagemStatus
     */
    public void setWs075MensagemStatus(java.lang.String ws075MensagemStatus) {
        this.ws075MensagemStatus = ws075MensagemStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ws074E075Falha)) return false;
        Ws074E075Falha other = (Ws074E075Falha) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ws075CodigoStatus==null && other.getWs075CodigoStatus()==null) || 
             (this.ws075CodigoStatus!=null &&
              this.ws075CodigoStatus.equals(other.getWs075CodigoStatus()))) &&
            ((this.ws075MensagemStatus==null && other.getWs075MensagemStatus()==null) || 
             (this.ws075MensagemStatus!=null &&
              this.ws075MensagemStatus.equals(other.getWs075MensagemStatus())));
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
        if (getWs075CodigoStatus() != null) {
            _hashCode += getWs075CodigoStatus().hashCode();
        }
        if (getWs075MensagemStatus() != null) {
            _hashCode += getWs075MensagemStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ws074E075Falha.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/claimsretrieve/", "ws074e075falha"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws075CodigoStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws075-codigo-status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws075MensagemStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws075-mensagem-status"));
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
