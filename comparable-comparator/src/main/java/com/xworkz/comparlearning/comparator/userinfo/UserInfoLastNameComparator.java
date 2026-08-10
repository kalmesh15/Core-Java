package com.xworkz.comparlearning.comparator.userinfo;

import com.xworkz.comparlearning.dto.UserInfo;

import java.util.Comparator;

public class UserInfoLastNameComparator implements Comparator<UserInfo> {
    @Override
    public int compare(UserInfo o1, UserInfo o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
