<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/user/loginEx.css">
    <script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>

</head>
<body style="background-color: rgb(240,233,181)">
<%--header--%>
<section>
<%--login tab--%>
    <div class="login-wrap" id="login-main">
<%--login top(text)--%>
        <div class="login-top">
            <h4>로그인</h4>
        </div>
<%--login main(form)--%>
        <div class="login-html">
        <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">User</label>
        <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Driver</label>
        <div class="login-form">
          <div class="sign-in-htm">
              <form action="userLogin" method="post">
                <div class="group">
                  <label for="user" class="label">ID</label>
                  <input name="u_id" type="text" class="input" style="color:#000000;" required>
                </div>
                <div class="group">
                  <label for="pass" class="label">Password</label>
                  <input name="u_pass" type="password" class="input" data-type="password"style="color:#000000;" required>
                </div>
                <div class="group">
                  <input type="submit" class="button" value="로그인">
                </div>
              </form>
            <div class="login_findmenu" style="display:block">
              <a href="#">아이디 찾기</a>
              <a href="#">비밀번호 찾기</a>
              <a href="uMvJoin" class="right">회원가입</a>
            </div>

            <hr>
<%--소셜 로그인--%>
            <div id="snslogin">
              <ul class="snsloginbox">
                <li id="naver_id_login" class="btn_naver">
                  <a href="#">네이버 로그인</a>
                </li>
                <li class="btn_kakao">
                  <a href="#">카카오 로그인</a>
                </li>
              </ul>
            </div>
          </div>
<%--기사 로그인--%>
          <div class="sign-up-htm">
            <div class="group">
              <label for="user" class="label">Driver ID</label>
              <input id="user" type="text" class="input">
            </div>
            <div class="group">
              <label for="pass" class="label">Password</label>
              <input id="pass" type="password" class="input" data-type="password">
            </div>
            <div class="group">
              <input type="submit" class="button" value="로그인">
            </div>
              <div class="login_findmenu" style="display:block">
                  <a href="#">아이디 찾기</a>
                  <a href="#">비밀번호 찾기</a>
                  <a href="" class="right">회원가입</a>
              </div>
              <hr>
          </div>
        </div>
      </div>
    </div>
</section>
</body>
<script>
    $(function(){
        //메시지 출력 부분
        let msg = "${msg}";
        if(msg != ""){
            alert(msg);
        }
    });
</script>
</html>
