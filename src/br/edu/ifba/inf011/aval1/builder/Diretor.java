package br.edu.ifba.inf011.aval1.builder;

import java.util.List;

import br.edu.ifba.inf011.aval1.Equipamento;


public class Diretor {
	public void createExercicio(String descricao, BuilderClass builderClass) {
		builderClass.reset();
		builderClass.setDescricao(descricao);
	}
	
	public void createExercicio(String descricao, List<TipoExercicio> categoria, BuilderClass builderClass) {
		builderClass.reset();
		builderClass.setDescricao(descricao);
		categoria.forEach(builderClass::setCategoria);
	}
	
	public void createExercicio(String descricao, List<TipoExercicio> categoria, List<String> gruposMusculares, BuilderClass builderClass) {
		builderClass.reset();
		builderClass.setDescricao(descricao);
		categoria.forEach(builderClass::setCategoria);
		gruposMusculares.forEach(builderClass::setGrupoMuscular);
	}
	
	public void createExercicio(String descricao, List<TipoExercicio> categoria, List<String> gruposMusculares, List<Equipamento> equipamentos, BuilderClass builderClass) {
		builderClass.reset();
		builderClass.setDescricao(descricao);
		categoria.forEach(builderClass::setCategoria);
		gruposMusculares.forEach(builderClass::setGrupoMuscular);
		equipamentos.forEach(builderClass::setEquipamento);
	}
}
