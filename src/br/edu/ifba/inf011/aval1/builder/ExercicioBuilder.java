package br.edu.ifba.inf011.aval1.builder;

import br.edu.ifba.inf011.aval1.models.Exercicio;

public class ExercicioBuilder extends AbstractExercicioBuilder<Exercicio>{
	public static ExercicioBuilder factory() {
		return new ExercicioBuilder();
	}
	
	public Exercicio build() {
		return Exercicio.getInstance(this.descricao, this.tiposExercicios, this.gruposMusculares, this.equipamentos); 
	}
}
