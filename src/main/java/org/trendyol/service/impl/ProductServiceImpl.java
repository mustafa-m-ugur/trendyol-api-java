package org.trendyol.service.impl;

import com.google.gson.Gson;
import org.trendyol.config.Endpoints;
import org.trendyol.dto.BaseResponseDto;
import org.trendyol.dto.product.ProductDto;
import org.trendyol.dto.product.ProductResponseDto;
import org.trendyol.dto.product.StockAndPriceUpdateRequestDto;
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

    @Override
    public ProductResponseDto checkBatchRequest(String batchRequestId) {
        String Str = new String(Endpoints.checkBatchRequest);
        String strEndPoint = Str.replace("@batchRequestId", batchRequestId);

        String url = this.getUrlWithSupplier(strEndPoint);
        BaseResponseDto serviceResponse = this.request("GET", url, "");
        return new Gson().fromJson(serviceResponse.getResponse(), ProductResponseDto.class);
    }

    @Override
    public ProductResponseDto updateStockAndPriceTransfer(StockAndPriceUpdateRequestDto data) {
        String url = this.getUrlWithSupplier(Endpoints.priceAndInventory);

        String jsonData = new Gson().toJson(data);
        BaseResponseDto serviceResponse = this.request("POST", url, jsonData.toString());
        return new Gson().fromJson(serviceResponse.getResponse(), ProductResponseDto.class);
    }

}
