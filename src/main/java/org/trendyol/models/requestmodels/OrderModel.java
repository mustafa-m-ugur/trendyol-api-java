package org.trendyol.models.requestmodels;

public class OrderModel {
    private PackageStatusUpdateRequestModel lines;

    public PackageStatusUpdateRequestModel getLines() {
        return lines;
    }

    public void setLines(PackageStatusUpdateRequestModel lines) {
        this.lines = lines;
    }
}
