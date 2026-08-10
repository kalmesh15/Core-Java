package com.xworkz.comparlearning.dto;

import com.xworkz.comparlearning.constant.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientDto implements Comparable<PatientDto> {
    private int id;
    private String name;
    private String diseaseName;
    private Gender gender;
    private int age;
    private String address;

    @Override
    public int compareTo(PatientDto o) {
        return this.name.compareTo(o.getName());
    }
}
