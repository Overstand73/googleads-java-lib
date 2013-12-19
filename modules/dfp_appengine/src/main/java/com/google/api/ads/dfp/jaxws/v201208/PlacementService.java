
package com.google.api.ads.dfp.jaxws.v201208;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "PlacementService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201208", wsdlLocation = "https://www.google.com/apis/ads/publisher/v201208/PlacementService?wsdl")
public class PlacementService
    extends Service
{

    private final static URL PLACEMENTSERVICE_WSDL_LOCATION;
    private final static WebServiceException PLACEMENTSERVICE_EXCEPTION;
    private final static QName PLACEMENTSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201208", "PlacementService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://www.google.com/apis/ads/publisher/v201208/PlacementService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PLACEMENTSERVICE_WSDL_LOCATION = url;
        PLACEMENTSERVICE_EXCEPTION = e;
    }

    public PlacementService() {
        super(__getWsdlLocation(), PLACEMENTSERVICE_QNAME);
    }

    public PlacementService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns PlacementServiceInterface
     */
    @WebEndpoint(name = "PlacementServiceInterfacePort")
    public PlacementServiceInterface getPlacementServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201208", "PlacementServiceInterfacePort"), PlacementServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PlacementServiceInterface
     */
    @WebEndpoint(name = "PlacementServiceInterfacePort")
    public PlacementServiceInterface getPlacementServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201208", "PlacementServiceInterfacePort"), PlacementServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PLACEMENTSERVICE_EXCEPTION!= null) {
            throw PLACEMENTSERVICE_EXCEPTION;
        }
        return PLACEMENTSERVICE_WSDL_LOCATION;
    }

}
