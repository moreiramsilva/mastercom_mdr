/**
 * Migrated_Disputes_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.Migrated_Disputes;

public class Migrated_Disputes_ServiceLocator extends org.apache.axis.client.Service implements mastercom.app.Migrated_Disputes.Migrated_Disputes_Service {

    public Migrated_Disputes_ServiceLocator() {
    }


    public Migrated_Disputes_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Migrated_Disputes_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Migrated_DisputesSOAP
    private java.lang.String Migrated_DisputesSOAP_address = "http://localhost:8080/Migrated_DisputesSOAP";

    public java.lang.String getMigrated_DisputesSOAPAddress() {
        return Migrated_DisputesSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Migrated_DisputesSOAPWSDDServiceName = "Migrated_DisputesSOAP";

    public java.lang.String getMigrated_DisputesSOAPWSDDServiceName() {
        return Migrated_DisputesSOAPWSDDServiceName;
    }

    public void setMigrated_DisputesSOAPWSDDServiceName(java.lang.String name) {
        Migrated_DisputesSOAPWSDDServiceName = name;
    }

    public mastercom.app.Migrated_Disputes.Migrated_Disputes_PortType getMigrated_DisputesSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Migrated_DisputesSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMigrated_DisputesSOAP(endpoint);
    }

    public mastercom.app.Migrated_Disputes.Migrated_Disputes_PortType getMigrated_DisputesSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mastercom.app.Migrated_Disputes.Ws072_Migrated_DisputesSOAPStub _stub = new mastercom.app.Migrated_Disputes.Ws072_Migrated_DisputesSOAPStub(portAddress, this);
            _stub.setPortName(getMigrated_DisputesSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMigrated_DisputesSOAPEndpointAddress(java.lang.String address) {
        Migrated_DisputesSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mastercom.app.Migrated_Disputes.Migrated_Disputes_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mastercom.app.Migrated_Disputes.Ws072_Migrated_DisputesSOAPStub _stub = new mastercom.app.Migrated_Disputes.Ws072_Migrated_DisputesSOAPStub(new java.net.URL(Migrated_DisputesSOAP_address), this);
                _stub.setPortName(getMigrated_DisputesSOAPWSDDServiceName());
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
        if ("Migrated_DisputesSOAP".equals(inputPortName)) {
            return getMigrated_DisputesSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://app.mastercom/Migrated_Disputes/", "Migrated_Disputes");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://app.mastercom/Migrated_Disputes/", "Migrated_DisputesSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Migrated_DisputesSOAP".equals(portName)) {
            setMigrated_DisputesSOAPEndpointAddress(address);
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
