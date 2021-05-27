package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/*
	Dev pelo :
	Giovanni de Freitas Fernandes CB 1640488
*/


public class Produto {
	
	private static List<Produto> lista = new ArrayList<>();
	private static Integer chaveSequencial = 0;
	
	private Integer id;
	private String nome;
	private int unidadeCompra;
	private String descricao;
	private double qtdPrevistoMes;
	private double precoMaxComprado;
	
	public Produto() {
		Produto.chaveSequencial += 1;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getUnidadeCompra() {
		return unidadeCompra;
	}
	public void setUnidadeCompra(int unidadeCompra) {
		this.unidadeCompra = unidadeCompra;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getQtdPrevistoMes() {
		return qtdPrevistoMes;
	}
	public void setQtdPrevistoMes(double qtdPrevistoMes) {
		this.qtdPrevistoMes = qtdPrevistoMes;
	}
	public double getPrecoMaxComprado() {
		return precoMaxComprado;
	}
	public void setPrecoMaxComprado(double precoMaxComprado) {
		this.precoMaxComprado = precoMaxComprado;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public static List<Produto> getLista() {
		return lista;
	}
	public static void addLista(Produto lista) {
		Produto.lista.add(lista);
	}
	public static void removeLista(Integer id) {
		Iterator<Produto> it = lista.iterator();
		
		while(it.hasNext()) {
			Produto prod = it.next();
			if (prod.getId() == id) {
				it.remove();
			}
		}
	}

	public static void setLista(List<Produto> lista) {
		Produto.lista = lista;
	}

	public static Integer getChaveSequencial() {
		return chaveSequencial;
	}

	public static void setChaveSequencial(Integer chaveSequencial) {
		Produto.chaveSequencial = chaveSequencial;
	}
}
