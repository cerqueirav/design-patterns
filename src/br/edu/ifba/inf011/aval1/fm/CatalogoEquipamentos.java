package br.edu.ifba.inf011.aval1.fm;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import br.edu.ifba.inf011.aval1.models.Equipamento;


public class CatalogoEquipamentos {
	private static CatalogoEquipamentos catalogo;
	
	private Map<String, Equipamento> equipamentos;
	
	public static CatalogoEquipamentos getCatalogo() {
		if (catalogo == null) 
			catalogo = new CatalogoEquipamentos();
		
		return CatalogoEquipamentos.catalogo;
	}
	
	private CatalogoEquipamentos() {
		this.equipamentos = new HashMap<String, Equipamento>();
	}
	
	public void cadastrar(TipoEquipamento tipo, String identificador, int quantidade) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {		
		CatalogoEquipamentos catalogo = CatalogoEquipamentos.getCatalogo();
		
		if (catalogo.equipamentos.containsKey(identificador)){	// Verifica a existência do Equipamento (a partir do ID)	
			if (getNomeClass(identificador).equals(getNomeClass(tipo))){
				int novaQtd = catalogo.equipamentos.get(identificador).getQuantidade() + quantidade;
				this.equipamentos.get(identificador).setQuantidade(novaQtd);
			}
			else {
				System.err.println("Não é possível criar o equipamento, código utilizado por outro Tipo de Equipamento");
			}
		}
		else {
			EquipamentoFactory fabrica = (EquipamentoFactory) Class.forName(tipo.getFactoryName()).getConstructor().newInstance();
			Equipamento equipamento = fabrica.createEquipamento(identificador, quantidade);
			CatalogoEquipamentos.catalogo.equipamentos.put(identificador, equipamento);	
		}
	}
	
	public  Equipamento listar(String codigo) {
		 if (CatalogoEquipamentos.getCatalogo().equipamentos.get(codigo) != null)
			 return (Equipamento) CatalogoEquipamentos.getCatalogo().equipamentos.get(codigo);
		 
		return null;
	}
	
	public void findAll() {
		for (Equipamento equipamento: CatalogoEquipamentos.getCatalogo().equipamentos.values()) 
			System.out.println(equipamento + "|ID: " + equipamento.getIdentificador() + " |Qtd: " + equipamento.getQuantidade());
		
	}

	public String getNomeClass(String identificador) {
		return CatalogoEquipamentos.getCatalogo().equipamentos.get(identificador).getClass().toString();
	}
	
	public String getNomeClass(TipoEquipamento tipoEquipamento) {
		return "class br.edu.ifba.inf011.aval1.models." + tipoEquipamento.toString();
	}
	
}
