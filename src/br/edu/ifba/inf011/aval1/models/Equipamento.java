package br.edu.ifba.inf011.aval1.models;

import br.edu.ifba.inf011.aval1.fm.TipoEquipamento;
import br.edu.ifba.inf011.aval1.prototype.Prototipavel;

public abstract class Equipamento implements Prototipavel{
	private String identificador;
	private int quantidade;
	
	public Equipamento(Equipamento equipamento) {
		this.identificador = equipamento.identificador;
		this.quantidade = equipamento.quantidade;
	}
	
	public Equipamento(String identificador, int quantidade) {
		this.identificador = identificador;
		this.quantidade = quantidade;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getIdentificador() {
		return identificador;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
}
