
package com.google.api.ads.adwords.jaxws.v201306.billing;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.google.api.ads.adwords.jaxws.v201306.cm.Selector;


/**
 * 
 *       Service for managing {@link BudgetOrder}s.
 *       <p class="note"><b>Note:</b> This service is available only
 *       on a whitelist basis.</p>
 *       <p class="warning"><b>Warning:</b> The <code>BudgetOrderService</code>
 *       is limited to one operation per mutate request. Any attempt to make
 *       more than one operation will result in an <code>ApiException</code>.</p>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "BudgetOrderServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201306")
@XmlSeeAlso({
    com.google.api.ads.adwords.jaxws.v201306.billing.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201306.ch.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201306.cm.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201306.mcm.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201306.o.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201306.rm.ObjectFactory.class
})
public interface BudgetOrderServiceInterface {


    /**
     * 
     *         Gets a list of {@link BudgetOrder}s using the generic selector.
     *         @param serviceSelector specifies which BudgetOrder to return.
     *         @return A {@link BudgetOrderPage} of BudgetOrders of the client customer.
     *         All BudgetOrder fields are returned. Stats are not yet supported.
     *         @throws ApiException
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201306.billing.BudgetOrderPage
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201306")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201306", className = "com.google.api.ads.adwords.jaxws.v201306.billing.Get")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201306", className = "com.google.api.ads.adwords.jaxws.v201306.billing.GetResponse")
    public BudgetOrderPage get(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201306")
        Selector serviceSelector)
        throws ApiException
    ;

    /**
     * 
     *         Returns all the open/active BillingAccounts associated with the current
     *         manager.
     *         @return A list of {@link BillingAccount}s.
     *         @throws ApiException
     *       
     * 
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201306.billing.BillingAccount>
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201306")
    @RequestWrapper(localName = "getBillingAccounts", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201306", className = "com.google.api.ads.adwords.jaxws.v201306.billing.GetBillingAccounts")
    @ResponseWrapper(localName = "getBillingAccountsResponse", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201306", className = "com.google.api.ads.adwords.jaxws.v201306.billing.GetBillingAccountsResponse")
    public List<BillingAccount> getBillingAccounts()
        throws ApiException
    ;

    /**
     * 
     *         Mutates BudgetOrders, supported operations are:
     *         <p><code>ADD</code>: Adds a {@link BudgetOrder} to the billing account
     *         specified by the billing account ID.</p>
     *         <p><code>SET</code>: Sets the start/end date and amount of the
     *         {@link BudgetOrder}.</p>
     *         <p><code>REMOVE</code>: Cancels the {@link BudgetOrder} (status change).</p>
     *         <p class="warning"><b>Warning:</b> The <code>BudgetOrderService</code>
     *         is limited to one operation per mutate request. Any attempt to make more
     *         than one operation will result in an <code>ApiException</code>.</p>
     *         @param operations A list of operations, <b>however currently we only
     *         support one operation per mutate call</b>.
     *         @return BudgetOrders affected by the mutate operation.
     *         @throws ApiException
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201306.billing.BudgetOrderReturnValue
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201306")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201306", className = "com.google.api.ads.adwords.jaxws.v201306.billing.Mutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201306", className = "com.google.api.ads.adwords.jaxws.v201306.billing.MutateResponse")
    public BudgetOrderReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201306")
        List<BudgetOrderOperation> operations)
        throws ApiException
    ;

}
