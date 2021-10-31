import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simpleDF1 = new SimpleDateFormat("dd/MM/yyyy"); //Formatar data.
		SimpleDateFormat simpleDF2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //Formatar data.
		SimpleDateFormat simpleDF3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //Formatar data.
		simpleDF3.setTimeZone(TimeZone.getTimeZone("GMT")); //Converte o TimeZone para GMT / UTC.
		
		//As datas são criadas em milisegundos
		Date data1 = new Date(); //Instaciar data e hora atual.
		Date data2 = new Date(0L); //Instanciar data inicial que é 01/01/1970 00:00:00 UTC.
		Date data3 = new Date(1000 * 60 * 60 * 3); //Instanciar data com milisegundos adicionando 3h à data inicial.
		
		Date dataManual1 = simpleDF1.parse("31/10/2021"); //Instanciar data com o formato do SimpleDateFormat.
		Date dataManual2 = simpleDF2.parse("31/10/2021 22:53:00"); //Instanciar data com o formato do SimpleDateFormat.
		Date dataManual3 = Date.from(Instant.parse("2021-10-31T22:53:00Z")); //Instanciar data com padrão ISO 8601.
		
		//Exibe data
		System.out.println("----------- Data -----------");
		System.out.println("data1: " + simpleDF1.format(data1));
		System.out.println("data2: " + simpleDF1.format(data2));
		System.out.println("data3: " + simpleDF1.format(data3));
		System.out.println("dataManual1: " + simpleDF1.format(dataManual1));
		System.out.println("dataManual2: " + simpleDF1.format(dataManual2));
		System.out.println("dataManual3: " + simpleDF1.format(dataManual3));
		
		//Exibe data e hora TimeZone local		
		System.out.println("\n----------- Data e Hora TimeZone local -----------");
		System.out.println("data1: " + simpleDF2.format(data1));
		System.out.println("data2: " + simpleDF2.format(data2));
		System.out.println("data3: " + simpleDF2.format(data3));
		System.out.println("dataManual1: " + simpleDF2.format(dataManual1));
		System.out.println("dataManual2: " + simpleDF2.format(dataManual2));
		System.out.println("dataManual3: " + simpleDF2.format(dataManual3));
		
		//Exibe data e hora TimeZone UTC
		System.out.println("\n----------- Data e Hora TimeZone UTC -----------");
		System.out.println("data1: " + simpleDF3.format(data1));
		System.out.println("data2: " + simpleDF3.format(data2));
		System.out.println("data3: " + simpleDF3.format(data3));
		System.out.println("dataManual1: " + simpleDF3.format(dataManual1));
		System.out.println("dataManual2: " + simpleDF3.format(dataManual2));
		System.out.println("dataManual3: " + simpleDF3.format(dataManual3));
	}

}
