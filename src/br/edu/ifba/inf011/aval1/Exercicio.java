package br.edu.ifba.inf011.aval1;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.aval1.builder.TipoExercicio;

public class Exercicio {
	private String descricao;
	private List<TipoExercicio> categoria;
	private List<String> gruposMusculares;
	private List<Equipamento> equipamentos;
	
	public Exercicio() {
		this.descricao = "";
		this.categoria = new ArrayList<>();
		this.gruposMusculares = new ArrayList<>();
		this.equipamentos = new ArrayList<>();
	}
	
	public Exercicio(Exercicio exercicio) {
		this.descricao = exercicio.descricao;
		this.categoria = exercicio.categoria;
		this.gruposMusculares = exercicio.gruposMusculares;
		this.equipamentos = exercicio.equipamentos;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public List<TipoExercicio> getCategoria() {
		return categoria;
	}
	
	public void setCategoria(TipoExercicio categoria) {
		this.categoria.add(categoria);
	}
	
	public List<String> getGruposMusculares() {
		return gruposMusculares;
	}
	
	public void setGrupoMuscular(String grupoMuscular) {
		this.gruposMusculares.add(grupoMuscular);
	}
	
	public List<Equipamento> getEquipamentos() {
		return equipamentos;
	}
	
	public void setEquipamento(Equipamento equipamento) {
		this.equipamentos.add(equipamento);
	}
}
