package gun02_variables_scanner;

import java.util.Scanner;

public class C04_Variables_Scanner {
    public static void main(String[] args) {
        // Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin

        //Kullanicidan deger almak icin 3 adima ihtiyacimiz var

        //1. scanner objesi olusturalim

        Scanner scan = new Scanner(System.in);

        //2. Kullanicidan ne isteyecegimizi yazdiralim

        System.out.println(" Lütfen iki tam sayi giriniz");

        // 3. next methodunu kullanarak girilen degeri alip, olusturacagimiy variableleri atayalim

        int sayi1 = scan.nextInt();  // integer icin scan.nextInt();
        int sayi2 = scan.nextInt();

        System.out.println("Sayilarin toplami : "+(sayi1+sayi2));
        System.out.println("Sayilarin farki : "+(sayi1-sayi2));
        System.out.println("Sayilarin carpimi : "+ (sayi1*sayi2));


    }
}
