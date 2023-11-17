package interviewJavaPrograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DifferenceInDates {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat myformat = new SimpleDateFormat("dd MM yyyy");
		
		String beforeDate = "31 01 2014";
		String afterdate = "02 02 2014";
		
		Date datebefore = myformat.parse(beforeDate);
		Date dateafter = myformat.parse(afterdate);
		
		long difference = dateafter.getTime() - datebefore.getTime();
		float daysbetween = (difference /(1000*60*60*24));
		
		System.out.println("days between " + daysbetween);

	}

}
