
package com.google.api.ads.adwords.jaxws.v201306.cm;

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
@WebServiceClient(name = "GeoLocationService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201306", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201306/GeoLocationService?wsdl")
public class GeoLocationService
    extends Service
{

    private final static URL GEOLOCATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException GEOLOCATIONSERVICE_EXCEPTION;
    private final static QName GEOLOCATIONSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201306", "GeoLocationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201306/GeoLocationService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GEOLOCATIONSERVICE_WSDL_LOCATION = url;
        GEOLOCATIONSERVICE_EXCEPTION = e;
    }

    public GeoLocationService() {
        super(__getWsdlLocation(), GEOLOCATIONSERVICE_QNAME);
    }

    public GeoLocationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns GeoLocationServiceInterface
     */
    @WebEndpoint(name = "GeoLocationServiceInterfacePort")
    public GeoLocationServiceInterface getGeoLocationServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201306", "GeoLocationServiceInterfacePort"), GeoLocationServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GeoLocationServiceInterface
     */
    @WebEndpoint(name = "GeoLocationServiceInterfacePort")
    public GeoLocationServiceInterface getGeoLocationServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201306", "GeoLocationServiceInterfacePort"), GeoLocationServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GEOLOCATIONSERVICE_EXCEPTION!= null) {
            throw GEOLOCATIONSERVICE_EXCEPTION;
        }
        return GEOLOCATIONSERVICE_WSDL_LOCATION;
    }

}
