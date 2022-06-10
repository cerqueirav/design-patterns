package br.edu.ifba.inf011.aval1.models;

import java.util.LinkedList;
import java.util.List;
import br.edu.ifba.inf011.aval1.builder.TipoExercicio;

public class Exercicio{
	private String descricao;
	private List<TipoExercicio> tipos;
	private List<String> gruposMusculares;
	private List<Equipamento> equipamentos;
	
	public Exercicio(Exercicio exercicio) {
		this.descricao = exercicio.getDescricao();
		
		this.tipos = new LinkedList<TipoExercicio>();
		for(TipoExercicio tipo : exercicio.tipos)
			this.tipos.add((TipoExercicio)tipo);
		
		this.gruposMusculares = new LinkedList<String>();
		for (String grupo : exercicio.gruposMusculares)
			this.gruposMusculares.add(grupo);	
		
		this.equipamentos = exercicio.equipamentos;
		for (Equipamento equipamento: exercicio.equipamentos) {
			this.equipamentos.add(equipamento);
		}
	}
	
	public Exercicio(String descricao) {
		this.setDescricao(descricao);
		this.tipos = new LinkedList<TipoExercicio>();
		this.gruposMusculares = new LinkedList<String>();
		this.equipamentos = new LinkedList<Equipamento>();
	}
	
	public Exercicio(String descricao, List<TipoExercicio> tipos, List<String> grupos, List<Equipamento> equipamentos) {
		this.setDescricao(descricao);
		this.tipos = new LinkedList<TipoExercicio>(tipos);	
		this.gruposMusculares = new LinkedList<String>(grupos);
		this.equipamentos = new LinkedList<Equipamento>(equipamentos);
	}	
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public List<TipoExercicio> getCategoria() {
		return tipos;
	}
	
	public void addCategoria(TipoExercicio categoria) {
		this.tipos.add(categoria);
	}
	
	public List<String> getGruposMusculares() {
		return gruposMusculares;
	}
	
	public void addGrupoMuscular(String grupoMuscular) {
		this.gruposMusculares.add(grupoMuscular);
	}
	
	public List<Equipamento> getEquipamentos() {
		return equipamentos;
	}
	
	public void addEquipamento(Equipamento equipamento) {
		this.equipamentos.add(equipamento);
	}
	
	@Override
	public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode()) + "\n" +
        		this.getDescricao() + "\n" +
        		this.getCategoria() + "\n" +
        		this.getGruposMusculares() + "\n" +
        		this.getEquipamentos();
    }
}
