package chapter4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//パス
//コンテキスト:http://localhost:8080/book/
//コンテキストパスからの相対パス chapter3/hello
//404エラーが発生したら確認する場所
@WebServlet(urlPatterns={"/chapter4/hello3"})
public class Hello3 extends HttpServlet {

	public void doGet(
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException,IOException{

		//日本語を表示する設定
		//文字コードを設定する（UTF-8）
	    //orintなの記述の意味を設定する（HTMLでHTML要素を判定）
		response.setContentType("text/html; charset=UTF-8");
		//HTMLへの書き出しを行うための定義
		PrintWriter out=response.getWriter();
		 //HTMLの記述（HTMLを作成する関数）
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Servlet/JSP Sample Programs</title>");
		out.println("</head>");
		out.println("<body>");

		out.println("<p>Hello!</p>");
		out.println("<p>こんにちは！</p>");
		out.println("<p>"+new java.util.Date()+"</p>");

		out.println("</body>");
		out.println("</html>");
		 //現在時刻の取得＋ブラウザに表示
		 //out.println(new java.util.Date());


	}

}