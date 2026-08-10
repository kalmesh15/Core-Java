package com.xworkz.comparlearning.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo  implements  Comparable<UserInfo>{
    private  int userId;
    private  String firstName;
    private  String lastName;
    private String email;
    private int weightInKG;
    private long mobileNo;

    @Override
    public int compareTo(UserInfo o) {
        return this.userId-o.userId;
    }
}
