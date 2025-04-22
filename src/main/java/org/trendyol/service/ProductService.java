package org.trendyol.service;

import org.trendyol.dto.product.ProductDto;
import org.trendyol.dto.product.ProductResponseDto;
import org.trendyol.dto.product.StockAndPriceUpdateRequestDto;

public interface ProductService {
     ProductResponseDto updateOrCreateProduct(ProductDto productRequestDto, boolean isUpdate);

     ProductResponseDto checkBatchRequest(String batchRequestId);

     ProductResponseDto updateStockAndPriceTransfer(StockAndPriceUpdateRequestDto data);
}
