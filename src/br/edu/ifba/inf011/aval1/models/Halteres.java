package br.edu.ifba.inf011.aval1.models;

public class Halteres extends Equipamento{
	private double peso;
	private static Halteres instance;
	
	protected Halteres(Halteres halteres) {
		super(halteres);
	}
	
	protected Halteres(String identificador, int quantidade) {
		super(identificador, quantidade);
	}
	
	protected Halteres(String identificador, int quantidade, double peso) {
		super(identificador, quantidade);
		this.peso = peso;
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public static Halteres getInstance(String identificador, int quantidade) {
		if ((instance == null) || (!instance.getIdentificador().equals(identificador)))	 
			instance = new Halteres(identificador, quantidade);
		else 
			instance.setQuantidade(instance.getQuantidade() + quantidade);
			
		return instance;
	}
	
	public static Halteres getInstance(Halteres halteres) {
		if ((instance == null) || (!instance.getIdentificador().equals(halteres.getIdentificador())))	 
			instance = new Halteres(halteres);
		else 
			instance.setQuantidade(instance.getQuantidade() + halteres.getQuantidade());
	
		return instance;
	}
}
