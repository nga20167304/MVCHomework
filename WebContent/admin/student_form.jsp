<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<div align="center">
		<h2>Create New Student</h2>
	
	<form action="create_student" method="post" id="categoryStudent">
		<table class="form">
			<tr>
				<td align="right">Id:</td>
				<td align="left"><input type="text" id="id"
					name="id" size="20" value="" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td align="right">Name:</td>
				<td align="left"><input type="text" id="name" name="name"
					size="20" value="" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td align="right">Year:</td>
				<td align="left"><input type="text" id="year"
					name="year" size="20" value="" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td align="right">Gender:</td>
				<td align="left"><input type="text" id="gender"
					name="gender" size="20" value="" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td align="right">Date:</td>
				<td align="left"><input type="text" id="date"
					name="date" size="20" value="" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<button type="submit"> Save</button>&nbsp;&nbsp;&nbsp;
				<button id="cancelButton">Cancel</button>
				</td>
			</tr>
			
		</table>
	
	</form>
	</div>
</body>
<script type="text/javascript">
$(document).ready(function(){
	$("#categoryStudent").validate({
		rules:{
			id:"required",
			name:"required",
			year:"required",
			gender:"required",
			date:"required"		
		},
		messages:{
			id:"Please enter id of student",
			name:"Please enter name of student",
			year:"Please enter name of student",
			gender:"Please enter gender of student",
			date:"Please enter date of student"
		}
	});
	$("#cancelButton").click(function(){
		history.go(-1);
	});
});
</script>

</html>