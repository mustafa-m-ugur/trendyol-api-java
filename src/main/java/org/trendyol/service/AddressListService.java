package org.trendyol.service;

import org.trendyol.config.Credentials;
import org.trendyol.config.Endpoints;

public class AddressListService extends BaseService {
    public AddressListService(boolean isTestStage, Credentials credentials) {
        super(isTestStage, credentials);
    }

    public Object get() {
        Endpoints endpoints = new Endpoints();
        String url = this.getUrlWithSupplier(endpoints.addresses);


        return this.request("GET", url, "");
    }

}
