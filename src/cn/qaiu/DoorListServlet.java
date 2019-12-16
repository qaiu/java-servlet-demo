package cn.qaiu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 负责查询所有门店信息
 * @author QAIU
 *
 */
public class DoorListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//1. 查询所有门店信息,返回一个门店集合
		List<String> doorList = new ArrayList<String>();
		doorList.add("1.永和大王北三环店,010-78787878");
		doorList.add("2.永和大王东直门店,010-56656565");
		doorList.add("3.永和大王西直门店,010-75666445");
		
		//2. 将所有的门店信息的集合 存入 request的域中
		request.setAttribute("doorList", doorList);
		//3. 将request及其中的数据转发到doorList.jsp中
		request.getRequestDispatcher("doorList.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
