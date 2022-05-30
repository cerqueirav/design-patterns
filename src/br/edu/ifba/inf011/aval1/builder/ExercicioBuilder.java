package br.edu.ifba.inf011.aval1.builder;

import br.edu.ifba.inf011.aval1.models.Equipamento;
import br.edu.ifba.inf011.aval1.models.Exercicio;

public class ExercicioBuilder implements BuilderClass{
	Exercicio exercicio;

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		this.exercicio = new Exercicio();
	}

	@Override
	public void setDescricao(String descricao) {
		// TODO Auto-generated method stub
		this.exercicio.setDescricao(descricao);
	}

	@Override
	public void setCategoria(TipoExercicio categoria) {
		// TODO Auto-generated method stub
		this.exercicio.setCategoria(categoria);
	}
	
	@Override
	public void setGrupoMuscular(String grupoMuscular) {
		// TODO Auto-generated method stub
		this.exercicio.setGrupoMuscular(grupoMuscular);
		
	}

	@Override
	public void setEquipamento(Equipamento equipamento) {
		// TODO Auto-generated method stub
		this.exercicio.setEquipamento(equipamento);
	}
	
	public Exercicio getExercicio() {
		if (this.exercicio == null) 
			reset();
		
		return exercicio;
	}
}
