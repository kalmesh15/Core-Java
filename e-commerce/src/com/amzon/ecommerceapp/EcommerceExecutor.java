package com.amzon.ecommerceapp;

import com.amzon.ecommerceapp.ecommerce.Ecommerce;
import com.amzon.ecommerceapp.product.Product;


public class EcommerceExecutor {
    public static void main(String[] args) {

        Ecommerce ecommerce =new Ecommerce();
        Product productOne=new Product();



        productOne.setUniqueId(1);
        productOne.setName("Grinder");
        productOne.setMfgDate("06/2025");
        productOne.setCost(1799);
        productOne.setSeller("nutripro");
        productOne.setWarrantyYear("2 years");
        productOne.setWarrantyExpired("06/2027");
        productOne.setOriginCountry("India");

        ecommerce.saveProduct(productOne);
            
        Product productTwo = new Product();

        productTwo.setUniqueId(2);
        productTwo.setName("mortein");
        productTwo.setMfgDate("06/2025");
        productTwo.setCost(599);
        productTwo.setSeller("Hindustan ");
        productTwo.setWarrantyYear("6 months");
        productTwo.setWarrantyExpired("1/2026");
        productTwo.setOriginCountry("India");


        ecommerce.saveProduct(productTwo);

        Product productThree=new Product();

        productThree.setUniqueId(3);
        productThree.setName("Dabur Honey");
        productThree.setMfgDate("03/2026");
        productThree.setCost(376);
        productThree.setSeller("Dabur");
        productThree.setWarrantyYear("06 months");
        productThree.setWarrantyExpired("06/2026");
        productThree.setOriginCountry("India");

        ecommerce.saveProduct(productThree);


        Product productFour=new Product();

        productFour.setUniqueId(4);
        productFour.setName("Laptop");
        productFour.setMfgDate("2024");
        productFour.setCost(58000);
        productFour.setSeller("Acer");
        productFour.setWarrantyYear("1 years");
        productFour.setWarrantyExpired("2025");
        productFour.setOriginCountry("China");


        ecommerce.saveProduct(productFour);

        Product productFive=new Product();
        productFive.setUniqueId(5);
        productFive.setName("Sampoo");
        productFive.setMfgDate("2025");
        productFive.setCost(455);
        productFive.setSeller("Dove");
        productFive.setWarrantyYear("1 years");
        productFive.setWarrantyExpired("2026");
        productFive.setOriginCountry("China");
        ecommerce.saveProduct(productFive);


        Product productSix=new Product();

        productSix.setUniqueId(6);
        productSix.setName("Sun Screen");
        productSix.setMfgDate("2025");
        productSix.setCost(450);
        productSix.setSeller("Lakmee");
        productSix.setWarrantyYear("1 years");
        productSix.setWarrantyExpired("2026");
        productSix.setOriginCountry("China");

        ecommerce.saveProduct(productSix);

        Product productSeven=new Product();

        productSeven.setUniqueId(7);
        productSeven.setName("Bag");
        productSeven.setMfgDate("2023");
        productSeven.setCost(2503);
        productSeven.setSeller("Safari");
        productSeven.setWarrantyYear("5 years");
        productSeven.setWarrantyExpired("2028");
        productSeven.setOriginCountry("USA");

        ecommerce.saveProduct(productSeven);


        Product productEight=new Product();

        productEight.setUniqueId(8);
        productEight.setName("Tyre");
        productEight.setMfgDate("2024");
        productEight.setCost(2560);
        productEight.setSeller("MRF");
        productEight.setWarrantyYear("1 years");
        productEight.setWarrantyExpired("2025");
        productEight.setOriginCountry("India");


        ecommerce.saveProduct(productEight);


        Product productNine=new Product();

        productNine.setUniqueId(9);
        productNine.setName("Laptop");
        productNine.setMfgDate("2026");
        productNine.setCost(40000);
        productNine.setSeller("Asus");
        productNine.setWarrantyYear("1 years");
        productNine.setWarrantyExpired("2027");
        productNine.setOriginCountry("China");

        ecommerce.saveProduct(productNine);


        Product productTen=new Product();

        productTen.setUniqueId(10);
        productTen.setName("Paste");
        productTen.setMfgDate("2026");
        productTen.setCost(58);
        productTen.setSeller("Colgate");
        productTen.setWarrantyYear("8 months");
        productTen.setWarrantyExpired("2027");
        productTen.setOriginCountry("India");

        ecommerce.saveProduct(productTen);


        Product productEleven=new Product();

        productEleven.setUniqueId(11);
        productEleven.setName("Musore Sandle Soap");
        productEleven.setMfgDate("15/2026");
        productEleven.setCost(90);
        productEleven.setSeller("KSF");
        productEleven.setWarrantyYear("2 years");
        productEleven.setWarrantyExpired("2028");
        productEleven.setOriginCountry("India");


        ecommerce.saveProduct(productEleven);


        Product productTwelve=new Product();

        productTwelve.setUniqueId(12);
        productTwelve.setName("SevenUp");
        productTwelve.setMfgDate("05/2025");
        productTwelve.setCost(50);
        productTwelve.setSeller("SevenUp");
        productTwelve.setWarrantyYear("2months");
        productTwelve.setWarrantyExpired("07/2025");
        productTwelve.setOriginCountry("India");


        ecommerce.saveProduct(productTwelve);


        Product productThirteen=new Product();

        productThirteen.setUniqueId(13);
        productThirteen.setName("Maaza");
        productThirteen.setMfgDate("2025");
        productThirteen.setCost(45);
        productThirteen.setSeller("Maaza");
        productThirteen.setWarrantyYear("6 months");
        productThirteen.setWarrantyExpired("2026");
        productThirteen.setOriginCountry("India");


        ecommerce.saveProduct(productThirteen);


        Product productFourteen=new Product();

        productFourteen.setUniqueId(14);
        productFourteen.setName("Bulb");
        productFourteen.setMfgDate("06/2026");
        productFourteen.setCost(460);
        productFourteen.setSeller("Pillipse");
        productFourteen.setWarrantyYear("1 years");
        productFourteen.setWarrantyExpired("07/2027");
        productFourteen.setOriginCountry("India");


        ecommerce.saveProduct(productFourteen);


        Product productFifteen=new Product();

        productFifteen.setUniqueId(15);
        productFifteen.setName("Fan");
        productFifteen.setMfgDate("2023");
        productFifteen.setCost(2500);
        productFifteen.setSeller("usha");
        productFifteen.setWarrantyYear("1 years");
        productFifteen.setWarrantyExpired("2024");
        productFifteen.setOriginCountry("India");


        ecommerce.saveProduct(productFifteen);

        ecommerce.getAllProduct();
        ecommerce.updateCostBySeller(567,"nutripro");
        ecommerce.updateMfgDateByUniqueId("9/2024",13);
        ecommerce.updateWarrantyYearsByName("3 years","Maaza");
        ecommerce.updateWarrantyYearsByUniqueId("3 years",12);

        ecommerce.getAllProduct();
    }
}
