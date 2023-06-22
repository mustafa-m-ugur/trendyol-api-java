package org.trendyol.models.requestmodels;

import org.trendyol.ToStringRequestBuilder;

import java.lang.reflect.Array;

public class ProductModel {
    public String barcode;
    public String title;
    public String productMainId;
    public Integer brandId;
    public Integer categoryId;
    public Integer quantity;
    public String stockCode;
    public Double dimensionalWeight;
    public String description;
    public String currencyType;
    public Double listPrice;
    public Double salePrice;
    public Double vatRate;
    public Integer cargoCompanyId;
    public Object images;
    public Object attributes;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProductMainId() {
        return productMainId;
    }

    public void setProductMainId(String productMainId) {
        this.productMainId = productMainId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public Double getDimensionalWeight() {
        return dimensionalWeight;
    }

    public void setDimensionalWeight(Double dimensionalWeight) {
        this.dimensionalWeight = dimensionalWeight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public Double getListPrice() {
        return listPrice;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getVatRate() {
        return vatRate;
    }

    public void setVatRate(Double vatRate) {
        this.vatRate = vatRate;
    }

    public Integer getCargoCompanyId() {
        return cargoCompanyId;
    }

    public void setCargoCompanyId(Integer cargoCompanyId) {
        this.cargoCompanyId = cargoCompanyId;
    }

    public Object getImages() {
        return images;
    }

    public void setImages(Object images) {
        this.images = images;
    }

    public Object getAttributes() {
        return attributes;
    }

    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return new ToStringRequestBuilder(this)
                .append("barcode", barcode)
                .append("title", title)
                .append("productMainId", productMainId)
                .append("brandId", brandId)
                .append("categoryId", categoryId)
                .append("quantity", quantity)
                .append("stockCode", stockCode)
                .append("dimensionalWeight", dimensionalWeight)
                .append("description", description)
                .append("currencyType", currencyType)
                .append("listPrice", listPrice)
                .append("salePrice", salePrice)
                .append("vatRate", vatRate)
                .append("cargoCompanyId", cargoCompanyId)
                .append("images", images)
                .append("attributes", attributes)
                .toString();
    }

}