package service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Threeparams")
public class ThreeParams extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<HTML>" +
	                "<HEAD><TITLE>Success</TITLE></HEAD>" +
	                "<BODY>" +
	                "<H1 ALIGN=\"CENTER\">Thank you for sending</H1>" +
	                "<UL><LI><B>PARAM1</B>: "+ req.getParameter("input1") + 
	                "  <LI><B>PARAM2</B>: "+ req.getParameter("input2") + 
	                "  <LI><B>PARAM3</B>: "+ req.getParameter("input3") +
	                "</UL></BODY></HTML>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<HTML>" +
	                "<HEAD><TITLE>Success Post</TITLE></HEAD>" +
	                "<BODY>" +
	                "<H1 ALIGN=\"CENTER\">Thank you for posting</H1>" +
	                "<UL><LI><B>PARAM1</B>: "+ req.getParameter("input1") + 
	                "  <LI><B>PARAM2</B>: "+ req.getParameter("input2") + 
	                "  <LI><B>PARAM3</B>: "+ req.getParameter("input3") +
	                "</UL></BODY></HTML>");
	}
}
