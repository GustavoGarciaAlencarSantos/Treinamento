package separaData;

import javax.swing.JOptionPane;

public class Repeticao {

	boolean exit = false;

	public Repeticao() {
//		while (!exit) {
//			processar();
	//	testaWhile();
		testaDoWhile();
		}

	//}
	public void testaWhile() {
		int i = 10;
		while(i<10) {
			System.out.println(i + "ao cubo �" + (i*i)*i);
			i++;
		}
	}
	public void testaDoWhile() {
		int i = 10;
		do{
			System.out.println(i + "ao cubo �" + (i*i)*i);
			i++;
		}while(i<10); 
	}
	public void processar() {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("informe a opcao "));
		switch (opcao) {
		case 1:
			JOptionPane.showInputDialog("sua opcao foi 1");
			break;
		case 2:
			JOptionPane.showInputDialog("sua opcao foi 2 ");
			break;
		case 3:
			JOptionPane.showInputDialog("sua opcao foi 3 ");
			break;
		case 9:
			exit = true;
			break;
		default:

			JOptionPane.showInputDialog("sua opcao foi invalida ");

			break;
		}
	}

	public static void main(String[] args) {
		new Repeticao();
	}
}
