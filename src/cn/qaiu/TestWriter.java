package cn.qaiu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 通过字符流向浏览器发送数据
 * @author QAIU
 *
 */
public class TestWriter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//这行代码是用于通知浏览器使用utf8编码接受响应数据
		//同时服务器也会使用相同的码表发数据给浏览器
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.write("你好");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
