package br.com.Aula04.beans;

public class Veiculo {
	
	private String placa;
	private String modelo;
	private Motor motor;
	
	public Veiculo(String placa, String modelo, Motor motor) {
		this.placa = placa;
		this.modelo = modelo;
		this.motor = motor;
	}
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	

}
