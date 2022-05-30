package br.edu.ifba.inf011.aval1.fm;

import br.edu.ifba.inf011.aval1.models.Acessorios;
import br.edu.ifba.inf011.aval1.models.Equipamento;

public class AcessoriosFactory extends EquipamentoFactory{

	@Override
	public Equipamento createEquipamento(String identificador, int quantidade) {
		// TODO Auto-generated method stub
		return Acessorios.getInstance(identificador, quantidade);
	}
}
