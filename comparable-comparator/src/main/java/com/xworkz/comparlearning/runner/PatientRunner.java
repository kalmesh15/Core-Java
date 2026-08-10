package com.xworkz.comparlearning.runner;

import com.xworkz.comparlearning.comparator.patient.*;
import com.xworkz.comparlearning.constant.Gender;
import com.xworkz.comparlearning.dto.PatientDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PatientRunner {
    public static void main(String[] args) {
        PatientDto patientDto = new PatientDto(1,"Praveen","BP", Gender.MALE,24,"Bannur");
        PatientDto patientDto1 = new PatientDto(2,"Shivu","Sugar", Gender.MALE,24,"Tumkur");
        PatientDto patientDto2 = new PatientDto(3,"Chandu","Bennovu", Gender.MALE,23,"Malavalli");
        PatientDto patientDto3 = new PatientDto(4,"Nithin","BP", Gender.MALE,24,"Mysure");
        PatientDto patientDto4 = new PatientDto(5,"Preethi","Tyroid", Gender.FEMALE,22,"Haveri");
        PatientDto patientDto5 = new PatientDto(6,"Sachin","headache", Gender.MALE,23,"Mudhol");
        PatientDto patientDto6 = new PatientDto(7,"Yallu","Fever", Gender.MALE,22,"Hubli");
        PatientDto patientDto7 = new PatientDto(8,"Arfat","Depression", Gender.MALE,20,"Mangaluru");
        PatientDto patientDto8 = new PatientDto(9,"Yashu","Suger", Gender.FEMALE,24,"Bagalkote");
        PatientDto patientDto9 = new PatientDto(10,"Suchitra","BP", Gender.FEMALE,34,"Belagali");

        List<PatientDto> patientDtos=new ArrayList<>();

        patientDtos.add(patientDto);
        patientDtos.add(patientDto1);
        patientDtos.add(patientDto2);
        patientDtos.add(patientDto3);
        patientDtos.add(patientDto4);
        patientDtos.add(patientDto5);
        patientDtos.add(patientDto6);
        patientDtos.add(patientDto7);
        patientDtos.add(patientDto8);
        patientDtos.add(patientDto9);

        System.out.println("Before sorting");
        for (PatientDto patient:patientDtos){
            System.out.println(patient);
        }
        Collections.sort(patientDtos);
        System.out.println("------------------------\nsorting by Name (Comparable)");
        for (PatientDto patient:patientDtos){
            System.out.println(patient);
        }

        Collections.sort(patientDtos, new PatientAddressComparator());
        System.out.println("------------------------\nsorting by address (Comparator)");
        for (PatientDto patient:patientDtos){
            System.out.println(patient);
        }

        Collections.sort(patientDtos, new PatientIdComparator());
        System.out.println("------------------------\nsorting by id (Comparator)");
        for (PatientDto patient:patientDtos){
            System.out.println(patient);
        }

        Collections.sort(patientDtos, new PatientGenderComparator());
        System.out.println("------------------------\nsorting by Gender (Comparator)");
        for (PatientDto patient:patientDtos){
            System.out.println(patient);
        }

        Collections.sort(patientDtos, new PatientAgeComparator());
        System.out.println("------------------------\nsorting by age (Comparator)");
        for (PatientDto patient:patientDtos){
            System.out.println(patient);
        }
        Collections.sort(patientDtos, new PatientDiseaseComparator());
        System.out.println("------------------------\nsorting by Disease (Comparator)");
        for (PatientDto patient:patientDtos){
            System.out.println(patient);
        }


    }
}
