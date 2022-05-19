package br.edu.ifba.inf011.aval1.fm;

public enum TipoEquipamento {
	
	HALTERES("br.edu.ifba.inf011.aval1.fm.HalteresFactory"),
	ACESSORIOS("br.edu.ifba.inf011.aval1.fm.AcessoriosFactory"),
	MAQUINAS("br.edu.ifba.inf011.aval1.fm.MaquinasFactory");
	
	String className;
	
	private TipoEquipamento(String className) {
		this.className = className;
	}
	
	public String getFactoryName() {
		return this.className;
	}	
}
