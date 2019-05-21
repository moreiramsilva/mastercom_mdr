/**
 * Ws072E073Falha.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.Migrated_Disputes;

public class Ws072E073Falha  implements java.io.Serializable {
    private java.lang.String ws073CodigoStatus;

    private java.lang.String ws073MensagemStatus;

    public Ws072E073Falha() {
    }

    public Ws072E073Falha(
           java.lang.String ws073CodigoStatus,
           java.lang.String ws073MensagemStatus) {
           this.ws073CodigoStatus = ws073CodigoStatus;
           this.ws073MensagemStatus = ws073MensagemStatus;
    }


    /**
     * Gets the ws073CodigoStatus value for this Ws072E073Falha.
     * 
     * @return ws073CodigoStatus
     */
    public java.lang.String getWs073CodigoStatus() {
        return ws073CodigoStatus;
    }


    /**
     * Sets the ws073CodigoStatus value for this Ws072E073Falha.
     * 
     * @param ws073CodigoStatus
     */
    public void setWs073CodigoStatus(java.lang.String ws073CodigoStatus) {
        this.ws073CodigoStatus = ws073CodigoStatus;
    }


    /**
     * Gets the ws073MensagemStatus value for this Ws072E073Falha.
     * 
     * @return ws073MensagemStatus
     */
    public java.lang.String getWs073MensagemStatus() {
        return ws073MensagemStatus;
    }


    /**
     * Sets the ws073MensagemStatus value for this Ws072E073Falha.
     * 
     * @param ws073MensagemStatus
     */
    public void setWs073MensagemStatus(java.lang.String ws073MensagemStatus) {
        this.ws073MensagemStatus = ws073MensagemStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ws072E073Falha)) return false;
        Ws072E073Falha other = (Ws072E073Falha) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ws073CodigoStatus==null && other.getWs073CodigoStatus()==null) || 
             (this.ws073CodigoStatus!=null &&
              this.ws073CodigoStatus.equals(other.getWs073CodigoStatus()))) &&
            ((this.ws073MensagemStatus==null && other.getWs073MensagemStatus()==null) || 
             (this.ws073MensagemStatus!=null &&
              this.ws073MensagemStatus.equals(other.getWs073MensagemStatus())));
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
        if (getWs073CodigoStatus() != null) {
            _hashCode += getWs073CodigoStatus().hashCode();
        }
        if (getWs073MensagemStatus() != null) {
            _hashCode += getWs073MensagemStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ws072E073Falha.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/Migrated_Disputes/", "ws072e073falha"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws073CodigoStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws073-codigo-status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws073MensagemStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws073-mensagem-status"));
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
