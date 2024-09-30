import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateUtils {
	private static String FORMAT = "dd/MM/yyyy";
	
	public static Date getDate(String date) throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		Date newDate = sdf.parse(date);
		return newDate;
		
	} 
	
   public static String formatDate(Date date) throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		String newDate = sdf.format(date);
		return newDate;
		
	} 
}
