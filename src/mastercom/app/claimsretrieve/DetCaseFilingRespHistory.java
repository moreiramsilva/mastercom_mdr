/**
 * DetCaseFilingRespHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.claimsretrieve;

public class DetCaseFilingRespHistory  implements java.io.Serializable {
    private java.lang.String detHistMemo;

    private java.lang.String detHistAction;

    private java.lang.String detHistResponseDate;

    public DetCaseFilingRespHistory() {
    }

    public DetCaseFilingRespHistory(
           java.lang.String detHistMemo,
           java.lang.String detHistAction,
           java.lang.String detHistResponseDate) {
           this.detHistMemo = detHistMemo;
           this.detHistAction = detHistAction;
           this.detHistResponseDate = detHistResponseDate;
    }


    /**
     * Gets the detHistMemo value for this DetCaseFilingRespHistory.
     * 
     * @return detHistMemo
     */
    public java.lang.String getDetHistMemo() {
        return detHistMemo;
    }


    /**
     * Sets the detHistMemo value for this DetCaseFilingRespHistory.
     * 
     * @param detHistMemo
     */
    public void setDetHistMemo(java.lang.String detHistMemo) {
        this.detHistMemo = detHistMemo;
    }


    /**
     * Gets the detHistAction value for this DetCaseFilingRespHistory.
     * 
     * @return detHistAction
     */
    public java.lang.String getDetHistAction() {
        return detHistAction;
    }


    /**
     * Sets the detHistAction value for this DetCaseFilingRespHistory.
     * 
     * @param detHistAction
     */
    public void setDetHistAction(java.lang.String detHistAction) {
        this.detHistAction = detHistAction;
    }


    /**
     * Gets the detHistResponseDate value for this DetCaseFilingRespHistory.
     * 
     * @return detHistResponseDate
     */
    public java.lang.String getDetHistResponseDate() {
        return detHistResponseDate;
    }


    /**
     * Sets the detHistResponseDate value for this DetCaseFilingRespHistory.
     * 
     * @param detHistResponseDate
     */
    public void setDetHistResponseDate(java.lang.String detHistResponseDate) {
        this.detHistResponseDate = detHistResponseDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DetCaseFilingRespHistory)) return false;
        DetCaseFilingRespHistory other = (DetCaseFilingRespHistory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.detHistMemo==null && other.getDetHistMemo()==null) || 
             (this.detHistMemo!=null &&
              this.detHistMemo.equals(other.getDetHistMemo()))) &&
            ((this.detHistAction==null && other.getDetHistAction()==null) || 
             (this.detHistAction!=null &&
              this.detHistAction.equals(other.getDetHistAction()))) &&
            ((this.detHistResponseDate==null && other.getDetHistResponseDate()==null) || 
             (this.detHistResponseDate!=null &&
              this.detHistResponseDate.equals(other.getDetHistResponseDate())));
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
        if (getDetHistMemo() != null) {
            _hashCode += getDetHistMemo().hashCode();
        }
        if (getDetHistAction() != null) {
            _hashCode += getDetHistAction().hashCode();
        }
        if (getDetHistResponseDate() != null) {
            _hashCode += getDetHistResponseDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DetCaseFilingRespHistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/claimsretrieve/", "det-caseFilingRespHistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detHistMemo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "det-hist-memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detHistAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "det-hist-action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detHistResponseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "det-hist-responseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
