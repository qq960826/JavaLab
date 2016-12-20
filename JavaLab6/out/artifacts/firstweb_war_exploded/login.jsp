<%@ page import="java.io.InputStreamReader" %>
<%@ page import="java.io.File" %>
<%@page import="A.Student"%>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: wzq
  Date: 12/20/16
  Time: 11:09 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%

    String user=request.getParameter("identity");
    String pass=request.getParameter("password");
    //Student a;
//    ;
    HashMap<String,A.Student> map =Student.loadfromfile();
    if(!map.containsKey(user)){
      out.println("用户名不存在");
    }else {
      Student student=map.get(user);

      if(student.identity.equals(pass)){
        out.println(student.identity+"  "+student.name+"  "+student.sex+" "+student.college);

      }else{
        out.println("密码错误");
      }
    }
//    File file=new File("")

  %>
  <%
    //File file=new File("");


  %>
  Hello World！
  </body>
</html>
