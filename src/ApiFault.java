/**
 * ApiFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse.www;

public class ApiFault  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private com.comverse.www.ApiFaultMessage[] faultMessageList;

    private com.comverse.www.ApiFaultStackTrace faultStackTrace;

    public ApiFault() {
    }

    public ApiFault(
           com.comverse.www.ApiFaultMessage[] faultMessageList,
           com.comverse.www.ApiFaultStackTrace faultStackTrace) {
        this.faultMessageList = faultMessageList;
        this.faultStackTrace = faultStackTrace;
    }


    /**
     * Gets the faultMessageList value for this ApiFault.
     * 
     * @return faultMessageList
     */
    public com.comverse.www.ApiFaultMessage[] getFaultMessageList() {
        return faultMessageList;
    }


    /**
     * Sets the faultMessageList value for this ApiFault.
     * 
     * @param faultMessageList
     */
    public void setFaultMessageList(com.comverse.www.ApiFaultMessage[] faultMessageList) {
        this.faultMessageList = faultMessageList;
    }

    public com.comverse.www.ApiFaultMessage getFaultMessageList(int i) {
        return this.faultMessageList[i];
    }

    public void setFaultMessageList(int i, com.comverse.www.ApiFaultMessage _value) {
        this.faultMessageList[i] = _value;
    }


    /**
     * Gets the faultStackTrace value for this ApiFault.
     * 
     * @return faultStackTrace
     */
    public com.comverse.www.ApiFaultStackTrace getFaultStackTrace() {
        return faultStackTrace;
    }


    /**
     * Sets the faultStackTrace value for this ApiFault.
     * 
     * @param faultStackTrace
     */
    public void setFaultStackTrace(com.comverse.www.ApiFaultStackTrace faultStackTrace) {
        this.faultStackTrace = faultStackTrace;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiFault)) return false;
        ApiFault other = (ApiFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.faultMessageList==null && other.getFaultMessageList()==null) || 
             (this.faultMessageList!=null &&
              java.util.Arrays.equals(this.faultMessageList, other.getFaultMessageList()))) &&
            ((this.faultStackTrace==null && other.getFaultStackTrace()==null) || 
             (this.faultStackTrace!=null &&
              this.faultStackTrace.equals(other.getFaultStackTrace())));
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
        if (getFaultMessageList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFaultMessageList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFaultMessageList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFaultStackTrace() != null) {
            _hashCode += getFaultStackTrace().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApiFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.comverse.com", "apiFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultMessageList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "faultMessageList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.comverse.com", "apiFaultMessage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultStackTrace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "faultStackTrace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.comverse.com", "apiFaultStackTrace"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
