package gun18_doWhileLoop;

import java.util.Scanner;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        //soru Kullanicidan toplamak uzere pozitif sayilar isteyin,
        //		 islemi bitirmek icin 0’a basmasini soyleyin.
        //
        //		Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve
        //		girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
        //		kullanici negatif sayi girerse ignore edin


        Scanner scan = new Scanner(System.in);

        int sayi = 0;
        int sayac = 0;
        int sayilarToplami = 0;

        do {
            System.out.println("Lütfen toplamak istediginiz sayilari giriniz \n islemi bitirmek icin 0’a basmasin");
            sayi = scan.nextInt();

            if (sayi > 0) {
                sayilarToplami += sayi;
                sayac++;
            } else if (sayi < 0) {
                System.out.println("lütfen pozitif tam sayi giriniz");
            }
        }
            while (sayi != 0);

            System.out.println(sayac + " kadar sayi girdiniz\n" +
                    "girdiginiz sayilarin toplami :" + sayilarToplami);

        }

}
