package com.jsframe.laundry.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class BoardDto {
    private int b_num;
    private String b_title;
    private String b_contents;
    private String u_id;
    private String u_name;
    //DB의 datetime 타입과 연동이 잘되는 자료형
    private Timestamp b_date;
    private int b_views;
}
