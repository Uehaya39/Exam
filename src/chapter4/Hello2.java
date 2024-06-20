package chapter4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns={"/chapter4/hello2"})
public class Hello2 extends HttpServlet {
	
	public void doGet(
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException,IOException{

		response.setContentType("text/plain; charset=UTF-8");
		//HTMLへの書き出しを行うための定義
		 PrintWriter out=response.getWriter();
		 //HTMLの記述（HTMLを作成する関数）
		 out.println("Hello!");
		 out.println("こんにちは！");
		 //現在時刻の取得＋ブラウザに表示
		 out.println(new java.util.Date());


	} 

}
