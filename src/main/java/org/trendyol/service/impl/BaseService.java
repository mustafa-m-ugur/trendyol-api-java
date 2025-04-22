package org.trendyol.service.impl;

import org.trendyol.client.TrendyolClient;
import org.trendyol.config.Credentials;
import org.trendyol.config.Endpoints;
import org.trendyol.dto.BaseResponseDto;

import java.io.IOException;

public abstract class BaseService {
    private TrendyolClient trendyolClient;

    private String getBaseUrl() {
        Credentials credentials = getCredentials();
        boolean stage = credentials.isStage();
        return stage ? Endpoints.test_base_url : Endpoints.prod_base_url;
    }

    public String getUrlWithSupplier(String endpoint) {
        return this.getBaseUrl() + Endpoints.suppliers + "/" + getCredentials().getSupplierId() + "/" + endpoint;
    }

    public String getUrlWithoutSuppliers(String endpoint) {
        return this.getBaseUrl() + endpoint;
    }

    public BaseResponseDto request(String method, String endpoint, String jsonData) {
        try {
            Credentials credentials = getCredentials();
            return trendyolClient.execute(credentials, method, endpoint, jsonData);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private Credentials getCredentials() {
        Credentials credentials = new Credentials();
        credentials.setUsername("username");
        credentials.setPassword("password");
        credentials.setSupplierId(0);
        credentials.setStage(true);
        return credentials;
    }

    public void setTrendyolClient(TrendyolClient trendyolClient) {
        this.trendyolClient = trendyolClient;
    }
}