<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

<div class="container">
	<h1>게시글 목록</h1>
	
	<table class="table">
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>첨부파일</td>
		</tr>
		<c:forEach items="${list}" var="b">
			<tr>
			<td>${b.bno}</td>
			<td>
				<a href="${contextPath}/board/detail?bno=${b.bno}">${b.title}</a>
			</td>
			<td>${b.content}</td>
			<td>${b.fileName}</td>
		</tr>
		</c:forEach>
	</table>
	
	<button class="btn btn-info"><a href="${contextPath}/board/write">글쓰기</a></button>
	
	
</div>

<%@ include file="../layout/footer.jsp" %>