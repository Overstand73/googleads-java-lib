/**
 * CampaignFeedServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;

public interface CampaignFeedServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of CampaignFeeds that meet the selector criteria.
     * 
     *         
     * @param selector Determines which CampaignFeeds to return. If empty
     * all
     *         Campaign feeds are returned.
     *         
     * @return The list of CampaignFeeds.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.CampaignFeedPage get(com.google.api.ads.adwords.axis.v201306.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;

    /**
     * Adds, sets or removes CampaignFeeds.
     *         
     *         
     * @param operations The operations to apply.
     *         
     * @return The resulting Feeds.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.CampaignFeedReturnValue mutate(com.google.api.ads.adwords.axis.v201306.cm.CampaignFeedOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;
}
