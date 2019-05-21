/**
 * ChargebacksCreate_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.chargebackscreate;

public class ChargebacksCreate_ServiceLocator extends org.apache.axis.client.Service implements mastercom.app.chargebackscreate.ChargebacksCreate_Service {

    public ChargebacksCreate_ServiceLocator() {
    }


    public ChargebacksCreate_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ChargebacksCreate_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ChargebacksCreateSOAP
    private java.lang.String ChargebacksCreateSOAP_address = "http://localhost:8000/";

    public java.lang.String getChargebacksCreateSOAPAddress() {
        return ChargebacksCreateSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ChargebacksCreateSOAPWSDDServiceName = "ChargebacksCreateSOAP";

    public java.lang.String getChargebacksCreateSOAPWSDDServiceName() {
        return ChargebacksCreateSOAPWSDDServiceName;
    }

    public void setChargebacksCreateSOAPWSDDServiceName(java.lang.String name) {
        ChargebacksCreateSOAPWSDDServiceName = name;
    }

    public mastercom.app.chargebackscreate.ChargebacksCreate_PortType getChargebacksCreateSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ChargebacksCreateSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getChargebacksCreateSOAP(endpoint);
    }

    public mastercom.app.chargebackscreate.ChargebacksCreate_PortType getChargebacksCreateSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mastercom.app.chargebackscreate.ChargebacksCreateSOAPStub _stub = new mastercom.app.chargebackscreate.ChargebacksCreateSOAPStub(portAddress, this);
            _stub.setPortName(getChargebacksCreateSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setChargebacksCreateSOAPEndpointAddress(java.lang.String address) {
        ChargebacksCreateSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mastercom.app.chargebackscreate.ChargebacksCreate_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mastercom.app.chargebackscreate.ChargebacksCreateSOAPStub _stub = new mastercom.app.chargebackscreate.ChargebacksCreateSOAPStub(new java.net.URL(ChargebacksCreateSOAP_address), this);
                _stub.setPortName(getChargebacksCreateSOAPWSDDServiceName());
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
        if ("ChargebacksCreateSOAP".equals(inputPortName)) {
            return getChargebacksCreateSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://app.mastercom/chargebackscreate/", "ChargebacksCreate");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://app.mastercom/chargebackscreate/", "ChargebacksCreateSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ChargebacksCreateSOAP".equals(portName)) {
            setChargebacksCreateSOAPEndpointAddress(address);
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
