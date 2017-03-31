<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%

    String SiteID=request.getParameter("ClientField3").split("/")[0];
    String MemberID=request.getParameter("ClientField3").split("/")[1];
    String MemberName=request.getParameter("ClientField2").split("/")[0];
    String MemberPassString =request.getParameter("ClientField2").split("/")[2];
    String DateTime=request.getParameter("ClientField3").split("/")[2];

 String ShopID = request.getParameter("ShopID");
 String OrderID=request.getParameter("OrderID");

	String RetURL="http://localhost:8888/successeditcard";
	String CancelURL="http://localhost:8888/cancel";


	//String RetURL="http://1-dot-qccloud-1186.appspot.com/successeditcard";
	//String CancelURL="http://1-dot-qccloud-1186.appspot.com/cancel";

    %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LotsJOY</title>
</head>
<body>

<p>登録されたクレジットカードの有効性の確認がされました。<br>
引き続き下記のボタンを押していただきカード名義人欄にお名前を記入ください。</p>

<form method="POST" action="https://pt01.mul-pay.jp/link/tshop00027379/Member/Edit">


           <input type="submit" value="【カード名義人を登録する】" /><br>

            <input type="hidden" name="ShopID" value=<%=ShopID%>><br />


          <input type="hidden" name="OrderID" value=<%=OrderID%>><br />

           <input type="hidden" name="DateTime" value=<%=DateTime%>><br />

           <input type="hidden" name="RetURL" value=<%=RetURL%>><br />


          <input type="hidden" name="CancelURL" value=<%=CancelURL%>><br />

           <input type="hidden" name="SiteID" value=<%=SiteID%>><br />


          <input type="hidden" name="MemberID" value=<%=MemberID%>><br />

           <input type="hidden" name="MemberName" value=<%=MemberName%>><br />


           <input type="hidden" name="MemberPassString" value=<%=MemberPassString%>><br />







        </form>

</body>
</html>