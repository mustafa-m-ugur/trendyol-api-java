package org.trendyol.models.basemodels;

import org.trendyol.ToStringRequestBuilder;

public class Attribute {

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

    @Override
    public String toString() {
        return new ToStringRequestBuilder(this)
                .append("attributeId", attributeId)
                .append("attributeValueId", attributeValueId)
                .append("customAttributeValue", customAttributeValue)
                .toString();
    }
}
