package br.edu.ifba.inf011.aval1.builder;

import java.util.LinkedList;
import java.util.List;

import br.edu.ifba.inf011.aval1.fm.TipoEquipamento;
import br.edu.ifba.inf011.aval1.models.Equipamento;

public abstract class AbstractExercicioBuilder<T> implements ExercicioBuilderIF<T> {
	protected String identificador;
	protected String descricao;
	protected List<TipoExercicio> tiposExercicios;
	protected List<String> gruposMusculares;
	protected List<Equipamento> equipamentos;
	
	public AbstractExercicioBuilder() {
		this.reset();
	}
	
	@Override
	public ExercicioBuilderIF<T> reset() {
		this.identificador = "";
		this.descricao = "";
		this.tiposExercicios = new LinkedList<TipoExercicio>();
		this.gruposMusculares = new LinkedList<String>();
		this.equipamentos = new LinkedList<Equipamento>();
		
		return this;
	}
	
	@Override
	public ExercicioBuilderIF<T> setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	@Override
	public ExercicioBuilderIF<T> addTipoExercicio(TipoExercicio tipoExercicio) {
		this.tiposExercicios.add(tipoExercicio);
		return this;
	}

	@Override
	public ExercicioBuilderIF<T> addGrupoMuscular(String grupoMuscular) {
		this.gruposMusculares.add(grupoMuscular);
		return this;
	}

	@Override
	public ExercicioBuilderIF<T> addEquipamento(Equipamento equipamento) {
		this.equipamentos.add(equipamento);
		return this;
	}	
}
