package br.edu.ifba.inf011.aval1.models;

import java.util.LinkedList;
import java.util.List;

import br.edu.ifba.inf011.aval1.builder.TipoExercicio;
import br.edu.ifba.inf011.aval1.prototype.Prototipavel;

public class Exercicio implements Prototipavel{
	private String descricao;
	private List<TipoExercicio> tipos;
	private List<String> gruposMusculares;
	private List<Equipamento> equipamentos;
	
	private static Exercicio instance;
	
	private Exercicio(Exercicio exercicio) {
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
	
	private Exercicio(String descricao, List<TipoExercicio> tipos, List<String> grupos, List<Equipamento> equipamentos) {
		this.setDescricao(descricao);
		this.tipos = new LinkedList<TipoExercicio>(tipos);	
		this.gruposMusculares = new LinkedList<String>(grupos);
		this.equipamentos = new LinkedList<Equipamento>(equipamentos);
	}
	
	public static Exercicio getInstance(String descricao, List<TipoExercicio> tipos, List<String> grupos, List<Equipamento> equipamentos) {
		if ((instance == null) && (instance.validarDescricao(descricao)))
			instance = new Exercicio(descricao, tipos, grupos, equipamentos);
		else {
			System.err.println("Não é possível criar o exercicio, por favor informar o nome");
		}
		
		return instance;
	}
	
	
	public boolean validarDescricao(String descricao) {
		return (descricao.equals("")) ? false : true;
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
	public Prototipavel prototipar() {
		return new Exercicio(this);
	}
}
