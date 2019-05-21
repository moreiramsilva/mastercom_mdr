/**
 * RetrievalsCreate_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.retrievalscreate;

public class RetrievalsCreate_ServiceLocator extends org.apache.axis.client.Service implements mastercom.app.retrievalscreate.RetrievalsCreate_Service {

    public RetrievalsCreate_ServiceLocator() {
    }


    public RetrievalsCreate_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RetrievalsCreate_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RetrievalsCreateSOAP
    private java.lang.String RetrievalsCreateSOAP_address = "http://localhost:8080/";

    public java.lang.String getRetrievalsCreateSOAPAddress() {
        return RetrievalsCreateSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RetrievalsCreateSOAPWSDDServiceName = "RetrievalsCreateSOAP";

    public java.lang.String getRetrievalsCreateSOAPWSDDServiceName() {
        return RetrievalsCreateSOAPWSDDServiceName;
    }

    public void setRetrievalsCreateSOAPWSDDServiceName(java.lang.String name) {
        RetrievalsCreateSOAPWSDDServiceName = name;
    }

    public mastercom.app.retrievalscreate.RetrievalsCreate_PortType getRetrievalsCreateSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RetrievalsCreateSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRetrievalsCreateSOAP(endpoint);
    }

    public mastercom.app.retrievalscreate.RetrievalsCreate_PortType getRetrievalsCreateSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mastercom.app.retrievalscreate.Ws060_RetrievalsCreateSOAPStub _stub = new mastercom.app.retrievalscreate.Ws060_RetrievalsCreateSOAPStub(portAddress, this);
            _stub.setPortName(getRetrievalsCreateSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRetrievalsCreateSOAPEndpointAddress(java.lang.String address) {
        RetrievalsCreateSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mastercom.app.retrievalscreate.RetrievalsCreate_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mastercom.app.retrievalscreate.Ws060_RetrievalsCreateSOAPStub _stub = new mastercom.app.retrievalscreate.Ws060_RetrievalsCreateSOAPStub(new java.net.URL(RetrievalsCreateSOAP_address), this);
                _stub.setPortName(getRetrievalsCreateSOAPWSDDServiceName());
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
        if ("RetrievalsCreateSOAP".equals(inputPortName)) {
            return getRetrievalsCreateSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://app.mastercom/retrievalscreate/", "RetrievalsCreate");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://app.mastercom/retrievalscreate/", "RetrievalsCreateSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RetrievalsCreateSOAP".equals(portName)) {
            setRetrievalsCreateSOAPEndpointAddress(address);
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
