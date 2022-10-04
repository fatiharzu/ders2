package gun17_whileForLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        //Soru 6 ) Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane
        //olduklarini ekranda yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi = scan.nextInt();

        int tamBolen = 1;
        int sayac =0;

        while (tamBolen<=sayi){

            if (sayi%tamBolen==0){

                System.out.print(tamBolen+" ");

                sayac++;

            }

            tamBolen++;
        }

        System.out.println("\nGirdiginiz sayi "+sayac+" adet tam boleni bulunmaktadir");




    }
}
