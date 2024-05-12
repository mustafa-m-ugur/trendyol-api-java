package org.trendyol.service;

import com.google.gson.Gson;
import org.trendyol.config.Credentials;
import org.trendyol.config.Endpoints;
import org.trendyol.models.requestmodels.OrderModel;

public class OrderService extends BaseService {

    public OrderService(boolean isTestStage, Credentials credentials) {
        super(isTestStage, credentials);
    }

    public Object get(String params) {
        Endpoints endpoints = new Endpoints();
        String url = this.getUrlWithSupplier(endpoints.orders + "?" + params);
        return this.request("GET", url, "");
    }

    public Object update(OrderModel params) {
        Endpoints endpoints = new Endpoints();
        String url = this.getUrlWithSupplier(endpoints.updatePackageStatus);

        String jsonData = new Gson().toJson(params);
        return this.request("PUT", url, jsonData);
    }

}