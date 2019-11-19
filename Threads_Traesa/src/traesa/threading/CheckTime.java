package traesa.threading;
import java.text.DateFormat;
import java.util.*;
public class CheckTime implements Runnable{
	
	public void run() {
		Date rightNow;
		Locale currentLocale;
		DateFormat timeFormatter;
		String outputTime;
		
		rightNow = new Date();
		currentLocale = new Locale("en");
		
		timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
		outputTime = timeFormatter.format(rightNow);
		
		System.out.println("Time: " + outputTime);
	}

}
