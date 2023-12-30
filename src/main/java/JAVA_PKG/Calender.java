package JAVA_PKG;

import java.util.Calendar;

public class Calender {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println(cal.getTime());
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.AM_PM));   //Am=0, PM=1
        System.out.println(cal.get(Calendar.MONTH));  //starting from 0-11

    }

}
