<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

<div class="container">
	<div>
		<ul>
			<li>이름 : 김철수, 휴대폰번호 : 00011112222</li>
			<li>이름 : 박철수, 휴대폰번호 : 00011113333</li>
			<li>이름 : 황철수, 휴대폰번호 : 00011114444</li>
		</ul>
	</div>
	<button class="addForm">폼추가</button>
	<button class="delForm">폼삭제</button>
	
	<form method="post" class="contactForm">
		<div class="contactDiv">
			이름 : <input type="text" name="contactList[0].name" class="name"><br>
			휴대폰번호 : <input type="text" name="contactList[0].phoneNumber" class="phoneNumber">
		</div>
	</form>
	<button>전송</button>
	

<%@ include file="../layout/footer.jsp" %>

<script>
$(function(){
	let numberDiv = 1;
	$('.addForm').on('click', function(){
		if(numberDiv >= 6){
			alert('추가X')
			return;
		}
		let contactDiv = $('.contactDiv').eq(0).clone();
		let nameInput = contactDiv.find('.name')
		let phoneInput = contactDiv.find('.phoneNumber')
		let n = nameInput.attr('name').replace('0', numberDiv)
		let p = nameInput.attr('name').replace('0', numberDiv)
		nameInput.attr('name', n)
		phoneInput.attr('name', p)
		$('.contactForm').append(contactDiv)
		// $('.contactForm').append(contactDiv)
		numberDiv++
	})	
	$('.delForm').on('click', function(){
		if(numberDiv <= 1){
			alert('삭제X')
			return
		}
	$('.contactDiv').eq(numberDiv-1).remove()
	numberDiv--;
	})
});
</script>