/**
 * SearchForTransaction_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mastercom.app.searchfortransaction;

public class SearchForTransaction_ServiceLocator extends org.apache.axis.client.Service implements mastercom.app.searchfortransaction.SearchForTransaction_Service {

    public SearchForTransaction_ServiceLocator() {
    }


    public SearchForTransaction_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SearchForTransaction_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SearchForTransactionSOAP
    private java.lang.String SearchForTransactionSOAP_address = "http://10.206.116.159:7080/searchfortransaction";

    public java.lang.String getSearchForTransactionSOAPAddress() {
        return SearchForTransactionSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SearchForTransactionSOAPWSDDServiceName = "SearchForTransactionSOAP";

    public java.lang.String getSearchForTransactionSOAPWSDDServiceName() {
        return SearchForTransactionSOAPWSDDServiceName;
    }

    public void setSearchForTransactionSOAPWSDDServiceName(java.lang.String name) {
        SearchForTransactionSOAPWSDDServiceName = name;
    }

    public mastercom.app.searchfortransaction.SearchForTransaction_PortType getSearchForTransactionSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SearchForTransactionSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSearchForTransactionSOAP(endpoint);
    }

    public mastercom.app.searchfortransaction.SearchForTransaction_PortType getSearchForTransactionSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mastercom.app.searchfortransaction.SearchForTransactionSOAPStub _stub = new mastercom.app.searchfortransaction.SearchForTransactionSOAPStub(portAddress, this);
            _stub.setPortName(getSearchForTransactionSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSearchForTransactionSOAPEndpointAddress(java.lang.String address) {
        SearchForTransactionSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mastercom.app.searchfortransaction.SearchForTransaction_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mastercom.app.searchfortransaction.SearchForTransactionSOAPStub _stub = new mastercom.app.searchfortransaction.SearchForTransactionSOAPStub(new java.net.URL(SearchForTransactionSOAP_address), this);
                _stub.setPortName(getSearchForTransactionSOAPWSDDServiceName());
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
        if ("SearchForTransactionSOAP".equals(inputPortName)) {
            return getSearchForTransactionSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://app.mastercom/searchfortransaction/", "SearchForTransaction");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://app.mastercom/searchfortransaction/", "SearchForTransactionSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SearchForTransactionSOAP".equals(portName)) {
            setSearchForTransactionSOAPEndpointAddress(address);
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
