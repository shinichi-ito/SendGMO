package com.appspot.sendgwo;



import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



public class SuccessCardEdit2 extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		String uid=req.getParameter("MemberID");//uidが入ってくる
	//	String syurui=req.getParameter("ClientField2");//その決済が何のサービスか入ってくる
		String ErrCode=req.getParameter("ErrCode");//処理中に発生したエラーコード(※3) 
		String ErrInfo=req.getParameter("ErrInfo");	//処理中に発生したエラー詳細コード(※3) 
	//	String Method=req.getParameter("Method");	//お客様が選択した支払方法 1：一括 2：分割 3：ボーナス一括 4：ボーナス分割 5：リボ
		
	//System.out.println(uid);
		
		if(ErrCode.equals("")){
		//	System.out.println("成功");
			 Date date = new Date();
		    DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
	        Map<String, Object> hopperUpdates = new HashMap<String, Object>();
           hopperUpdates.put("cardedit", date.getTime());
	        reference.child("companyData/"+uid+"/companyInfo").updateChildren(hopperUpdates);
			
			
	     		
        RequestDispatcher rd=getServletContext().getRequestDispatcher("/WEB-INF/successeditcard2.jsp");	
		rd.forward(req, resp);
		
		}else{
			
		//	System.out.println("失敗");
			
			  RequestDispatcher rd=getServletContext().getRequestDispatcher("/WEB-INF/cancel.jsp");	
				rd.forward(req, resp);
		}
		
		
		
		

	}
	
}
