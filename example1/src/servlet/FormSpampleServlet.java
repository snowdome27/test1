package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormSampleServlet")

public class FormSpampleServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,IOException{

		request.setCharacterEncoding("utf-8");
		String name =request.getParameter("name");
		String gender =request.getParameter("gender");

		String errorMsg="";
		if (name==null||name.length()==0){
			errorMsg +="名前が入力されてません<br>";

		}
		if(gender==null||gender.length()!=0){
			errorMsg="性別が選択されてません<br>";
		}else{
			if(gender.equals("0")){gender="男性";}
			else if(gender.equals("1")){gender="女性";}
			}

			}
	String msg = name +"さん("+ gender +")を登録しました";
	private ServletResponse response;
	if(errorMsg.lenght() !=0){
		msg=errorMsg;
	}

	responce.setContentType("text/html; charset=utf-8");
	PrintWriter out=response.getWriter();

	out.println("");




	}
