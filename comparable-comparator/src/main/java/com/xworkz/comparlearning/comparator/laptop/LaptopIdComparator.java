package com.xworkz.comparlearning.comparator.laptop;

import com.xworkz.comparlearning.dto.LaptopDto;

import java.util.Comparator;

public class LaptopIdComparator implements Comparator<LaptopDto> {
    @Override
    public int compare(LaptopDto o1, LaptopDto o2) {
        return o1.getId()-o2.getId();
    }
}
