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

@WebServlet("/Edit")
public class Edit extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String newData[] = new String[6];
		newData[0] = req.getParameter("identificador");
		newData[1] = req.getParameter("nome");
		newData[2] = req.getParameter("unidadeCompra");
		newData[3] = req.getParameter("descricao");
		newData[4] = req.getParameter("qtdPrevistoMes");
		newData[5] = req.getParameter("precoMaxComprado");
		
		for (Produto prod : Produto.getLista()) {
			System.out.print("prod: "+prod.getId());
			if (prod.getId() == Integer.parseInt(newData[0])) {
				prod.setNome(newData[1]);
				prod.setUnidadeCompra(Integer.parseInt(newData[2]));
				prod.setDescricao(newData[3]);
				prod.setQtdPrevistoMes(Double.parseDouble(newData[4]));
				prod.setPrecoMaxComprado(Double.parseDouble(newData[5]));
			}
		}
		
		req.setAttribute("produtos", Produto.getLista());
		//resp.sendRedirect("/TP02-SW1/");
 		RequestDispatcher rd = req.getRequestDispatcher("/");
 		rd.forward(req, resp);
 		
	}
}
