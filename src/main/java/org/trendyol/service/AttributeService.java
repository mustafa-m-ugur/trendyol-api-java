package org.trendyol.service;

import org.trendyol.config.Credentials;
import org.trendyol.config.Endpoints;

public class AttributeService extends BaseService {
    public AttributeService(boolean isTestStage, Credentials credentials) {
        super(isTestStage, credentials);
    }

    //categoryId is a string because str does not accept int value
    public Object get(String $categoryId) {
        Endpoints endpoints = new Endpoints();

        String Str = new String(endpoints.attributeList);
        String strEndPoint = Str.replace("@categoryId", $categoryId);

        String url = this.getUrlWithoutSuppliers(strEndPoint);
        return this.request("GET", url, "");
    }
}
