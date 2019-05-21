/**
 * Ws074_Claims_RetrieveSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.claimsretrieve;

public class Ws074_Claims_RetrieveSOAPSkeleton implements mastercom.app.claimsretrieve.Ws074_Claims_Retrieve, org.apache.axis.wsdl.Skeleton {
    private mastercom.app.claimsretrieve.Ws074_Claims_Retrieve impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://app.mastercom/claimsretrieve/", "ws074"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://app.mastercom/claimsretrieve/", "ws074"), mastercom.app.claimsretrieve.Ws074.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("claims_Retrieve", _params, new javax.xml.namespace.QName("http://app.mastercom/claimsretrieve/", "ws075"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://app.mastercom/claimsretrieve/", "ws075"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "Claims_Retrieve"));
        _oper.setSoapAction("http://app.mastercom/claimsretrieve/Claims_Retrieve");
        _myOperationsList.add(_oper);
        if (_myOperations.get("claims_Retrieve") == null) {
            _myOperations.put("claims_Retrieve", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("claims_Retrieve")).add(_oper);
    }

    public Ws074_Claims_RetrieveSOAPSkeleton() {
        this.impl = new mastercom.app.claimsretrieve.Ws074_Claims_RetrieveSOAPImpl();
    }

    public Ws074_Claims_RetrieveSOAPSkeleton(mastercom.app.claimsretrieve.Ws074_Claims_Retrieve impl) {
        this.impl = impl;
    }
    public mastercom.app.claimsretrieve.Ws075 claims_Retrieve(mastercom.app.claimsretrieve.Ws074 ws074) throws java.rmi.RemoteException
    {
        mastercom.app.claimsretrieve.Ws075 ret = impl.claims_Retrieve(ws074);
        return ret;
    }

}
