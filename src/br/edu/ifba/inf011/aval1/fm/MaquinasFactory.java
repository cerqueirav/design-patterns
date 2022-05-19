package br.edu.ifba.inf011.aval1.fm;

import br.edu.ifba.inf011.aval1.Maquinas;
import br.edu.ifba.inf011.aval1.Equipamento;

public class MaquinasFactory extends EquipamentoFactory{
	
	@Override
	public Equipamento createProduto(String identificador, int quantidade) {
		// TODO Auto-generated method stub
		return new Maquinas(identificador, quantidade);
	}
}
