package br.edu.ifba.inf011.aval1.models;

public class Maquinas extends Equipamento{
	private String descricao;
	private String marca;
	private static Maquinas instance;
	
	protected Maquinas(Maquinas maquinas) {
		super(maquinas);
	}
	
	protected Maquinas(String identificador, int quantidade) {
		super(identificador, quantidade);
	}
	
	protected Maquinas(String identificador, int quantidade, String descricao, String marca) {
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
	
	public static Maquinas getInstance(String identificador, int quantidade) {
		if ((instance == null) || (!instance.getIdentificador().equals(identificador)))
			instance = new Maquinas(identificador, quantidade);
		
		return instance;
	}
	
	public static Maquinas getInstance(Maquinas maquinas) {
		if ((instance == null) || (!instance.getIdentificador().equals(maquinas.getIdentificador())))
			instance = new Maquinas(maquinas);
		
		return instance;
	}
}
