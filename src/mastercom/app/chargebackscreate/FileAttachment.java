/**
 * FileAttachment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.chargebackscreate;

public class FileAttachment  implements java.io.Serializable {
    private java.lang.String ws056Filename;

    private java.lang.String ws056File;

    public FileAttachment() {
    }

    public FileAttachment(
           java.lang.String ws056Filename,
           java.lang.String ws056File) {
           this.ws056Filename = ws056Filename;
           this.ws056File = ws056File;
    }


    /**
     * Gets the ws056Filename value for this FileAttachment.
     * 
     * @return ws056Filename
     */
    public java.lang.String getWs056Filename() {
        return ws056Filename;
    }


    /**
     * Sets the ws056Filename value for this FileAttachment.
     * 
     * @param ws056Filename
     */
    public void setWs056Filename(java.lang.String ws056Filename) {
        this.ws056Filename = ws056Filename;
    }


    /**
     * Gets the ws056File value for this FileAttachment.
     * 
     * @return ws056File
     */
    public java.lang.String getWs056File() {
        return ws056File;
    }


    /**
     * Sets the ws056File value for this FileAttachment.
     * 
     * @param ws056File
     */
    public void setWs056File(java.lang.String ws056File) {
        this.ws056File = ws056File;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileAttachment)) return false;
        FileAttachment other = (FileAttachment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ws056Filename==null && other.getWs056Filename()==null) || 
             (this.ws056Filename!=null &&
              this.ws056Filename.equals(other.getWs056Filename()))) &&
            ((this.ws056File==null && other.getWs056File()==null) || 
             (this.ws056File!=null &&
              this.ws056File.equals(other.getWs056File())));
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
        if (getWs056Filename() != null) {
            _hashCode += getWs056Filename().hashCode();
        }
        if (getWs056File() != null) {
            _hashCode += getWs056File().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileAttachment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/chargebackscreate/", "fileAttachment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws056Filename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws056-filename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws056File");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws056-file"));
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
