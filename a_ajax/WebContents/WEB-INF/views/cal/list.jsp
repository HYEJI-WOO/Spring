<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

<div class="container">
<h2>${month}월</h2>
	<table class="table table-bordered toDoCalendar">
		<tr>	
			<th style="color:red">일</th>
			<th>월</th>
			<th>화</th>
			<th>수</th>
			<th>목</th>
			<th>금</th>
			<th style="color:blue">토</th>
		</tr>
		<c:forEach items="${dateList}" var="date">
			<c:if test="${date.dayOfWeek==1}">
				<tr>
			</c:if>
			<c:if test="${date.month eq month}">
				<%-- <td>
				<c:if test="${date.dayOfWeek==1}">
					<a href="${contextPath}/cal?date=${date}" style="color: red;">${date.dayOfMonth}</a>
				</c:if>
				<c:if test="${date.dayOfWeek!=1}">
					<a href="${contextPath}/cal?date=${date}">${date.dayOfMonth}</a>
				</c:if> 
				</td> --%>
				
					<td>
						<!-- 일정 있음 -->
						<c:if test="${not empty date.toDoList}">
							<a class="day_on" href="${contextPath}/cal?date=${date}">${date.dayOfMonth}
								<div>
									<c:forEach items="${date.toDoList}" var="todo">
										<span>${todo.memo}</span><br>
									</c:forEach>
								</div>
							</a>
						</c:if>
						<!-- 일정 없음 -->
						<c:if test="${empty date.toDoList}">
							<a href="${date}" class="openWriteForm">${date.dayOfMonth}<br>
								<span>일정없음</span>
							</a>
						</c:if>
					</td>
			</c:if>
			<c:if test="${date.month ne month}">
					<td></td>
				</c:if>
			<c:if test="${date.dayOfWeek==7}">
				</tr>
			</c:if>
		</c:forEach>
	</table>
</div>
<!-- The Modal -->
<div class="modal" id="writeToDoForm">
  <div class="modal-dialog">
 	<form action="${contextPath}/todo/toDoWrite" method="post">
	    <div class="modal-content">
	
	      <!-- Modal Header -->
	      <div class="modal-header">
	      
	        <h4 class="modal-title">Modal Heading</h4>
	        <button type="button" class="close" data-dismiss="modal">&times;</button>
	      </div>
	
	      <!-- Modal body -->
	      <div class="modal-body">
	      	<div class="form-group">
				<input type="hidden" name="toDoDate" class="toDoDate">
				<input type="text" name="memo" class="form-control memo">
			</div>
	      </div>
	
	      <!-- Modal footer -->
	      <div class="modal-footer">
	        <button class="btn btn-primary">저장</button>
	        <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
	      </div>
	    </div>
    </form>
  </div>
</div>

<script>
$('.openWriteForm').click(function(e) {
	e.preventDefault();
	let toDoDate = $(this).attr('href');
	$('#writeToDoForm .modal-title').html(toDoDate);
	$('#writeToDoForm .toDoDate').val(toDoDate);
	$('#writeToDoForm .memo').val('');
	$('#writeToDoForm').modal();
})
</script>

<%@ include file="../layout/footer.jsp" %>