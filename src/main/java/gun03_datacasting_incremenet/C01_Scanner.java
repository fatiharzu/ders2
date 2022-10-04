package gun03_datacasting_incremenet;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {


        /*Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
Isminiz : Mehmet
Soyisminiz : Bulut
Kursumuza katiliminiz alinmistir,tesekkur ederiz*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Adinizi ve soyadinizi giriniz");

        String isim = scan.nextLine();
        String soyIsim = scan.nextLine().toUpperCase();

        System.out.println("Isminiz : "+isim+"\nSoyadiniz : "+soyIsim+"\nKursumuza katiliminiz alinmistir,tesekkur ederiz");





    }
}
