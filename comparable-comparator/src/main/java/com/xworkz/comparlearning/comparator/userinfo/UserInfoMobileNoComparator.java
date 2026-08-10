package com.xworkz.comparlearning.comparator.userinfo;

import com.xworkz.comparlearning.dto.UserInfo;

import java.util.Comparator;

public class UserInfoMobileNoComparator implements Comparator<UserInfo> {
    @Override
    public int compare(UserInfo o1, UserInfo o2) {
        return Long.compare(o1.getMobileNo(),o2.getMobileNo());
    }
}
