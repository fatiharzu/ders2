package gun17_whileForLoop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {
        //Soru 4) Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden baslayip bitis
        //harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. Kullanicinin hata
        //yapmadigini farz edin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir baslagic harfi giriniz");
        char baslangic = scan.next().toUpperCase().charAt(0);
        System.out.println("Lütfen bir bitis harfi giriniz.");
        char bitis = scan.next().toUpperCase().charAt(0);

        char ilkHarf = baslangic;

        while(ilkHarf<=bitis){

            System.out.print(ilkHarf+" ");

            ilkHarf++;
        }

    }
}
