package br.edu.ifba.inf011.aval1.fm;
import br.edu.ifba.inf011.aval1.Equipamento;
import br.edu.ifba.inf011.aval1.Halteres;

public class HalteresFactory extends EquipamentoFactory {

	@Override
	public Equipamento createEquipamento(String identificador, int quantidade) {
		// TODO Auto-generated method stub
		return new Halteres(identificador, quantidade);
	}

}
