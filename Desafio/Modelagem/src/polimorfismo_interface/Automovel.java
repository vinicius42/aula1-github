package polimorfismo_interface;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class Automovel implements I_item{
	public String categoria = "";
	public String DataRetirada = "";
	public String HoraRetirada = "";
	public String DataDevolucao = "";
	public String HoraDevolucao = "";
	public double preco = 0.0;
	
	private int CalcularRetirada() throws ParseException {
		// 1° Converter as String em Date
		Date d1, d2;
		d1 = new SimpleDateFormat("dd/MM/yyyy").parse(DataRetirada); 
		// Toda vez que tiver Parse, podemos ter erro. Assim temos que colocar o throw ou try/catch
		// Publicar o erro pro consumidor, utiliza o throw
		d2 = new SimpleDateFormat("dd/MM/yyyy").parse(DataDevolucao);
		
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
	

	public double CalcularPreco() {
		int diarias = 0;
		try {
			diarias = this.CalcularRetirada();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.preco * diarias; // Ainda está incompleto
	}

}
