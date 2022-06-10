package br.edu.ifba.inf011.aval1.models;

public abstract class Equipamento{
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
	
	@Override
	public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode()) +
        		" |ID: " + this.getIdentificador()  +
        		" |QTD: "+ this.getQuantidade();
    }
}
