package com.appspot.sendgwo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class SendGwoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
//		String data=req.getParameter("test");
//		System.out.println(data);
//		String ShopID=req.getParameter("ShopID");
		RequestDispatcher rd=getServletContext().getRequestDispatcher("/WEB-INF/sendgwo.jsp");
		
		rd.forward(req, resp);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
	//	String Approve=req.getParameter("Approve");//決済 OK の場合に設定されます。 決済 OK でも有効性チェックの場合など、 ブランク設定となる例外があります。 	
	//	String TranID=req.getParameter("TranID");//本サービスが発行する決済の ID 	
	//	String TranDate=req.getParameter("TranDate");//本サービスが決済を実行した日時 (yyyyMMddhhmmss 形式) 		
		String uid=req.getParameter("ClientField1");//uidが入ってくる
		String syurui=req.getParameter("ClientField2");//その決済が何のサービスか入ってくる
		String data=req.getParameter("ClientField3");//その決済が何のサービスか入ってくる
		
		//System.out.println(data);
		
		
		String ErrCode=req.getParameter("ErrCode");//処理中に発生したエラーコード(※3) 
//		String ErrInfo=req.getParameter("ErrInfo");	//処理中に発生したエラー詳細コード(※3) 
		String Method=req.getParameter("Method");	//お客様が選択した支払方法 1：一括 2：分割 3：ボーナス一括 4：ボーナス分割 5：リボ
//		
//		 Enumeration names = req.getParameterNames();
//		    while (names.hasMoreElements()){
//		      String name = (String)names.nextElement();
//		     // System.out.println(name);
//		      
//		      String vals[] = req.getParameterValues(name);
//		      if (vals != null){
//		        for (int i = 0 ; i < vals.length ; i++){
//		        	System.out.println(name+" ;  "+vals[i]);
//		         
//		        }
//		      }
//    }
//		System.out.println(TranID);
//		System.out.println(TranDate);
//		System.out.println(uid);
//		System.out.println(syurui);
//		System.out.println(ErrCode);
//		System.out.println(ErrInfo);
		//System.out.println(Method);
		
		if(ErrCode.equals("")){
		//	System.out.println("成功");
			
//		   String JSON_FILE_NAME = "WEB-INF/serviceAccounts/QCcloud2.json";//Firebaseに登録する
//        String URL = "https://qccloud-asia-northeast1.firebaseio.com/";
//	        InputStream stream_json = new FileInputStream(JSON_FILE_NAME);	
//	        FirebaseOptions options = new FirebaseOptions.Builder()
//         .setServiceAccount(stream_json)
//	            .setDatabaseUrl(URL)
//	            .build();	
//           FirebaseApp.initializeApp(options);	
//	        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
//	        Map<String, Object> hopperUpdates = new HashMap<String, Object>();
//           hopperUpdates.put("term", 1);
//	        reference.child("companyData/"+uid+"/companyInfo").updateChildren(hopperUpdates);
	     		
        RequestDispatcher rd=getServletContext().getRequestDispatcher("/WEB-INF/success.jsp");	
		rd.forward(req, resp);
		
		}else{
			
		//	System.out.println("失敗");
			
			  RequestDispatcher rd=getServletContext().getRequestDispatcher("/WEB-INF/cancel.jsp");	
				rd.forward(req, resp);
		}
		
		
		
		

	}
	
	
	
}

















