<html>
<head>
  <title>Welcome!</title>
</head>
<body>
  
  <h1>Cadastrando ${className}!</h1>
  <ul>
    <li ng-repat="item in ${classNamePlural}">{{item}}</li>
  </ul>
  
  <#list properties as prop>
    <p>${prop}</p>
  </#list>
  
</body>
</html>
