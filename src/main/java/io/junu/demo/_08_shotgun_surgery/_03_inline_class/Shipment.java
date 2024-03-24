package io.junu.demo._08_shotgun_surgery._03_inline_class;

public class Shipment {

    private String shippingCompany;

    private String trackingNumber;

    public Shipment(String shippingCompany, String trackingNumber) {
        this.shippingCompany = shippingCompany;
        this.trackingNumber = trackingNumber;
    }

    public String getShippingCompany() {
        return shippingCompany;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public String getTrackingInfo() {
        return this.shippingCompany + ": " + this.trackingNumber;
    }
}
