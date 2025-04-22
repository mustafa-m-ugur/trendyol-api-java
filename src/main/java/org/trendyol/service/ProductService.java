package org.trendyol.service;

import org.trendyol.dto.ProductDto;
import org.trendyol.dto.ProductResponseDto;

public interface ProductService {
     ProductResponseDto updateOrCreateProduct(ProductDto productRequestDto, boolean isUpdate);
}
