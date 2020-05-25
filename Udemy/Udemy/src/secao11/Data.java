package secao11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Data {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		
		Date x1 = new Date();// Criando data com hor�rio de agora
		Date x2 = new Date(System.currentTimeMillis());// Criando data com hor�rio de agora
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:072Z"));// Formato ISO UTC
		
		System.out.println("x1: " + sdf2.format(x1));// Criando data com hor�rio de agora
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		
		
		// Manipular data com Calendar
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(d); // Data instanciada
		cal.add(Calendar.HOUR_OF_DAY, 4); // Vai ser acrescentado 4 horas a minha data
		d = cal.getTime();
		System.out.println(sdf.format(d));
		
		
		cal.setTime(d); // Data instanciada
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH); // Temos que add o 1, pois por padr�o ele come�a no 0
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);

	}

}
