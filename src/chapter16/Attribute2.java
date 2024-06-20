package chapter16;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Product;
import dao.ProductDAO;

@WebServlet(urlPatterns={"/chapter16/attribute2"})
public class Attribute2 extends HttpServlet{
	public void doGet(
			HttpServletRequest request, HttpServletResponse response
		     ) throws ServletException, IOException{
		          PrintWriter out=response.getWriter();
		          try{
		        	  //DB内のデータにアクセスするためDAOを使う
		        	  //アクセスするテーブル名がPRODUCTなので
		        	  //ProductDAOをインスタンスする
		        	  ProductDAO dao=new ProductDAO();
		        	  //検索結果をList型（ProductのList）で取得
		        	  //DB検索はsearch（）メソッドを使う
		        	  List<Product> list=dao.search("");
                      //JSPにProduct型のオブジェクトのリスト"list"を
		        	  request.setAttribute("list", list);
                      //"attribute2.jsp"をフォワードに（実行）する
		        	  request.getRequestDispatcher("attribute2.jsp")
		        	        .forward(request, response);
		          } catch (Exception e){
		        	  e.printStackTrace(out);
		          }
	}
}
