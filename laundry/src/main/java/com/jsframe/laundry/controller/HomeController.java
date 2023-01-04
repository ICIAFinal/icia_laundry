package com.jsframe.laundry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    //메인페이지
    @GetMapping("/")
    public String index() {
        return "index";
    }

    //로그인 페이지
    @GetMapping("login")
    public String login() {
        return "user/login";
    }

    //회원가입 페이지
    @GetMapping("uMvJoin")
    public String uMvJoin() {
        return "user/uMvJoin";
    }

    @GetMapping("order")
    public String order(){
        return "order/order";
    }

    @GetMapping("boardList")
    public String boardList(){
        return "board/boardList";
    }
}
