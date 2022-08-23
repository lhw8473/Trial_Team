<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="apple-touch-icon" href="assets/img/apple-icon.png">
    <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">

    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/templatemo.css">
    <link rel="stylesheet" href="assets/css/custom.css">

    <!-- Load fonts style after rendering the layout styles -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;200;300;400;500;700;900&display=swap">
    <link rel="stylesheet" href="assets/css/fontawesome.min.css">
<!--
    
TemplateMo 559 Zay Shop
https://templatemo.com/tm-559-zay-shop
-->
<style>
tr{
  border: 1px solid black;
}
td{
  border: 1px solid black;
}
th{
  border: 1px solid black;
}
.rc-table{
  display: flex;
  justify-content: center;
}
</style>
</head>
<body>

	<%@include file="../include/header.jsp" %>
	<section class="container py-5">
  <div class="announcement-detail-title">
    <h3>공고 상세보기</h3>
  </div>
  <div class="rc-table">
    <style type="text/css">
      .tg  {border-collapse:collapse;border-spacing:0;}
      .tg td{border-style:solid;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;
        padding:10px 5px;word-break:normal;}
      .tg th{border-style:solid;font-family:Arial, sans-serif;font-size:14px;font-weight:normal;
        overflow:hidden;padding:10px 5px;word-break:normal;}
      .tg .tg-sg5v{border-color:inherit;font-size:100%;text-align:left;vertical-align:top}
      .tg .tg-8jvv{border-color:inherit;font-size:15px;text-align:left;vertical-align:top}
      .tg .tg-0pky{border-color:inherit;text-align:left;vertical-align:top}
      </style>
      <table class="tg">
      <thead>
        <tr>
          <th class="tg-8jvv">신청인</th>
          <th class="tg-0pky" colspan="2">김고길동</th>
          <th class="tg-0pky">주민등록번호</th>
          <th class="tg-0pky" colspan="2">010427-1948372</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td class="tg-0pky" rowspan="2">평점항목</td>
          <td class="tg-0pky" rowspan="2">세부항목</td>
          <td class="tg-sg5v" rowspan="2">배점</td>
          <td class="tg-0pky" colspan="3">내용</td>
        </tr>
        <tr>
          <td class="tg-0pky">구분</td>
          <td class="tg-0pky">기준</td>
          <td class="tg-0pky">배점</td>
        </tr>
        <tr>
          <td class="tg-0pky" rowspan="9">기본평점</td>
          <td class="tg-0pky" rowspan="6">경력 점수</td>
          <td class="tg-0pky" rowspan="6"># 배점<br>(4 + 3 점으로 7점)</td>
          <td class="tg-0pky" rowspan="3">통산경력</td>
          <td class="tg-0pky"><input type="radio" name="rc-group1" value="5" disabled style="margin-right: 10px;">10년 이상</td>
          <td class="tg-0pky">5</td>
        </tr>
        <tr>
          <td class="tg-0pky"><input type="radio" name="rc-group1" value="4" disabled style="margin-right: 10px;">5~10년 이상</td>
          <td class="tg-0pky">4</td>
        </tr>
        <tr>
          <td class="tg-0pky"><input type="radio" name="rc-group1" value="3" disabled style="margin-right: 10px;">5년 미만</td>
          <td class="tg-0pky">3</td>
        </tr>
        <tr>
          <td class="tg-0pky" rowspan="3">관내경력</td>
          <td class="tg-0pky"><input type="radio" name="rc-group2" value="5" disabled style="margin-right: 10px;">10년 이상</td>
          <td class="tg-0pky">5</td>
        </tr>
        <tr>
          <td class="tg-0pky"><input type="radio" name="rc-group2" value="4" disabled style="margin-right: 10px;">5~10년 이상</td>
          <td class="tg-0pky">4</td>
        </tr>
        <tr>
          <td class="tg-0pky"><input type="radio" name="rc-group2" value="3" disabled style="margin-right: 10px;">5년 미만</td>
          <td class="tg-0pky">3</td>
        </tr>
        <tr>
          <td class="tg-0pky" rowspan="2">사무소 소재지</td>
          <td class="tg-0pky" rowspan="2">3</td>
          <td class="tg-0pky" colspan="2"><input type="radio" name="rc-group3" value="5" disabled style="margin-right: 10px;">관내사무소</td>
          <td class="tg-0pky">5</td>
        </tr>
        <tr>
          <td class="tg-0pky" colspan="2"><input type="radio" name="rc-group3" value="3" disabled style="margin-right: 10px;">관외사무소</td>
          <td class="tg-0pky">3</td>
        </tr>
        <tr>
          <td class="tg-0pky" colspan="5">신청인 사무소주소지: #{신청인 주소지}</td>
        </tr>
        <tr>
          <td class="tg-0pky" rowspan="3">인성평가</td>
          <td class="tg-0pky" colspan="2" rowspan="3"></td>
          <td class="tg-0pky"></td>
          <td class="tg-0pky"><input type="radio" name="rc-group4" value="5" disabled style="margin-right: 10px;">우수</td>
          <td class="tg-0pky">5</td>
        </tr>
        <tr>
          <td class="tg-0pky"></td>
          <td class="tg-0pky"><input type="radio" name="rc-group4" value="4" disabled style="margin-right: 10px;">평균</td>
          <td class="tg-0pky">4</td>
        </tr>
        <tr>
          <td class="tg-0pky"></td>
          <td class="tg-0pky"><input type="radio" name="rc-group4" value="3" disabled style="margin-right: 10px;">미흡</td>
          <td class="tg-0pky">3</td>
        </tr>
        <tr>
          <td class="tg-0pky" rowspan="2">면접</td>
          <td class="tg-0pky" colspan="2" rowspan="2"></td>
          <td class="tg-0pky"></td>
          <td class="tg-0pky"><input type="radio" name="rc-group5" value="5" disabled style="margin-right: 10px;">우수</td>
          <td class="tg-0pky">5</td>
        </tr>
        <tr>
          <td class="tg-0pky"></td>
          <td class="tg-0pky"><input type="radio" name="rc-group5" value="3" disabled style="margin-right: 10px;">미흡</td>
          <td class="tg-0pky">3</td>
        </tr>
        <tr>
          <td class="tg-0pky" rowspan="4">자격증점수</td>
          <td class="tg-0pky" colspan="2" rowspan="4"></td>
          <td class="tg-0pky"></td>
          <td class="tg-0pky"></td>
          <td class="tg-0pky">2.5</td>
        </tr>
        <tr>
          <td class="tg-0pky"></td>
          <td class="tg-0pky">혜원이 운전면허증</td>
          <td class="tg-0pky">2.5</td>
        </tr>
        <tr>
          <td class="tg-0pky"></td>
          <td class="tg-0pky">혜원이 주민등록증</td>
          <td class="tg-0pky">2.5</td>
        </tr>
        <tr>
          <td class="tg-0pky"></td>
          <td class="tg-0pky">혜원이 굴삭기자격증</td>
          <td class="tg-0pky">2.5</td>
        </tr>
        <tr>
          <td class="tg-0pky">합계</td>
          <td class="tg-0pky" colspan="2"></td>
          <td class="tg-0pky" colspan="3"></td>
        </tr>
        <tr>
          <td class="tg-0pky">감정인 평정표</td>
          <td class="tg-0pky" colspan="2"></td>
          <td class="tg-0pky" colspan="3"></td>
        </tr>
        <tr>
          <td class="tg-0pky">감정인 평정표</td>
          <td class="tg-0pky">심사위원 추천</td>
          <td class="tg-0pky"></td>
          <td class="tg-0pky" colspan="3">(최대 7점)</td>
        </tr>
        <tr>
          <td class="tg-0pky">최종점수(종합)</td>
          <td class="tg-0pky" colspan="2"></td>
          <td class="tg-0pky" colspan="3">'--점/총점</td>
        </tr>
      </tbody>
      </table>
  </div>
</section>
	<%@include file="../include/footer.jsp" %>

</body>
</html>