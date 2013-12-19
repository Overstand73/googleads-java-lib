
package com.google.api.ads.dfp.jaxws.v201311;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for adding, updating and retrieving {@link Creative}
 *       objects.
 *       
 *       <p>For a creative to run, it must be associated with a {@link LineItem}
 *       managed by the {@link LineItemCreativeAssociationService}.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CreativeServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CreativeServiceInterface {


    /**
     * 
     *         Creates a new {@link Creative}.
     *         
     *         The following fields are required along with the required fields of the
     *         sub-class:
     *         <ul>
     *         <li>{@link Creative#advertiserId}</li>
     *         <li>{@link Creative#name}</li>
     *         <li>{@link Creative#size}</li>
     *         </ul>
     *         
     *         @param creative the creative to create
     *         @return the new creative with its ID set
     *       
     * 
     * @param creative
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201311.Creative
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
    @RequestWrapper(localName = "createCreative", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.CreativeServiceInterfacecreateCreative")
    @ResponseWrapper(localName = "createCreativeResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.CreativeServiceInterfacecreateCreativeResponse")
    public Creative createCreative(
        @WebParam(name = "creative", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
        Creative creative)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Creates new {@link Creative} objects.
     *         
     *         @param creatives the creatives to create
     *         @return the created creatives with their IDs filled in
     *       
     * 
     * @param creatives
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201311.Creative>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
    @RequestWrapper(localName = "createCreatives", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.CreativeServiceInterfacecreateCreatives")
    @ResponseWrapper(localName = "createCreativesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.CreativeServiceInterfacecreateCreativesResponse")
    public List<Creative> createCreatives(
        @WebParam(name = "creatives", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
        List<Creative> creatives)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the {@link Creative} uniquely identified by the given ID.
     *         
     *         @param creativeId the ID of the creative, which must already exist
     *         @return the {@code Creative} uniquely identified by the given ID
     *       
     * 
     * @param creativeId
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201311.Creative
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
    @RequestWrapper(localName = "getCreative", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.CreativeServiceInterfacegetCreative")
    @ResponseWrapper(localName = "getCreativeResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.CreativeServiceInterfacegetCreativeResponse")
    public Creative getCreative(
        @WebParam(name = "creativeId", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
        Long creativeId)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link CreativePage} of {@link Creative} objects that satisfy the
     *         given {@link Statement#query}. The following fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Creative#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Creative#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code advertiserId}</td>
     *         <td>{@link Creative#advertiserId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code width}</td>
     *         <td>{@link Creative#size}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code height}</td>
     *         <td>{@link Creative#size}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Creative#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of creatives
     *         @return the creatives that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201311.CreativePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
    @RequestWrapper(localName = "getCreativesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.CreativeServiceInterfacegetCreativesByStatement")
    @ResponseWrapper(localName = "getCreativesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.CreativeServiceInterfacegetCreativesByStatementResponse")
    public CreativePage getCreativesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Creative}.
     *         
     *         @param creative the creative to update
     *         @return the updated creative
     *       
     * 
     * @param creative
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201311.Creative
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
    @RequestWrapper(localName = "updateCreative", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.CreativeServiceInterfaceupdateCreative")
    @ResponseWrapper(localName = "updateCreativeResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.CreativeServiceInterfaceupdateCreativeResponse")
    public Creative updateCreative(
        @WebParam(name = "creative", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
        Creative creative)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Creative} objects.
     *         
     *         @param creatives the creatives to update
     *         @return the updated creatives
     *       
     * 
     * @param creatives
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201311.Creative>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
    @RequestWrapper(localName = "updateCreatives", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.CreativeServiceInterfaceupdateCreatives")
    @ResponseWrapper(localName = "updateCreativesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.CreativeServiceInterfaceupdateCreativesResponse")
    public List<Creative> updateCreatives(
        @WebParam(name = "creatives", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
        List<Creative> creatives)
        throws ApiException_Exception
    ;

}
