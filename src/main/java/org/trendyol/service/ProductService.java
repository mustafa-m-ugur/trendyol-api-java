package org.trendyol.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.beans.binding.ObjectExpression;
import org.json.JSONArray;
import org.json.JSONObject;
import org.trendyol.config.Credentials;
import org.trendyol.config.Endpoints;
import org.trendyol.models.requestmodels.ProductModel;

public class ProductService extends BaseService {

    public ProductService(boolean isTestStage, Credentials credentials) {
        super(isTestStage, credentials);
    }

    public Object get(String page, String size) {
        Endpoints endpoints = new Endpoints();
        String url = this.getUrlWithSupplier(endpoints.productFiltering + "?page=" + page + "&size=" + size);
        return this.request("GET", url, "");
    }

    public Object updateOrCreate(Object data, boolean isUpdate) {
        Endpoints endpoints = new Endpoints();
        String url = this.getUrlWithSupplier(endpoints.version + "/" + endpoints.createProduct);

        String jsonData = productTransferData(data);

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

    public Object updateStockAndPriceTransfer(Object data) {
        Endpoints endpoints = new Endpoints();
        String url = this.getUrlWithSupplier(endpoints.priceAndInventory);

        String jsonData = productTransferData(data);

        return this.request("POST", url, jsonData.toString());
    }

    public String productTransferData(Object data) {
        JSONObject item = new JSONObject();
        JSONArray items = new JSONArray();

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String productJson = objectMapper.writeValueAsString(data);
            item = new JSONObject(productJson);
        } catch (Exception e) {
            e.printStackTrace();
        }

        items.put(item);

        JSONObject jsonData = new JSONObject();
        jsonData.put("items", items);

        return jsonData.toString();
    }

}
