package org.trendyol.service;

import org.trendyol.config.Credentials;
import org.trendyol.config.Endpoints;

public class BrandService extends BaseService {
    public BrandService(boolean isTestStage, Credentials credentials) {
        super(isTestStage, credentials);
    }

    public Object get() {
        Endpoints endpoints = new Endpoints();
        String url = this.getUrlWithoutSuppliers(endpoints.brands);
        return this.request("GET", url, "");
    }

    public Object search(String $name) {
        Endpoints endpoints = new Endpoints();
        String url = this.getUrlWithoutSuppliers(endpoints.brands + "/by-name?name=" + $name);
        return this.request("GET", url, "");
    }
}