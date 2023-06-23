package org.trendyol;

import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;
import org.trendyol.config.Credentials;
import org.trendyol.models.basemodels.Attribute;
import org.trendyol.models.basemodels.Image;
import org.trendyol.models.requestmodels.ProductModel;
import org.trendyol.service.*;

public class Main {

    public static void main(String[] args) {
        Trendyol trendyol = new Trendyol("", "", 0, false);
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



        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String productJson = objectMapper.writeValueAsString(productModel);

            System.out.println(productService.updateOrCreate(productJson, false));

        } catch (Exception e) {
            e.getMessage();
        }

    }
}