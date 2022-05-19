package br.edu.ifba.inf011.aval1.fm;

import br.edu.ifba.inf011.aval1.Acessorios;
import br.edu.ifba.inf011.aval1.Equipamento;

public class AcessoriosFactory extends EquipamentoFactory{

	@Override
	public Equipamento createEquipamento(String identificador, int quantidade) {
		// TODO Auto-generated method stub
		return new Acessorios(identificador, quantidade);
	}
}
