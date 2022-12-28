package com.jsframe.laundry.dto;

import lombok.Data;

@Data
public class ListDto {
    private String colname; //bo_title, bo_contents 중 저장
    private String keyword; //검색어
    private int pageNum;
    private int listCnt;
}
