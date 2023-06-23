package org.trendyol.models.basemodels;

import org.trendyol.ToStringRequestBuilder;

public class PackageLine {

    public int lineId;
    public int quantity;

    public int getLineId() {
        return lineId;
    }

    public void setLineId(int lineId) {
        this.lineId = lineId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return new ToStringRequestBuilder(this)
                .append("lineId", lineId)
                .append("quantity", quantity)
                .toString();
    }
}
