package org.trendyol.models.basemodels;

import org.trendyol.ToStringRequestBuilder;

public class BaseResponseModel {
    private boolean status;
    private int statusCode;
    private String message;
    private String response;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return new ToStringRequestBuilder(this)
                .append("status", status)
                .append("statusCode", statusCode)
                .append("message", message)
                .append("response", response)
                .toString();
    }
}