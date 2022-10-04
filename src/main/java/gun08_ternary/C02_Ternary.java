package gun08_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        //Soru1 ) Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 2 sayi giriniz");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        System.out.println(sayi1<sayi2?sayi1:sayi2);

        int sonuc = sayi1<sayi2 ? sayi1:sayi2;

        System.out.println(sonuc);

    }
}
