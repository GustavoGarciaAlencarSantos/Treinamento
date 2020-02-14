package exerc3;

/**
 * classe que herda Produto
 * 
 * @author galencar
 * @since 11/02/2020
 * @version 0.2
 */
public class Caneta extends Produto {
	String cor, formato;

	// valida os dados � exibe
	public void exibirCaneta() {
		exibirTudo();
		if (cor != null) {
			System.out.println("a cor � " + cor);

		} else {
			System.out.println("nao tem cor informada");
		}
		if (formato != null) {
			System.out.println("o formato � " + formato);
		} else {
			System.out.println("nao tem formato informado");
		}
	}
}
