/**
 * ClaimsCreate_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.claimscreate;

public class ClaimsCreate_ServiceLocator extends org.apache.axis.client.Service implements mastercom.app.claimscreate.ClaimsCreate_Service {

    public ClaimsCreate_ServiceLocator() {
    }


    public ClaimsCreate_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ClaimsCreate_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ClaimsCreateSOAP
    private java.lang.String ClaimsCreateSOAP_address = "http://localhost:8080/";

    public java.lang.String getClaimsCreateSOAPAddress() {
        return ClaimsCreateSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ClaimsCreateSOAPWSDDServiceName = "ClaimsCreateSOAP";

    public java.lang.String getClaimsCreateSOAPWSDDServiceName() {
        return ClaimsCreateSOAPWSDDServiceName;
    }

    public void setClaimsCreateSOAPWSDDServiceName(java.lang.String name) {
        ClaimsCreateSOAPWSDDServiceName = name;
    }

    public mastercom.app.claimscreate.ClaimsCreate_PortType getClaimsCreateSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ClaimsCreateSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getClaimsCreateSOAP(endpoint);
    }

    public mastercom.app.claimscreate.ClaimsCreate_PortType getClaimsCreateSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mastercom.app.claimscreate.ClaimsCreateSOAPStub _stub = new mastercom.app.claimscreate.ClaimsCreateSOAPStub(portAddress, this);
            _stub.setPortName(getClaimsCreateSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setClaimsCreateSOAPEndpointAddress(java.lang.String address) {
        ClaimsCreateSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mastercom.app.claimscreate.ClaimsCreate_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mastercom.app.claimscreate.ClaimsCreateSOAPStub _stub = new mastercom.app.claimscreate.ClaimsCreateSOAPStub(new java.net.URL(ClaimsCreateSOAP_address), this);
                _stub.setPortName(getClaimsCreateSOAPWSDDServiceName());
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
        if ("ClaimsCreateSOAP".equals(inputPortName)) {
            return getClaimsCreateSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://app.mastercom/claimscreate/", "ClaimsCreate");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://app.mastercom/claimscreate/", "ClaimsCreateSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ClaimsCreateSOAP".equals(portName)) {
            setClaimsCreateSOAPEndpointAddress(address);
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
