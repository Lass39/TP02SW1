package controller;

import java.io.IOException;
import java.io.PrintWriter;

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

@WebServlet("/Insert")
public class Insert extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String newData[] = new String[5];
		newData[0] = req.getParameter("nome");
		newData[1] = req.getParameter("unidadeCompra");
		newData[2] = req.getParameter("descricao");
		newData[3] = req.getParameter("qtdPrevistoMes");
		newData[4] = req.getParameter("precoMaxComprado");
		
		Produto produto = new Produto();
		produto.setId(Produto.getChaveSequencial());
		produto.setNome(                             newData[0]);
		produto.setUnidadeCompra(   Integer.parseInt(newData[1]));
		produto.setDescricao(                        newData[2]);
		produto.setQtdPrevistoMes(  Double.parseDouble(newData[3]));
		produto.setPrecoMaxComprado(Double.parseDouble(newData[4]));
		
		Produto.addLista(produto);
		req.setAttribute("produtos", Produto.getLista());
		
		
 		RequestDispatcher rd = req.getRequestDispatcher("/");
 		rd.forward(req, resp);
	}

}
