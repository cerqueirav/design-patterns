package br.edu.ifba.inf011.aval1.fm;

import br.edu.ifba.inf011.aval1.models.Equipamento;
import br.edu.ifba.inf011.aval1.models.Maquinas;

public class MaquinasFactory extends EquipamentoFactory{
	
	@Override
	public Equipamento createEquipamento(String identificador, int quantidade) {
		// TODO Auto-generated method stub
		return Maquinas.getInstance(identificador, quantidade);
	}
}
