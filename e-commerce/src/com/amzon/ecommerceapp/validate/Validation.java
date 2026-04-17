package com.amzon.ecommerceapp.validate;

import com.amzon.ecommerceapp.product.Product;

public class Validation {
    Product product;

    public boolean validate(Product product){
        boolean isvalidate=false;
        boolean isUniqueIdValid=false;
        boolean isNameValid=false;
        boolean ismfgDatevalid=false;
        boolean isCostValid=false;
        boolean isSellerValid=false;
        boolean isWarrantyYearValid=false;
        boolean isWarrantyExpiredValid=false;
        boolean isOriginCountryValid=false;


        if(product.getUniqueId() > 0){
            isUniqueIdValid=true;
        }else System.out.println("Invalid unique ID");
        if(product.getName() !=null && !product.getName().isEmpty()){
            isNameValid=true;
        }else System.out.println("Invalid Name");
        if(product.getMfgDate()!=null && !product.getMfgDate().isEmpty()){
            ismfgDatevalid=true;
        }else System.out.println("Invalid Manufacture Date");
        if (product.getCost() >0){
            isCostValid=true;
        }else System.out.println("Invalid Cost");
        if(product.getSeller()!=null & !product.getSeller().isEmpty()){
            isSellerValid=true;
        }else System.out.println("Invalid Seller");
        if (product.getWarrantyYear()!=null && !product.getWarrantyYear().isEmpty()){
            isWarrantyYearValid=true;
        }else System.out.println("Invalid warranty year");
        if(product.getWarrantyExpired()!=null && !product.getWarrantyExpired().isEmpty()){
            isWarrantyExpiredValid=true;
        }else System.out.println("Invalid Warranty Expire date");
        if(product.getOriginCountry()!=null && !product.getOriginCountry().isEmpty()){
            isOriginCountryValid=true;
        }

        if(isUniqueIdValid && isNameValid && ismfgDatevalid && isCostValid && isSellerValid && isWarrantyYearValid && isWarrantyExpiredValid && isOriginCountryValid ){
            this.product=product;
            isvalidate=true;
        }

        return isvalidate;
    }
}
