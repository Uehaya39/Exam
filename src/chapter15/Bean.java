package chapter15;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Product;
import tool.Page;

@WebServlet(urlPatterns={"/chapter15/bean"})
public class Bean extends HttpServlet {

	public void doGet (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Page.header(out);

		//Product(Bean)をインスタンス化
		Product p=new Product();

		//Beanに値を設定
		p.setId(1);
		p.setName("まぐろ");
		p.setPrice(100);

		//getInt, getString でテーブルの項目名を指定することで値を取得
		out.println(p.getId());
		out.println("：");
		out.println(p.getName());
		out.println("：");
		out.println(p.getPrice());

		Page.footer(out);
	}
}
