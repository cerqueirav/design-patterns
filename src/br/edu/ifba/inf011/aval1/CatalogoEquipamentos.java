package br.edu.ifba.inf011.aval1;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import br.edu.ifba.inf011.aval1.fm.EquipamentoFactory;
import br.edu.ifba.inf011.aval1.fm.TipoEquipamento;
import br.edu.ifba.inf011.aval1.models.Equipamento;

public class CatalogoEquipamentos {
	private static CatalogoEquipamentos catalogo;
	
	private Map<String, Equipamento> equipamentos;
	
	public static CatalogoEquipamentos getCatalogo() {
		if (catalogo == null) 
			catalogo =	 new CatalogoEquipamentos();
		
		return CatalogoEquipamentos.catalogo;
	}
	
	private CatalogoEquipamentos() {
		this.equipamentos = new HashMap<String, Equipamento>();
	}
	
	public void addEquipamento(TipoEquipamento tipoEquipamento, String identificador, int quantidade) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {		
		// Verifica a existencia do Equipamento no catalogo (por meio do identificador)	
		if (this.equipamentos.containsKey(identificador)){
			// Verifica se é possível atualizar o equipamento (o tipo do equipamento deve ser igual ao informado pelo usuario)
			if (getClassName(identificador).equals(getClassName(tipoEquipamento)))
				updateQtdById(identificador, quantidade);
			else 
				System.err.println("Erro ao criar o equipamento com o código: "+identificador +" (código utilizado por outro Tipo de Equipamento)");
		}
		else{
			// Criação de um novo Equipamento (cujo identificador ainda foi não associado a nenhum equipamento)
			Equipamento equipamento = EquipamentoFactory.novoEquipamento(tipoEquipamento, identificador, quantidade);
			
			this.equipamentos.put(equipamento.getIdentificador(), equipamento);		
		}
	}
	
	private void updateQtdById(String identificador, int quantidade) {
		int novaQtd = this.equipamentos.get(identificador).getQuantidade() + quantidade;
		
		if (quantidade > 0) 
			this.equipamentos.get(identificador).setQuantidade(novaQtd);
		else
			System.err.println("Erro ao atualizar o equipamento com o código: " + identificador + " (a quantidade informada deve ser maior que zero)");
	}
	
	public void listarEquipamento(String codigo) {
		System.out.println(this.equipamentos.get(codigo));	
	}
	
	public String getClassName(String identificador) {
		return this.equipamentos.get(identificador).getClass().toString();
	}
	
	public String getClassName(TipoEquipamento tipoEquipamento) {
		return "class br.edu.ifba.inf011.aval1.models." + tipoEquipamento.toString();
	}
}
