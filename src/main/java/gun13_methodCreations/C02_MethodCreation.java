package gun13_methodCreations;

import java.util.Scanner;



public class C02_MethodCreation {
    public static void main(String[] args) {

        // Kullanicidan 2 tamsayi isteyin
        // bu sayilarin toplamlarini ve carpimlarini
        // iki ayri method'da hesaplayip yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki tam sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

       toplam(sayi1,sayi2);
       carpim(sayi1,sayi2);

    }

    public static void carpim(int sayi1, int sayi2) {
        System.out.println("sayilarin carpimi : "+sayi1*sayi2);
    }

    public static void toplam(int sayi1, int sayi2) {

        System.out.println("sayilarin toplamlari : " +(sayi1+sayi2));

    }


}
