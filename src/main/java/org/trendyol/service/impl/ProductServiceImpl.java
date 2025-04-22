package org.trendyol.service.impl;

import com.google.gson.Gson;
import org.trendyol.config.Endpoints;
import org.trendyol.dto.BaseResponseDto;
import org.trendyol.dto.ProductDto;
import org.trendyol.dto.ProductResponseDto;
import org.trendyol.service.ProductService;

public class ProductServiceImpl extends BaseService implements ProductService {

    @Override
    public ProductResponseDto updateOrCreateProduct(ProductDto productRequestDto, boolean isUpdate) {
        String url = this.getUrlWithSupplier(Endpoints.version + "/" + Endpoints.createProduct);

        String jsonData = new Gson().toJson(productRequestDto);
        String method = isUpdate ? "PUT" : "POST";

        BaseResponseDto serviceResponse = this.request(method, url, jsonData);
        return new Gson().fromJson(serviceResponse.getResponse(), ProductResponseDto.class);
    }
}
