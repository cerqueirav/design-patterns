package br.edu.ifba.inf011.aval1.builder;

import br.edu.ifba.inf011.aval1.Equipamento;

interface BuilderClass {
	void reset();
	void setDescricao(String descricao);
	void setCategoria(TipoExercicio categoria);
	void setGrupoMuscular(String grupoMuscular);
	void setEquipamento(Equipamento equipamento);
}
