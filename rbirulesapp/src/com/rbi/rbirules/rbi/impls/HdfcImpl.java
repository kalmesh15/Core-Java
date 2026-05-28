package com.rbi.rbirules.rbi.impls;

import com.rbi.rbirules.rbi.RbiRules;

public class HdfcImpl implements RbiRules {
    @Override
    public boolean kyc(){
        System.out.println("HDFC bank kyc Implementation");
        return  true;
    }

    @Override
    public void fraudDetection(){

        System.out.println("HDFC bank Fraud Detection  Implementation");
    }
}
