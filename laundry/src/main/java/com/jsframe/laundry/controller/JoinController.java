package com.jsframe.laundry.controller;

import com.jsframe.laundry.dto.UserDto;
import com.jsframe.laundry.service.join.JoinService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
public class JoinController {
    private static final Logger logger = LoggerFactory.getLogger(JoinController.class);

    @Autowired
    private JoinService jServ;

    //user 회원가입
    @PostMapping("/userInsert")
    public String userInsert(UserDto user,
                             RedirectAttributes rttr){
        logger.info("userInsert()");

        String view = jServ.userInsert(user, rttr);
        return view;
    }

    //    id중복 검사
    @PostMapping(value = "/idCheck",
            produces = "application/text; charset=UTF-8")
    @ResponseBody
    public String idCheck(String data){
        logger.info("idCheck() - u_id : " + data);
        String res = jServ.idCheck(data);
        return res;
    }

    //    user 로그인
    @PostMapping("/userLogin")
    public String userLoginProc(UserDto user, HttpSession session,
                                RedirectAttributes rttr){
        logger.info("userLoginProc()");

        String view = jServ.loginProc(user, session, rttr);

        return view;
    }
}
