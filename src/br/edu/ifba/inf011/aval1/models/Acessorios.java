package br.edu.ifba.inf011.aval1.models;

import br.edu.ifba.inf011.aval1.prototype.Prototipavel;

public class Acessorios extends Equipamento{
	private String descricao;
	private static Acessorios instance;
	
	protected Acessorios(Acessorios acessorios) {
		super(acessorios);
	}
	
	protected Acessorios(String identificador, int quantidade) {
		super(identificador, quantidade);
	}
	
	protected Acessorios(String identificador, int quantidade, String descricao) {
		super(identificador, quantidade);
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static Acessorios getInstance(String identificador, int quantidade) {
		if ((instance == null) || (instance.getIdentificador() != identificador))
			instance = new Acessorios(identificador, quantidade);
			
		return instance;
	}
	
	public static Acessorios getInstance(Acessorios acessorios) {
		if ((instance == null) || (instance.getIdentificador() != acessorios.getIdentificador()))
			instance = new Acessorios(acessorios);
			
		return instance;
	}
	
	@Override
	public Prototipavel prototipar() {
		return new Acessorios(this);
	}
}
