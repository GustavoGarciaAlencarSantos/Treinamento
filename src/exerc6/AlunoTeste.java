package exerc6;

import javax.swing.JOptionPane;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class AlunoTeste {

	public static void main(String[] args) {
	
   String dataCompleta = JOptionPane.showInputDialog("informe a data de Nascimento: ");
   String data[] = dataCompleta.split("/");
   
   int ano = Integer.parseInt(data[2]);
   int mes = Integer.parseInt(data[1]);
   int dia = Integer.parseInt(data[0]);
   
    String anoA = (new java.text.SimpleDateFormat("yyyy").format(new java.util.Date(System.currentTimeMillis())));
	String MesA = (new java.text.SimpleDateFormat("MM").format(new java.util.Date(System.currentTimeMillis())));
	String diasA = (new java.text.SimpleDateFormat("dd").format(new java.util.Date(System.currentTimeMillis())));

	int anoAt = Integer.parseInt(anoA);
	int mesAt = Integer.parseInt(MesA);
	int diasAT = Integer.parseInt(diasA);
	
  
   
	DateTime dataInicial = new DateTime(ano,mes,dia,0,0);
	DateTime dataAtual = new DateTime(anoAt,mesAt,diasAT,0,0);
	
	int dias = Days.daysBetween(dataInicial, dataAtual).getDays();
	System.out.println(dias);
	}

}
