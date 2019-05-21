/**
 * ChargebacksCreateSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.chargebackscreate;

public class ChargebacksCreateSOAPSkeleton implements mastercom.app.chargebackscreate.ChargebacksCreate_PortType, org.apache.axis.wsdl.Skeleton {
    private mastercom.app.chargebackscreate.ChargebacksCreate_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://app.mastercom/chargebackscreate/", "ws056"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://app.mastercom/chargebackscreate/", "ws056"), mastercom.app.chargebackscreate.Ws056.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("ws056E057", _params, new javax.xml.namespace.QName("http://app.mastercom/chargebackscreate/", "ws057"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://app.mastercom/chargebackscreate/", "ws057"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "ws056e057"));
        _oper.setSoapAction("http://app.mastercom/chargebackscreate/ws056e057");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ws056E057") == null) {
            _myOperations.put("ws056E057", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("ws056E057")).add(_oper);
    }

    public ChargebacksCreateSOAPSkeleton() {
        this.impl = new mastercom.app.chargebackscreate.ChargebacksCreateSOAPImpl();
    }

    public ChargebacksCreateSOAPSkeleton(mastercom.app.chargebackscreate.ChargebacksCreate_PortType impl) {
        this.impl = impl;
    }
    public mastercom.app.chargebackscreate.Ws057 ws056E057(mastercom.app.chargebackscreate.Ws056 ws056) throws java.rmi.RemoteException
    {
        mastercom.app.chargebackscreate.Ws057 ret = impl.ws056E057(ws056);
        return ret;
    }

}
