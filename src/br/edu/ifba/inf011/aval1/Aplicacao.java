package br.edu.ifba.inf011.aval1;

import java.lang.reflect.InvocationTargetException;

import br.edu.ifba.inf011.aval1.builder.ExercicioBuilder;
import br.edu.ifba.inf011.aval1.builder.TipoExercicio;
import br.edu.ifba.inf011.aval1.fm.EquipamentoFactory;
import br.edu.ifba.inf011.aval1.fm.TipoEquipamento;
import br.edu.ifba.inf011.aval1.models.Equipamento;
import br.edu.ifba.inf011.aval1.models.Exercicio;

public class Aplicacao {
	
	private void rodarQ1() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// Criação dos Equipamentos (Testes)
		CatalogoEquipamentos catalogo = CatalogoEquipamentos.getCatalogo();
		
		catalogo.cadastrar(TipoEquipamento.Halteres, "EQUIP_01", 25);	
		catalogo.cadastrar(TipoEquipamento.Halteres, "EQUIP_02", 100);
		catalogo.cadastrar(TipoEquipamento.Halteres, "EQUIP_02", 87);
		catalogo.cadastrar(TipoEquipamento.Acessorios, "EQUIP_03", 53);
		catalogo.cadastrar(TipoEquipamento.Acessorios, "EQUIP_03", 33);
		catalogo.cadastrar(TipoEquipamento.Acessorios, "EQUIP_04", 98);
		catalogo.cadastrar(TipoEquipamento.Maquinas, "EQUIP_05", 65);
		catalogo.cadastrar(TipoEquipamento.Maquinas, "EQUIP_05", -55);
		catalogo.cadastrar(TipoEquipamento.Maquinas, "EQUIP_06", 32);
		catalogo.cadastrar(TipoEquipamento.Maquinas, "EQUIP_06", 12);
	
		catalogo.getEquipamentos();
	}
	
	private void rodarQ2() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// Criação dos Exercicios (Testes)
		CatalogoExercicios catalogo = CatalogoExercicios.getCatalogo();
		
		Equipamento equip01 = EquipamentoFactory.novoEquipamento(TipoEquipamento.Halteres, 
																 "EQUIP_18", 50);
		Equipamento equip02 = EquipamentoFactory.novoEquipamento(TipoEquipamento.Acessorios, 
				 												 "EQUIP_35", 90);
		Equipamento equip03 = EquipamentoFactory.novoEquipamento(TipoEquipamento.Maquinas, 
				 												 "EQUIP_40", 76);
		Exercicio exercicio = ExercicioBuilder.factory()
											  .reset()
											  .setDescricao("Leg Press 90°")
											  .addTipoExercicio(TipoExercicio.Resistido)
											  .addGrupoMuscular("Pernas")
											  .addEquipamento(equip01)
											  .addTipoExercicio(TipoExercicio.Funcional)
											  .addEquipamento(equip02)
											  .addGrupoMuscular("Panturrilha")
											  .addEquipamento(equip03)
											  .build();
		
		catalogo.findAll(exercicio.getDescricao());
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Aplicacao app = new Aplicacao();
		app.rodarQ1();
		//app.rodarQ2();
	}
}
