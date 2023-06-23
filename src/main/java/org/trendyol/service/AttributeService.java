package org.trendyol.service;

import org.trendyol.config.Credentials;
import org.trendyol.config.Endpoints;

public class AttributeService extends BaseService {
    public AttributeService(boolean isTestStage, Credentials credentials) {
        super(isTestStage, credentials);
    }

    //categoryId is a string because str does not accept int value
    public Object get(String categoryId) {
        Endpoints endpoints = new Endpoints();

        String str = endpoints.attributeList;
        String strEndPoint = str.replace("@categoryId", categoryId);

        String url = this.getUrlWithoutSuppliers(strEndPoint);
        return this.request("GET", url, "");
    }
}
