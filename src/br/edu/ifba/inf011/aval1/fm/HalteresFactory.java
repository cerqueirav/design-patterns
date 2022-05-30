package br.edu.ifba.inf011.aval1.fm;
import br.edu.ifba.inf011.aval1.models.Equipamento;
import br.edu.ifba.inf011.aval1.models.Halteres;

public class HalteresFactory extends EquipamentoFactory {

	@Override
	public Equipamento createEquipamento(String identificador, int quantidade) {
		// TODO Auto-generated method stub
		return Halteres.getInstance(identificador, quantidade);
	}

}
