package com.xworkz.comparlearning.comparator.laptop;

import com.xworkz.comparlearning.dto.LaptopDto;

import java.util.Comparator;

public class LaptopPriceComparator implements Comparator<LaptopDto> {
    @Override
    public int compare(LaptopDto o1, LaptopDto o2) {
        return Double.compare(o1.getPrice(),o2.getPrice());
    }
}
