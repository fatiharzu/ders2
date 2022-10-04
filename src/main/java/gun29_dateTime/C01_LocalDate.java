package gun29_dateTime;

import java.time.LocalDate;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now(); // tarih isminde obj create ettik.   new anahtari kullanilmaz

        System.out.println("bugunun tarihi : "+tarih);//2022-09-28

        System.out.println("bugunden 21 gun sonrasi : "+tarih.plusDays(21));//2022-10-19

        System.out.println("bugunden 3 yil sonrasi : "+tarih.plusYears(3));//2025-09-28

        System.out.println("bugunden 3 gun 5ay 2 yilsonrasi : "+tarih.plusDays(3).plusMonths(5).plusYears(2));//2025-03-01

        System.out.println("bugunden 40 oncesi : " + tarih.minusDays(40));//2022-08-19

        System.out.println("bugunden 3 hafta oncesi : "+tarih.minusWeeks(3));// 2022-09-07

        System.out.println("bugunden 5 yil once 2 ay sonrasi ve 3 hafta sonrasi : "+tarih.minusYears(5).plusMonths(2).plusWeeks(3));//2017-12-19

        System.out.println(tarih.isLeapYear()); // false        artik yil degildir
        System.out.println("bugunden 3 yil sonrasi artik yilmidir :"+tarih.plusYears(3).isLeapYear());// false

        //localDate classindan uretilen obj method chain kuralina uyar ve methodlar ayni homojen olmak zorunda degildir...

        System.out.println(tarih.getDayOfWeek());//WEDNESDAY
        System.out.println(tarih.getDayOfMonth());//28
        System.out.println(tarih.getDayOfYear());//271

        System.out.println(tarih.getMonthValue());//9
        System.out.println(tarih.getMonth());//SEPTEMBER

        LocalDate dogunGunu = LocalDate.of(1985,03,11);

        System.out.println("Dogum Tarihi : "+dogunGunu);

        System.out.println("Dogum gunu :"+dogunGunu.getDayOfWeek());

        System.out.println(tarih.isAfter(dogunGunu));// true

        System.out.println(tarih.isBefore(dogunGunu));//false







    }

}
