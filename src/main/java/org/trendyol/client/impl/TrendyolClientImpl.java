package org.trendyol.client.impl;

import org.trendyol.client.TrendyolClient;
import org.trendyol.config.Credentials;
import org.trendyol.dto.BaseResponseDto;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.Base64;

public class TrendyolClientImpl implements TrendyolClient {

    @Override
    public BaseResponseDto execute(Credentials credentials, String method, String url, String requestData) throws IOException, InterruptedException {

        String usernamePass = credentials.getUsername() + ":" + credentials.getPassword();
        String basicAuth = "Basic " + Arrays.toString(Base64.getEncoder().encode(usernamePass.getBytes()));
        String userAgent = credentials.getSupplierId() + " - SelfIntegration";

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .headers("Content-Type", "application/json", "Authorization", basicAuth, "User-Agent", userAgent)
                .POST(HttpRequest.BodyPublishers.ofString(requestData)).build();

        HttpResponse<String> response = execute(httpRequest);

        BaseResponseDto responseModel = new BaseResponseDto();
        responseModel.setMessage("Success");
        responseModel.setStatusCode(response.statusCode());
        responseModel.setMessage(response.body());
        return responseModel;
    }


    private HttpResponse<String> execute(HttpRequest request) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        return client.send(request, HttpResponse.BodyHandlers.ofString());
    }
}
