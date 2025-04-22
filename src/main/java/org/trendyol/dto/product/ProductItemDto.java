package org.trendyol.dto.product;

public class ProductItemDto {
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
    public ProductImageDto images;
    public ProductAttributeDto attributes;

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

    public ProductImageDto getImages() {
        return images;
    }

    public void setImages(ProductImageDto images) {
        this.images = images;
    }

    public ProductAttributeDto getAttributes() {
        return attributes;
    }

    public void setAttributes(ProductAttributeDto attributes) {
        this.attributes = attributes;
    }
}