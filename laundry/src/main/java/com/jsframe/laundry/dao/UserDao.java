package com.jsframe.laundry.dao;

import com.jsframe.laundry.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    //회원 가입
    public void userInsert(UserDto user);

    //id체크 -> 회원가입 중복체크
    public int idCheck(String id);

    //비번구하고 -> 로그인
    String pwdSelect(String u_id);

    //회원 정보 구하기
    UserDto userSelect(String u_id);
}
