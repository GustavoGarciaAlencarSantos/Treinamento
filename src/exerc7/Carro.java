package exerc7;

import javax.swing.JOptionPane;

/**
 * 
 * @author galencar
 *
 */
public class Carro {

String modeloDoCarro,placaDoCarro,combustivel;
int velocidade;
double valor;
String cor;
boolean vendido = false;
public Carro() {
	
}
public Carro(String modeloDoCarro, String placaDoCarro, String combustivel, double valor, int velocidade,String cor, boolean vendido) {
	this.cor = cor;
	this.modeloDoCarro = modeloDoCarro;
	this.placaDoCarro = placaDoCarro;
	this.combustivel = combustivel;
	this.valor = valor;
	this.velocidade = velocidade;
	this.vendido = false;
}
public void exibeCarro() {
	JOptionPane.showMessageDialog(null," o modelo do carro � "+ modeloDoCarro +"\n"+" a placa do carro � "+ placaDoCarro+"\n"+" o combustivel do carro � "
+ combustivel+"\n"+" o  valor do carro � "+ valor+"\n"+" A velocidade do carro � "+ velocidade+"\n"+" A cor do carro � "+ cor) ;
	
	
	
	
	
	
}


	
	
	
	
	
	
	
}


