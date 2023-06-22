package org.trendyol.config;

public class Endpoints {

    public final String test_base_url = "https://stageapi.trendyol.com/stagesapigw/";
    public final String prod_base_url = "https://api.trendyol.com/sapigw/";
    public final String suppliers = "suppliers";
    public final String version = "v2";

    //products endpoints
    public final String productFiltering = "products";
    public final String createProduct = "products";
    public final String updateProduct = "products";
    public final String checkBatchRequest = "products/batch-requests/@batchRequestId";
    public final String categoryList = "product-categories";
    public final String attributeList = "product-categories/@categoryId/attributes";
    public final String brands = "brands";
    public final String addresses = "addresses";
    public final String priceAndInventory = "products/price-and-inventory";

    //orders endpoints
    public final String orders = "orders";
    public final String updateShippingCode = "@shipmentPackageId/update-tracking-number";
    public final String updatePackageStatus = "shipment-packages/@Id";
    public final String sendInvoiceLinks = "supplier-invoice-links";
    public final String splitPackages = "shipment-packages/@shipmentPackageId/split-packages";
    public final String changeCargoProviders = "shipment-packages/@shipmentPackageId/cargo-providers";
    public final String testOrderCreate = "integration/oms/core";

}
