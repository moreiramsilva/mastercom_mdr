/**
 * Claims_RetrieveLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.searchfortransaction.claimsretrieve;

public class Claims_RetrieveLocator extends org.apache.axis.client.Service implements mastercom.app.searchfortransaction.claimsretrieve.Claims_Retrieve {

    public Claims_RetrieveLocator() {
    }


    public Claims_RetrieveLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Claims_RetrieveLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Claims_RetrieveSOAP
    private java.lang.String Claims_RetrieveSOAP_address = "http://www.example.org/";

    public java.lang.String getClaims_RetrieveSOAPAddress() {
        return Claims_RetrieveSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Claims_RetrieveSOAPWSDDServiceName = "Claims_RetrieveSOAP";

    public java.lang.String getClaims_RetrieveSOAPWSDDServiceName() {
        return Claims_RetrieveSOAPWSDDServiceName;
    }

    public void setClaims_RetrieveSOAPWSDDServiceName(java.lang.String name) {
        Claims_RetrieveSOAPWSDDServiceName = name;
    }

    public mastercom.app.searchfortransaction.claimsretrieve.Ws074_Claims_Retrieve getClaims_RetrieveSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Claims_RetrieveSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getClaims_RetrieveSOAP(endpoint);
    }

    public mastercom.app.searchfortransaction.claimsretrieve.Ws074_Claims_Retrieve getClaims_RetrieveSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mastercom.app.searchfortransaction.claimsretrieve.Ws074_Claims_RetrieveSOAPStub _stub = new mastercom.app.searchfortransaction.claimsretrieve.Ws074_Claims_RetrieveSOAPStub(portAddress, this);
            _stub.setPortName(getClaims_RetrieveSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setClaims_RetrieveSOAPEndpointAddress(java.lang.String address) {
        Claims_RetrieveSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mastercom.app.searchfortransaction.claimsretrieve.Ws074_Claims_Retrieve.class.isAssignableFrom(serviceEndpointInterface)) {
                mastercom.app.searchfortransaction.claimsretrieve.Ws074_Claims_RetrieveSOAPStub _stub = new mastercom.app.searchfortransaction.claimsretrieve.Ws074_Claims_RetrieveSOAPStub(new java.net.URL(Claims_RetrieveSOAP_address), this);
                _stub.setPortName(getClaims_RetrieveSOAPWSDDServiceName());
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
        if ("Claims_RetrieveSOAP".equals(inputPortName)) {
            return getClaims_RetrieveSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://app.mastercom/searchfortransaction/claimsretrieve/", "Claims_Retrieve");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://app.mastercom/searchfortransaction/claimsretrieve/", "Claims_RetrieveSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Claims_RetrieveSOAP".equals(portName)) {
            setClaims_RetrieveSOAPEndpointAddress(address);
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
