package com.xworkz.healthapp;

import com.xworkz.healthapp.doctor.Doctor;
import com.xworkz.healthapp.hospital.Hospital;

public class HospitalExecutor {
    public static void main(String[] args) {

        Hospital hospital=new Hospital();
        Doctor doctor = new Doctor();
        doctor.setDoctorId(1);
        doctor.setDoctorName("kalmesh");
        doctor.setDesignation("efyr");
        doctor.setSpecialization("General");
        doctor.setExperience("2 years");
        doctor.setFees(200.95);
        hospital.createDoctor(doctor);

        Doctor doctorTwo = new Doctor();
        doctorTwo.setDoctorId(2);
        doctorTwo.setDoctorName("Dr.Ajay Kaul");
        doctorTwo.setDesignation("Chairmen Cardiac Science");
        doctorTwo.setSpecialization("Heart Transplant ");
        doctorTwo.setExperience("38 years");
        doctorTwo.setFees(1600);

        hospital.createDoctor(doctorTwo);
        Doctor doctorThree = new Doctor();
        doctorThree.setDoctorId(3);
        doctorThree.setDoctorName("Dr.Rao");
        doctorThree.setDesignation("Manager");
        doctorThree.setSpecialization("General");
        doctorThree.setExperience("23 years");
        doctorThree.setFees(2800);

        hospital.createDoctor(doctorThree);
        Doctor doctorFour = new Doctor();
        doctorFour.setDoctorId(4);
        doctorFour.setDoctorName("Dr.Ajay Agarwal");
        doctorFour.setDesignation("Chairmen");
        doctorFour.setSpecialization("General Physician");
        doctorFour.setExperience("25 years");
        doctorFour.setFees(1400);

        hospital.createDoctor(doctorFour);
        Doctor doctorFive = new Doctor();
        doctorFive.setDoctorId(5);
        doctorFive.setDoctorName("Dr.Anoop Misra");
        doctorFive.setDesignation("Executive Chairmen");
        doctorFive.setSpecialization("Endocrinology");
        doctorFive.setExperience("44 years");
        doctorFive.setFees(2800);

        hospital.createDoctor(doctorFive);
        hospital.getDoctorDetails();
        boolean updated=hospital.updateFeesByDoctorName(257.89,"Dr.Rao");
        System.out.println(updated);

        hospital.updateDesignationByDoctorId("CEO",2);

        hospital.updateFeesByDoctorId(6599.67,1);


        hospital.updateDesignationByDoctorName("Chairmen","kalmesh");


        System.out.println("get Designation by name "+hospital.getDesignationByDoctorName("Dr.Anoop Misra"));
        System.out.println("get fees by Doctor Id "+hospital.getFeesByDoctorId(2));
        System.out.println("get specialization by Doctor Name "+hospital.getSpecializationByDoctorName("Dr.Ajay Agarwal"));
        hospital.getDoctorDetails();
    }


}
