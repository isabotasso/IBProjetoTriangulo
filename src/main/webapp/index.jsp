<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Verifica triangulo</title>
</head>
<link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<form method="post" action ="IBProjetoTriangulo">
<h1>Triangulo</h1>
  <div class="mb-3 col-3">
    <label for="exampleInputEmail1" class="form-label">Lado 1 :</label>
    <input type="text" name="lado1" >
    
  </div>
  <div class="mb-3 col-3" >
    <label for="exampleInputPassword1" class="form-label">Lado 2 :</label>
    <input type="text" name="lado2">
  </div>
 
  <div class="mb-3 col-3" >
    <label for="exampleInputPassword1" class="form-label">Lado 3 :</label>
    <input type="text" name="lado3">
  </div>
  
  <button type="reset" class="btn btn-secondary">Limpar</button>
  <button type="submit" class="btn btn-secondary">Somar</button>
  </form>
  </div>

</body>
</html>
