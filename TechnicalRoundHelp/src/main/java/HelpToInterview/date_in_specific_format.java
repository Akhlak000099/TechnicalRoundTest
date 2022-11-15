package HelpToInterview;


import java.text.SimpleDateFormat;
import java.util.Date;

public class date_in_specific_format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		
		SimpleDateFormat simpleDateFormat2 =new SimpleDateFormat(pattern);
		System.out.println(simpleDateFormat2.format(new Date()));
	}

}
