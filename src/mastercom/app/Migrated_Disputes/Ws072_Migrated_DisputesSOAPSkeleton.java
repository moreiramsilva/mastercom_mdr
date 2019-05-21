/**
 * Ws072_Migrated_DisputesSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.Migrated_Disputes;

public class Ws072_Migrated_DisputesSOAPSkeleton implements mastercom.app.Migrated_Disputes.Migrated_Disputes_PortType, org.apache.axis.wsdl.Skeleton {
    private mastercom.app.Migrated_Disputes.Migrated_Disputes_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://app.mastercom/Migrated_Disputes/", "ws072"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://app.mastercom/Migrated_Disputes/", "ws072"), mastercom.app.Migrated_Disputes.Ws072.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("migrated_Disputes", _params, new javax.xml.namespace.QName("http://app.mastercom/Migrated_Disputes/", "ws073"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://app.mastercom/Migrated_Disputes/", "ws073"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "Migrated_Disputes"));
        _oper.setSoapAction("http://app.mastercom/Migrated_Disputes/Migrated_Disputes");
        _myOperationsList.add(_oper);
        if (_myOperations.get("migrated_Disputes") == null) {
            _myOperations.put("migrated_Disputes", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("migrated_Disputes")).add(_oper);
    }

    public Ws072_Migrated_DisputesSOAPSkeleton() {
        this.impl = new mastercom.app.Migrated_Disputes.Ws072_Migrated_DisputesSOAPImpl();
    }

    public Ws072_Migrated_DisputesSOAPSkeleton(mastercom.app.Migrated_Disputes.Migrated_Disputes_PortType impl) {
        this.impl = impl;
    }
    public mastercom.app.Migrated_Disputes.Ws073 migrated_Disputes(mastercom.app.Migrated_Disputes.Ws072 ws072) throws java.rmi.RemoteException
    {
        mastercom.app.Migrated_Disputes.Ws073 ret = impl.migrated_Disputes(ws072);
        return ret;
    }

}
