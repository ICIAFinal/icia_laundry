package com.jsframe.laundry.controller;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log
public class controller {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    //    로그인 페이지 이동
    @GetMapping("login")
    public String login(){
        return "user/login";
    }

    //    회원가입 페이지 이동
    @GetMapping("uMvJoin")
    public String uMvJoin(){
        return "user/uMvJoin";
    }

    @GetMapping("/order")
    public String order(){
        log.info("order()");
        return "order/order";
    }
    @GetMapping("boardList")
    public String boardList(){
        return "board/boardList";
    }

}

