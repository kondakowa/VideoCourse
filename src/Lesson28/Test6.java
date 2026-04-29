/*package Lesson28;

import java.time.*;
import java.time.format.*;

public class Test6 {
    public static void main(String[] args) {
      LocalDate ld = LocalDate.of(2016, Month.SEPTEMBER, 1);
      LocalDateTime ldt = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 16, 40, 9);
       LocalTime lt = LocalTime.of(16, 40);

     //   DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
        // System.out.println(ld);
        // System.out.println(ld.format(d1));

     //   DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME;
        // System.out.println(lt);
        // System.out.println(lt.format(d2));

  //      DateTimeFormatter d3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        // System.out.println(ldt);
        // System.out.println(ldt.format(d3));

    //    DateTimeFormatter d4 = DateTimeFormatter.ISO_WEEK_DATE;
    //    System.out.println(ld);
    //    System.out.println(ld.format(d4));
    DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
System.out.println(ld);
System.out.println(ld.format(shortFormat));
System.out.println(ldt);
System.out.println(ldt.format(shortFormat));
System.out.println(lt);
System.out.println(lt.format(shortFormat));

    }
}
*/