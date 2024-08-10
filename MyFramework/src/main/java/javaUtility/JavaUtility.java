package javaUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtility {
	
	public String  add30DaysToDate()
	{
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DAY_OF_WEEK,30);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date dobj=cal.getTime();
		String sdate=sdf.format(dobj);
		return sdate;
		
		
		
	}

}
