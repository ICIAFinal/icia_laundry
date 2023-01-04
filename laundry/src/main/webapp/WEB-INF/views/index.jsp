<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Laundry</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- (index) css main-->
    <link rel="stylesheet" href="css/index/index.css">

    <script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
    <!-- Google fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Jost:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

    <!-- (index)Vendor CSS Files -->
    <link href="/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
  <header>
    <jsp:include page="../tags/hf/header.jsp"/>
  </header>

    <!-- 슬라이드 -->
    <!-- ======= Hero Section ======= -->
    <section id="hero">
        <div id="heroCarousel" data-bs-interval="3000" class="carousel slide carousel-fade" data-bs-ride="carousel">

            <ol class="carousel-indicators" id="hero-carousel-indicators"></ol>

            <div class="carousel-inner" role="listbox">

                <!-- Slide 1 -->
                <div class="carousel-item active" style="background-image: url(images/mokoko.jpeg)">
                    <div class="carousel-container">
                        <div class="container">
                            <h2 class="animate__animated animate__fadeInDown"> <span>모코코</span></h2>
                            <p class="animate__animated animate__fadeInUp">기분 좋은 향기가 솔솔 피어난다.</p>
<%--                            <a href="#about" class="btn-get-started animate__animated animate__fadeInUp scrollto">Read More</a>--%>
                        </div>
                    </div>
                </div>

                <!-- Slide 2 -->
                <div class="carousel-item" style="background-image: url(images/mokoko.jpeg)">
                    <div class="carousel-container">
                        <div class="container">
                            <h2 class="animate__animated animate__fadeInDown">모코코 2</h2>
                            <p class="animate__animated animate__fadeInUp">기분 좋은 향기가 솔솔 피어난다.</p>
<%--                            <a href="#about" class="btn-get-started animate__animated animate__fadeInUp scrollto">Read More</a>--%>
                        </div>
                    </div>
                </div>

                <!-- Slide 3 -->
                <div class="carousel-item" style="background-image: url()">
                    <div class="carousel-container">
                        <div class="container">
                            <h2 class="animate__animated animate__fadeInDown">이미지 3</h2>
                            <p class="animate__animated animate__fadeInUp">내용 3</p>
<%--                            <a href="#about" class="btn-get-started animate__animated animate__fadeInUp scrollto">Read More</a>--%>
                        </div>
                    </div>
                </div>

            </div>

        </div>
    </section>
    <!-- End Hero -->

<footer>
    <jsp:include page="../tags/hf/footer.jsp"/>
</footer>

  <!-- (index)main JS Files -->
  <script src="/js/index/index.js"></script>

  <!-- (index)Vendor JS Files -->
  <script src="/vendor/aos/aos.js"></script>
  <script src="/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="/vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="/vendor/swiper/swiper-bundle.min.js"></script>


</body>
<script>

</script>
</html>
