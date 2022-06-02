package br.edu.ifba.inf011.aval1.builder;
import br.edu.ifba.inf011.aval1.models.Equipamento;

public interface ExercicioBuilderIF<T> {
	public ExercicioBuilderIF<T> reset();
	public ExercicioBuilderIF<T> setDescricao(String descricao);
	public ExercicioBuilderIF<T> addTipoExercicio(TipoExercicio tipoExercicio);
	public ExercicioBuilderIF<T> addGrupoMuscular(String grupoMuscular);
	public ExercicioBuilderIF<T> addEquipamento(Equipamento equipamento);
	public T build();
}
