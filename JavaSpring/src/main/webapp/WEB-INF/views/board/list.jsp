<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;" charset=UTF-8>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
<title>Board List</title>
</head>

<body>
	<nav class="navbar navbar-expand-sm bg-white navbar-dark">
  		<div class="container">
			<form class="form-inline" style="display:inline-block;">
			  <select class="form-control" name="type" >
			    <option value="0" <c:out value="${type==0? 'selected':''}"/>>search</option>
			    <option value="1" <c:out value="${type==1? 'selected':''}"/>>title</option>
			    <option value="2" <c:out value="${type==2? 'selected':''}"/>>author</option>
			    <option value="3" <c:out value="${type==3? 'selected':''}"/>>contents</option>
			  </select>
			    <input class="form-control mr-sm-2" type="text"  value="${search }" name="search">
			    <button class="btn btn-success" type="submit">Search</button>
	  		</form>
		</div>
	</nav>
	
	
	<div class="container">	
		<br><br>
		<h2 style="text-align:center; font:Courier10 BT Bold">Board</h2><br><br>
		
		<div> 	
			<table class="table table-hover">
			    <thead>
					<tr>
			        	<th style="width:20%;">번호</th>
			        	<th style="width:60%;">제목</th>
			        	<th style="width:20%;">작성자</th>
			      	</tr>
			    </thead>
			    
			    <tbody>
			    	<c:forEach items="${list}" var="board">
			    	<tr>
		    			<td>${board.number}</td>
			        	<td>${board.title}</td>
			        	<td>${board.author}</td>
			        </tr>
			        </c:forEach>
			    </tbody>
			  </table>
			  <ul class="pagination justify-content-center">
			    <c:if test="${pageMaker.prev}">
			        <li class="page-item">
			            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${pageMaker.startPage-1}">Prev</a>
			        </li>
			    </c:if>
			    <c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage}" var="index">
			        <li class="page-item">
			            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${index}">${index}</a>
			        </li>
			    </c:forEach>
			    <c:if test="${pageMaker.next}">
			        <li class="page-item">
			            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${pageMaker.endPage+1}">Next</a>
			        </li>
			    </c:if>
			</ul>
		  </div> 
	</div>
</body>
</html>




