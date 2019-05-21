/**
 * Ws073.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.Migrated_Disputes;

public class Ws073  implements java.io.Serializable {
    private mastercom.app.Migrated_Disputes.MigrationResponseList[] ws073MigrationResponseList;

    private java.lang.String ws073TotalCount;

    private java.lang.String ws073CodigoStatus;

    private java.lang.String ws073MensagemStatus;

    public Ws073() {
    }

    public Ws073(
           mastercom.app.Migrated_Disputes.MigrationResponseList[] ws073MigrationResponseList,
           java.lang.String ws073TotalCount,
           java.lang.String ws073CodigoStatus,
           java.lang.String ws073MensagemStatus) {
           this.ws073MigrationResponseList = ws073MigrationResponseList;
           this.ws073TotalCount = ws073TotalCount;
           this.ws073CodigoStatus = ws073CodigoStatus;
           this.ws073MensagemStatus = ws073MensagemStatus;
    }


    /**
     * Gets the ws073MigrationResponseList value for this Ws073.
     * 
     * @return ws073MigrationResponseList
     */
    public mastercom.app.Migrated_Disputes.MigrationResponseList[] getWs073MigrationResponseList() {
        return ws073MigrationResponseList;
    }


    /**
     * Sets the ws073MigrationResponseList value for this Ws073.
     * 
     * @param ws073MigrationResponseList
     */
    public void setWs073MigrationResponseList(mastercom.app.Migrated_Disputes.MigrationResponseList[] ws073MigrationResponseList) {
        this.ws073MigrationResponseList = ws073MigrationResponseList;
    }

    public mastercom.app.Migrated_Disputes.MigrationResponseList getWs073MigrationResponseList(int i) {
        return this.ws073MigrationResponseList[i];
    }

    public void setWs073MigrationResponseList(int i, mastercom.app.Migrated_Disputes.MigrationResponseList _value) {
        this.ws073MigrationResponseList[i] = _value;
    }


    /**
     * Gets the ws073TotalCount value for this Ws073.
     * 
     * @return ws073TotalCount
     */
    public java.lang.String getWs073TotalCount() {
        return ws073TotalCount;
    }


    /**
     * Sets the ws073TotalCount value for this Ws073.
     * 
     * @param ws073TotalCount
     */
    public void setWs073TotalCount(java.lang.String ws073TotalCount) {
        this.ws073TotalCount = ws073TotalCount;
    }


    /**
     * Gets the ws073CodigoStatus value for this Ws073.
     * 
     * @return ws073CodigoStatus
     */
    public java.lang.String getWs073CodigoStatus() {
        return ws073CodigoStatus;
    }


    /**
     * Sets the ws073CodigoStatus value for this Ws073.
     * 
     * @param ws073CodigoStatus
     */
    public void setWs073CodigoStatus(java.lang.String ws073CodigoStatus) {
        this.ws073CodigoStatus = ws073CodigoStatus;
    }


    /**
     * Gets the ws073MensagemStatus value for this Ws073.
     * 
     * @return ws073MensagemStatus
     */
    public java.lang.String getWs073MensagemStatus() {
        return ws073MensagemStatus;
    }


    /**
     * Sets the ws073MensagemStatus value for this Ws073.
     * 
     * @param ws073MensagemStatus
     */
    public void setWs073MensagemStatus(java.lang.String ws073MensagemStatus) {
        this.ws073MensagemStatus = ws073MensagemStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ws073)) return false;
        Ws073 other = (Ws073) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ws073MigrationResponseList==null && other.getWs073MigrationResponseList()==null) || 
             (this.ws073MigrationResponseList!=null &&
              java.util.Arrays.equals(this.ws073MigrationResponseList, other.getWs073MigrationResponseList()))) &&
            ((this.ws073TotalCount==null && other.getWs073TotalCount()==null) || 
             (this.ws073TotalCount!=null &&
              this.ws073TotalCount.equals(other.getWs073TotalCount()))) &&
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
        if (getWs073MigrationResponseList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWs073MigrationResponseList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWs073MigrationResponseList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWs073TotalCount() != null) {
            _hashCode += getWs073TotalCount().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(Ws073.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/Migrated_Disputes/", "ws073"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws073MigrationResponseList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws073-migrationResponseList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/Migrated_Disputes/", "migrationResponseList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws073TotalCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws073-totalCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
