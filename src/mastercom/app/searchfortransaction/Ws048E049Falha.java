/**
 * Ws048E049Falha.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.searchfortransaction;

public class Ws048E049Falha  implements java.io.Serializable {
    private java.lang.String ws049Codigostatus;

    private java.lang.String ws049Mensagemstatus;

    public Ws048E049Falha() {
    }

    public Ws048E049Falha(
           java.lang.String ws049Codigostatus,
           java.lang.String ws049Mensagemstatus) {
           this.ws049Codigostatus = ws049Codigostatus;
           this.ws049Mensagemstatus = ws049Mensagemstatus;
    }


    /**
     * Gets the ws049Codigostatus value for this Ws048E049Falha.
     * 
     * @return ws049Codigostatus
     */
    public java.lang.String getWs049Codigostatus() {
        return ws049Codigostatus;
    }


    /**
     * Sets the ws049Codigostatus value for this Ws048E049Falha.
     * 
     * @param ws049Codigostatus
     */
    public void setWs049Codigostatus(java.lang.String ws049Codigostatus) {
        this.ws049Codigostatus = ws049Codigostatus;
    }


    /**
     * Gets the ws049Mensagemstatus value for this Ws048E049Falha.
     * 
     * @return ws049Mensagemstatus
     */
    public java.lang.String getWs049Mensagemstatus() {
        return ws049Mensagemstatus;
    }


    /**
     * Sets the ws049Mensagemstatus value for this Ws048E049Falha.
     * 
     * @param ws049Mensagemstatus
     */
    public void setWs049Mensagemstatus(java.lang.String ws049Mensagemstatus) {
        this.ws049Mensagemstatus = ws049Mensagemstatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ws048E049Falha)) return false;
        Ws048E049Falha other = (Ws048E049Falha) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ws049Codigostatus==null && other.getWs049Codigostatus()==null) || 
             (this.ws049Codigostatus!=null &&
              this.ws049Codigostatus.equals(other.getWs049Codigostatus()))) &&
            ((this.ws049Mensagemstatus==null && other.getWs049Mensagemstatus()==null) || 
             (this.ws049Mensagemstatus!=null &&
              this.ws049Mensagemstatus.equals(other.getWs049Mensagemstatus())));
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
        if (getWs049Codigostatus() != null) {
            _hashCode += getWs049Codigostatus().hashCode();
        }
        if (getWs049Mensagemstatus() != null) {
            _hashCode += getWs049Mensagemstatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ws048E049Falha.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/searchfortransaction/", "ws048e049falha"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws049Codigostatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws049-codigostatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws049Mensagemstatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws049-mensagemstatus"));
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
