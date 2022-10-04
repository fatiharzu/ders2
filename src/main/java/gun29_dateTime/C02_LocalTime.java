package gun29_dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalDate dateOfBirth =LocalDate.of(1985,03,11);

        //How to manipulate time
        LocalTime currentTime = LocalTime.now();

        int hour = currentTime.getHour();
        System.out.println(hour);//21

        boolean isAfter =currentTime.isAfter(LocalTime.of(23,11,32,1234));
        System.out.println(isAfter); //false

        System.out.println(currentTime.NOON);//12pm
        System.out.println(Integer.MIN_VALUE);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");

        System.out.println(dtf.format(dateOfBirth));

        //kac yasindayiz

        LocalDate dt = LocalDate.of(2022,9,22);
        System.out.println("bugunun tarihi :"+currentTime);
        Period yasim = Period.between(dateOfBirth,dt);

        System.out.println("kac yasinda oldugum"+yasim);
        System.out.println(yasim.getYears());//37

        //compare method

        int fark = dt.compareTo(dateOfBirth);
        System.out.println(fark);






    }
}
