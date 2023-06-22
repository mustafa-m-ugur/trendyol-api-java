package org.trendyol.service;

import org.trendyol.config.Credentials;
import org.trendyol.config.Endpoints;

public class CategoryService extends BaseService {

    public CategoryService(boolean isTestStage, Credentials credentials) {
        super(isTestStage, credentials);
    }

    public Object get() {
        Endpoints endpoints = new Endpoints();
        String url = this.getUrlWithoutSuppliers(endpoints.categoryList);
        return this.request("GET", url, "");
    }


}
