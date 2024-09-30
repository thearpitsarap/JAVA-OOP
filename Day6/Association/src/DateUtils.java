import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateUtils {
	private static final String FORMAT = "dd/MM/yyyy";
	private static final String EMPTY = "";
	
	private DateUtils() {}
	
	public static Date getDate(String d) throws ParseException{
		
		if(null==d || EMPTY==d) {
			return null;
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		Date date = sdf.parse(d);
		
		return date;
	}
}