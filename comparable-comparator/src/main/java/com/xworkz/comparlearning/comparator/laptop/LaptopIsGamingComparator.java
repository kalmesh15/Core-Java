package com.xworkz.comparlearning.comparator.laptop;

import com.xworkz.comparlearning.dto.LaptopDto;

import java.util.Comparator;

public class LaptopIsGamingComparator implements Comparator<LaptopDto> {
    @Override
    public int compare(LaptopDto o1, LaptopDto o2) {
        return Boolean.compare(o1.isGamingLaptop(),o2.isGamingLaptop());
    }
}
