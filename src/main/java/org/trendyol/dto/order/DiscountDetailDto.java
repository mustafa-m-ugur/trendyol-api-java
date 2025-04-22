package org.trendyol.dto.order;

public class DiscountDetailDto {
    private double lineItemPrice;
    private double lineItemDiscount;
    private double lineItemTyDiscount;

    public double getLineItemPrice() {
        return lineItemPrice;
    }

    public void setLineItemPrice(double lineItemPrice) {
        this.lineItemPrice = lineItemPrice;
    }

    public double getLineItemDiscount() {
        return lineItemDiscount;
    }

    public void setLineItemDiscount(double lineItemDiscount) {
        this.lineItemDiscount = lineItemDiscount;
    }

    public double getLineItemTyDiscount() {
        return lineItemTyDiscount;
    }

    public void setLineItemTyDiscount(double lineItemTyDiscount) {
        this.lineItemTyDiscount = lineItemTyDiscount;
    }
}
