package JAVA_PKG;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //SC1: print Date
        Date date = new Date();
        System.out.println("Complete Date: "+date);

        //SC2: print date into dd/M/yy format
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        System.out.println("SC2: "+sdf.format(date));

        //SC3: print date & time into dd/M/yy format
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-M-yy hh:mm:ss");
        System.out.println("SC3: "+sdf1.format(date));

        //SC4: print date & time into dd/M/yy format
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/M/yyyy HH:mm:ss");
        System.out.println("SC4: "+sdf2.format(date));


    }
}
