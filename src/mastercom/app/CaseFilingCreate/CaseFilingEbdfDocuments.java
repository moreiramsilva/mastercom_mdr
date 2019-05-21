/**
 * CaseFilingEbdfDocuments.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.CaseFilingCreate;

public class CaseFilingEbdfDocuments  implements java.io.Serializable {
    private mastercom.app.CaseFilingCreate.ExpeditedBillingDrfDocument expeditedBillingDrfDocument;

    private mastercom.app.CaseFilingCreate.SmsLinkedCaseFilingDrfDocument smsLinkedCaseFilingDrfDocument;

    public CaseFilingEbdfDocuments() {
    }

    public CaseFilingEbdfDocuments(
           mastercom.app.CaseFilingCreate.ExpeditedBillingDrfDocument expeditedBillingDrfDocument,
           mastercom.app.CaseFilingCreate.SmsLinkedCaseFilingDrfDocument smsLinkedCaseFilingDrfDocument) {
           this.expeditedBillingDrfDocument = expeditedBillingDrfDocument;
           this.smsLinkedCaseFilingDrfDocument = smsLinkedCaseFilingDrfDocument;
    }


    /**
     * Gets the expeditedBillingDrfDocument value for this CaseFilingEbdfDocuments.
     * 
     * @return expeditedBillingDrfDocument
     */
    public mastercom.app.CaseFilingCreate.ExpeditedBillingDrfDocument getExpeditedBillingDrfDocument() {
        return expeditedBillingDrfDocument;
    }


    /**
     * Sets the expeditedBillingDrfDocument value for this CaseFilingEbdfDocuments.
     * 
     * @param expeditedBillingDrfDocument
     */
    public void setExpeditedBillingDrfDocument(mastercom.app.CaseFilingCreate.ExpeditedBillingDrfDocument expeditedBillingDrfDocument) {
        this.expeditedBillingDrfDocument = expeditedBillingDrfDocument;
    }


    /**
     * Gets the smsLinkedCaseFilingDrfDocument value for this CaseFilingEbdfDocuments.
     * 
     * @return smsLinkedCaseFilingDrfDocument
     */
    public mastercom.app.CaseFilingCreate.SmsLinkedCaseFilingDrfDocument getSmsLinkedCaseFilingDrfDocument() {
        return smsLinkedCaseFilingDrfDocument;
    }


    /**
     * Sets the smsLinkedCaseFilingDrfDocument value for this CaseFilingEbdfDocuments.
     * 
     * @param smsLinkedCaseFilingDrfDocument
     */
    public void setSmsLinkedCaseFilingDrfDocument(mastercom.app.CaseFilingCreate.SmsLinkedCaseFilingDrfDocument smsLinkedCaseFilingDrfDocument) {
        this.smsLinkedCaseFilingDrfDocument = smsLinkedCaseFilingDrfDocument;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CaseFilingEbdfDocuments)) return false;
        CaseFilingEbdfDocuments other = (CaseFilingEbdfDocuments) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.expeditedBillingDrfDocument==null && other.getExpeditedBillingDrfDocument()==null) || 
             (this.expeditedBillingDrfDocument!=null &&
              this.expeditedBillingDrfDocument.equals(other.getExpeditedBillingDrfDocument()))) &&
            ((this.smsLinkedCaseFilingDrfDocument==null && other.getSmsLinkedCaseFilingDrfDocument()==null) || 
             (this.smsLinkedCaseFilingDrfDocument!=null &&
              this.smsLinkedCaseFilingDrfDocument.equals(other.getSmsLinkedCaseFilingDrfDocument())));
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
        if (getExpeditedBillingDrfDocument() != null) {
            _hashCode += getExpeditedBillingDrfDocument().hashCode();
        }
        if (getSmsLinkedCaseFilingDrfDocument() != null) {
            _hashCode += getSmsLinkedCaseFilingDrfDocument().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CaseFilingEbdfDocuments.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/CaseFilingCreate/", "caseFilingEbdfDocuments"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expeditedBillingDrfDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expeditedBillingDrfDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/CaseFilingCreate/", "expeditedBillingDrfDocument"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsLinkedCaseFilingDrfDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smsLinkedCaseFilingDrfDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/CaseFilingCreate/", "smsLinkedCaseFilingDrfDocument"));
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
