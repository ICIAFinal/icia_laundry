package com.jsframe.laundry.dto;

import lombok.Data;

@Data
public class UserDto {
    // user(회원) 테이블
    private int u_no;
    private String u_id;
    private String u_pass;
    private String u_name;
    private String u_firstaddr;
    private String u_secaddr;
    private String u_phoneNum;
    //  sns social(카카오,네이버)키
    private String u_socialkey;
    private String u_socialhost;


}
