package com.xworkz.comparlearning.runner;

import com.xworkz.comparlearning.comparator.userinfo.*;
import com.xworkz.comparlearning.dto.UserInfo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class UserInfoRunner {
    public static void main(String[] args) {
        UserInfo userInfo1= new UserInfo(1,"Shrinika","Amari","shrinika@gmail.com",10,99857645985L);
        UserInfo userInfo2=new UserInfo(2,"Kalmesh","Dyamannavar","kalmesh@gmail.com",56,7019136540L);
        UserInfo userInfo = new UserInfo(3,"Mallappa","Dyamannar","mallappa@gmail.com",80,9945795589L);
        UserInfo userInfo3 = new UserInfo(4,"Prajju","Shetter","prajju@gmail.com",50,63645874965L);
        UserInfo userInfo4 = new UserInfo(5,"Nithin","A","nithin@gmail.com",75,9658745556L);
        UserInfo userInfo5 = new UserInfo(6,"Bhuvan","B","Bhuvi2026@gmail.com",15,7894562312L);
        UserInfo userInfo6 = new UserInfo(7,"LaxmiBai","Dyamannavar","laxmibai@gmail",60,7626468659L);
        UserInfo userInfo7 = new UserInfo(8,"Manasvi","B","manasvi@gmail.com",4,7896546695L);
        UserInfo userInfo8=new UserInfo(9,"Raju","Amari","rajuamari@gmail.com",75,6469875659L);
        UserInfo userInfo9 = new UserInfo(10,"Savitha","B","savitha@gmail.com",42,78956431158L);


        List<UserInfo> userInfos= new LinkedList<>();
        userInfos.add(userInfo1);
        userInfos.add(userInfo2);
        userInfos.add(userInfo);
        userInfos.add(userInfo3);
        userInfos.add(userInfo5);
        userInfos.add(userInfo4);
        userInfos.add(userInfo6);
        userInfos.add(userInfo7);
        userInfos.add(userInfo8);
        userInfos.add(userInfo9);


        Collections.sort(userInfos);

        System.out.println("------------------------------------\nsort by UserId(comparable)");
        for (UserInfo user:userInfos){
            System.out.println(user);
        }

        Collections.sort(userInfos,new UserInfoEmailComparator());

        System.out.println("------------------------------------\nsort by email(comparator)");
        for (UserInfo user:userInfos){
            System.out.println(user);
        }

        Collections.sort(userInfos,new UserInfoFirstNameComparator());

        System.out.println("------------------------------------\nsort by first name (comparator)");
        for (UserInfo user:userInfos){
            System.out.println(user);
        }

        Collections.sort(userInfos,new UserInfoLastNameComparator());

        System.out.println("------------------------------------\nsort by Last name(comparator)");
        for (UserInfo user:userInfos){
            System.out.println(user);
        }

        Collections.sort(userInfos,new UserInfoMobileNoComparator());

        System.out.println("------------------------------------\nsort by Mobile no (comparator)");
        for (UserInfo user:userInfos){
            System.out.println(user);
        }

        Collections.sort(userInfos,new UserInfoWeightComparator());

        System.out.println("------------------------------------\nsort by user  Weight (comparator)");
        for (UserInfo user:userInfos){
            System.out.println(user);
        }

    }
}
