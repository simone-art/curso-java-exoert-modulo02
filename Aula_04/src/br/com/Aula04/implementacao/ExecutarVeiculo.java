package br.com.Aula04.implementacao;

import br.com.Aula04.beans.Motor;
import br.com.Aula04.beans.Veiculo;

public class ExecutarVeiculo {
	
	public static void main(String[] args) {

		Motor motor = new Motor(120, 4, "Flex");
	
		Veiculo vei = new Veiculo("ABC1234", "Fusca", motor);
		
		System.out.println("veiculo:" + vei.getPlaca() + " motor:" + vei.getMotor().getCombustivel());
	}

}
