package org.trendyol.dto;

public class ProductResponseDto {
    private String batchRequestId;
    private ProductDto productDto;

    public String getBatchRequestId() {
        return batchRequestId;
    }

    public void setBatchRequestId(String batchRequestId) {
        this.batchRequestId = batchRequestId;
    }

    public ProductDto getProductDto() {
        return productDto;
    }

    public void setProductDto(ProductDto productDto) {
        this.productDto = productDto;
    }
}
