package gun02_variables_scanner;


import java.util.Scanner;

public class C05_Variables_Scanner {
    public static void main(String[] args) {

        // Soru 6) Kullanicidan ismini ve soyismini teker teker alip
        //aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
        // Isim – soyisim : Fatih Arzu

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");

        String isim = scan.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");

        String soyIsim = scan.nextLine();

        System.out.println("Isim - Soyisim : "+isim +" "+ soyIsim);

    }
}
