package br.edu.ifba.inf011.aval1;

import java.lang.reflect.InvocationTargetException;

import br.edu.ifba.inf011.aval1.fm.CatalogoEquipamentos;
import br.edu.ifba.inf011.aval1.fm.TipoEquipamento;

public class Aplicacao {
	
	private void rodarQ1() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// Q1) Criação dos Equipamentos (Testes)
		CatalogoEquipamentos catalogo = CatalogoEquipamentos.getCatalogo();
		
		catalogo.cadastrar(TipoEquipamento.Halteres, "EQUIP_01", 25);	
		catalogo.cadastrar(TipoEquipamento.Halteres, "EQUIP_02", 100);
		catalogo.cadastrar(TipoEquipamento.Halteres, "EQUIP_02", 56);
		catalogo.cadastrar(TipoEquipamento.Acessorios, "EQUIP_03", 53);
		catalogo.cadastrar(TipoEquipamento.Acessorios, "EQUIP_03", 74);
		catalogo.cadastrar(TipoEquipamento.Acessorios, "EQUIP_04", 98);
		catalogo.cadastrar(TipoEquipamento.Maquinas, "EQUIP_05", 65);
		catalogo.cadastrar(TipoEquipamento.Maquinas, "EQUIP_06", 32);
		catalogo.cadastrar(TipoEquipamento.Maquinas, "EQUIP_06", 12);
		
		catalogo.findAll();
	}
	
	private void rodarQ2() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Aplicacao app = new Aplicacao();
		app.rodarQ1();
		//app.rodarQ2();
	}
}
