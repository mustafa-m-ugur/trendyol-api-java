# trendyol-api-java
Trendyol Marketplace API Integration With Java
[README.md](..%2F..%2Fprojects%2Ftrendyol-php-api%2FREADME.md)

## ProductService

```java
    Trendyol trendyol = new Trendyol("**********", "*******", 000000, true);
    ProductService productService = (ProductService) trendyol.product;

        ProductModel productModel = new ProductModel();
        productModel.setBarcode("8691234567892");
        productModel.setTitle("Test Product");
        productModel.setProductMainId("123456789");
        productModel.setBrandId(1);
        productModel.setCategoryId(1);
        productModel.setQuantity(100);
        productModel.setStockCode("TEST-PRODUCT");
        productModel.setDimensionalWeight(0.1);
        productModel.setDescription("Test Description");
        productModel.setCurrencyType("TRY");
        productModel.setListPrice(100.0);
        productModel.setSalePrice(90.0);
        productModel.setVatRate(18.0);
        productModel.setCargoCompanyId(1);

        Image image = new Image();
        image.setUrl("https://cdn.dsmcdn.com//ty1/product/media/images/20200305/15/103576/10000101/1/1_org_zoom.jpg");

        List<Image> images = new ArrayList<>();
        images.add(image);
        productModel.setImages(images);

        Attribute attribute = new Attribute();
        attribute.setAttributeId("1");
        attribute.setAttributeValueId("1");
        attribute.setCustomAttributeValue("Test Attribute");

        List<Attribute> attributes = new ArrayList<>();
        attributes.add(attribute);
        productModel.setAttributes(attributes);

        System.out.println(productService.updateOrCreate(productModel, false));
        
        /*
         checkBatchRequest 
         * */
        System.out.println(productService.checkBatchRequest("52bc3395-af26-4bc4-a855-fc8c156956b3-168752107"));

        
        /*
         Stock and Price Update 
         * */
        
        StockAndPriceUpdateRequestModel stockAndPriceUpdateRequestModel = new StockAndPriceUpdateRequestModel();

        stockAndPriceUpdateRequestModel.setBarcode("100");
        stockAndPriceUpdateRequestModel.setQuantity(100);
        stockAndPriceUpdateRequestModel.setSalePrice(100);
        stockAndPriceUpdateRequestModel.setListPrice(100);

        System.out.println(productService.updateStockAndPriceTransfer(stockAndPriceUpdateRequestModel));
```
## OrderService

```java

OrderService orderService = (OrderService) trendyol.order;

PackageStatusUpdateRequestModel packageStatusUpdateRequestModel = new PackageStatusUpdateRequestModel();
PackageLine packageLine = new PackageLine();
packageLine.setLineId(1);
packageLine.setQuantity(1);

List<PackageLine> packageLines = new ArrayList<>();
packageLines.add(packageLine);

packageStatusUpdateRequestModel.setLines(packageLines);

PackageParams packageParams = new PackageParams();
packageParams.setInvoiceNumber("123456");

packageStatusUpdateRequestModel.setParams(packageParams);
packageStatusUpdateRequestModel.setStatus("Picking");

System.out.println(orderService.update(packageStatusUpdateRequestModel));

```
