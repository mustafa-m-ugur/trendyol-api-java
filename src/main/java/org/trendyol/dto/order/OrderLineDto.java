package org.trendyol.dto.order;

import java.util.List;

public class OrderLineDto {
    private int quantity;
    private long salesCampaignId;
    private String productSize;
    private String merchantSku;
    private String productName;
    private long productCode;
    private String productOrigin;
    private long merchantId;
    private double amount;
    private double discount;
    private double tyDiscount;
    private List<DiscountDetailDto> discountDetails;
    private List<FastDeliveryOptionDto> fastDeliveryOptions;
    private String currencyCode;
    private String productColor;
    private long id;
    private String sku;
    private int vatBaseAmount;
    private String barcode;
    private String orderLineItemStatusName;
    private double price;
    private long productCategoryId;
    private double laborCost;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getSalesCampaignId() {
        return salesCampaignId;
    }

    public void setSalesCampaignId(long salesCampaignId) {
        this.salesCampaignId = salesCampaignId;
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    public String getMerchantSku() {
        return merchantSku;
    }

    public void setMerchantSku(String merchantSku) {
        this.merchantSku = merchantSku;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getProductCode() {
        return productCode;
    }

    public void setProductCode(long productCode) {
        this.productCode = productCode;
    }

    public String getProductOrigin() {
        return productOrigin;
    }

    public void setProductOrigin(String productOrigin) {
        this.productOrigin = productOrigin;
    }

    public long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(long merchantId) {
        this.merchantId = merchantId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTyDiscount() {
        return tyDiscount;
    }

    public void setTyDiscount(double tyDiscount) {
        this.tyDiscount = tyDiscount;
    }

    public List<DiscountDetailDto> getDiscountDetails() {
        return discountDetails;
    }

    public void setDiscountDetails(List<DiscountDetailDto> discountDetails) {
        this.discountDetails = discountDetails;
    }

    public List<FastDeliveryOptionDto> getFastDeliveryOptions() {
        return fastDeliveryOptions;
    }

    public void setFastDeliveryOptions(List<FastDeliveryOptionDto> fastDeliveryOptions) {
        this.fastDeliveryOptions = fastDeliveryOptions;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getVatBaseAmount() {
        return vatBaseAmount;
    }

    public void setVatBaseAmount(int vatBaseAmount) {
        this.vatBaseAmount = vatBaseAmount;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getOrderLineItemStatusName() {
        return orderLineItemStatusName;
    }

    public void setOrderLineItemStatusName(String orderLineItemStatusName) {
        this.orderLineItemStatusName = orderLineItemStatusName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public double getLaborCost() {
        return laborCost;
    }

    public void setLaborCost(double laborCost) {
        this.laborCost = laborCost;
    }
}
