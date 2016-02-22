package service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//De annotation zorgt ervoor dat onze klasse als servlet bekend staat met de opgegeven url
@WebServlet("/Test1")
public class TestServlet extends HttpServlet {
	//De doget functie wordt aangeroepen indien we een post doen vanuit een browser
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//we geven aan wat de inhoud van het resultaat zal zijn
		resp.setContentType("text/html");
		 
		//We halen het object op om onze output naar de response stream te schrijven
		PrintWriter out = resp.getWriter();
		
		out.print("<!DOCTYPE HTML>" +
			       "<HTML><HEAD><TITLE>A test servlet</TITLE></HEAD>" +
			       "<BODY>" +
			       "<H1>TEST</H1>" +
			       "<P>SIMPLE SERVLET FOR TESTING.</P>" +
			       "</BODY></HTML>");

		
	}
}
