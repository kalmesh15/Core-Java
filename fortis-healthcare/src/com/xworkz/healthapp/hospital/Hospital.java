package com.xworkz.healthapp.hospital;

import com.xworkz.healthapp.doctor.Doctor;

//updateFeesByDoctorName
//updateDesignationByDoctorId
//updateFeesByDoctorId
//updateDesignationByDoctorName
//getDesignationByDoctorName
//getFeesByDoctorId
//getSpecializationByDoctorName

public class Hospital {
    Doctor[] doctors =new Doctor[5];
    int index;

    public void createDoctor(Doctor doctor){
        boolean isDoctorIdValid=false;
        boolean isDoctorNameValid=false;
        boolean isDesignationvalid=false;
        boolean isSpecializationValid=false;
        boolean isExperienceValid=false;
        boolean isFeesValid=false;

        if(doctor.getDoctorId() >0){
            isDoctorIdValid=true;
        }else{
            System.out.println("invalid doctor id");
        }
        if(doctor.getDoctorName() != null && !doctor.getDoctorName().isEmpty()){
            isDoctorNameValid = true;
        }else System.out.println("Invalid doctor name");
        if(doctor.getDesignation() != null && !doctor.getDesignation().isEmpty()){
            isDesignationvalid=true;
        }else System.out.println("Invalid designation");
        if(doctor.getSpecialization() != null && !doctor.getSpecialization().isEmpty()){
            isSpecializationValid=true;
        }else System.out.println("Invalid specialization");

        if(doctor.getExperience() !=null && !doctor.getExperience().isEmpty()){
            isExperienceValid=true;
        }else System.out.println("Invalid Experience");

        if(doctor.getFees() >0 ){
            isFeesValid=true;
        }else System.out.println("Invalid fees");

        if(isDoctorIdValid && isDoctorNameValid && isSpecializationValid && isExperienceValid && isDesignationvalid && isFeesValid){
            this.doctors[index++]=doctor;
        }

    }

    public void getDoctorDetails(){
        for(Doctor doctor:doctors) {
            System.out.println("-----------------------------------------");
            System.out.println("Doctor Id is " + doctor.getDoctorId());
            System.out.println("Doctor name is " + doctor.getDoctorName());
            System.out.println("doctor designation is " + doctor.getDesignation());
            System.out.println("Doctor specialization is " + doctor.getSpecialization());
            System.out.println("Doctor experience is " + doctor.getExperience());
            System.out.println("Doctor consulting fees is " + doctor.getFees());
            System.out.println("-----------------------------------------");
        }
    }

    public boolean updateFeesByDoctorName(double updateFees ,String doctorName){
        boolean isFeesByDoctorNameUpdated=false;

        for(int index =0 ; index<doctors.length; index++){

            if(doctors[index].getDoctorName().equals(doctorName)){
                doctors[index].setFees(updateFees);
                isFeesByDoctorNameUpdated=true;
            }
        }
        return isFeesByDoctorNameUpdated;
    }

    public boolean updateDesignationByDoctorId(String updateDesign , int doctorId){
        boolean isDesignationUpdatedByDoctorName=false;
        if(updateDesign != null && doctorId > 0){
            for (int index = 0; index < doctors.length; index++) {
                if(doctors[index].getDoctorId()== doctorId){
                    doctors[index].setDesignation(updateDesign);
                    isDesignationUpdatedByDoctorName=true;
                }
            }

        }
        return isDesignationUpdatedByDoctorName;

    }

    public boolean updateFeesByDoctorId(double updateFees, int doctorId){
        boolean isFeesUpdatedByDoctorId=false;
        if(updateFees >0 && doctorId>0 ){
            for (int index = 0; index < doctors.length; index++) {
                if(doctors[index].getDoctorId()==doctorId){
                    doctors[index].setFees(updateFees);
                    isFeesUpdatedByDoctorId=true;
                }
            }
        }
        return isFeesUpdatedByDoctorId;
    }

    public boolean updateDesignationByDoctorName(String updatedesig, String doctorName){
        boolean isDesignUpdatedByDoctorName=false;
        if(updatedesig !=null && doctorName!=null){
            for (int index = 0; index < doctors.length; index++) {
                if(doctors[index].getDoctorName().equals(doctorName)){
                    doctors[index].setDesignation(updatedesig);
                    isDesignUpdatedByDoctorName=true;
                }

            }
        }

        return isDesignUpdatedByDoctorName;
    }

    public String getDesignationByDoctorName(String doctorName){
        String getDesign = null;
        for (int index = 0; index < doctors.length; index++) {
            if (doctors[index].getDoctorName().equals(doctorName)){
                getDesign=doctors[index].getDesignation();
            }

        }

        return getDesign;
    }

    public double getFeesByDoctorId(int doctorId){
        double fees=00.0;
        if(doctorId>0){
            for (int index = 0; index < doctors.length; index++) {
                if(doctors[index].getDoctorId()==doctorId){
                    fees=doctors[index].getFees();
                }
            }
        }
        return  fees;
    }

    public String getSpecializationByDoctorName(String doctorName){
        String specialize=null;
        if(doctorName!=null){
            for (int index = 0; index < doctors.length; index++) {
                if(doctors[index].getDoctorName().equals(doctorName)){
                    specialize=doctors[index].getSpecialization();

                }
            }
        }

        return specialize;
    }
}
