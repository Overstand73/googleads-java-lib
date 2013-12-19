/**
 * ManualCpcBiddingScheme.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;


/**
 * Manual click based bidding where user pays per click.
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX.</span>
 */
public class ManualCpcBiddingScheme  extends com.google.api.ads.adwords.axis.v201306.cm.BiddingScheme  implements java.io.Serializable {
    /* The enhanced CPC bidding option for the campaign, which enables
     * bids to be enhanced based on conversion optimizer data. For more
     *                     information about enhanced CPC, see the
     *                     <a href="//support.google.com/adwords/bin/answer.py?answer=2464964"
     * >AdWords Help Center</a>.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "EnhancedCpcEnabled".</span><span
     * class="constraint Filterable">This field can be filtered on.</span> */
    private java.lang.Boolean enhancedCpcEnabled;

    public ManualCpcBiddingScheme() {
    }

    public ManualCpcBiddingScheme(
           java.lang.String biddingSchemeType,
           java.lang.Boolean enhancedCpcEnabled) {
        super(
            biddingSchemeType);
        this.enhancedCpcEnabled = enhancedCpcEnabled;
    }


    /**
     * Gets the enhancedCpcEnabled value for this ManualCpcBiddingScheme.
     * 
     * @return enhancedCpcEnabled   * The enhanced CPC bidding option for the campaign, which enables
     * bids to be enhanced based on conversion optimizer data. For more
     *                     information about enhanced CPC, see the
     *                     <a href="//support.google.com/adwords/bin/answer.py?answer=2464964"
     * >AdWords Help Center</a>.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "EnhancedCpcEnabled".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public java.lang.Boolean getEnhancedCpcEnabled() {
        return enhancedCpcEnabled;
    }


    /**
     * Sets the enhancedCpcEnabled value for this ManualCpcBiddingScheme.
     * 
     * @param enhancedCpcEnabled   * The enhanced CPC bidding option for the campaign, which enables
     * bids to be enhanced based on conversion optimizer data. For more
     *                     information about enhanced CPC, see the
     *                     <a href="//support.google.com/adwords/bin/answer.py?answer=2464964"
     * >AdWords Help Center</a>.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "EnhancedCpcEnabled".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public void setEnhancedCpcEnabled(java.lang.Boolean enhancedCpcEnabled) {
        this.enhancedCpcEnabled = enhancedCpcEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManualCpcBiddingScheme)) return false;
        ManualCpcBiddingScheme other = (ManualCpcBiddingScheme) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enhancedCpcEnabled==null && other.getEnhancedCpcEnabled()==null) || 
             (this.enhancedCpcEnabled!=null &&
              this.enhancedCpcEnabled.equals(other.getEnhancedCpcEnabled())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getEnhancedCpcEnabled() != null) {
            _hashCode += getEnhancedCpcEnabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManualCpcBiddingScheme.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "ManualCpcBiddingScheme"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhancedCpcEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "enhancedCpcEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
