package cn.qaiu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 测试response实现重定向
 * @author QAIU
 *
 */
public class TestRedirect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		System.out.println("TestRedirect重定向执行了");
		
		//往request的map里存入数据
		request.setAttribute("name", "郭富城");
//		response.sendRedirect("http://localhost/day10/index.jsp");
//		response.sendRedirect("day09/index.jsp");
		response.sendRedirect("http://www.baidu.com");
//		response.sendRedirect("http://localhost/day09/index.jsp");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
