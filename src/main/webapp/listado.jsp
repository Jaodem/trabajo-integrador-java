<%@ page import="java.util.ArrayList" %>
<%@ page import="ar.com.codoacodo.oop.Articulo" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
    <meta http-equiv="Pragma" content="no-cache" />
    <meta http-equiv="Expires" content="0" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Trabajo Backend</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body class="bg-dark">
  <jsp:include page="navbar.jsp"/>
    <% 
     /*codigo java*/
     ArrayList<Articulo> listado = (ArrayList<Articulo>)request.getAttribute("listado"); //esto es un array
    %>
    <!-- aca van los mensajes-->
    <%
      String error = (String)request.getAttribute("error");
      String success = (String)request.getAttribute("success");
    %>
    <%
      if(error!=null) {
    %>
    <div class="alert alert-danger" role="alert">
      <%=error%>
    </div>
    <%
      }
    %>
    <%
      if(success != null) {
    %>
    <div class="alert alert-success" role="alert">
      <%=success%>
    </div>
    <%
    }
    %>
    <div class="container">
        <div class="row">
            <div class="col-12">
                <section>
                    <h1 class="text-light">Listado de Articulos</h1>
                    <table class="table table table-striped-columns">
                        <thead>
                          <tr>
                            <th class="text-light" scope="col">#</th>
                            <th class="text-light" scope="col">Titulo</th>
                            <th class="text-light" scope="col">Codigo</th>
                            <th class="text-light" scope="col">Precio</th>
                            <th class="text-light" scope="col">Fecha</th>
                            <th class="text-light" scope="col">Acciones</th>
                          </tr>
                        </thead>
                        <tbody>
                            <% 
                            for(Articulo unarticulo : listado) {
                            %>
                                <tr>
                                    <th class="text-light" scope="row"><%=unarticulo.getId()%></th>
                                    <td class="text-light"><%=unarticulo.getTitulo()%></td>
                                    <td class="text-light"><%=unarticulo.getCodigo()%></td>
                                    <td class="text-light"><%=unarticulo.getPrecio()%></td>
                                    <td class="text-light"><%=unarticulo.getFechaCreacion()%></td>
                                    <td>
                                        <a href="<%=request.getContextPath()%>/DeleteController?id=<%=unarticulo.getId()%>" class="btn btn-danger" tabindex="-1" role="button" aria-disabled="true">
                                            Eliminar
                                        </a>
                                        <a href="<%=request.getContextPath()%>/EditarController?id=<%=unarticulo.getId()%>" 
                                            class="btn btn-secondary" tabindex="-1" role="button" aria-disabled="true">
                                          Editar
                                      </a>
                                    </td>
                                </tr>
                            <% } %>
                        </tbody>
                      </table>
                </section>
            </div>
        </div>
</body>

</html>