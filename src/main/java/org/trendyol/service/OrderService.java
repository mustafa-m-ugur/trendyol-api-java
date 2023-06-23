package org.trendyol.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.trendyol.config.Credentials;
import org.trendyol.config.Endpoints;

public class OrderService extends BaseService {

    public OrderService(boolean isTestStage, Credentials credentials) {
        super(isTestStage, credentials);
    }

    public Object get(String params) {
        Endpoints endpoints = new Endpoints();
        String url = this.getUrlWithSupplier(endpoints.orders + "?" + params);
        return this.request("GET", url, "");
    }

    public Object update(Object params) {
        Endpoints endpoints = new Endpoints();
        String url = this.getUrlWithSupplier(endpoints.updatePackageStatus);

        String jsonData = orderTransferData(params);
        return this.request("PUT", url, jsonData.toString());
    }

    public String orderTransferData(Object data) {
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
        jsonData.put("lines", items);

        return item.toString();
    }

}