package org.trendyol.models.requestmodels;

import org.trendyol.ToStringRequestBuilder;

public class StockAndPriceUpdateRequestModel {
    public String barcode;
    public int quantity;
    public double salePrice;
    public double listPrice;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    @Override
    public String toString() {
        return new ToStringRequestBuilder(this)
                .append("barcode", barcode)
                .append("quantity", quantity)
                .append("salePrice", salePrice)
                .append("listPrice", listPrice)
                .toString();
    }
}
