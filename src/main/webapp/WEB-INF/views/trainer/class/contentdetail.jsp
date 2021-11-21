<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<c:url var="contentdetailURL" value="/trainer/classoverview/edit"/>
<c:url var="classoverviewURL" value="/trainer/manageclass/class-overview"/>
<c:url var="asmAPI" value="/api/asm"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<div id="content">
		<div id="breadcrumbs">
			<ul class="breadcrumb">
				<li><a href="trainer-index.html">Home</a></li>
				<li><a href="manage-class.html">My Classes</a></li>
				<li><a href="class-overview.html">BHAF-1911-2.2</a></li>
				<li>Asm 1 - Topic 1</li>
			</ul>
		</div>
		<div id="main-content">
			<div class="right-content">
				<div class="nav-tab">
					<button class="btn tablink first-tab"
						onclick="openTab(event,'content-overview')">Content
						Overview</button>
				</div>
				<div id="content-overview" class="tab-content content-overview">
					<h2>${model.asmName}</h2>
					<table id="asm-info">
						<tr>
							<td>Due</td>
							<td>Saturday, 23 January 2021, 11:59 PM</td>
						</tr>
						<tr>
							<td>Submitsion Type</td>
							<td>.pdf</td>
						</tr>
						<tr>
							<td>Paid</td>
							<td>30/30</td>
						</tr>
					</table>
					<c:if test="${not empty message}">
						<div class="alert alert-${alert}">
  							<strong>${message}!</strong>
						</div>
			      	</c:if>
					<div class="content-overview-btn">
						<button class="btn btn-edit" id="btn-modal" type="button">
							<i class="fas fa-pen"></i> Edit
						</button>
						<div class="overlay" id="overlay"></div>
						<div class="modal" id="modal">
							<button class="modal-close-btn" id="close-btn">
								<i class="fa fa-times" title="Close"></i>
							</button>
							<form:form role="form" id="formSubmitAsm"
								modelAttribute="model">
								<h4>Assignment Name</h4>
								<form:input cssClass="input-info edit-input" path="asmName" />
								<h4>Assignment Brief</h4>
								<form:input cssClass="input-info edit-input" path="asmBrief" />
								<h4>Submission Type</h4>
								<form:input cssClass="input-info edit-input" path="subType" />
								<h4>Due</h4>
								<form:input type="date" cssClass="input-info edit-input" path="asmDateDue"/>
								<form:input type="time" cssClass="input-info edit-input" path="asmTimeDue"/>
								<h4>Limit Item</h4>
								<form:input cssClass="input-info edit-input" path="limitItem" />
								<h4>Class Name</h4>
								<form:select cssClass="input-info edit-input" path="classId">
									<form:options items="${classlist}" />
								</form:select>
								<br>
								<form:hidden path="asmId" id="asmId"/>
								<button type="button" id="btnAddOrUpdateAsm" title="Edit"
									class="btn-edit-asm">Edit</button>
							</form:form>
						</div>
						<button id="btnDeleteAsm" class="btn btn-2" type ="button" onclick="warningBeforeDelete()">
							<i class="fas fa-trash"></i> Delete
						</button>
					</div>
					<table class="sub-asm">
						<tr>
							<th>Trainee ID</th>
							<th>Trainee's Name</th>
							<th>Last modified</th>
							<th>Submisstion Type</th>
							<th>Status</th>
							<th></th>
						</tr>
						<tr>
							<td colspan="6" class="search-sub-asm-bar">
								<form action="">
									<input type="text" placeholder="Search Trainee Name"
										class="input-info search-sub-asm">
									<button type="submit" class="btn-search-sub-asm icon">
										<i class="fas fa-search"></i>
									</button>
								</form>
							</td>
						</tr>
						<tr>
							<td>SV1</td>
							<td>Lee Sin</td>
							<td>Saturday, 23 January 2021, 11:59 PM</td>
							<td>.pdf</td>
							<td>not graded yet</td>
							<td><a href="view-sub-asm.html"><i class="fas fa-eye"></i>
									View</a></td>
						</tr>
						<tr>
							<td>SV1</td>
							<td>Lee Sin</td>
							<td>Saturday, 23 January 2021, 11:59 PM</td>
							<td>.pdf</td>
							<td>not graded yet</td>
							<td><a href="view-sub-asm.html"><i class="fas fa-eye"></i>
									View</a></td>
						</tr>
						<tr>
							<td>SV1</td>
							<td>Lee Sin</td>
							<td>Saturday, 23 January 2021, 11:59 PM</td>
							<td>.pdf</td>
							<td>not graded yet</td>
							<td><a href=""><i class="fas fa-eye"></i> View</a></td>
						</tr>
					</table>
				</div>
			</div>
			<div id="sidebar">
				<div id="sidebar-nav-class">
					<div class="events-title">
						<i class="fas fa-graduation-cap"></i> <span>Class Navigation</span>
					</div>
					<div>
						<button class="dropdown-btn">
							Class 1 <i class="fa fa-caret-down"></i>
						</button>
						<div class="dropdown-container">
							<a href="#">Link 1</a> <a href="#">Link 2</a> <a href="#">Link
								3</a>
						</div>
					</div>
					<div>
						<button class="dropdown-btn">
							Class 1 <i class="fa fa-caret-down"></i>
						</button>
						<div class="dropdown-container">
							<a href="#">Link 1</a> <a href="#">Link 2</a> <a href="#">Link
								3</a>
						</div>
					</div>
					<div>
						<button class="dropdown-btn">
							Class 1 <i class="fa fa-caret-down"></i>
						</button>
						<div class="dropdown-container">
							<a href="#">Link 1</a> <a href="#">Link 2</a> <a href="#">Link
								3</a>
						</div>
					</div>
					<div>
						<button class="dropdown-btn">
							Class 1 <i class="fa fa-caret-down"></i>
						</button>
						<div class="dropdown-container">
							<a href="#">Link 1</a> <a href="#">Link 2</a> <a href="#">Link
								3</a>
						</div>
					</div>
					<div>
						<button class="dropdown-btn">
							Class 1 <i class="fa fa-caret-down"></i>
						</button>
						<div class="dropdown-container">
							<a href="#">Link 1</a> <a href="#">Link 2</a> <a href="#">Link
								3</a>
						</div>
					</div>
				</div>
				<div class="events">
					<div class="events-title">
						<i class="fas fa-calendar-check"></i><span>Events</span>
					</div>
					<div>
						<div class="panel panel-danger">
							<div class="panel-heading">
								<h3 class="panel-title">
									<span class="glyphicon glyphicon-calendar"></span>  Calendar
									Events
								</h3>
							</div>
							<div class="panel-body">
								<ul class="media-list">
									<li class="media">
										<div class="media-left">
											<div class="panel panel-danger text-center date">
												<div class="panel-heading month">
													<span class="panel-title strong"> Mar </span>
												</div>
												<div class="panel-body day text-danger">23</div>
											</div>
										</div>
										<div class="media-body">
											<h4 class="media-heading">Assignment 1</h4>
											<p>Due : Saturday, 23 January 2021, 11:59 PM</p>
										</div>
									</li>
									<li class="media">
										<div class="media-left">
											<div class="panel panel-danger text-center date">
												<div class="panel-heading month">
													<span class="panel-title strong"> Jan </span>
												</div>
												<div class="panel-body text-danger day">16</div>
											</div>
										</div>
										<div class="media-body">
											<h4 class="media-heading">Assignment 1</h4>
											<p>Due : Saturday, 23 January 2021, 11:59 PM</p>
										</div>
									</li>
									<li class="media">
										<div class="media-left">
											<div class="panel panel-danger text-center date">
												<div class="panel-heading month">
													<span class="panel-title strong all-caps"> Dec </span>
												</div>
												<div class="panel-body text-danger day">8</div>
											</div>
										</div>
										<div class="media-body">
											<h4 class="media-heading">Assignment 1</h4>
											<p>Due : Saturday, 23 January 2021, 11:59 PM</p>
										</div>
									</li>
								</ul>
								<a href="#" class="btn btn-default btn-block">More Events »</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script>
		$('#btnAddOrUpdateAsm').click(function(e) {
			e.preventDefault();
			var data = {};
			var formData = $('#formSubmitAsm').serializeArray();
			$.each(formData, function (i, v) {
	            data[""+v.name+""] = v.value;
	        });
		    var asmId = $('#asmId').val();
		    if (asmId == "") {
		    	addAsm(data);
		    } else {
		    	updateAsm(data);
		    }
		});
		
		function updateAsm(data) {
			$.ajax({
	            url: '${asmAPI}',
	            type: 'PUT',
	            contentType: 'application/json',
	            data: JSON.stringify(data),
	            dataType: 'json',
	            success: function (result) {
	            	window.location.href = "${contentdetailURL}?asmId="+result.asmId+"&message=update_success";
	            },
	            error: function (error) {
	            	window.location.href = "${contentdetailURL}?asmId="+result.asmId+"&message=error_system";
	            }
	        });
		}
		
		function warningBeforeDelete() {
			swal({
			  title: "Delete Confirm",
			  text: "Are you sure you want to delete? This action cannot be undone",
			  type: "warning",
			  showCancelButton: true,
			  confirmButtonClass: "btn-success",
			  cancelButtonClass: "btn-danger",
			  confirmButtonText: "Confirm",
			  cancelButtonText: "Cancel",
			}).then(function(isConfirm) {
			  if (isConfirm) {
				  	var asmIds = $('#asmId').map(function () {
			            return $(this).val();
			        }).get();
					deleteAsm(asmIds);
			  }
			});
		} 
		
		function deleteAsm(data) {
	        $.ajax({
	            url: '${asmAPI}',
	            type: 'DELETE',
	            contentType: 'application/json',
	            data: JSON.stringify(data),
	            success: function (result) {
	                window.location.href = "${classoverviewURL}?page=1&limit=4&message=delete_success";
	            },
	            error: function (error) {
	            	window.location.href = "${classoverviewURL}?page=1&limit=4&message=error_system";
	            }
	        });
	    }
	</script>
</body>
</html>