import java.time.LocalDate;
import java.time.LocalTime;

public class Baul_MyFirstApp {
        public static void main(String[] args) {
            LocalDate X = LocalDate.now();
            LocalTime Y = LocalTime.now();
            String S = "!!!";


            System.out.println("My name is Jeric Owen S. Baul " + S); // Hello
            System.out.println("The current date is: " + X.getDayOfYear() +" "+ X.getMonth() +" "+ X.getYear());
            System.out.println("The current time is: " + Y.getHour() +":"+ Y.getMinute() +":"+ Y.getSecond());
        }

    }


