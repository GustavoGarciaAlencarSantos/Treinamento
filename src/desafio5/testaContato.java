package desafio5;

public class testaContato {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.nome = "Gustavo";
		contato.email = "gustavogarciaalencarsantos@gmail.com";
		
		Agenda agenda = new Agenda();
		
		agenda.adicionaContato(contato);
	}
}
