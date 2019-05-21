/**
 * ClaimsCreateSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.claimscreate;

public class ClaimsCreateSOAPSkeleton implements mastercom.app.claimscreate.ClaimsCreate_PortType, org.apache.axis.wsdl.Skeleton {
    private mastercom.app.claimscreate.ClaimsCreate_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://app.mastercom/claimscreate/", "ws050"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://app.mastercom/claimscreate/", "ws050"), mastercom.app.claimscreate.Ws050.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("ws050E051", _params, new javax.xml.namespace.QName("http://app.mastercom/claimscreate/", "ws051"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://app.mastercom/claimscreate/", "ws051"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "ws050e051"));
        _oper.setSoapAction("http://app.mastercom/claimscreate/ws050e051");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ws050E051") == null) {
            _myOperations.put("ws050E051", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("ws050E051")).add(_oper);
    }

    public ClaimsCreateSOAPSkeleton() {
        this.impl = new mastercom.app.claimscreate.ClaimsCreateSOAPImpl();
    }

    public ClaimsCreateSOAPSkeleton(mastercom.app.claimscreate.ClaimsCreate_PortType impl) {
        this.impl = impl;
    }
    public mastercom.app.claimscreate.Ws051 ws050E051(mastercom.app.claimscreate.Ws050 ws050) throws java.rmi.RemoteException
    {
        mastercom.app.claimscreate.Ws051 ret = impl.ws050E051(ws050);
        return ret;
    }

}
