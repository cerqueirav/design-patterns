package br.edu.ifba.inf011.aval1;

import java.lang.reflect.InvocationTargetException;

import br.edu.ifba.inf011.aval1.fm.EquipamentoFactory;
import br.edu.ifba.inf011.aval1.fm.TipoEquipamento;

public class Aplicacao {
	
	private void rodarQ1() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Equipamento equip01 = EquipamentoFactory.novoEquipamento(TipoEquipamento.HALTERES,
																"EQUIP_ACA01", 25);
		System.out.println(equip01);
		
		Equipamento equip02 = EquipamentoFactory.novoEquipamento(TipoEquipamento.ACESSORIOS,
  				 												"EQUIP_ACA02", 46);
		System.out.println(equip02);
		
		Equipamento equip03 = EquipamentoFactory.novoEquipamento(TipoEquipamento.MAQUINAS,
																"EQUIP_ACA03", 13);
		System.out.println(equip03);	
	}
	

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Aplicacao app = new Aplicacao();
		app.rodarQ1();
	}
}
