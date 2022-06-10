package br.edu.ifba.inf011.aval1;

import java.util.HashMap;
import java.util.Map;

import br.edu.ifba.inf011.aval1.models.Exercicio;

public class CatalogoExercicios {
	public static CatalogoExercicios catalogo;
	
	private Map<String, Exercicio> exercicios;
	
	public static CatalogoExercicios getCatalogo() {
		if(CatalogoExercicios.catalogo == null)
			CatalogoExercicios.catalogo = new CatalogoExercicios();
		return CatalogoExercicios.catalogo;
	}
	
	public CatalogoExercicios() {
		this.exercicios = new HashMap<String, Exercicio>();
	}
	
	public void cadastrar(Exercicio exercicio) {
		this.exercicios.put(exercicio.getDescricao(), exercicio);
	}
	
	public void listar() {
		for (Exercicio exercicio: this.exercicios.values()) 
			System.out.println(exercicio.getDescricao());
	}
	
	public Exercicio recuperar(String descricao) {
		Exercicio exercicio = this.exercicios.get(descricao);
		return (exercicio != null) ? exercicio : null;
	}
}
