/**
 * AdExtensionOverrideOperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;


/**
 * AdExtensionOverride service operation.
 */
public class AdExtensionOverrideOperation  extends com.google.api.ads.adwords.axis.v201306.cm.Operation  implements java.io.Serializable {
    /* AdExtensionOverride on which to operate */
    private com.google.api.ads.adwords.axis.v201306.cm.AdExtensionOverride operand;

    public AdExtensionOverrideOperation() {
    }

    public AdExtensionOverrideOperation(
           com.google.api.ads.adwords.axis.v201306.cm.Operator operator,
           java.lang.String operationType,
           com.google.api.ads.adwords.axis.v201306.cm.AdExtensionOverride operand) {
        super(
            operator,
            operationType);
        this.operand = operand;
    }


    /**
     * Gets the operand value for this AdExtensionOverrideOperation.
     * 
     * @return operand   * AdExtensionOverride on which to operate
     */
    public com.google.api.ads.adwords.axis.v201306.cm.AdExtensionOverride getOperand() {
        return operand;
    }


    /**
     * Sets the operand value for this AdExtensionOverrideOperation.
     * 
     * @param operand   * AdExtensionOverride on which to operate
     */
    public void setOperand(com.google.api.ads.adwords.axis.v201306.cm.AdExtensionOverride operand) {
        this.operand = operand;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdExtensionOverrideOperation)) return false;
        AdExtensionOverrideOperation other = (AdExtensionOverrideOperation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.operand==null && other.getOperand()==null) || 
             (this.operand!=null &&
              this.operand.equals(other.getOperand())));
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
        if (getOperand() != null) {
            _hashCode += getOperand().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdExtensionOverrideOperation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "AdExtensionOverrideOperation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operand");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "operand"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "AdExtensionOverride"));
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
