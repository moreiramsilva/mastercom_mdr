/**
 * FraudCreate_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.fraudcreate;

public class FraudCreate_ServiceLocator extends org.apache.axis.client.Service implements mastercom.app.fraudcreate.FraudCreate_Service {

    public FraudCreate_ServiceLocator() {
    }


    public FraudCreate_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FraudCreate_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ws064_FraudCreateSOAP
    private java.lang.String ws064_FraudCreateSOAP_address = "http://localhost:8080/";

    public java.lang.String getws064_FraudCreateSOAPAddress() {
        return ws064_FraudCreateSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ws064_FraudCreateSOAPWSDDServiceName = "ws064_FraudCreateSOAP";

    public java.lang.String getws064_FraudCreateSOAPWSDDServiceName() {
        return ws064_FraudCreateSOAPWSDDServiceName;
    }

    public void setws064_FraudCreateSOAPWSDDServiceName(java.lang.String name) {
        ws064_FraudCreateSOAPWSDDServiceName = name;
    }

    public mastercom.app.fraudcreate.FraudCreate_PortType getws064_FraudCreateSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ws064_FraudCreateSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getws064_FraudCreateSOAP(endpoint);
    }

    public mastercom.app.fraudcreate.FraudCreate_PortType getws064_FraudCreateSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mastercom.app.fraudcreate.Ws064_FraudCreateSOAPStub _stub = new mastercom.app.fraudcreate.Ws064_FraudCreateSOAPStub(portAddress, this);
            _stub.setPortName(getws064_FraudCreateSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setws064_FraudCreateSOAPEndpointAddress(java.lang.String address) {
        ws064_FraudCreateSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mastercom.app.fraudcreate.FraudCreate_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mastercom.app.fraudcreate.Ws064_FraudCreateSOAPStub _stub = new mastercom.app.fraudcreate.Ws064_FraudCreateSOAPStub(new java.net.URL(ws064_FraudCreateSOAP_address), this);
                _stub.setPortName(getws064_FraudCreateSOAPWSDDServiceName());
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
        if ("ws064_FraudCreateSOAP".equals(inputPortName)) {
            return getws064_FraudCreateSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://app.mastercom/fraudcreate/", "FraudCreate");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://app.mastercom/fraudcreate/", "ws064_FraudCreateSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ws064_FraudCreateSOAP".equals(portName)) {
            setws064_FraudCreateSOAPEndpointAddress(address);
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
