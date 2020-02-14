package exerc6;

import java.util.Calendar;
/**
 * clase que tem tudo de um aluno e calcula ano e dias de vida
 * @author galencar
 *@since
 */
public class Aluno {
	String nome, curso, cidade;
	int anoNascimento;

	int idade;
	String dataNascimento;

	// calcula anos de vida
	public int calcularano() {
		String data = (new java.text.SimpleDateFormat("yyyyMMdd")
				.format(new java.util.Date(System.currentTimeMillis())));
		String datas[] = dataNascimento.split("/");
		String dataNasc = datas[2] + datas[1] + datas[0];

		int anoNasci = Integer.parseInt(dataNasc);
		int anoat = Integer.parseInt(data);
		int resultado;
		resultado = anoat - anoNasci;
		resultado = (resultado % 1000000 / 10000);
		return resultado;
	}

// metodo que calcula dias de vida
	public int calculaTempoVida() {

		String ano = (new java.text.SimpleDateFormat("yyyy").format(new java.util.Date(System.currentTimeMillis())));
		String Mes = (new java.text.SimpleDateFormat("MM").format(new java.util.Date(System.currentTimeMillis())));
		String dias = (new java.text.SimpleDateFormat("dd").format(new java.util.Date(System.currentTimeMillis())));

		int anoI = Integer.parseInt(ano);
		int mesI = Integer.parseInt(Mes);
		int diasI = Integer.parseInt(dias);

		String datas[] = dataNascimento.split("/");

		int anoA = Integer.parseInt(datas[2]);
		int mesA = Integer.parseInt(datas[1]);
		int diasA = Integer.parseInt(datas[0]);

		int totaldias = ((anoI * 365) + (mesI * 30) + diasI) - ((anoA * 365) + (mesA * 30) + diasA);

		return totaldias;
	}

//metodo que faz anos de vida errado
	public int calcularERetornarIdade() {

		idade = (Calendar.getInstance().get(Calendar.YEAR)) - anoNascimento;

		return idade;
	}
//metodo que exibe tudo
	public void mostrarTudo() {
		calcularERetornarIdade();
		System.out.println("seu nome é " + nome);
		System.out.println("seu curso é " + curso);
		System.out.println("sua cidade é " + cidade);
		System.out.println("sua idade é " + calcularERetornarIdade());
		System.out.println("sua idade certa é " + calcularano());
		System.out.println("a quantidade de dias de vida é " + calculaTempoVida());
	}
 //construtor
	public Aluno(String nome, String curso, String cidade, int anoNascimento, String dataNascimento) {
		this.dataNascimento = dataNascimento;
		this.nome = nome;
		this.curso = curso;
		this.cidade = cidade;
		this.anoNascimento = anoNascimento;
		mostrarTudo();
		calcularano();
	}

}
