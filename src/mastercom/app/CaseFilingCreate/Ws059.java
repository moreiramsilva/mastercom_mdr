/**
 * Ws059.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.CaseFilingCreate;

public class Ws059  implements java.io.Serializable {
    private java.lang.String ws059CaseId;

    private java.lang.String ws059Codigostatus;

    private java.lang.String ws059Mensagemstatus;

    public Ws059() {
    }

    public Ws059(
           java.lang.String ws059CaseId,
           java.lang.String ws059Codigostatus,
           java.lang.String ws059Mensagemstatus) {
           this.ws059CaseId = ws059CaseId;
           this.ws059Codigostatus = ws059Codigostatus;
           this.ws059Mensagemstatus = ws059Mensagemstatus;
    }


    /**
     * Gets the ws059CaseId value for this Ws059.
     * 
     * @return ws059CaseId
     */
    public java.lang.String getWs059CaseId() {
        return ws059CaseId;
    }


    /**
     * Sets the ws059CaseId value for this Ws059.
     * 
     * @param ws059CaseId
     */
    public void setWs059CaseId(java.lang.String ws059CaseId) {
        this.ws059CaseId = ws059CaseId;
    }


    /**
     * Gets the ws059Codigostatus value for this Ws059.
     * 
     * @return ws059Codigostatus
     */
    public java.lang.String getWs059Codigostatus() {
        return ws059Codigostatus;
    }


    /**
     * Sets the ws059Codigostatus value for this Ws059.
     * 
     * @param ws059Codigostatus
     */
    public void setWs059Codigostatus(java.lang.String ws059Codigostatus) {
        this.ws059Codigostatus = ws059Codigostatus;
    }


    /**
     * Gets the ws059Mensagemstatus value for this Ws059.
     * 
     * @return ws059Mensagemstatus
     */
    public java.lang.String getWs059Mensagemstatus() {
        return ws059Mensagemstatus;
    }


    /**
     * Sets the ws059Mensagemstatus value for this Ws059.
     * 
     * @param ws059Mensagemstatus
     */
    public void setWs059Mensagemstatus(java.lang.String ws059Mensagemstatus) {
        this.ws059Mensagemstatus = ws059Mensagemstatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ws059)) return false;
        Ws059 other = (Ws059) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ws059CaseId==null && other.getWs059CaseId()==null) || 
             (this.ws059CaseId!=null &&
              this.ws059CaseId.equals(other.getWs059CaseId()))) &&
            ((this.ws059Codigostatus==null && other.getWs059Codigostatus()==null) || 
             (this.ws059Codigostatus!=null &&
              this.ws059Codigostatus.equals(other.getWs059Codigostatus()))) &&
            ((this.ws059Mensagemstatus==null && other.getWs059Mensagemstatus()==null) || 
             (this.ws059Mensagemstatus!=null &&
              this.ws059Mensagemstatus.equals(other.getWs059Mensagemstatus())));
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
        if (getWs059CaseId() != null) {
            _hashCode += getWs059CaseId().hashCode();
        }
        if (getWs059Codigostatus() != null) {
            _hashCode += getWs059Codigostatus().hashCode();
        }
        if (getWs059Mensagemstatus() != null) {
            _hashCode += getWs059Mensagemstatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ws059.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/CaseFilingCreate/", "ws059"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws059CaseId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws059-caseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws059Codigostatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws059-codigostatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws059Mensagemstatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws059-mensagemstatus"));
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
