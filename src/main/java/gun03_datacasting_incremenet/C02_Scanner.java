package gun03_datacasting_incremenet;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        // Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");

        char ilkHarf = scan.next().toUpperCase().charAt(0);

        System.out.println("Girdiginiz ismin ilk harfi : "+ilkHarf);


    }
}
