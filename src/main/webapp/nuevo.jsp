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
    <div class="container">
        <div class="row">
            <div class="col-12">
                <section>
                    <h1 class="text-light">Alta Articulo</h1>
                    <form method="post" action="<%=request.getContextPath()%>/AltaArticuloController">
                        <div class="mb-3">
                            <label for="exampleFormControlInput1" 
                                class="form-label text-light">Articulo</label>
                            <input name="nombre" 
                                type="text" 
                                class="form-control" 
                                id="exampleFormControlInput1"
                                placeholder="Ingrese el articulo"
                                maxlength="50">
                        </div>
                        <div class="mb-3">
                            <label for="exampleFormControlTextarea1" 
                                class="form-label text-light">Precio
                            </label>
                            <input name="precio" 
                                type="number" 
                                class="form-control" 
                                id="exampleFormControlTextarea1"
                                placeholder="Ingrese el precio">
                        </div>
                        <div class="mb-3">
                            <label for="exampleFormControlTextarea1" 
                                class="form-label text-light">Imagen
                            </label>
                            <input name="imagen" 
                                type="file" 
                                class="form-control" 
                                id="exampleFormControlTextarea1">
                        </div>
                        <div class="mb-3">
                            <label for="exampleFormControlTextarea1" 
                                class="form-label text-light">Codigo
                            </label>
                            <input name="codigo" 
                                type="text" 
                                class="form-control" 
                                id="exampleFormControlTextarea1"
                                placeholder="Ingrese un articulo"
                                maxlength="7">
                        </div>
                        <div class="mb-3">
                            <label for="autor" 
                                class="form-label text-light">Autor
                            </label>
                            <input name="autor" 
                                type="text" 
                                class="form-control" 
                                id="autor"
                                placeholder="Ingrese un autor"
                                maxlength="50">
                        </div>
                        <button class="btn btn-secondary">
                            Dar de alta
                        </button>
                    </form>
                </section>
            </div>
        </div>
</body>
</html>