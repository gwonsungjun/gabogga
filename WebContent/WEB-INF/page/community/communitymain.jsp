<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 헤더 -->
<%@ include file="/page/template/header.jsp" %>	
<!-- 여기서부터 우리가 꾸미기-->
<div class="row">
<div class="col-sm-3 sidenav">
<%@ include file="/WEB-INF/page/community/boardmenu.jsp" %>
</div>
</div>
<!-- 여기서부터 게시판 메인 꾸미기 -->
	<div class="col-sm-9 main">			
			<img src="${root}/page/community/communitymain.png" width="100%">	
	</div>
	
	
<!-- 여기까지가 우리가 꾸밀부분 -->
<!-- 푸터 -->
<%@ include file="/page/template/footer.jsp" %>	