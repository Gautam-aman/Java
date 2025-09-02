import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Date;
//hashset

public class Main{
    public static void main(String[] args) {

        HashSet<Integer> h1= new HashSet<>(6,0.4f);
        h1.add(45);
        h1.add(65);
       // System.out.println(h1);

        //Date and tme
        System.out.println(System.currentTimeMillis());
        System.out.println(Long.MAX_VALUE);
        Date d= new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getYear());

        //calender class
        System.out.println("calender class started");
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getCalendarType());
        System.out.println(cal.getTime());
        System.out.println(cal.getWeekYear());
        System.out.println(cal.getTimeZone().getID());
        System.out.println(Calendar.DATE);
        System.out.println(Calendar.HOUR_OF_DAY);

        //java time api

        System.out.println("java.time api");

        LocalDate e= LocalDate.now();
        System.out.println(d);
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd-MM-yyyy");  //change format of date
        String dateformst= e.format(dft);
        System.out.println(dateformst);





    }
}