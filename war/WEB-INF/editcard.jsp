<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
       <%
       String SiteID=request.getParameter("SiteID");
       String MemberID=request.getParameter("MemberID");     
    String ShopID = request.getParameter("ShopID");
    String OrderID=request.getParameter("OrderID");
	String MemberPassString=request.getParameter("MemberPassString");
	String RetURL=request.getParameter("RetURL");
	String CancelURL=request.getParameter("CancelURL");
	String DateTime=request.getParameter("DateTime");
	String MemberName=request.getParameter("MemberName");
     
%>   
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LotsJOY</title>
</head>
<body>
<form method="POST" action="https://pt01.mul-pay.jp/link/tshop00027379/Member/Edit">
        
        
        
           <input type="submit" value="【クレジットカード編集画面にデータを送信】" /><br>
                    
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