package beans;

public class AgendaRevisao {
	
	//public s�o modificadores de acesso
	//Atributos
	public Date data;
	public Date hora;
	public String cliente;
	public String fone;
	public String veiculo;
	public String modelo;

	//opera��es (metodos)
	
	public void agendar() {
		System.out.println("Agendado..!!");
	}
	public void reagendar() {}
	public void cancelar() {}

}
