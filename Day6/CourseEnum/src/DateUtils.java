import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	private static final String FORMAT = "dd/MM/yyyy";
	private static final String EMPTY = "";
	
	private DateUtils(){
		//To not let developer create object of this class
	}
	
	public static String dateFromater(Date date) {
		
		if(null==date) {
			return null;
		}
		
		SimpleDateFormat df = new SimpleDateFormat(FORMAT);
		String fDate = df.format(date);
		return fDate;
	}
	
	public static Date getDate(String date) throws ParseException   {
		
		if(null == date || EMPTY.equals(date)) {
			return null;
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		Date d = sdf.parse(date);
		return d;
	}
}