package org.trendyol.service;

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

}