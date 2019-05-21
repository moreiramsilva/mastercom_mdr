/**
 * Ws058CaseFilingCreateSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.CaseFilingCreate;

public class Ws058CaseFilingCreateSOAPSkeleton implements mastercom.app.CaseFilingCreate.CaseFilingCreate_PortType, org.apache.axis.wsdl.Skeleton {
    private mastercom.app.CaseFilingCreate.CaseFilingCreate_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://app.mastercom/CaseFilingCreate/", "ws058"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://app.mastercom/CaseFilingCreate/", "ws058"), mastercom.app.CaseFilingCreate.Ws058.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("ws058E059", _params, new javax.xml.namespace.QName("http://app.mastercom/CaseFilingCreate/", "ws059"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://app.mastercom/CaseFilingCreate/", "ws059"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "ws058e059"));
        _oper.setSoapAction("http://app.mastercom/CaseFilingCreate/ws058e059");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ws058E059") == null) {
            _myOperations.put("ws058E059", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("ws058E059")).add(_oper);
    }

    public Ws058CaseFilingCreateSOAPSkeleton() {
        this.impl = new mastercom.app.CaseFilingCreate.Ws058CaseFilingCreateSOAPImpl();
    }

    public Ws058CaseFilingCreateSOAPSkeleton(mastercom.app.CaseFilingCreate.CaseFilingCreate_PortType impl) {
        this.impl = impl;
    }
    public mastercom.app.CaseFilingCreate.Ws059 ws058E059(mastercom.app.CaseFilingCreate.Ws058 ws058) throws java.rmi.RemoteException
    {
        mastercom.app.CaseFilingCreate.Ws059 ret = impl.ws058E059(ws058);
        return ret;
    }

}
