package br.edu.ifba.inf011.aval1.fm;

public enum TipoEquipamento {
	
	Halteres("br.edu.ifba.inf011.aval1.fm.HalteresFactory"),
	Acessorios("br.edu.ifba.inf011.aval1.fm.AcessoriosFactory"),
	Maquinas("br.edu.ifba.inf011.aval1.fm.MaquinasFactory");
	
	String className;
	
	private TipoEquipamento(String className) {
		this.className = className;
	}
	
	public String getFactoryName() {
		return this.className;
	}	
}
