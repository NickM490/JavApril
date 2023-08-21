<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!-- c:out ; c:forEach ; c:if -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (like dates) -->
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Title Here</title>
    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
  </head>
  <body>
    <div class="container">
      <!-- Beginning of Container -->

      <h1 class="navbar justify-content-center">Candy Creation Zone</h1>
      <div class="navbar navbar-expand-lg bg-primary justify-content-center border border-5 border-primary-subtle">
        <br />
        <a class="col-2 navbar-brand bs-emphasis-color" href="/dashboard">Dashboard</a>
        <a class="col-2 navbar-brand" href="/newCandy">New Candy</a>
        <a class="col-2 navbar-brand" href="/oneCandy">One Candy</a>
        <a class="col-2 navbar-brand btn btn-primary-subtle" href="/newOwner">Make an Owner</a>
      </div>

      <!-- <c:forEach var="i" items="${allCands}">
        <p> <c:out value="${ i.name }" ></c:out> 
         <c:out value="${ i.brand }" ></c:out> 
         <c:out value="${ i.price }" ></c:out> 
         <c:out value="${ i.rating }" ></c:out> </p>

      </c:forEach> -->

      <table class="table  table-striped table-hover border border-5 border-primary-subtle border-top-0">
        <thead>
          <tr class="border border-5 border-primary-subtle border-top-0">
            <th class="align-middle">Name</th>
            <th class="align-middle">Brand</th>
            <th class="align-middle">Price</th>
            <th class="align-middle">Rating</th>
            <th class="align-middle">Actions</th>
            <th class="align-middle">Owner</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="i" items="${allCands}">
            <tr>
              <td>
                <a href="/oneCandy/${i.id}">
                  <c:out value="${i.name}"></c:out>
                </a>
              </td>
              <td><c:out value="${i.brand}"></c:out></td>
              <td>$ <c:out value="${i.price}"></c:out>.00</td>
              <td><c:out value="${i.rating}"></c:out></td>

              <td>
                <a class="btn btn-primary" href="/updateCandy/${i.id}"
                  >Update This Candy</a
                >
                <a class="btn btn-danger" href="/delete/${i.id}">Delete</a>
              </td>
              <td>
                <c:out value="${i.owner.firstName} ${i.owner.lastName}"></c:out>
              </td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </div>
    <!-- End of Container -->
  </body>
</html>
