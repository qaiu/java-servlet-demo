package cn.qaiu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 测试request获取请求参数
 * 测试request请求参数乱码问题
 * @author QAIU
 *
 */
public class RequestDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//通知服务器使用tf-8接受请求参数
		request.setCharacterEncoding("utf-8");
		//获取请求中的用户名
		String user = request.getParameter("user");
		System.out.println(user);
		//获取请求参数中的爱好
		String[] likes = request.getParameterValues("like");
		System.out.println(Arrays.toString(likes));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
