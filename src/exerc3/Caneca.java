package exerc3;

/**
 * classe para que herda Produto
 * 
 * @author galencar
 * @since 11/02/2020
 * @version 0.2
 */
public class Caneca extends Produto {
	String material, medida;
	boolean estampa = false;

	// valida os dados � exibe
	public void exibirCaneca() {
		exibirTudo();
		if (estampa) {
			System.out.println("tem Estampa");
		} else {
			System.out.println("Nao tem estampa");
		}
		if (material != null) {
			System.out.println("o material da caneca � " + material);
		} else {
			System.out.println("nao tem materia informado");
		}
		if (medida != null) {
			System.out.println("a medida � " + medida);
		} else {
			System.out.println("n�o tem medida");

		}

	}

}
