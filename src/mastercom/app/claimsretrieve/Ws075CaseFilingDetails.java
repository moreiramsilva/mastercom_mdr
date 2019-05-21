/**
 * Ws075CaseFilingDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.claimsretrieve;

public class Ws075CaseFilingDetails  implements java.io.Serializable {
    private java.lang.String caseFilingStatus;

    private mastercom.app.claimsretrieve.DetCaseFilingDetails caseFilingDetails;

    private mastercom.app.claimsretrieve.DetCaseFilingRespHistory[] caseFilingRespHistory;

    public Ws075CaseFilingDetails() {
    }

    public Ws075CaseFilingDetails(
           java.lang.String caseFilingStatus,
           mastercom.app.claimsretrieve.DetCaseFilingDetails caseFilingDetails,
           mastercom.app.claimsretrieve.DetCaseFilingRespHistory[] caseFilingRespHistory) {
           this.caseFilingStatus = caseFilingStatus;
           this.caseFilingDetails = caseFilingDetails;
           this.caseFilingRespHistory = caseFilingRespHistory;
    }


    /**
     * Gets the caseFilingStatus value for this Ws075CaseFilingDetails.
     * 
     * @return caseFilingStatus
     */
    public java.lang.String getCaseFilingStatus() {
        return caseFilingStatus;
    }


    /**
     * Sets the caseFilingStatus value for this Ws075CaseFilingDetails.
     * 
     * @param caseFilingStatus
     */
    public void setCaseFilingStatus(java.lang.String caseFilingStatus) {
        this.caseFilingStatus = caseFilingStatus;
    }


    /**
     * Gets the caseFilingDetails value for this Ws075CaseFilingDetails.
     * 
     * @return caseFilingDetails
     */
    public mastercom.app.claimsretrieve.DetCaseFilingDetails getCaseFilingDetails() {
        return caseFilingDetails;
    }


    /**
     * Sets the caseFilingDetails value for this Ws075CaseFilingDetails.
     * 
     * @param caseFilingDetails
     */
    public void setCaseFilingDetails(mastercom.app.claimsretrieve.DetCaseFilingDetails caseFilingDetails) {
        this.caseFilingDetails = caseFilingDetails;
    }


    /**
     * Gets the caseFilingRespHistory value for this Ws075CaseFilingDetails.
     * 
     * @return caseFilingRespHistory
     */
    public mastercom.app.claimsretrieve.DetCaseFilingRespHistory[] getCaseFilingRespHistory() {
        return caseFilingRespHistory;
    }


    /**
     * Sets the caseFilingRespHistory value for this Ws075CaseFilingDetails.
     * 
     * @param caseFilingRespHistory
     */
    public void setCaseFilingRespHistory(mastercom.app.claimsretrieve.DetCaseFilingRespHistory[] caseFilingRespHistory) {
        this.caseFilingRespHistory = caseFilingRespHistory;
    }

    public mastercom.app.claimsretrieve.DetCaseFilingRespHistory getCaseFilingRespHistory(int i) {
        return this.caseFilingRespHistory[i];
    }

    public void setCaseFilingRespHistory(int i, mastercom.app.claimsretrieve.DetCaseFilingRespHistory _value) {
        this.caseFilingRespHistory[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ws075CaseFilingDetails)) return false;
        Ws075CaseFilingDetails other = (Ws075CaseFilingDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.caseFilingStatus==null && other.getCaseFilingStatus()==null) || 
             (this.caseFilingStatus!=null &&
              this.caseFilingStatus.equals(other.getCaseFilingStatus()))) &&
            ((this.caseFilingDetails==null && other.getCaseFilingDetails()==null) || 
             (this.caseFilingDetails!=null &&
              this.caseFilingDetails.equals(other.getCaseFilingDetails()))) &&
            ((this.caseFilingRespHistory==null && other.getCaseFilingRespHistory()==null) || 
             (this.caseFilingRespHistory!=null &&
              java.util.Arrays.equals(this.caseFilingRespHistory, other.getCaseFilingRespHistory())));
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
        if (getCaseFilingStatus() != null) {
            _hashCode += getCaseFilingStatus().hashCode();
        }
        if (getCaseFilingDetails() != null) {
            _hashCode += getCaseFilingDetails().hashCode();
        }
        if (getCaseFilingRespHistory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaseFilingRespHistory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaseFilingRespHistory(), i);
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
        new org.apache.axis.description.TypeDesc(Ws075CaseFilingDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/claimsretrieve/", "ws075-caseFilingDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseFilingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "caseFilingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseFilingDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "caseFilingDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/claimsretrieve/", "det-caseFilingDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseFilingRespHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "caseFilingRespHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://app.mastercom/claimsretrieve/", "det-caseFilingRespHistory"));
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
