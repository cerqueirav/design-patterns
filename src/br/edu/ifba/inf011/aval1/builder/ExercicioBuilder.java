package br.edu.ifba.inf011.aval1.builder;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.aval1.models.Equipamento;
import br.edu.ifba.inf011.aval1.models.Exercicio;

public class ExercicioBuilder{
    private String descricao;
	private List<TipoExercicio> tiposExercicios;
	private List<String> gruposMusculares;
	private List<Equipamento> equipamentos;
	private static ExercicioBuilder instance;
	
	public static ExercicioBuilder createExercicio(String descricao) throws Exception {
		if ((instance == null) && (!descricao.isEmpty())) 
			instance = new ExercicioBuilder(descricao);	
		else
			throw new Exception("Não é possível criar o equipamento sem o nome");
		
		return instance;
	}
	
	private ExercicioBuilder(String descricao) {
		this.descricao = descricao;
		this.tiposExercicios = new ArrayList<TipoExercicio>();
		this.gruposMusculares = new ArrayList<String>();
		this.equipamentos = new ArrayList<Equipamento>();
	}
	
	public ExercicioBuilder setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	public ExercicioBuilder addTipoExercicio(TipoExercicio tipoExercicio) {
		this.tiposExercicios.add(tipoExercicio);
		return this;
	}

	public ExercicioBuilder addGrupoMuscular(String grupoMuscular) {
		this.gruposMusculares.add(grupoMuscular);
		return this;
	}

	public ExercicioBuilder addEquipamento(Equipamento equipamento) {
		this.equipamentos.add(equipamento);
		return this;
	}
	
    public Exercicio build() {
		return new Exercicio(this.descricao, this.tiposExercicios, this.gruposMusculares, this.equipamentos);
	}
}