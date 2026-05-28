package com.rbi.rbirules.rbi.impls;

import com.rbi.rbirules.rbi.RbiRules;

public class SbiImpl implements RbiRules {
    @Override
    public boolean kyc(){
        System.out.println("SBI bank kyc Implementation");
        return  true;
    }

    @Override
    public void fraudDetection(){

        System.out.println("SBI bank Fraud Detection  Implementation");
    }
}
