package br.edu.ifba.inf011.aval1;

import br.edu.ifba.inf011.aval1.prototype.Prototipavel;

public class Halteres extends Equipamento{
	private double peso;
	
	public Halteres(Halteres halteres) {
		super(halteres);
	}
	
	public Halteres(String identificador, int quantidade) {
		super(identificador, quantidade);
	}
	
	public Halteres(String identificador, int quantidade, double peso) {
		super(identificador, quantidade);
		this.peso = peso;
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public Prototipavel prototipar() {
		return new Halteres(this);
	}	
}
