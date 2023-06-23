package org.trendyol.models.basemodels;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.trendyol.ToStringRequestBuilder;

public class PackageParams {
    public String invoiceNumber;

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    public String toString() {
        return new ToStringRequestBuilder(this)
                .append("invoiceNumber", invoiceNumber)
                .toString();
    }
}
