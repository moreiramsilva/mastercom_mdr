/**
 * Ws064_FraudCreateSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.fraudcreate;

public class Ws064_FraudCreateSOAPSkeleton implements mastercom.app.fraudcreate.FraudCreate_PortType, org.apache.axis.wsdl.Skeleton {
    private mastercom.app.fraudcreate.FraudCreate_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://app.mastercom/fraudcreate/", "ws064"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://app.mastercom/fraudcreate/", "ws064"), mastercom.app.fraudcreate.Ws064.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("fraudCreate", _params, new javax.xml.namespace.QName("http://app.mastercom/fraudcreate/", "ws065"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://app.mastercom/fraudcreate/", "ws065"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "FraudCreate"));
        _oper.setSoapAction("http://app.mastercom/fraudcreate/FraudCreate");
        _myOperationsList.add(_oper);
        if (_myOperations.get("fraudCreate") == null) {
            _myOperations.put("fraudCreate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("fraudCreate")).add(_oper);
    }

    public Ws064_FraudCreateSOAPSkeleton() {
        this.impl = new mastercom.app.fraudcreate.Ws064_FraudCreateSOAPImpl();
    }

    public Ws064_FraudCreateSOAPSkeleton(mastercom.app.fraudcreate.FraudCreate_PortType impl) {
        this.impl = impl;
    }
    public mastercom.app.fraudcreate.Ws065 fraudCreate(mastercom.app.fraudcreate.Ws064 ws064) throws java.rmi.RemoteException
    {
        mastercom.app.fraudcreate.Ws065 ret = impl.fraudCreate(ws064);
        return ret;
    }

}
