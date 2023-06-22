package org.trendyol;

import org.trendyol.config.Credentials;
import org.trendyol.service.*;

public class Trendyol {
    public Object brand;
    public Object category;
    public Object attribute;
    public Object AddressList;
    public Object product;
    public Object order;

    public Trendyol(String username, String password, int supplierId, boolean isTestStage) {
        Credentials credentials = new Credentials();
        credentials.setUsername(username);
        credentials.setPassword(password);
        credentials.setSupplierId(supplierId);
        this.brand = new BrandService(isTestStage, credentials);
        this.category = new CategoryService(isTestStage, credentials);
        this.attribute = new AttributeService(isTestStage, credentials);
        this.AddressList = new AddressListService(isTestStage, credentials);
        this.product = new ProductService(isTestStage, credentials);
        this.order = new OrderService(isTestStage, credentials);
    }

}