package com.jsframe.laundry.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class ReplyDto {
    private int r_num;//댓글 번호(기본키)
    private int r_bnum;//게시글 번호(검색)
    private String r_contents;//내용
    private String r_id;//작성자 ID(로그인한 ID)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "Asia/Seoul")
    private Timestamp r_date;
}
