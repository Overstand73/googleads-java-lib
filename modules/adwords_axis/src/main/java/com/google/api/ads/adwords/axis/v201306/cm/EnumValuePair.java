/**
 * EnumValuePair.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;


/**
 * Represents information about enum values.
 */
public class EnumValuePair  implements java.io.Serializable {
    /* The api enum value.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span> */
    private java.lang.String enumValue;

    /* The enum value displayed in the downloaded report.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span> */
    private java.lang.String enumDisplayValue;

    public EnumValuePair() {
    }

    public EnumValuePair(
           java.lang.String enumValue,
           java.lang.String enumDisplayValue) {
           this.enumValue = enumValue;
           this.enumDisplayValue = enumDisplayValue;
    }


    /**
     * Gets the enumValue value for this EnumValuePair.
     * 
     * @return enumValue   * The api enum value.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public java.lang.String getEnumValue() {
        return enumValue;
    }


    /**
     * Sets the enumValue value for this EnumValuePair.
     * 
     * @param enumValue   * The api enum value.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public void setEnumValue(java.lang.String enumValue) {
        this.enumValue = enumValue;
    }


    /**
     * Gets the enumDisplayValue value for this EnumValuePair.
     * 
     * @return enumDisplayValue   * The enum value displayed in the downloaded report.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public java.lang.String getEnumDisplayValue() {
        return enumDisplayValue;
    }


    /**
     * Sets the enumDisplayValue value for this EnumValuePair.
     * 
     * @param enumDisplayValue   * The enum value displayed in the downloaded report.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public void setEnumDisplayValue(java.lang.String enumDisplayValue) {
        this.enumDisplayValue = enumDisplayValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnumValuePair)) return false;
        EnumValuePair other = (EnumValuePair) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enumValue==null && other.getEnumValue()==null) || 
             (this.enumValue!=null &&
              this.enumValue.equals(other.getEnumValue()))) &&
            ((this.enumDisplayValue==null && other.getEnumDisplayValue()==null) || 
             (this.enumDisplayValue!=null &&
              this.enumDisplayValue.equals(other.getEnumDisplayValue())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getEnumValue() != null) {
            _hashCode += getEnumValue().hashCode();
        }
        if (getEnumDisplayValue() != null) {
            _hashCode += getEnumDisplayValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnumValuePair.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "EnumValuePair"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "enumValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumDisplayValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "enumDisplayValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
