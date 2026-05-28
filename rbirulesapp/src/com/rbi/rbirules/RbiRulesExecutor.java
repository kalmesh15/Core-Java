package com.rbi.rbirules;


import com.rbi.rbirules.rbi.RbiRules;
import com.rbi.rbirules.rbi.impls.HdfcImpl;
import com.rbi.rbirules.rbi.impls.SbiImpl;

public class RbiRulesExecutor {
    public static void main(String[] args) {
        RbiRules hdfc = new HdfcImpl();

        boolean res = hdfc.kyc();
        //System.out.println(hdfc.kyc());
        hdfc.fraudDetection();


        RbiRules sbi = new SbiImpl();
        sbi.fraudDetection();
        sbi.kyc();
    }



}
