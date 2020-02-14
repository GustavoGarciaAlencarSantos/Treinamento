package exerc3;

/**
 * classe que herda Produto
 * 
 * @author galencar
 * @since 11/02/2020
 * @version 0,2
 */
public class Computador extends Produto {
	String tela = "29'0 ", hd = "500 ", placadevideo = "geforce ",
			processador = "amd ", memoria = "4gigas ";

	// valida os dados é exibe
	public void exibirComputador() {
		exibirTudo();
		System.out.println("a tela tem o tamanho de " + tela);
		System.out.println(" O hd tem tamanho de " + hd);
		System.out.println("a placa de video e " + placadevideo);
		System.out.println("o Processador e " + processador);
		System.out.println("a memoria e de " + memoria);
	}

}
