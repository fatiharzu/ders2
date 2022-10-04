package gun14_methodCreations;

import java.util.Scanner;

public class C02_MethodCreations02 {
    public static void main(String[] args) {
        /*
		 Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.
		 Kullanici 2,3 veya 4 degerini girerse,
		 kullanicidan bu sayilari girmesini isteyin
		 ve sayilarin toplamini yazdirin.
		 Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse
		 “Cok sayi girdiniz, ben toplayamam” yazdirin.
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Kac sayi toplamak istiyorsunuz?");
        int istenenSayi = scan.nextInt();
        if (istenenSayi<2){
            System.out.println("lütfen en az iki sayi giriniz");
            }else if(istenenSayi==2){
            ikiSayiTopla();
        }else if (istenenSayi==3){
            ucSayiTopla();
        }else if (istenenSayi==4){
            dortSayiTopla();
        }else {
            System.out.println("Kusura bakmayin benim kafa en fazla 4 sayi toplayabilir");
        }
}

    private static void dortSayiTopla() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen toplamak istediginiz dort sayiyi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sayi3 = scan.nextInt();
        int sayi4 = scan.nextInt();
        System.out.println("Girdiniz sayilarin toplami : "+(sayi1+sayi2+sayi3+sayi4));
    }

    private static void ucSayiTopla() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen toplamak istediginiz uc sayiyi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sayi3 = scan.nextInt();
        System.out.println("Girdiniz sayilarin toplami : "+(sayi1+sayi2+sayi3));
    }

    private static void ikiSayiTopla() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen toplamak istediginiz iki sayiyi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        System.out.println("Girdiniz sayilarin toplami : "+(sayi1+sayi2));
    }
}
