package org.trendyol.models.requestmodels;
public class PackageStatusUpdateRequestModel {
    public Object lines;
    public Object params;
    public String status;

    public Object getLines() {
        return lines;
    }

    public void setLines(Object lines) {
        this.lines = lines;
    }

    public Object getParams() {
        return params;
    }

    public void setParams(Object params) {
        this.params = params;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
