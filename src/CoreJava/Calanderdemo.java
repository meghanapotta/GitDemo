package CoreJava;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calanderdemo {

	public static void main(String[] args) {
		
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("M/d/y h:m:s");
		System.out.println(sd.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		
	}

}
