package org.trendyol;

import org.trendyol.models.basemodels.PackageLine;
import org.trendyol.models.basemodels.PackageParams;
import org.trendyol.models.requestmodels.PackageStatusUpdateRequestModel;
import org.trendyol.models.requestmodels.StockAndPriceUpdateRequestModel;
import org.trendyol.service.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Trendyol trendyol = new Trendyol("PQaYVlRK4kbsKUY90snR", "f2pmKHwlzR2CYUYa8I1U", 628246, false);
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


    }
}