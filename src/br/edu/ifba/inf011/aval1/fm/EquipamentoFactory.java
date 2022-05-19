package br.edu.ifba.inf011.aval1.fm;

import java.lang.reflect.InvocationTargetException;

import br.edu.ifba.inf011.aval1.Equipamento;

public abstract class EquipamentoFactory {
	
	public static Equipamento novoEquipamento(TipoEquipamento tipo, String identificador, int quantidade) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		EquipamentoFactory factory = 
				(EquipamentoFactory) Class.forName(tipo.getFactoryName()).getConstructor().newInstance();
		return factory.createProduto(identificador, quantidade);
	}

	public abstract  Equipamento createProduto(String identificador, int quantidade);
}
