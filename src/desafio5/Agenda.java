package desafio5;

public class Agenda {
	Contato[] listaContato = new Contato[20];

	public void adicionaContato(Contato contato) {

		for (int i = 0; i < listaContato.length; i++) {

			if (listaContato[i] == null) {

				listaContato[i].nome = contato.nome;
				listaContato[i].email = contato.email;
				System.out.println("nome adicionado com sucesso");
			}
		}
	}

	public Contato buscaContato(String nome) {
		for (int i = 0; i < listaContato.length; i++) {
          if(listaContato[i].nome == nome ){
        	  System.out.println("Busca feita com sucesso");
        	  return listaContato[i];
          }
		}return null;

	}
   public void apagaContato(String nome){
	  for(int i = 0;i<listaContato.length;i++){
		  if (listaContato[i].nome == nome){
			  listaContato[i] = null;
			  System.out.println("apagado com sucesso");
		  }
	  }
   }

}
