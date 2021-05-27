package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Produto;

/*
	Dev pelo :
	Giovanni de Freitas Fernandes CB 1640488
*/

@WebServlet("/Delete")
public class Delete extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String newData[] = new String[6];
		newData[0] = req.getParameter("identificador");
		newData[1] = req.getParameter("nome");
		newData[2] = req.getParameter("unidadeCompra");
		newData[3] = req.getParameter("descricao");
		newData[4] = req.getParameter("qtdPrevistoMes");
		newData[5] = req.getParameter("precoMaxComprado");
		
		
		Produto.removeLista( Integer.parseInt(newData[0]) );
		
		req.setAttribute("produtos", Produto.getLista());
		
		resp.sendRedirect("/TP02-SW1/");
 		//RequestDispatcher rd = req.getRequestDispatcher("/");
 		//rd.forward(req, resp);
	}
}
