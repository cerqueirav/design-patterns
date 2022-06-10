package br.edu.ifba.inf011.aval1.models;

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
		if ((instance == null) || (!instance.getIdentificador().equals(identificador)))
			instance = new Acessorios(identificador, quantidade);
			
		return instance;
	}
	
	public static Acessorios getInstance(Acessorios acessorios) {
		if ((instance == null) || (!instance.getIdentificador().equals(acessorios.getIdentificador())))
			instance = new Acessorios(acessorios);
			
		return instance;
	}
}
