/**
 * CaseFilingCreate_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.CaseFilingCreate;

public class CaseFilingCreate_ServiceLocator extends org.apache.axis.client.Service implements mastercom.app.CaseFilingCreate.CaseFilingCreate_Service {

    public CaseFilingCreate_ServiceLocator() {
    }


    public CaseFilingCreate_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CaseFilingCreate_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CaseFilingCreateSOAP
    private java.lang.String CaseFilingCreateSOAP_address = "http://10.206.116.188:8080/mastercom/services/CaseFilingCreate";

    public java.lang.String getCaseFilingCreateSOAPAddress() {
        return CaseFilingCreateSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CaseFilingCreateSOAPWSDDServiceName = "CaseFilingCreateSOAP";

    public java.lang.String getCaseFilingCreateSOAPWSDDServiceName() {
        return CaseFilingCreateSOAPWSDDServiceName;
    }

    public void setCaseFilingCreateSOAPWSDDServiceName(java.lang.String name) {
        CaseFilingCreateSOAPWSDDServiceName = name;
    }

    public mastercom.app.CaseFilingCreate.CaseFilingCreate_PortType getCaseFilingCreateSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CaseFilingCreateSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCaseFilingCreateSOAP(endpoint);
    }

    public mastercom.app.CaseFilingCreate.CaseFilingCreate_PortType getCaseFilingCreateSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mastercom.app.CaseFilingCreate.Ws058CaseFilingCreateSOAPStub _stub = new mastercom.app.CaseFilingCreate.Ws058CaseFilingCreateSOAPStub(portAddress, this);
            _stub.setPortName(getCaseFilingCreateSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCaseFilingCreateSOAPEndpointAddress(java.lang.String address) {
        CaseFilingCreateSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mastercom.app.CaseFilingCreate.CaseFilingCreate_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mastercom.app.CaseFilingCreate.Ws058CaseFilingCreateSOAPStub _stub = new mastercom.app.CaseFilingCreate.Ws058CaseFilingCreateSOAPStub(new java.net.URL(CaseFilingCreateSOAP_address), this);
                _stub.setPortName(getCaseFilingCreateSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CaseFilingCreateSOAP".equals(inputPortName)) {
            return getCaseFilingCreateSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://app.mastercom/CaseFilingCreate/", "CaseFilingCreate");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://app.mastercom/CaseFilingCreate/", "CaseFilingCreateSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CaseFilingCreateSOAP".equals(portName)) {
            setCaseFilingCreateSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
