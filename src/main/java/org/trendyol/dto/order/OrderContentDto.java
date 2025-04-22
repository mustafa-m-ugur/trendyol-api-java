package org.trendyol.dto.order;

import java.util.List;

public class OrderContentDto {
    private ShipmentAddressDto shipmentAddress;
    private String orderNumber;
    private double grossAmount;
    private double totalDiscount;
    private double totalTyDiscount;
    private String taxNumber;
    private InvoiceAddressDto invoiceAddress;
    private String customerFirstName;
    private String customerEmail;
    private long customerId;
    private String customerLastName;
    private long id;
    private long cargoTrackingNumber;
    private String cargoTrackingLink;
    private String cargoSenderNumber;
    private String cargoProviderName;
    private List<OrderLineDto> lines;
    private long orderDate;
    private String tcIdentityNumber;
    private String identityNumber;
    private String currencyCode;
    private List<PackageHistoryDto> packageHistories;
    private String shipmentPackageStatus;
    private String status;
    private String deliveryType;
    private int timeSlotId;
    private String scheduledDeliveryStoreId;
    private long estimatedDeliveryStartDate;
    private long estimatedDeliveryEndDate;
    private double totalPrice;
    private String deliveryAddressType;
    private long agreedDeliveryDate;
    private Boolean agreedDeliveryDateExtendible;
    private Long extendedAgreedDeliveryDate;
    private Long agreedDeliveryExtensionStartDate;
    private Long agreedDeliveryExtensionEndDate;
    private String invoiceLink;
    private boolean fastDelivery;
    private String fastDeliveryType;
    private long originShipmentDate;
    private long lastModifiedDate;
    private boolean commercial;
    private boolean deliveredByService;
    private boolean micro;
    private boolean giftBoxRequested;
    private String etgbNo;
    private Long etgbDate;
    private boolean is3pByTrendyol;
    private boolean containsDangerousProduct;

    public ShipmentAddressDto getShipmentAddress() {
        return shipmentAddress;
    }

    public void setShipmentAddress(ShipmentAddressDto shipmentAddress) {
        this.shipmentAddress = shipmentAddress;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(double grossAmount) {
        this.grossAmount = grossAmount;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public double getTotalTyDiscount() {
        return totalTyDiscount;
    }

    public void setTotalTyDiscount(double totalTyDiscount) {
        this.totalTyDiscount = totalTyDiscount;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public InvoiceAddressDto getInvoiceAddress() {
        return invoiceAddress;
    }

    public void setInvoiceAddress(InvoiceAddressDto invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCargoTrackingNumber() {
        return cargoTrackingNumber;
    }

    public void setCargoTrackingNumber(long cargoTrackingNumber) {
        this.cargoTrackingNumber = cargoTrackingNumber;
    }

    public String getCargoTrackingLink() {
        return cargoTrackingLink;
    }

    public void setCargoTrackingLink(String cargoTrackingLink) {
        this.cargoTrackingLink = cargoTrackingLink;
    }

    public String getCargoSenderNumber() {
        return cargoSenderNumber;
    }

    public void setCargoSenderNumber(String cargoSenderNumber) {
        this.cargoSenderNumber = cargoSenderNumber;
    }

    public String getCargoProviderName() {
        return cargoProviderName;
    }

    public void setCargoProviderName(String cargoProviderName) {
        this.cargoProviderName = cargoProviderName;
    }

    public List<OrderLineDto> getLines() {
        return lines;
    }

    public void setLines(List<OrderLineDto> lines) {
        this.lines = lines;
    }

    public long getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(long orderDate) {
        this.orderDate = orderDate;
    }

    public String getTcIdentityNumber() {
        return tcIdentityNumber;
    }

    public void setTcIdentityNumber(String tcIdentityNumber) {
        this.tcIdentityNumber = tcIdentityNumber;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public List<PackageHistoryDto> getPackageHistories() {
        return packageHistories;
    }

    public void setPackageHistories(List<PackageHistoryDto> packageHistories) {
        this.packageHistories = packageHistories;
    }

    public String getShipmentPackageStatus() {
        return shipmentPackageStatus;
    }

    public void setShipmentPackageStatus(String shipmentPackageStatus) {
        this.shipmentPackageStatus = shipmentPackageStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public int getTimeSlotId() {
        return timeSlotId;
    }

    public void setTimeSlotId(int timeSlotId) {
        this.timeSlotId = timeSlotId;
    }

    public String getScheduledDeliveryStoreId() {
        return scheduledDeliveryStoreId;
    }

    public void setScheduledDeliveryStoreId(String scheduledDeliveryStoreId) {
        this.scheduledDeliveryStoreId = scheduledDeliveryStoreId;
    }

    public long getEstimatedDeliveryStartDate() {
        return estimatedDeliveryStartDate;
    }

    public void setEstimatedDeliveryStartDate(long estimatedDeliveryStartDate) {
        this.estimatedDeliveryStartDate = estimatedDeliveryStartDate;
    }

    public long getEstimatedDeliveryEndDate() {
        return estimatedDeliveryEndDate;
    }

    public void setEstimatedDeliveryEndDate(long estimatedDeliveryEndDate) {
        this.estimatedDeliveryEndDate = estimatedDeliveryEndDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDeliveryAddressType() {
        return deliveryAddressType;
    }

    public void setDeliveryAddressType(String deliveryAddressType) {
        this.deliveryAddressType = deliveryAddressType;
    }

    public long getAgreedDeliveryDate() {
        return agreedDeliveryDate;
    }

    public void setAgreedDeliveryDate(long agreedDeliveryDate) {
        this.agreedDeliveryDate = agreedDeliveryDate;
    }

    public Boolean getAgreedDeliveryDateExtendible() {
        return agreedDeliveryDateExtendible;
    }

    public void setAgreedDeliveryDateExtendible(Boolean agreedDeliveryDateExtendible) {
        this.agreedDeliveryDateExtendible = agreedDeliveryDateExtendible;
    }

    public Long getExtendedAgreedDeliveryDate() {
        return extendedAgreedDeliveryDate;
    }

    public void setExtendedAgreedDeliveryDate(Long extendedAgreedDeliveryDate) {
        this.extendedAgreedDeliveryDate = extendedAgreedDeliveryDate;
    }

    public Long getAgreedDeliveryExtensionStartDate() {
        return agreedDeliveryExtensionStartDate;
    }

    public void setAgreedDeliveryExtensionStartDate(Long agreedDeliveryExtensionStartDate) {
        this.agreedDeliveryExtensionStartDate = agreedDeliveryExtensionStartDate;
    }

    public Long getAgreedDeliveryExtensionEndDate() {
        return agreedDeliveryExtensionEndDate;
    }

    public void setAgreedDeliveryExtensionEndDate(Long agreedDeliveryExtensionEndDate) {
        this.agreedDeliveryExtensionEndDate = agreedDeliveryExtensionEndDate;
    }

    public String getInvoiceLink() {
        return invoiceLink;
    }

    public void setInvoiceLink(String invoiceLink) {
        this.invoiceLink = invoiceLink;
    }

    public boolean isFastDelivery() {
        return fastDelivery;
    }

    public void setFastDelivery(boolean fastDelivery) {
        this.fastDelivery = fastDelivery;
    }

    public String getFastDeliveryType() {
        return fastDeliveryType;
    }

    public void setFastDeliveryType(String fastDeliveryType) {
        this.fastDeliveryType = fastDeliveryType;
    }

    public long getOriginShipmentDate() {
        return originShipmentDate;
    }

    public void setOriginShipmentDate(long originShipmentDate) {
        this.originShipmentDate = originShipmentDate;
    }

    public long getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(long lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public boolean isCommercial() {
        return commercial;
    }

    public void setCommercial(boolean commercial) {
        this.commercial = commercial;
    }

    public boolean isDeliveredByService() {
        return deliveredByService;
    }

    public void setDeliveredByService(boolean deliveredByService) {
        this.deliveredByService = deliveredByService;
    }

    public boolean isMicro() {
        return micro;
    }

    public void setMicro(boolean micro) {
        this.micro = micro;
    }

    public boolean isGiftBoxRequested() {
        return giftBoxRequested;
    }

    public void setGiftBoxRequested(boolean giftBoxRequested) {
        this.giftBoxRequested = giftBoxRequested;
    }

    public String getEtgbNo() {
        return etgbNo;
    }

    public void setEtgbNo(String etgbNo) {
        this.etgbNo = etgbNo;
    }

    public Long getEtgbDate() {
        return etgbDate;
    }

    public void setEtgbDate(Long etgbDate) {
        this.etgbDate = etgbDate;
    }

    public boolean isIs3pByTrendyol() {
        return is3pByTrendyol;
    }

    public void setIs3pByTrendyol(boolean is3pByTrendyol) {
        this.is3pByTrendyol = is3pByTrendyol;
    }

    public boolean isContainsDangerousProduct() {
        return containsDangerousProduct;
    }

    public void setContainsDangerousProduct(boolean containsDangerousProduct) {
        this.containsDangerousProduct = containsDangerousProduct;
    }
}
