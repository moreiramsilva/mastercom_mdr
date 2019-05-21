/**
 * SearchForTransactionSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.searchfortransaction;

public class SearchForTransactionSOAPSkeleton implements mastercom.app.searchfortransaction.SearchForTransaction_PortType, org.apache.axis.wsdl.Skeleton {
    private mastercom.app.searchfortransaction.SearchForTransaction_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://app.mastercom/searchfortransaction/", "ws048"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://app.mastercom/searchfortransaction/", "ws048"), mastercom.app.searchfortransaction.Ws048.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("ws048E049", _params, new javax.xml.namespace.QName("http://app.mastercom/searchfortransaction/", "ws049"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://app.mastercom/searchfortransaction/", "ws049"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "ws048e049"));
        _oper.setSoapAction("http://app.mastercom/searchfortransaction/ws048e049");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ws048E049") == null) {
            _myOperations.put("ws048E049", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("ws048E049")).add(_oper);
    }

    public SearchForTransactionSOAPSkeleton() {
        this.impl = new mastercom.app.searchfortransaction.SearchForTransactionSOAPImpl();
    }

    public SearchForTransactionSOAPSkeleton(mastercom.app.searchfortransaction.SearchForTransaction_PortType impl) {
        this.impl = impl;
    }
    public mastercom.app.searchfortransaction.Ws049 ws048E049(mastercom.app.searchfortransaction.Ws048 ws048) throws java.rmi.RemoteException
    {
        mastercom.app.searchfortransaction.Ws049 ret = impl.ws048E049(ws048);
        return ret;
    }

}
