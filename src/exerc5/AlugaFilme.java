package exerc5;

import java.util.*;

/**
 * classe para ver se um filme esta alugado e devolver o troco se necessario
 * 
 * @author galencar
 * @since 12/02/2020
 * @version 0.1
 */
public class AlugaFilme {
	double valorDeAluguelDiario;
	double valorPago;
	int quantidadeDeDias;
	boolean filmeInception = true;
	boolean filmeStolen = true;
	String filmeAlugado;
	int b = 0;
	Scanner sc = new Scanner(System.in);

	// metodo que verifica a disponibilidade e adiciona valor a Aluguel diario
	public void FilmeDisponizel() {
		System.out.println("Digete o filme desejado");
		filmeAlugado = sc.nextLine();
		if (filmeAlugado.equals("Inception")) {
			if (filmeInception) {
				System.out.println("filme Inception Esta disponivel ");
				filmeInception = false;
				valorDeAluguelDiario = 10;
			} else {
				System.out.println("filme Inception  indisponivel");
			}
		} else if (filmeAlugado.equals("Stolen")) {

			if (filmeStolen) {
				System.out.println("filme Stolen Esta disponivel");
				valorDeAluguelDiario = 15;
			} else {
				System.out.println("filme Stolen indisponivel");
			}

		} else {
			System.out.println("filme Nao encontrado na loja");
			b = 1;
		}
	}

	// verifica valor e faz a conta do troco
	public void verificaValor() {
		if (b == 0) {
			System.out.println("Digete o Valor pago");
			valorPago = sc.nextDouble();
			System.out.println("Digete a quantidade de dias");
			quantidadeDeDias = sc.nextInt();

			if ((valorDeAluguelDiario * quantidadeDeDias) == valorPago) {
				System.out.println("valor pago e suficiente para pagar a diaria do " + filmeAlugado);
			}
			if ((valorDeAluguelDiario * quantidadeDeDias) > valorPago) {
				System.out.println("valor pago e insuficiente para pagar a diaria do " + filmeAlugado);
			}
			if ((valorDeAluguelDiario * quantidadeDeDias) < valorPago) {
				System.out.println("valor pago e maior que o da diaria do " + filmeAlugado);
				System.out.println("o valor de troco é " + (valorPago - (valorDeAluguelDiario * quantidadeDeDias)));
			}
		}else {
			b = 0;
		}
	}

	public static void main(String[] args) {

		AlugaFilme a = new AlugaFilme();

		a.FilmeDisponizel();
		a.verificaValor();

	}

}
