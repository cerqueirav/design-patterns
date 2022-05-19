package br.edu.ifba.inf011.aval1;

import br.edu.ifba.inf011.aval1.prototype.Prototipavel;

public class Acessorios extends Equipamento{
	private String descricao;
	
	public Acessorios(Acessorios acessorios) {
		super(acessorios);
	}
	
	public Acessorios(String identificador, int quantidade) {
		super(identificador, quantidade);
	}
	
	public Acessorios(String identificador, int quantidade, String descricao) {
		super(identificador, quantidade);
		this.descricao = descricao;
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
