/**
 * FeeCreate_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.FeeCreate;

public class FeeCreate_ServiceLocator extends org.apache.axis.client.Service implements mastercom.app.FeeCreate.FeeCreate_Service {

    public FeeCreate_ServiceLocator() {
    }


    public FeeCreate_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FeeCreate_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FeeCreateSOAP
    private java.lang.String FeeCreateSOAP_address = "http://www.example.org/";

    public java.lang.String getFeeCreateSOAPAddress() {
        return FeeCreateSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FeeCreateSOAPWSDDServiceName = "FeeCreateSOAP";

    public java.lang.String getFeeCreateSOAPWSDDServiceName() {
        return FeeCreateSOAPWSDDServiceName;
    }

    public void setFeeCreateSOAPWSDDServiceName(java.lang.String name) {
        FeeCreateSOAPWSDDServiceName = name;
    }

    public mastercom.app.FeeCreate.FeeCreate_PortType getFeeCreateSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FeeCreateSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFeeCreateSOAP(endpoint);
    }

    public mastercom.app.FeeCreate.FeeCreate_PortType getFeeCreateSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mastercom.app.FeeCreate.FeeCreateSOAPStub _stub = new mastercom.app.FeeCreate.FeeCreateSOAPStub(portAddress, this);
            _stub.setPortName(getFeeCreateSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFeeCreateSOAPEndpointAddress(java.lang.String address) {
        FeeCreateSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mastercom.app.FeeCreate.FeeCreate_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mastercom.app.FeeCreate.FeeCreateSOAPStub _stub = new mastercom.app.FeeCreate.FeeCreateSOAPStub(new java.net.URL(FeeCreateSOAP_address), this);
                _stub.setPortName(getFeeCreateSOAPWSDDServiceName());
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
        if ("FeeCreateSOAP".equals(inputPortName)) {
            return getFeeCreateSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://app.mastercom/FeeCreate/", "FeeCreate");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://app.mastercom/FeeCreate/", "FeeCreateSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FeeCreateSOAP".equals(portName)) {
            setFeeCreateSOAPEndpointAddress(address);
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
