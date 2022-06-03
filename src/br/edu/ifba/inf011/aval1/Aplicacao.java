package br.edu.ifba.inf011.aval1;

import java.lang.reflect.InvocationTargetException;

import br.edu.ifba.inf011.aval1.builder.ExercicioBuilder;
import br.edu.ifba.inf011.aval1.builder.TipoExercicio;
import br.edu.ifba.inf011.aval1.fm.EquipamentoFactory;
import br.edu.ifba.inf011.aval1.fm.TipoEquipamento;
import br.edu.ifba.inf011.aval1.models.Acessorios;
import br.edu.ifba.inf011.aval1.models.Equipamento;
import br.edu.ifba.inf011.aval1.models.Exercicio;
import br.edu.ifba.inf011.aval1.models.Halteres;
import br.edu.ifba.inf011.aval1.models.Maquinas;

public class Aplicacao {
	
	private void rodarQ1() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// Criação do Catalogo de Equipamentos
		CatalogoEquipamentos catalogo = CatalogoEquipamentos.getCatalogo();
		
		// Testes unitários - Casos de Sucesso
		System.out.println("Testes - Casos de Sucesso");
		
		catalogo.addEquipamento(TipoEquipamento.Halteres, "EQUIP_01", 25);
		catalogo.listarEquipamento("EQUIP_01");
		
		catalogo.addEquipamento(TipoEquipamento.Halteres, "EQUIP_02", 100);
		catalogo.listarEquipamento("EQUIP_02");
		
		catalogo.addEquipamento(TipoEquipamento.Halteres, "EQUIP_02", 87);
		catalogo.listarEquipamento("EQUIP_02");
		
		catalogo.addEquipamento(TipoEquipamento.Acessorios, "EQUIP_03", 53);
		catalogo.listarEquipamento("EQUIP_03");
		
		catalogo.addEquipamento(TipoEquipamento.Acessorios, "EQUIP_03", 2);
		catalogo.listarEquipamento("EQUIP_03");
		
		catalogo.addEquipamento(TipoEquipamento.Acessorios, "EQUIP_04", 98);
		catalogo.listarEquipamento("EQUIP_04");
		
		catalogo.addEquipamento(TipoEquipamento.Maquinas, "EQUIP_05", 65);
		catalogo.listarEquipamento("EQUIP_05");
		
		catalogo.addEquipamento(TipoEquipamento.Maquinas, "EQUIP_06", 32);
		catalogo.listarEquipamento("EQUIP_06");
		
		catalogo.addEquipamento(TipoEquipamento.Maquinas, "EQUIP_06", 12);
		catalogo.listarEquipamento("EQUIP_06");
		
		// Testes unitários - Casos de Erro (validação de quantidade e tipo do Equipamento)
		System.out.println("\nTestes - Casos de Erro");
		
		catalogo.addEquipamento(TipoEquipamento.Halteres, "EQUIP_02", 0);
		catalogo.listarEquipamento("EQUIP_02");
		
		catalogo.addEquipamento(TipoEquipamento.Acessorios, "EQUIP_05", 46);
		catalogo.listarEquipamento("EQUIP_05");
		
		catalogo.addEquipamento(TipoEquipamento.Maquinas, "EQUIP_06", -22);
		catalogo.listarEquipamento("EQUIP_06");
		
		// Testes unitários - Casos de Erro (instanciação direta com o New)
		//Halteres halteres = new Halteres("EQUIP_11", 40);
		//Acessorios acessorios = new Acessorios("EQUIP_12", 55);
		//Maquinas maquinas = new Maquinas("EQUIP_13", 88);
		
		// Lista todos os Equipamentos do Catalogo
		//catalogo.getEquipamentos();
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
