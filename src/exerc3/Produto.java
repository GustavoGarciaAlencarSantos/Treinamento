package exerc3;

/**
 * classe produto contem todos os atributos de um produto
 * 
 * @author galencar
 * @since 11/02/2020
 * @version 0.1
 */
public class Produto {

	String nome;
	int quantidade;
	double custo;
	int quantidadeVendido;
	double percentualDeLucro;
	double resultado;

	// exibe o nome

	public void exibirNome() {
		if (nome != null) {
			System.out.println("o nome do produto é " + nome);
		} else {
			System.out.println("nome nao foi informado");

		}
	}

	// exibi o lucro
	public void exibirLucro() {
		if (percentualDeLucro >= 0) {
			System.out.println("o percentual de lucro é " + porcentualLucro());

		} else {
			System.out.println("Lucro menor Que 0");
		}
	}

	public double porcentualLucro() {
		if (percentualDeLucro >= 0) {
			resultado = (percentualDeLucro / 100) * custo;

		}

		return resultado;
	}

	// exibe valor
	public void exibirValor() {
		if (custo > 0) {
			System.out.println("o valor é " + (custo + porcentualLucro()));

		} else {
			System.out.println("voce digitou 0 no custo");
		}

	}

	// exibe tudo
	public void exibirTudo() {
		exibirNome();
		exibirValor();
		exibirLucro();

	}

}
