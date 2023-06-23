package org.trendyol.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.trendyol.config.Credentials;
import org.trendyol.config.Endpoints;
import org.trendyol.models.basemodels.BaseResponseModel;

import javax.xml.ws.http.HTTPException;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

public class BaseService {
    protected boolean isTestStage;
    protected Credentials credentials = new Credentials();
    protected Endpoints endpoints = new Endpoints();
    private static HttpURLConnection connection;
    private String baseUrl;

    public BaseService(boolean isTestStage, Credentials credentials) {
        this.credentials = credentials;
        this.isTestStage = isTestStage;
        this.baseUrl = isTestStage ? this.endpoints.test_base_url : this.endpoints.prod_base_url;
    }

    public String getUrlWithSupplier(String endpoint) {
        return this.baseUrl + this.endpoints.suppliers + "/" + credentials.getSupplierId() + "/" + endpoint;
    }

    public String getUrlWithoutSuppliers(String endpoint) {
        return this.baseUrl + endpoint;
    }

    public Object request(String method, String endpoint, String dataOptions) {
        BaseResponseModel responseModel = new BaseResponseModel();

        BufferedReader reader;
        String responseData;
        StringBuffer response = new StringBuffer();

        try {

            String usernamePass = credentials.getUsername() + ":" + credentials.getPassword();
            String basicAuth = "Basic " + Base64.getEncoder().encode(usernamePass.getBytes());

            URL url = new URL(endpoint);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Authorization", basicAuth);
            connection.setRequestProperty("User-Agent", credentials.getSupplierId() + " - SelfIntegration");
            connection.setRequestMethod(method);
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.setDoOutput(true);

            if (method.equals("POST") && dataOptions != null) {
                try (DataOutputStream wr = new DataOutputStream(connection.getOutputStream())) {
                    wr.write(dataOptions.getBytes());
                }
            }

            if (connection.getResponseCode() < 300) {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((responseData = reader.readLine()) != null) {
                    response.append(responseData);
                }
                reader.close();

            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((responseData = reader.readLine()) != null) {
                    response.append(responseData);
                }
                reader.close();
            }

            responseModel.setStatus(true);
            responseModel.setStatusCode(connection.getResponseCode());
            responseModel.setResponse(response.toString());

        } catch (HTTPException e) {
            responseModel.setStatus(false);
            responseModel.setStatusCode(e.getStatusCode());
            responseModel.setMessage(e.getMessage());
        } catch (Exception e) {
            responseModel.setStatus(false);
            responseModel.setStatusCode(500);
            responseModel.setMessage(e.getMessage());
        } finally {
            connection.disconnect();
        }

        String responseString
                = "{"
                + "\"status\": " + responseModel.isStatus() + ", "
                + "\"statusCode\": " + responseModel.getStatusCode() + ", "
                + "\"message\": \"" + responseModel.getMessage() + "\", "
                + "\"response\": " + responseModel.getResponse() + ""
                + "}";

        return responseString;

    }

    public String getServiceData(Object data) {
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
        jsonData.put("items", items);

        return jsonData.toString();
    }

}