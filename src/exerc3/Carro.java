package exerc3;

/**
 * classe que herda de produto
 * 
 * @author galencar
 * @since 11/02/2020
 * @version 0.2
 */
public class Carro extends Produto {
	String marca, modelo, cor, motor, ano;

	// valida os dados é exibe

	public void exibirCarro() {
		exibirTudo();
		if (marca != null) {
			System.out.println("a marca é " + marca);
		} else {
			System.out.println("nao tem marca informada");
		}
		if (modelo != null) {
			System.out.println("o modelo é" + modelo);
		} else {
			System.out.println("nao tem modelo ");
		}
		if (cor != null) {
			System.out.println("A cor é " + cor);
		} else {
			System.out.println("nao tem cor informada");
		}
		if (motor != null) {
			System.out.println("o motor é " + motor);
		} else {
			System.out.println("nao tem motor informado");
		}
		if (ano != null) {
			System.out.println("o ano é " + ano);
		} else {
			System.out.println("Nao tem ano informado");
		}

	}
}
