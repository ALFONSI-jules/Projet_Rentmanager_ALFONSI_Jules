<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<%@include file="/WEB-INF/views/common/head.jsp"%>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <%@ include file="/WEB-INF/views/common/header.jsp" %>
    <!-- Left side column. contains the logo and sidebar -->
    <%@ include file="/WEB-INF/views/common/sidebar.jsp" %>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                Utilisateurs
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/users/create">Ajouter</a>
            </h1>
        </section>

        <!-- Main content -->
        <section class="content">
            <div class="row">
                <div class="col-md-12">
                    <div class="box">
                        <div class="box-body no-padding">
                            <table class="table table-striped">
                                <tr>
                                    <th style="width: 10px">#</th>
                                    <th>Nom</th>
                                    <th>Prenom</th>
                                    <th>Email</th>
                                    <th>Action</th>
                                </tr>
                                <tr>
                                    <td>1.</td>
                                    <td>${nomClient1}</td>
                                    <td>${prenomClient1}</td>
                                    <td>${emailClient1}</td>
                                    <td>
                                        <a class="btn btn-primary" href="${pageContext.request.contextPath}/users/details?id=1">
                                        <i class="fa fa-play"></i>
                                        </a>
                                        <a class="btn btn-success disabled" href="#">
                                            <i class="fa fa-edit"></i>
                                        </a>
                                        <a class="btn btn-danger disabled" href="#">
                                            <i class="fa fa-trash"></i>
                                        </a>
                                    </td>
                                </tr>


                                <tr>
                                    <td>2.</td>
                                    <td>${nomClient2}</td>
                                    <td>${prenomClient2}</td>
                                    <td>${emailClient2}</td>
                                    <td>
                                        <a class="btn btn-primary" href="${pageContext.request.contextPath}/users/details?id=2">
                                        <i class="fa fa-play"></i>
                                        </a>
                                        <a class="btn btn-success disabled" href="#">
                                            <i class="fa fa-edit"></i>
                                        </a>
                                        <a class="btn btn-danger disabled" href="#">
                                            <i class="fa fa-trash"></i>
                                        </a>
                                    </td>
                                </tr>

                                <tr>
                                    <td>3.</td>
                                    <td>${nomClient3}</td>
                                    <td>${prenomClient3}</td>
                                    <td>${emailClient3}</td>
                                    <td>
                                        <a class="btn btn-primary" href="${pageContext.request.contextPath}/users/details?id=3">
                                        <i class="fa fa-play"></i>
                                        </a>
                                        <a class="btn btn-success disabled" href="#">
                                            <i class="fa fa-edit"></i>
                                        </a>
                                        <a class="btn btn-danger disabled" href="#">
                                            <i class="fa fa-trash"></i>
                                        </a>
                                    </td>
                                </tr>

                                 <tr>
                                     <td>4.</td>
                                     <td>${nomClient4}</td>
                                     <td>${prenomClient4}</td>
                                     <td>${emailClient4}</td>
                                     <td>
                                         <a class="btn btn-primary" href="${pageContext.request.contextPath}/users/details?id=4">
                                         <i class="fa fa-play"></i>
                                         </a>
                                         <a class="btn btn-success disabled" href="#">
                                             <i class="fa fa-edit"></i>
                                         </a>
                                         <a class="btn btn-danger disabled" href="#">
                                             <i class="fa fa-trash"></i>
                                         </a>
                                     </td>
                                 </tr>
                            </table>
                        </div>
                        <!-- /.box-body -->
                    </div>
                    <!-- /.box -->
                </div>
                <!-- /.col -->
            </div>
        </section>
        <!-- /.content -->
    </div>

    <%@ include file="/WEB-INF/views/common/footer.jsp" %>
</div>
<!-- ./wrapper -->

<%@ include file="/WEB-INF/views/common/js_imports.jsp" %>
</body>
</html>
