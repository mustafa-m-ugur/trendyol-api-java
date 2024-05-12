package org.trendyol.service;

import com.google.gson.Gson;
import org.trendyol.config.Credentials;
import org.trendyol.config.Endpoints;
import org.trendyol.models.requestmodels.ProductModel;
import org.trendyol.models.requestmodels.StockAndPriceUpdateRequestModel;

public class ProductService extends BaseService {

    public ProductService(boolean isTestStage, Credentials credentials) {
        super(isTestStage, credentials);
    }

    public Object get(String page, String size) {
        Endpoints endpoints = new Endpoints();
        String url = this.getUrlWithSupplier(endpoints.productFiltering + "?page=" + page + "&size=" + size);
        return this.request("GET", url, "");
    }

    public Object updateOrCreate(ProductModel productModel, boolean isUpdate) {
        Endpoints endpoints = new Endpoints();
        String url = this.getUrlWithSupplier(endpoints.version + "/" + endpoints.createProduct);

        String jsonData = new Gson().toJson(productModel);

        String method = isUpdate ? "PUT" : "POST";
        return this.request(method, url, jsonData.toString());
    }

    public Object checkBatchRequest(String batchRequestId) {
        Endpoints endpoints = new Endpoints();

        String Str = new String(endpoints.checkBatchRequest);
        String strEndPoint = Str.replace("@batchRequestId", batchRequestId);

        String url = this.getUrlWithSupplier(strEndPoint);

        return this.request("GET", url, "");
    }

    public Object updateStockAndPriceTransfer(StockAndPriceUpdateRequestModel data) {
        Endpoints endpoints = new Endpoints();
        String url = this.getUrlWithSupplier(endpoints.priceAndInventory);

        String jsonData = new Gson().toJson(data);

        return this.request("POST", url, jsonData.toString());
    }


}
