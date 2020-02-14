package exerc7;

import java.awt.Dimension;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Locadora {
	static Carro vetorCarro[];
            Carro[] carroAux = new Carro[10];    
               
	boolean terminar = true;
	 boolean carroNaoEncontrado = false;

	
	 
	 public void escolhaComprar(String cor, String modelo) {
       String  vetorAux="" ;
		int cont = 0;
		
		 ordenaComprar();
		 for (int i = 0; i < vetorCarro.length; i++) {
			 
			if (vetorCarro[i].modeloDoCarro.equals(modelo) && vetorCarro[i].cor.equals(cor)) {
                
				vetorAux = vetorAux +" \n" + "carro numero "  + ++cont +"\n" ;
				vetorAux = vetorAux + " o combustivel é " + vetorCarro[i].combustivel+"\n";
                vetorAux = vetorAux + " a cor é " +vetorCarro[i].cor+"\n";
                vetorAux = vetorAux + " o modelo é " +vetorCarro[i].modeloDoCarro+"\n";
                vetorAux = vetorAux + " a placa é "+vetorCarro[i].placaDoCarro+"\n";
                vetorAux = vetorAux + " o valor é  "+vetorCarro[i].valor+"\n";
                
                carroAux[cont] = vetorCarro[i];
                
                carroNaoEncontrado = true;
               
			}
		}
		 if( carroNaoEncontrado == false){
			
			JOptionPane.showMessageDialog(null,"desculpa nao temos esse  carro");
		}
		
		if( carroNaoEncontrado == true){
			int escolha =Integer.parseInt(JOptionPane.showInputDialog(vetorAux));
		
			for(int i = 1 ;i< carroAux.length;i ++ ) {
			   for(int j = 0; j <)
			
			
		}
			
		}
		
		
}
	public void Compra(int escolha) {
      JOptionPane.showInputDialog("Digite quanto quer pagar");
	
	
	
	}


	public void ordenaComprar() {
		Carro carroOrdem;

		for (int i = 0; i < vetorCarro.length; i++) {

			for (int j = 0; j < vetorCarro.length; j++) {
				if (vetorCarro[i].valor < vetorCarro[j].valor) {

					carroOrdem = vetorCarro[i];
					vetorCarro[i] = vetorCarro[j];
					vetorCarro[j] = carroOrdem;

				}
			}
		}
	}



public void ordenaTodos() {
		Carro carroOrdem;

		for (int i = 0; i < vetorCarro.length; i++) {

			for (int j = 0; j < vetorCarro.length; j++) {
				if (vetorCarro[i].valor > vetorCarro[j].valor) {

					carroOrdem = vetorCarro[i];
					vetorCarro[i] = vetorCarro[j];
					vetorCarro[j] = carroOrdem;
                     
				}
			}
		}
	}
	

	public void exibeTodos() {
		String vetorAu = "";
		
		for (int i = 0; i < vetorCarro.length; i++) {
			if(vetorCarro[i].vendido == false) {
				vetorAu = vetorAu + " o modelo é " +vetorCarro[i].modeloDoCarro+"\n";
				vetorAu = vetorAu + " o combustivel é " + vetorCarro[i].combustivel+"\n";
                vetorAu = vetorAu + " a cor é " +vetorCarro[i].cor+"\n";
                 vetorAu = vetorAu + " a placa é "+vetorCarro[i].placaDoCarro+"\n";
                vetorAu = vetorAu + " o valor é  "+vetorCarro[i].valor+"\n";
                vetorAu = vetorAu + "\n";
			}
			
		}
		JTextArea textArea = new JTextArea(vetorAu);
		JScrollPane scrollPane = new JScrollPane(textArea);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		scrollPane.setPreferredSize(new Dimension(500,500 ));
		
	JOptionPane.showMessageDialog(null,scrollPane,vetorAu,JOptionPane.YES_NO_OPTION) ;
		
	}

	public void descideBusca() {
		int qualBusca = 0;

		while (terminar = true) {
			switch (qualBusca) {
			case 0:

				qualBusca = Integer.parseInt(JOptionPane.showInputDialog(
						"Digite o que quer buscar  \n1 para Modelo \n 2 para combustivel \n 3 para velocidade \n 4 para mostrar \n 5 para escolher cor \n 6 para comprar "));
				break;
			case 1:
				String modelo = JOptionPane.showInputDialog("Digite o modelo").toUpperCase();
				BuscaModelo(modelo);
				qualBusca = 0;
				break;
			case 2:
				String combustivel = JOptionPane.showInputDialog("Digite o combustivel").toUpperCase();
				BuscaCombustivel(combustivel);
				qualBusca = 0;
				break;
			case 3:
				String velocidade = JOptionPane.showInputDialog("Digite a velocidade").toUpperCase();
				int velocidadeConvert = Integer.parseInt(velocidade);
				BuscaVelocidade(velocidadeConvert);
				qualBusca = 0;
				break;
			case 4:
				ordenaTodos();
				exibeTodos();
				qualBusca = 0;
				break;
			case 5:
				String cor = JOptionPane.showInputDialog("Digite a cor").toUpperCase();
				BuscaCor(cor);
				qualBusca = 0;
				break;

			case 6:
				String corC = JOptionPane.showInputDialog("digite a cor desejada").toUpperCase();
				String modeloC = JOptionPane.showInputDialog("digite O modelo desejado").toUpperCase();
				escolhaComprar(corC, modeloC);
				qualBusca = 0;
				break;
			case 9:
				terminar = false;

				break;

			default:
				System.out.println("vc nao sabe escolher");
				break;
			}
		}

	}

	public void BuscaCor(String corConvert) {
		boolean encontrar = false;
		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].cor.contentEquals(corConvert)) {

				vetorCarro[i].exibeCarro();
				encontrar = true;
			}

		}
		if (!encontrar) {
			JOptionPane.showMessageDialog(null, "nao encontrou");
		}

	}

	public void BuscaModelo(String modelo) {
		boolean encontrar = false;
		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].modeloDoCarro.contentEquals(modelo)) {

				vetorCarro[i].exibeCarro();
				encontrar = true;
			}

		}
		if (!encontrar) {
			JOptionPane.showMessageDialog(null, "nao encontrou");
		}

	}

	public void BuscaCombustivel(String combustivel) {
		boolean encontrar = false;
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].combustivel.contentEquals(combustivel)) {

				vetorCarro[i].exibeCarro();
			}
		}
		if (encontrar) {
			JOptionPane.showMessageDialog(null, "nao encontrou");
		}

	}

	public boolean BuscaVelocidade(int velocidade) {
		boolean encontrar = false;
		for (int i = 0; i < vetorCarro.length; i++) {

			if (velocidade == vetorCarro[i].velocidade) {

				vetorCarro[i].exibeCarro();
				if (i == vetorCarro.length) {
					return true;
				}

			}
			if (encontrar) {
				JOptionPane.showMessageDialog(null, "nao encontrou");
			}
		}
		return false;
	}

	public Locadora() {
		descideBusca();
	}

	public static void main(String[] args) {

		vetorCarro = new Carro[10];
		Carro carro1 = new Carro("FUSCA", "abc1234", "GASOLINA", 10, 500, "AZUL",false);
		vetorCarro[0] = carro1;
		Carro carro2 = new Carro("FUSCA", "cbc4321", "GASOLINA", 20, 500, "AZUL",false);
		vetorCarro[1] = carro2;
		Carro carro3 = new Carro("ford ka", "acb2141", "GASOLINA", 30, 500, "AZUL",false);
		vetorCarro[2] = carro3;
		Carro carro4 = new Carro("renegadi", "abc6319", "FLEX", 6, 1500, "azuli",false);
		vetorCarro[3] = carro4;
		Carro carro5 = new Carro("DODGE", "abc7319", "GASOLINA", 50, 1500, "CINZA",false);
		vetorCarro[4] = carro5;
		Carro carro6 = new Carro("CAMARO", "abc4919", "FLEX", 60, 1500, "CINZA",false);
		vetorCarro[5] = carro6;
		Carro carro7 = new Carro("OPALA", "abc4310", "GASOLINA", 7, 1500, "ROXO",false);
		vetorCarro[6] = carro7;
		Carro carro8 = new Carro("BRASILIA", "abc4389", "ETANOL", 8, 1500, "ROXO",false);
		vetorCarro[7] = carro8;
		Carro carro9 = new Carro("FUSCA", "abc5319", "PETROLEO", 90, 1500, "AZUL",false);
		vetorCarro[8] = carro9;
		Carro carro10 = new Carro("FUSCA", "abc1019", "DISSEL", 4, 1500, "AZUL",false);
		vetorCarro[9] = carro10;
		new Locadora();
	}
}
