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
	
	public void cadastrar(TipoEquipamento tipoEquipamento, String identificador, int quantidade) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {		
		// Verifica a exist�ncia do Equipamento (atrav�s do identificador)	
		if (this.equipamentos.containsKey(identificador)){
			
			// Verifica se � poss�vel atualizar o equipamento (o tipo do equipamento deve ser igual ao informado pelo usuario)
			if (getClassName(identificador).equals(getClassName(tipoEquipamento)))
				
				updateQtdById(identificador, quantidade);
			else 
				System.err.println("N�o � poss�vel criar o equipamento, c�digo utilizado por outro Tipo de Equipamento");
			
		}
		else {
			// Cria��o de um novo Equipamento (identificador n�o associado a outro equipamento)
			Equipamento equipamento = EquipamentoFactory.novoEquipamento(tipoEquipamento, identificador, quantidade);
			
			this.equipamentos.put(equipamento.getIdentificador(), equipamento);		
		}	
	}
	
	private void updateQtdById(String identificador, int quantidade) {
		int novaQtd = this.equipamentos.get(identificador).getQuantidade() + quantidade;
		
		if (quantidade > 0)
			this.equipamentos.get(identificador).setQuantidade(novaQtd);
		else
			System.err.println("** N�o foi poss�vel atualizar o equipamento: [" + identificador + "]"+", a quantidade informada � menor ou igual a zero!**");
	}
	
	public Equipamento getEquipamentoById(String codigo) {
		Equipamento equipamento = this.equipamentos.get(codigo);
		 
		return (Equipamento) ((equipamento != null) ? equipamento : null);
	}
	
	public Equipamento getPrototype(String codigo) {
		Equipamento equipamento = this.equipamentos.get(codigo);
		 
		return (Equipamento) ((equipamento != null) ? equipamento.prototipar() : null);
	}
	
	public void getEquipamentos() {
		for (Equipamento equipamento: this.equipamentos.values()) 
			System.out.println(equipamento + "|ID: " + equipamento.getIdentificador() + " |Qtd: " + equipamento.getQuantidade());	
	}

	public String getClassName(String identificador) {
		return this.equipamentos.get(identificador).getClass().toString();
	}
	
	public String getClassName(TipoEquipamento tipoEquipamento) {
		return "class br.edu.ifba.inf011.aval1.models." + tipoEquipamento.toString();
	}
}
