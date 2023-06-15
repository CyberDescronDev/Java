package DateTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        LocalDateTime ldt2 = LocalDateTime.now();
        String fDate = ldt2.format(dtf);

        System.out.println(ldt);

        System.out.println("Today's date : "+ldt.getYear()+"/"+ldt.getDayOfMonth()+"/"+ldt.getDayOfWeek());
        System.out.println("Time right now  : "+ldt.getHour()+":"+ldt.getMinute()+":"+ldt.getSecond());

        System.out.println(fDate);

        




    }
}
