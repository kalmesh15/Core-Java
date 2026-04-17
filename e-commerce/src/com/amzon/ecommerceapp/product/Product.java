package com.amzon.ecommerceapp.product;

public class Product {
    private int uniqueId;
    private String name;
    private String mfgDate;
    private double cost;
    private String seller;
    private String warrantyYear;
    private String warrantyExpired;
    private String originCountry;

    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMfgDate() {
        return mfgDate;
    }

    public void setMfgDate(String mfgDate) {
        this.mfgDate = mfgDate;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getWarrantyYear() {
        return warrantyYear;
    }

    public void setWarrantyYear(String warrantyYear) {
        this.warrantyYear = warrantyYear;
    }

    public String getWarrantyExpired() {
        return warrantyExpired;
    }

    public void setWarrantyExpired(String warrantyExpired) {
        this.warrantyExpired = warrantyExpired;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }
}
