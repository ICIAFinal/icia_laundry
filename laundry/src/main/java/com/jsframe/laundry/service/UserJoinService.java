package com.jsframe.laundry.service;

import com.jsframe.laundry.dao.UserDao;
import com.jsframe.laundry.dto.UserDto;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Service
@Log
public class UserJoinService {
    @Autowired
    private UserDao uDao;

    private BCryptPasswordEncoder pwdEncoder = new BCryptPasswordEncoder();
    private ModelAndView mv;
    public String userInsert(UserDto user, RedirectAttributes rttr) {

        String view = null;
        String msg = null;

//        비밀번호 암호화
        String encpwd = pwdEncoder.encode(user.getU_pass());
        log.info("encpwd : " + encpwd);
        user.setU_pass(encpwd);

        try{
            uDao.userInsert(user);

            view = "redirect:login";
            msg = "회원가입에 성공하셨습니다";
        } catch (Exception e){
            e.printStackTrace();

            view = "redirect:uMvJoin";
            msg = "회원가입 실패 하셨습니다.";
        }
        rttr.addFlashAttribute("msg", msg);

        return view;
    }

    public String idCheck(String id) {
        String res = null;

        int cnt = uDao.idCheck(id);

        if (cnt == 0){
            res = "ok";
        }
        else {
            res = "not";
        }
        return res;
    }

    public String loginProc(UserDto user, HttpSession session, RedirectAttributes rttr) {
        String view = null;
        String msg = null;

        //회원 비밀번호 먼저 구하기
        String encPwd = uDao.pwdSelect(user.getU_id());

        if (encPwd != null){
            //존재 아이디
            if (pwdEncoder.matches(user.getU_pass(), encPwd)){

                user = uDao.userSelect(user.getU_id());
                session.setAttribute("user", user);

                view = "redirect:/";
                msg = "로그인 성공!";
            }
            else {
                view = "redirect:login";
                msg = "비밀번호 오류";
            }
        }
        else {
            //아이디가 없을 경우
            view = "redirect:login";
            msg = "없는 아이디";

        }
        rttr.addFlashAttribute("msg", msg);

        return view;
    }
}
