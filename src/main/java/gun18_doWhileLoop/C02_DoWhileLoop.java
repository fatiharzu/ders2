package gun18_doWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        // Kullanicidan iki pozitif sayi isteyin
        // kullanici negatif sayi girdiginde
        // girilen negatif sayilari yok sayip, yeniden deger isteyin
        // kullanici dogru giris yaptiginda "well done" ve sayilarin carpini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki pozitif sayi giriniz");
        int sayi1 = 0;
        int sayi2 =0 ;

        do {
            sayi1 = scan.nextInt();
            sayi2 = scan.nextInt();
            if (sayi1>0 && sayi2>0){
                System.out.println("sayilarin carpimi "+sayi1*sayi2);
            }else {
                System.out.println("Lütfen pozitif iki tam sayi giriniz");
            }
        } while (!(sayi1>0 && sayi2>0));

    }
}
