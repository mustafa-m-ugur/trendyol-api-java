package org.trendyol.config;

public class Endpoints {

    public static final String test_base_url = "https://stageapi.trendyol.com/stagesapigw/";
    public static final String prod_base_url = "https://api.trendyol.com/sapigw/";
    public static final String suppliers = "suppliers";
    public static final String version = "v2";

    //products endpoints
    public static final String productFiltering = "products";
    public static final String createProduct = "products";
    public static final String updateProduct = "products";
    public static final String checkBatchRequest = "products/batch-requests/@batchRequestId";
    public static final String categoryList = "product-categories";
    public static final String attributeList = "product-categories/@categoryId/attributes";
    public static final String brands = "brands";
    public static final String addresses = "addresses";
    public static final String priceAndInventory = "products/price-and-inventory";

    //orders endpoints
    public static final String orders = "orders";
    public static final String updateShippingCode = "@shipmentPackageId/update-tracking-number";
    public static final String updatePackageStatus = "shipment-packages/@Id";
    public static final String sendInvoiceLinks = "supplier-invoice-links";
    public static final String splitPackages = "shipment-packages/@shipmentPackageId/split-packages";
    public static final String changeCargoProviders = "shipment-packages/@shipmentPackageId/cargo-providers";
    public static final String testOrderCreate = "integration/oms/core";

}
