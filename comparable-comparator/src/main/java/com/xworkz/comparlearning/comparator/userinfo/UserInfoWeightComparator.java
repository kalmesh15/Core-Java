package com.xworkz.comparlearning.comparator.userinfo;

import com.xworkz.comparlearning.dto.UserInfo;

import java.util.Comparator;

public class UserInfoWeightComparator implements Comparator<UserInfo> {

    @Override
    public int compare(UserInfo o1, UserInfo o2) {
        return o1.getWeightInKG()-o2.getWeightInKG();
    }
}
