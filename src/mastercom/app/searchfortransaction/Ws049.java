/**
 * Ws049.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.searchfortransaction;

public class Ws049  implements java.io.Serializable {
    private java.lang.String ws049Codigostatus;

    private java.lang.String ws049Mensagemstatus;

    private java.lang.String ws049AuthSumCount;

    private java.lang.String ws049AuthMessage;

    private mastercom.app.searchfortransaction.Ws049AuthSummary[] ws049AuthSummary;

    public Ws049() {
    }

    public Ws049(
           java.lang.String ws049Codigostatus,
           java.lang.String ws049Mensagemstatus,
           java.lang.String ws049AuthSumCount,
           java.lang.String ws049AuthMessage,
           mastercom.app.searchfortransaction.Ws049AuthSummary[] ws049AuthSummary) {
           this.ws049Codigostatus = ws049Codigostatus;
           this.ws049Mensagemstatus = ws049Mensagemstatus;
           this.ws049AuthSumCount = ws049AuthSumCount;
           this.ws049AuthMessage = ws049AuthMessage;
           this.ws049AuthSummary = ws049AuthSummary;
    }


    /**
     * Gets the ws049Codigostatus value for this Ws049.
     * 
     * @return ws049Codigostatus
     */
    public java.lang.String getWs049Codigostatus() {
        return ws049Codigostatus;
    }


    /**
     * Sets the ws049Codigostatus value for this Ws049.
     * 
     * @param ws049Codigostatus
     */
    public void setWs049Codigostatus(java.lang.String ws049Codigostatus) {
        this.ws049Codigostatus = ws049Codigostatus;
    }


    /**
     * Gets the ws049Mensagemstatus value for this Ws049.
     * 
     * @return ws049Mensagemstatus
     */
    public java.lang.String getWs049Mensagemstatus() {
        return ws049Mensagemstatus;
    }


    /**
     * Sets the ws049Mensagemstatus value for this Ws049.
     * 
     * @param ws049Mensagemstatus
     */
    public void setWs049Mensagemstatus(java.lang.String ws049Mensagemstatus) {
        this.ws049Mensagemstatus = ws049Mensagemstatus;
    }


    /**
     * Gets the ws049AuthSumCount value for this Ws049.
     * 
     * @return ws049AuthSumCount
     */
    public java.lang.String getWs049AuthSumCount() {
        return ws049AuthSumCount;
    }


    /**
     * Sets the ws049AuthSumCount value for this Ws049.
     * 
     * @param ws049AuthSumCount
     */
    public void setWs049AuthSumCount(java.lang.String ws049AuthSumCount) {
        this.ws049AuthSumCount = ws049AuthSumCount;
    }


    /**
     * Gets the ws049AuthMessage value for this Ws049.
     * 
     * @return ws049AuthMessage
     */
    public java.lang.String getWs049AuthMessage() {
        return ws049AuthMessage;
    }


    /**
     * Sets the ws049AuthMessage value for this Ws049.
     * 
     * @param ws049AuthMessage
     */
    public void setWs049AuthMessage(java.lang.String ws049AuthMessage) {
        this.ws049AuthMessage = ws049AuthMessage;
    }


    /**
     * Gets the ws049AuthSummary value for this Ws049.
     * 
     * @return ws049AuthSummary
     */
    public mastercom.app.searchfortransaction.Ws049AuthSummary[] getWs049AuthSummary() {
        return ws049AuthSummary;
    }


    /**
     * Sets the ws049AuthSummary value for this Ws049.
     * 
     * @param ws049AuthSummary
     */
    public void setWs049AuthSummary(mastercom.app.searchfortransaction.Ws049AuthSummary[] ws049AuthSummary) {
        this.ws049AuthSummary = ws049AuthSummary;
    }

    public mastercom.app.searchfortransaction.Ws049AuthSummary getWs049AuthSummary(int i) {
        return this.ws049AuthSummary[i];
    }

    public void setWs049AuthSummary(int i, mastercom.app.searchfortransaction.Ws049AuthSummary _value) {
        this.ws049AuthSummary[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ws049)) return false;
        Ws049 other = (Ws049) obj;
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
              this.ws049Mensagemstatus.equals(other.getWs049Mensagemstatus()))) &&
            ((this.ws049AuthSumCount==null && other.getWs049AuthSumCount()==null) || 
             (this.ws049AuthSumCount!=null &&
              this.ws049AuthSumCount.equals(other.getWs049AuthSumCount()))) &&
            ((this.ws049AuthMessage==null && other.getWs049AuthMessage()==null) || 
             (this.ws049AuthMessage!=null &&
              this.ws049AuthMessage.equals(other.getWs049AuthMessage()))) &&
            ((this.ws049AuthSummary==null && other.getWs049AuthSummary()==null) || 
             (this.ws049AuthSummary!=null &&
              java.util.Arrays.equals(this.ws049AuthSummary, other.getWs049AuthSummary())));
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
        if (getWs049AuthSumCount() != null) {
            _hashCode += getWs049AuthSumCount().hashCode();
        }
        if (getWs049AuthMessage() != null) {
            _hashCode += getWs049AuthMessage().hashCode();
        }
        if (getWs049AuthSummary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWs049AuthSummary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWs049AuthSummary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ws049.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/searchfortransaction/", "ws049"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws049AuthSumCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws049-auth-sum-count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws049AuthMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws049-auth-message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws049AuthSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws049-auth-summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/searchfortransaction/", "ws049-auth-summary"));
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
