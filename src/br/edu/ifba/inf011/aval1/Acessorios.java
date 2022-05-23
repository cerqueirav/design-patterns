package br.edu.ifba.inf011.aval1;

import br.edu.ifba.inf011.aval1.prototype.Prototipavel;

public class Acessorios extends Equipamento{
	private String descricao;
	private static Acessorios instance;
	
	private Acessorios(Acessorios acessorios) {
		super(acessorios);
	}
	
	private Acessorios(String identificador, int quantidade) {
		super(identificador, quantidade);
	}
	
	private Acessorios(String identificador, int quantidade, String descricao) {
		super(identificador, quantidade);
		this.descricao = descricao;
	}
	
	public static Acessorios getInstance(Acessorios acessorios) {
		if (instance == null) {
			instance = new Acessorios(acessorios);
		}
		return instance;
	}
	
	public static Acessorios getInstance(String identificador, int quantidade) {
		if (instance == null) {
			instance = new Acessorios(identificador, quantidade);
		}
		return (Acessorios) instance;
	}
	

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public Prototipavel prototipar() {
		return new Acessorios(this);
	}
}
