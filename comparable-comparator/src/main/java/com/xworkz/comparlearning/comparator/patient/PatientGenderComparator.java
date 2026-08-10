package com.xworkz.comparlearning.comparator.patient;

import com.xworkz.comparlearning.dto.PatientDto;

import java.util.Comparator;

public class PatientGenderComparator implements Comparator<PatientDto> {
    @Override
    public int compare(PatientDto o1, PatientDto o2) {
        return o1.getGender().compareTo(o2.getGender());
    }
}
