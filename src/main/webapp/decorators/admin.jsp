<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file = "/common/taglib.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<!-- link header -->
<title>Btec Cms</title>
<!-- link table -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round" />
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<link rel="stylesheet" href="<c:url value='/template/assets/css/main.css' />" />
<link rel="stylesheet" href="<c:url value='/template/assets/css/upcoming-events.css' />" />
<link rel="stylesheet" href="<c:url value='/template/assets/css/search-nav.css' />" />
<link rel="stylesheet" href="<c:url value='/template/assets/css/calendar.css' />" />
<link rel="stylesheet" href="<c:url value='/template/assets/css/content-overview.css' />" />
<link rel="stylesheet" href="<c:url value='/template/assets/css/sidebar-nav-class.css' />" />
<link rel="stylesheet" href="<c:url value='/template/assets/css/view-sub-asm.css' />" />
<link rel="stylesheet" href="<c:url value='/template/assets/css/slideshow.css' />" />
<link rel="stylesheet" href="<c:url value='/template/assets/css/table.css' />" />
<link rel="stylesheet" href="<c:url value='/template/assets/css/update-profile.css' />" />
<link rel="stylesheet" href="<c:url value='/template/assets/css/responsive.css' />" />
<link rel="stylesheet" href="<c:url value='/template/assets/fonts/fontawesome-free-5.15.4-web/css/all.css' />" />
<link rel="stylesheet" type="text/css"
	href="//fonts.googleapis.com/css?family=Nunito" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		// Activate tooltip
		$('[data-toggle="tooltip"]').tooltip();

		// Select/Deselect checkboxes
		var checkbox = $('table tbody input[type="checkbox"]');
		$("#selectAll").click(function() {
			if (this.checked) {
				checkbox.each(function() {
					this.checked = true;
				});
			} else {
				checkbox.each(function() {
					this.checked = false;
				});
			}
		});
		checkbox.click(function() {
			if (!this.checked) {
				$("#selectAll").prop("checked", false);
			}
		});
	});
</script>
<!-- endlink table -->
</head>

<body>

	<%@ include file = "/common/admin/header.jsp" %>

	<dec:body/>
	
	<%@ include file = "/common/admin/footer.jsp" %>


	<script src="<c:url value='/template/assets/js/calendar.js' />"></script>
	<script src="<c:url value='/template/assets/js/drop-user.js' />"></script>
	<script src="<c:url value='/template/assets/js/fixed-nav-top.js' />"></script>
	<script src="<c:url value='/template/assets/js/login.js' />"></script>
	<script src="<c:url value='/template/assets/js/showpass.js' />"></script>
	<script src="<c:url value='/template/assets/js/sidebar-nav-class.js' />"></script>
	<script src="<c:url value='/template/assets/js/slideshow.js' />"></script>
	<script src="<c:url value='/template/assets/js/table.js' />"></script>
	<script src="<c:url value='/template/assets/js/tablink.js' />"></script>
	<script src="<c:url value='/template/assets/js/textarea-editor.js' />"></script>
	<script src="<c:url value='/template/assets/js/responsive.js' />"></script>
</body>
</html>