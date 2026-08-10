package com.xworkz.comparlearning.dto;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LaptopDto implements Comparable<LaptopDto> {

    private int id;
    private String brand;
    private String model;
    private boolean isGamingLaptop;
    private double price;

    @Override
    public int compareTo(LaptopDto o) {
        return this.getBrand().compareTo(o.getBrand());
    }
}
