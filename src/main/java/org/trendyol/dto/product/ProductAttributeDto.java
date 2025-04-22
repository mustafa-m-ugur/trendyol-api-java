package org.trendyol.dto.product;


public class ProductAttributeDto {

    public String attributeId;
    public String attributeValueId;
    public String customAttributeValue;

    public String getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(String attributeId) {
        this.attributeId = attributeId;
    }

    public String getAttributeValueId() {
        return attributeValueId;
    }

    public void setAttributeValueId(String attributeValueId) {
        this.attributeValueId = attributeValueId;
    }

    public String getCustomAttributeValue() {
        return customAttributeValue;
    }

    public void setCustomAttributeValue(String customAttributeValue) {
        this.customAttributeValue = customAttributeValue;
    }

}
