<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
       <!DOCTYPE html>
       <html>
       <head>
       <meta charset="UTF-8">
       <!-- naudojame bootstrap stiliams -->
        <style><%@include file="/WEB-INF/jsp/style.css"%></style>
       <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
       <link href="/eshop/bootstrap-4.3.1-dist/css/bootstrap.min.css" rel="stylesheet">
       <header>
       <div class="jumbotron">
             <div class="conteiner">
               <div class="bounce">
               <h1>${message}</h1>
               </div>
           </div>
         </div>
           </header>
       <title>Sveikiname mūsų parduotuvėje!</title>
       </head>

      <img class="resize" src="https://c.wallhere.com/photos/8a/9c/BMW_M3_bmw_m3_e36_Stance_car-291401.jpg!d" width="1000" height="800"/>
       <body>

<div>
</div>

<button type="button" class="btn btn-secondary btn-lg btn-block" onclick="window.location.href = 'http://localhost:8080/eshop/market/products';">Choose your weapon</button>




       </body>
       </html>