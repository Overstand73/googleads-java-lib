
package com.google.api.ads.dfp.jaxws.v201308;

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
 *       Provides methods for creating, updating and retrieving {@link Placement}
 *       objects.
 *       
 *       <p>You can use a placement to group ad units. For example, you might have a
 *       placement that focuses on sports sites, which may be spread across different
 *       branches of your inventory. You might also have a "fire sale" placement that
 *       includes ad units that have not been selling and are consequently priced very
 *       attractively.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "PlacementServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PlacementServiceInterface {


    /**
     * 
     *         Creates a new {@link Placement}.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link Placement#name}</li>
     *         <li>{@link Placement#description}</li>
     *         </ul>
     *         
     *         @param placement the placement to create
     *         @return the new placement with its ID set
     *       
     * 
     * @param placement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201308.Placement
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
    @RequestWrapper(localName = "createPlacement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.PlacementServiceInterfacecreatePlacement")
    @ResponseWrapper(localName = "createPlacementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.PlacementServiceInterfacecreatePlacementResponse")
    public Placement createPlacement(
        @WebParam(name = "placement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        Placement placement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Creates new {@link Placement} objects.
     *         
     *         @param placements the placements to create
     *         @return the new placements, with their IDs filled in
     *       
     * 
     * @param placements
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201308.Placement>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
    @RequestWrapper(localName = "createPlacements", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.PlacementServiceInterfacecreatePlacements")
    @ResponseWrapper(localName = "createPlacementsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.PlacementServiceInterfacecreatePlacementsResponse")
    public List<Placement> createPlacements(
        @WebParam(name = "placements", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        List<Placement> placements)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the {@link Placement} uniquely identified by the given ID.
     *         
     *         @param placementId ID of the placement, which must already exist
     *         @return the {@code Placement} uniquely identified by the given ID
     *       
     * 
     * @param placementId
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201308.Placement
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
    @RequestWrapper(localName = "getPlacement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.PlacementServiceInterfacegetPlacement")
    @ResponseWrapper(localName = "getPlacementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.PlacementServiceInterfacegetPlacementResponse")
    public Placement getPlacement(
        @WebParam(name = "placementId", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        Long placementId)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link PlacementPage} of {@link Placement} objects that satisfy the
     *         given {@link Statement#query}. The following fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code description}</td>
     *         <td>{@link Placement#description}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Placement#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isAdSenseTargetingEnabled}</td>
     *         <td>{@link Placement#isAdSenseTargetingEnabled}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Placement#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code placementCode}</td>
     *         <td>{@link Placement#placementCode}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Placement#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Placement#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of placements
     *         @return the placements that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201308.PlacementPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
    @RequestWrapper(localName = "getPlacementsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.PlacementServiceInterfacegetPlacementsByStatement")
    @ResponseWrapper(localName = "getPlacementsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.PlacementServiceInterfacegetPlacementsByStatementResponse")
    public PlacementPage getPlacementsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link Placement} objects that match the given
     *         {@link Statement#query}.
     *         
     *         @param placementAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of placements
     *         @return the result of the action performed
     *       
     * 
     * @param placementAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201308.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
    @RequestWrapper(localName = "performPlacementAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.PlacementServiceInterfaceperformPlacementAction")
    @ResponseWrapper(localName = "performPlacementActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.PlacementServiceInterfaceperformPlacementActionResponse")
    public UpdateResult performPlacementAction(
        @WebParam(name = "placementAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        PlacementAction placementAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Placement}.
     *         
     *         @param placement the placement to update
     *         @return the updated placement
     *       
     * 
     * @param placement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201308.Placement
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
    @RequestWrapper(localName = "updatePlacement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.PlacementServiceInterfaceupdatePlacement")
    @ResponseWrapper(localName = "updatePlacementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.PlacementServiceInterfaceupdatePlacementResponse")
    public Placement updatePlacement(
        @WebParam(name = "placement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        Placement placement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Placement} objects.
     *         
     *         @param placements the placements to update
     *         @return the updated placements
     *       
     * 
     * @param placements
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201308.Placement>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
    @RequestWrapper(localName = "updatePlacements", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.PlacementServiceInterfaceupdatePlacements")
    @ResponseWrapper(localName = "updatePlacementsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.PlacementServiceInterfaceupdatePlacementsResponse")
    public List<Placement> updatePlacements(
        @WebParam(name = "placements", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        List<Placement> placements)
        throws ApiException_Exception
    ;

}
