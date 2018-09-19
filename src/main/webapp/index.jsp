<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String res = (String)request.getAttribute("result");
  if(res == null) res ="";
  String n1 = request.getParameter("n1") != null ?  request.getParameter("n1") :"";
  String n2 = request.getParameter("n2") != null ?  request.getParameter("n2") :"";
  String n3 = request.getParameter("n3") != null ?  request.getParameter("n3") :"";
  String n4 = request.getParameter("n4") != null ?  request.getParameter("n4") :"";
  String n5 = request.getParameter("n5") != null ?  request.getParameter("n5") :"";
  String n6 = request.getParameter("n6") != null ?  request.getParameter("n6") :"";
  String n7 = request.getParameter("n7") != null ?  request.getParameter("n7") :"";
  String n8 = request.getParameter("n8") != null ?  request.getParameter("n8") :"";
  String n9 = request.getParameter("n9") != null ?  request.getParameter("n9") :"";
  String n10 = request.getParameter("n10") != null ?  request.getParameter("n10") :"";%>

<html>
  <head>
    <title>Сортировка чисел</title>
  </head>
  <body>
  <h1> Введите числа </h1>
  <form action="/Sort10NumbersWeb-1.0/Sorting" method="post">
    <table>
      <tr>
        <td>Число 1</td>
        <td><input type="text" name="n1" value="<%=n1%>"></td>
      </tr>
      <tr>
        <td>Число 2</td>
        <td><input type="text" name="n2" value="<%=n2%>"></td>
      </tr>
      <tr>
        <td>Число 3</td>
        <td><input type="text" name="n3" value="<%=n3%>"></td>
      </tr>
      <tr>
        <td>Число 4</td>
        <td><input type="text" name="n4" value="<%=n4%>"></td>
      </tr>
      <tr>
        <td>Число 5</td>
        <td><input type="text" name="n5" value="<%=n5%>"></td>
      </tr>
      <tr>
        <td>Число 6</td>
        <td><input type="text" name="n6" value="<%=n6%>"></td>
      </tr>
      <tr>
        <td>Число 7</td>
        <td><input type="text" name="n7" value="<%=n7%>"></td>
      </tr>
      <tr>
        <td>Число 8</td>
        <td><input type="text" name="n8" value="<%=n8%>"></td>
      </tr>
      <tr>
        <td>Число 9</td>
        <td><input type="text" name="n9" value="<%=n9%>"></td>
      </tr>
      <tr>
        <td>Число 10</td>
        <td><input type="text" name="n10" value="<%=n10%>"></td>
      </tr>
    </table>
    <button type="submit">Enter</button>
  </form>
  <h1> Числа в порядке возрастания : <%=res%></h1>
  </body>
</html>
