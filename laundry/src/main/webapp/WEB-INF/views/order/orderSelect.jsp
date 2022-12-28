<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="css/order/orderMake.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
<script type="text/javascript">


    //select box
</script>
<div class="orderInfo-order">
    <div class="order-select-wrap">
        <select class="mulit-select" name="order-item" id="order-item">
            <option value="" selected>선택하세요</option>
            <c:forEach var="vo" items ="${list}">
                <option value="${vo.product_number}">${vo.product_name} </option>
            </c:forEach>
        </select>
        <div class="addBtnWrap"><button class="addBtn" id="orderAddBtn">추가</button>&nbsp;<i class="fa-solid fa-circle-plus" id="plusI"></i></div>
    </div>
</div>
</body>
