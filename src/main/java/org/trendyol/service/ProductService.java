package org.trendyol.service;

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

    public Object updateOrCreate(String data, boolean isUpdate) {
        Endpoints endpoints = new Endpoints();
        String url = this.getUrlWithSupplier(endpoints.version + "/" + endpoints.createProduct);
        JSONObject item = new JSONObject();
        JSONArray items = new JSONArray();
        item = new JSONObject(data);
        items.put(item);

        JSONObject jsonData = new JSONObject();
        jsonData.put("items", items);
        String method = isUpdate ? "PUT" : "POST";
        return this.request(method, url, jsonData.toString());
    }

}
