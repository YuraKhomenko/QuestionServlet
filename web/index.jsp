<%--
  Created by IntelliJ IDEA.
  User: Юрій
  Date: 15.09.2020
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Question</title>
  <style>
    body {
      margin: 0 auto;
    }
    div {
      background-color: aqua;
      width: 200px;
      height: auto;
      padding: 10px;
    }
    .bottom {
      border: 1px;
      border-radius: 20px;
      border-bottom-color: black;
      background-color: burlywood;
    }

  </style>
  </head>
  <body>
  <div>
  <form action="${pageContext.request.contextPath}/question" method="POST">
    Name: <p><input type="text" name="name"></p>
    Surname: <p><input type="text" name="surname"></p>
    Age: <p><input type="number" name="age"></p>

    <p>Answer the questions</p>

    Do you have a car?
    <p><input type="radio" name="question1" value="yes">Yes</p>
    <p><input type="radio" name="question1" value="no">No</p>

    Is it a passenger car or not?
    <p><input type="radio" name="question2" value="yes">Yes</p>
    <p><input type="radio" name="question2" value="no">No</p>

    <p><input class="bottom" type="submit" value="  Send  ">
       <input class="bottom" type="reset" value="  Reset  "></p>
  </form>
  </div>
  </body>
</html>
