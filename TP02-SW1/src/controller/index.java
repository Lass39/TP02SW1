package controller;

import java.io.IOException;

/*
	Dev pelo :
	Giovanni de Freitas Fernandes CB 1640488
*/

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Produto;

@WebServlet("/")
public class index extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		req.setAttribute("produtos", Produto.getLista());
		//resp.sendRedirect("/TP02-SW1/");
 		RequestDispatcher rd = req.getRequestDispatcher("/");
 		rd.forward(req, resp);
 		
	}
}
