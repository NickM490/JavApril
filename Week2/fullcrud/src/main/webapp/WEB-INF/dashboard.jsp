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
<script>
  var exampleModal = document.getElementById('exampleModal')
  exampleModal.addEventListener('show.bs.modal', function (event) {
    // Button that triggered the modal
    var button = event.relatedTarget
    // Extract info from data-bs-* attributes
    var recipient = button.getAttribute('data-bs-whatever')
    // If necessary, you could initiate an AJAX request here
    // and then do the updating in a callback.
    //
    // Update the modal's content.
    var modalTitle = exampleModal.querySelector('.modal-title')
    var modalBodyInput = exampleModal.querySelector('.modal-body input')

    modalTitle.textContent = 'New message to ' + recipient
    modalBodyInput.value = recipient
  })
</script>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Candy Zone</title>
    <!-- Bootstrap -->
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
      crossorigin="anonymous"
    />
  </head>
  <body>
    <div class="container">
      <!-- Beginning of Container -->

      <div
        class="navbar sticky-top navbar-expand-lg bg-light justify-content-center border-5 border-primary-subtle"
      >
        <div class="container-fluid">
          <br />
          <button
            type="button"
            class="navbar-brand bs-emphasis-color btn btn-outline-secondary"
            data-bs-toggle="modal"
            data-bs-target="#exampleModal"
            data-bs-whatever="@mdo"
          >
            Dashboard
          </button>

          <a
            class="col-2 navbar-brand btn btn-outline-secondary"
            href="/newCandy"
            >New Candy</a
          >
          <a
            class="col-2 navbar-brand btn btn-outline-secondary"
            href="/oneCandy"
            >One Candy</a
          >
          <a
            class="col-2 navbar-brand btn btn-primary-subtle btn btn-outline-secondary"
            href="/newOwner"
            >Make an Owner</a
          >
          <div class="col-1">Welcome ${thisOwner.firstName}</div>
        </div>
      </div>
      <img
        src="https://images.pexels.com/photos/55825/gold-bear-gummi-bears-bear-yellow-55825.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
        style="width: 100%; height: 275px; object-fit: cover"
        class="img-fluid"
        alt="..."
      />
      <div class="nav bg-secondary-subtle justify-content-center">
        <h1 class="navbar display-1">Candy Creation Zone</h1>
      </div>

      <div
        class="modal fade"
        id="exampleModal"
        tabindex="-1"
        aria-labelledby="exampleModalLabel"
        aria-hidden="true"
      >
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <h5 class="modal-title" id="exampleModalLabel">
                You are already on the Dashboard!
              </h5>
              <button
                type="button"
                class="btn-close"
                data-bs-dismiss="modal"
                aria-label="Close"
              ></button>
            </div>
          </div>
        </div>
      </div>

      <!-- <c:forEach var="i" items="${allCands}">
        <p> <c:out value="${ i.name }" ></c:out> 
         <c:out value="${ i.brand }" ></c:out> 
         <c:out value="${ i.price }" ></c:out> 
         <c:out value="${ i.rating }" ></c:out> </p>

      </c:forEach> -->

      <table
        class="table table-striped table-hover table-bordered border border-5 border-primary-subtle border-top-5"
      >
        <thead>
          <tr
            class="border border-5 border-primary-subtle border-top-0 bg-light"
          >
            <th class="align-middle">Name</th>
            <th class="align-middle text-center">Brand</th>
            <th class="align-middle text-center">Price</th>
            <th class="align-middle text-center">Rating</th>
            <th class="align-middle text-center">Actions</th>
            <th class="align-middle text-center">Owner</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="i" items="${allCands}">
            <tr>
              <td>
                <a class="link-info" href="/oneCandy/${i.id}">
                  <c:out value="${i.name}"></c:out>
                </a>
              </td>
              <td class="text-center"><c:out value="${i.brand}"></c:out></td>
              <td class="text-center">
                $ <c:out value="${i.price}"></c:out>.00
              </td>
              <td class="text-center"><c:out value="${i.rating}"></c:out></td>

              <td class="text-center">
                <a class="btn btn-outline-primary" href="/updateCandy/${i.id}"
                  >Update</a
                >
                <a class="btn btn-danger" href="/delete/${i.id}">Delete</a>
              </td>
              <td class="text-center">
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
