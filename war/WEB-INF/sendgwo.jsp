<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%

    String ShopID = request.getParameter("ShopID");
	String OrderID=request.getParameter("OrderID");
	String Amount=request.getParameter("Amount");
	String DateTime=request.getParameter("DateTime");
	String ShopPassString=request.getParameter("ShopPassString");
	String RetURL=request.getParameter("RetURL");
	String CancelURL=request.getParameter("CancelURL");
	String UseCredit=request.getParameter("UseCredit");
	String SiteID=request.getParameter("SiteID");
	String MemberID=request.getParameter("MemberID");
	String JobCd=request.getParameter("JobCd");
	String MemberPassString=request.getParameter("MemberPassString");
	String ClientField1=request.getParameter("ClientField1");
	String ClientField2=request.getParameter("ClientField2");   
	String ClientField3=request.getParameter("ClientField3");  
%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LotsJOY</title>
</head>
<body>


<p>登録されたクレジットカードの有効性の確認を行います。<br>
下記のボタンを押していただきカード情報を入力画面へと進めてください。<br>
なお　支払い方法は【一括】のみ扱っております。ご注意ください。
</p>

<form method="POST" action="https://pt01.mul-pay.jp/link/tshop00027379/Multi/Entry">
        
        
        
           <input type="submit" value="【クレジットカード登録画面にデータを送信】" />
           
           
          <input type="hidden" name="ShopID" value=<%=ShopID%>><br />
           

          <input type="hidden" name="OrderID" value=<%=OrderID%>><br />
          
          
          <input type="hidden" name="Amount" value=<%=Amount%>><br />
          
           
          <input type="hidden" name="DateTime" value=<%=DateTime%>><br />
          
          
          <input type="hidden" name="ShopPassString" value=<%=ShopPassString%>><br />
          
          
          <input type="hidden" name="RetURL" value=<%=RetURL%>><br />
          
           
          <input type="hidden" name="CancelURL" value=<%=CancelURL%>><br />
          
          
          <input type="hidden" name="UseCredit" value=<%=UseCredit%>><br />
          
          
          <input type="hidden" name="SiteID" value=<%=SiteID%>><br />
          
          
          <input type="hidden" name="MemberID" value=<%=MemberID%>><br />
          
          
          
          <input type="hidden" name="JobCd" value=<%=JobCd%>><br />
          
          
          
            
          <input type="hidden" name="MemberPassString" value=<%=MemberPassString%>><br />
          
          
             
          <input type="hidden" name="ClientField1" value=<%=ClientField1%>><br />
          
          
           
          <input type="hidden" name="ClientField2" value=<%=ClientField2%>><br />
          
           <input type="hidden" name="ClientField3" value=<%=ClientField3%>><br />
       
        
        </form>


</body>
</html>