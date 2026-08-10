package com.xworkz.comparlearning.runner;

import com.xworkz.comparlearning.comparator.laptop.LaptopIdComparator;
import com.xworkz.comparlearning.comparator.laptop.LaptopIsGamingComparator;
import com.xworkz.comparlearning.comparator.laptop.LaptopModelComparator;
import com.xworkz.comparlearning.comparator.laptop.LaptopPriceComparator;
import com.xworkz.comparlearning.dto.LaptopDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopRunner {
    public static void main(String[] args) {
        LaptopDto laptop = new LaptopDto(1,"Acer","Acer-ALG",true,58_000);
        LaptopDto laptop1 = new LaptopDto(2,"HP","HP-victus",true,60_000.00);
        LaptopDto laptop2=new LaptopDto(3,"Acer","acer light",false,3800.09);
        LaptopDto laptop3=new LaptopDto(4,"Samsung","NoteBook",false,4500.9);
        LaptopDto laptop4= new LaptopDto(5,"Apple","MacBook Pro 14",false,220000);
        LaptopDto laptop5 = new LaptopDto(6,"Dell","G15",true,84000);
        LaptopDto laptop6=new LaptopDto(7,"Lenovo","Legion",true,189000);
        LaptopDto laptop7=new LaptopDto(8,"MSI","Vector 16",true,250000);
        LaptopDto laptop8= new LaptopDto(9,"Samsung","Galaxy Book4",false,75000);
        LaptopDto laptop9 = new LaptopDto(10,"Razer","Blade 15",true,220000);

        List<LaptopDto> laptops=new ArrayList<>();
        laptops.add(laptop);
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);
        laptops.add(laptop7);
        laptops.add(laptop8);
        laptops.add(laptop9);

        Collections.sort(laptops);

        System.out.println("----------------------------------\nSort by brand (comparable)");
        for (LaptopDto lap:laptops){
            System.out.println(lap);
        }

        Collections.sort(laptops, new LaptopIdComparator());
        System.out.println("------------------------------\nSort by id (comparator)");
        for (LaptopDto lap:laptops){
            System.out.println(lap);
        }

        Collections.sort(laptops, new LaptopModelComparator());
        System.out.println("-------------------------\nSort by Model (comparator)");
        for (LaptopDto lap:laptops){
            System.out.println(lap);
        }

        Collections.sort(laptops, new LaptopIsGamingComparator());
        System.out.println("-------------------------\nSort by isGaming (comparator)");
        for (LaptopDto lap:laptops){
            System.out.println(lap);
        }

        Collections.sort(laptops, new LaptopPriceComparator());
        System.out.println("-------------------------\nSort by price (comparator)");
        for (LaptopDto lap:laptops){
            System.out.println(lap);
        }
    }
}
