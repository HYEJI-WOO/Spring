<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

<div class="container">
	<h1>글쓰기</h1>
	<form action="${contextPath}/board/write" method="post" enctype="multipart/form-data">
		<input type="text" name="title" placeholder="제목" class="form-control">
		<textarea rows="10" cols="" name="content" class="form-control"></textarea>
		<input type="text" name="writer" placeholder="작성자" class="form-control">
		<input type="file" name="attachFile" class="form-control">
		<button class="btn btn-info">등록</button>
	</form>
	
	
</div>

<%@ include file="../layout/footer.jsp" %>