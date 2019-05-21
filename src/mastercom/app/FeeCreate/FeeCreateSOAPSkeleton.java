/**
 * FeeCreateSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.FeeCreate;

public class FeeCreateSOAPSkeleton implements mastercom.app.FeeCreate.FeeCreate_PortType, org.apache.axis.wsdl.Skeleton {
    private mastercom.app.FeeCreate.FeeCreate_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://app.mastercom/FeeCreate/", "ws068"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://app.mastercom/FeeCreate/", "ws068"), mastercom.app.FeeCreate.Ws068.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("feeCreate", _params, new javax.xml.namespace.QName("http://app.mastercom/FeeCreate/", "ws069"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://app.mastercom/FeeCreate/", "ws069"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "FeeCreate"));
        _oper.setSoapAction("http://app.mastercom/FeeCreate/FeeCreate");
        _myOperationsList.add(_oper);
        if (_myOperations.get("feeCreate") == null) {
            _myOperations.put("feeCreate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("feeCreate")).add(_oper);
    }

    public FeeCreateSOAPSkeleton() {
        this.impl = new mastercom.app.FeeCreate.FeeCreateSOAPImpl();
    }

    public FeeCreateSOAPSkeleton(mastercom.app.FeeCreate.FeeCreate_PortType impl) {
        this.impl = impl;
    }
    public mastercom.app.FeeCreate.Ws069 feeCreate(mastercom.app.FeeCreate.Ws068 ws068) throws java.rmi.RemoteException
    {
        mastercom.app.FeeCreate.Ws069 ret = impl.feeCreate(ws068);
        return ret;
    }

}
