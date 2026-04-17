package com.amzon.ecommerceapp.ecommerce;

import com.amzon.ecommerceapp.product.Product;
import com.amzon.ecommerceapp.validate.Validation;

public class Ecommerce {

    Product[] products=new Product[15];
    int index;
    Validation validation= new Validation();



    public boolean  saveProduct(Product product){
        boolean isProductSaved=false;
        if(product !=null){
            if(validation.validate(product)){
                products[index++]=product;
                isProductSaved=true;
            }else System.out.println("Invalid Inputs");
        }
        return isProductSaved;
    }

    public void getAllProduct(){
        for (Product product:products) {
            System.out.println("------------------------");
            System.out.println("The Product Unique id is "+product.getUniqueId());
            System.out.println("The Product name is "+product.getName());
            System.out.println("The product manufacture date is "+product.getMfgDate());
            System.out.println("The Product cost is "+product.getCost());
            System.out.println("The product's seller is "+product.getSeller());
            System.out.println("The product's Warranty years are "+product.getWarrantyYear());
            System.out.println("The product's warranty Expires on "+product.getWarrantyExpired());
            System.out.println("The Product's country of Origin is "+product.getOriginCountry());
        }

    }

    public boolean updateMfgDateByUniqueId(String updatedMFGDate , int uniqueId){
        boolean isMFGDateUpdaeted=false;
        if(updatedMFGDate!=null && !updatedMFGDate.isEmpty() && uniqueId >0){
            for (int index = 0; index < products.length; index++) {
                if(products[index].getUniqueId()==uniqueId){
                    products[index].setMfgDate(updatedMFGDate);
                    isMFGDateUpdaeted=true;
                }
            }
        }
        return isMFGDateUpdaeted;
    }

    public boolean updateCostBySeller(double updatedCost , String seller){
        boolean isCostUpdated=false;
        if(updatedCost>0 && seller!=null && !seller.isEmpty()){
            for (int index = 0; index < products.length; index++) {
                if(products[index].getSeller().equals(seller)){
                    products[index].setCost(updatedCost);
                    isCostUpdated=true;
                }
            }
        }

        return isCostUpdated;
    }

    public boolean updateWarrantyYearsByUniqueId(String updatedWarrantyYears, int uniqueId){
        boolean isWarrantyYearsUpdated=false;
        if (updatedWarrantyYears!=null && !updatedWarrantyYears.isEmpty() && uniqueId>0){
            for (int index = 0; index < products.length; index++) {
                if(products[index].getUniqueId() == uniqueId){
                    products[index].setWarrantyYear(updatedWarrantyYears);
                    isWarrantyYearsUpdated=true;
                }
            }
        }
        return isWarrantyYearsUpdated;
    }

    public boolean updateWarrantyYearsByName(String updatedWarrantyYears,String name){
        boolean isWarrantyYearsUpdated=false;
        if (updatedWarrantyYears!=null && !updatedWarrantyYears.isEmpty() && name!=null && !name.isEmpty()){
            for (int index = 0; index < products.length; index++) {
                if(products[index].getName().equals(name) ){
                    products[index].setWarrantyYear(updatedWarrantyYears);
                    isWarrantyYearsUpdated=true;
                }
            }
        }
        return isWarrantyYearsUpdated;
    }
}
