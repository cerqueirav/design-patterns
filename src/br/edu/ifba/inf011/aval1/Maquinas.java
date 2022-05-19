package br.edu.ifba.inf011.aval1;

import br.edu.ifba.inf011.aval1.prototype.Prototipavel;

public class Maquinas extends Equipamento{
	private String descricao;
	private String marca;
	
	public Maquinas(Maquinas maquinas) {
		super(maquinas);
	}
	
	public Maquinas(String identificador, int quantidade) {
		super(identificador, quantidade);
	}
	
	public Maquinas(String identificador, int quantidade, String descricao, String marca) {
		super(identificador, quantidade);
		this.descricao = descricao;
		this.marca = marca;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public Prototipavel prototipar() {
		return new Maquinas(this);
	}
}
