package CoreJava;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {

	public static void main(String[] args) {

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/y");
		SimpleDateFormat sd = new SimpleDateFormat("M/d/y h:m:s");
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		System.out.println(d.toString());
		System.out.println("current date displays successfully");
	}
}
