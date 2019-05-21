/**
 * Ws060_RetrievalsCreateSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.retrievalscreate;

public class Ws060_RetrievalsCreateSOAPSkeleton implements mastercom.app.retrievalscreate.RetrievalsCreate_PortType, org.apache.axis.wsdl.Skeleton {
    private mastercom.app.retrievalscreate.RetrievalsCreate_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://app.mastercom/retrievalscreate/", "ws060"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://app.mastercom/retrievalscreate/", "ws060"), mastercom.app.retrievalscreate.Ws060.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("retrievalsCreate", _params, new javax.xml.namespace.QName("http://app.mastercom/retrievalscreate/", "ws061"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://app.mastercom/retrievalscreate/", "ws061"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "RetrievalsCreate"));
        _oper.setSoapAction("http://app.mastercom/retrievalscreate/RetrievalsCreate");
        _myOperationsList.add(_oper);
        if (_myOperations.get("retrievalsCreate") == null) {
            _myOperations.put("retrievalsCreate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("retrievalsCreate")).add(_oper);
    }

    public Ws060_RetrievalsCreateSOAPSkeleton() {
        this.impl = new mastercom.app.retrievalscreate.Ws060_RetrievalsCreateSOAPImpl();
    }

    public Ws060_RetrievalsCreateSOAPSkeleton(mastercom.app.retrievalscreate.RetrievalsCreate_PortType impl) {
        this.impl = impl;
    }
    public mastercom.app.retrievalscreate.Ws061 retrievalsCreate(mastercom.app.retrievalscreate.Ws060 ws060) throws java.rmi.RemoteException
    {
        mastercom.app.retrievalscreate.Ws061 ret = impl.retrievalsCreate(ws060);
        return ret;
    }

}
