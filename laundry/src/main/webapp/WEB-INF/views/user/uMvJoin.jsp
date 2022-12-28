<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Logo</title>
    <link rel="stylesheet" href="css/user/join.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
    <script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
</head>
<body>
<div class="member">
    <!-- 1. 로고 -->
    <%--    <img class="logo" src="./images/images2/logo-naver.png">--%>

    <!-- 2. 필드 -->
    <form action="userInsert" method="post" name="uMvJoin"
          onsubmit="return check()">

        <div class="field">
            <b>아이디</b>
            <span class="placehold-text"><input type="text" id="idin" name="u_id" required></span>
            <span id="idCheck"></span>
        </div>

        <div class="field">
            <b>비밀번호</b>
            <input class="userpw" type="password" name="u_pass" id="pwck1" required>
        </div>

        <div class="field">
            <b>비밀번호 재확인</b>
            <input class="userpw-confirm pw2" type="password" name="u_pass2" id="pwck2" required>
            <span id="pwdCheck"></span>
        </div>

        <div class="field">
            <b>이름</b>
            <input type="text" name="u_name" required>
        </div>

        <div class="field tel-number">
            <b>주소</b>
            <div>
                <input type="text" id="sample6_postcode" placeholder="우편번호" required>
                <input type="button" onclick="sample6_execDaumPostcode()" value="우편번호 찾기">
            </div>
            <input type="text" id="sample6_address" placeholder="주소" name="u_firstaddr" required><br>
            <input type="text" id="sample6_detailAddress" placeholder="상세주소" name="u_secaddr" required>
            <input type="text" id="sample6_extraAddress" placeholder="참고항목">
        </div>

        <div class="field tel-number">
            <b>연락처</b>
            <div>
                <input type="tel" placeholder="전화번호 입력" name="u_phoneNum" required>
            </div>
        </div>
        <!-- 6. 가입하기 버튼 -->
        <input type="submit" value="가입하기">
    </form>

    <!-- 7. 푸터 -->
    <div class="member-footer">
        <div>
            <a href="#none">이용약관</a>
            <a href="#none">개인정보처리방침</a>
            <a href="#none">책임의 한계와 법적고지</a>
            <a href="#none">회원정보 고객센터</a>
        </div>
        <span><a href="#none">Laundry Corp.</a></span>
    </div>

</div>
</body>
<script src="/js/user/userJoin.js"></script>
<script>
    var ckOk = false;//false일 경우 가입 프로세스 실행 X (ID)
    let ckck = false;//false일 경우 가입 프로세스 실행 x (PWD)
    $("#idin").keyup(function (){
        let id = $('#idin').val();
        console.log(id);

        let sendObj = {"data" : id};
        $.ajax({
            url : "/idCheck",
            type : "post",
            data : sendObj,
            success : function (result){
                if (id == ""){
                    $("#idCheck").html('아이디를 입력해주세요').css("color", "black");
                    ckOk = false;
                }
                else if (result == "ok"){
                    $("#idCheck").html('사용할 수 있는 아이디입니다.').css("color", "#2fb380");
                    ckOk = true;
                } else {
                    $("#idCheck").html('이미 사용중인 아이디입니다.').css("color", "#dc3545");
                    ckOk = false;
                }
            },
            error : function (error){
                alert("서버요청 실패");
                ckOk = false;
            }
        });
    });//id 중복 체크(비동기) end

    $(".pw2").keyup(function (){
        let pass1 = $("#pwck1").val();
        let pass2 = $("#pwck2").val();

        if (pass1 != "" || pass2 != ""){
            if (pass1 == pass2){
                $("#pwdCheck").html('비밀번호가 일치합니다').css("color", "#2fb380");
                ckck = true;
            } else {
                $("#pwdCheck").html('비밀번호가 불일치합니다').css("color", "#dc3545");
                ckck = false;
            }
        }//if end
    });//pw2 keyup end


    function check(){
        if (ckOk == false){
            return false;
        }
        if (ckck == false){
            return false;
        }



        var frm = document.uMvJoin;
        console.log(frm);

        var length = frm.length - 1;//submit 버튼 제외
        console.log(length);

        for(var i = 0; i < length; i++){
            if(frm[i].value == "" || frm[i].value == null){
                alert(frm[i].title + "참고항목을 입력주세요");
                frm[i].focus();
                return false;
            }
        }
        alert("회원가입이 완료되었습니다");

        return true;//모든 칸이 다 채워졌고, 중복 체크도 한 상태
    }//빈공간 체크 end
</script>
</html>
