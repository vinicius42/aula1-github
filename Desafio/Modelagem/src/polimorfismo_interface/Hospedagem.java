package polimorfismo_interface;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class Hospedagem implements I_item {
	public String CheckIn = "";
	public String CheckOut = "";
	public double PrecoDiaria = 0.0;
	
	//Método privado para calcular a diferença entre as datas (n° de dias)
	private int CalcularDiaria() throws ParseException {
		// 1° Converter as String em Date
		Date d1, d2;
		d1 = new SimpleDateFormat("dd/MM/yyyy").parse(CheckIn); 
		// Toda vez que tiver Parse, podemos ter erro. Assim temos que colocar o throw ou try/catch
		// Publicar o erro pro consumidor, utiliza o throw
		d2 = new SimpleDateFormat("dd/MM/yyyy").parse(CheckOut);
		
		// 2° Converter os objetos "Date" em "Calendar"
		Calendar cd1 = Calendar.getInstance();// Construído uma data calendar dentro do getInstance
		cd1.setTime(d1);
		
		Calendar cd2 = Calendar.getInstance();
		cd2.setTime(d2);
		
		// Precisamos do "localdate", pois ele copia a data conforme o SO
		LocalDate ld1 = LocalDate.of(cd1.get(Calendar.YEAR), 
									 cd1.get(Calendar.MONTH), 
									 cd1.get(Calendar.DAY_OF_MONTH)); // O método of vai converter 3 valores em uma data local
		
		LocalDate ld2 = LocalDate.of(cd2.get(Calendar.YEAR), 
				 cd2.get(Calendar.MONTH), 
				 cd2.get(Calendar.DAY_OF_MONTH));
		
		Period periodo = Period.between(ld1, ld2); // Cálculo do período entre elas
		
		return periodo.getDays();
	}

	@Override
	public double CalcularPreco() {
		// Calcular o preço total de acordo com o número de diárias
		// Aqui eu uso o try/catch para não precisar refatorar cada classe, pois ao alterar a interface temos que alterar
		// em todas as classes caso use o throw
		int diarias = 0;
		try {
			diarias = this.CalcularDiaria();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.PrecoDiaria * diarias; // Ainda está incompleto
	}

}
