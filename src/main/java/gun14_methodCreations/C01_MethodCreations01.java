package gun14_methodCreations;

import java.util.Scanner;

public class C01_MethodCreations01 {
    public static void main(String[] args) {
        /*
		 Soru 1 ) Kullanicidan bir sayi alin.
		 i) Bu sayinin tek mi cift mi oldugunu,
		 ii)sifirdan buyuk mu kucuk mu oldugunu,
		 iii) ayrica ve 100’den buyukse
		 birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
		 100’den kucukse sadece 1’ler basamagini
		 yazdiran 3 method olusturun.
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi = scan.nextInt();

        tekMiCiftMi(sayi);        // method call
        sifirdanBuyukmu(sayi);
        istenenBasamaklar(sayi);
 }

    private static void istenenBasamaklar(int sayi) {
        if (sayi<100){
            System.out.println("sayinin birler basamagi : " +sayi%10);
        }else {
            int rakamlarToplami =0;       // 1453
            int   rakam = 0;

            rakam= sayi%10;               //    145,3
            rakamlarToplami+=rakam;      //      0   +  3
            sayi/=10;                   //       145

            rakam = sayi%10;
            rakamlarToplami+=rakam;
            sayi/=10;                       //     14

            rakam=sayi%10;
            rakamlarToplami+=rakam;

            System.out.println("sayinin birler onlar ve yuzler basamaklari toplami : "+ rakamlarToplami);

        }

    }

    private static void sifirdanBuyukmu(int sayi) {
        if (sayi<0){
            System.out.println("sayiniz nagtif bir sayi");
        }else if (sayi>0){
            System.out.println("sayiniz pozitif bir sayidir");
        }else {
            System.out.println("sayiniz sifirdir");
        }
    }

    private static void tekMiCiftMi(int sayi) {

        if (sayi%2==0){
            System.out.println("sayimiz cifttir");
    }else {
            System.out.println("sayimiz tekdir");
        }

}


}
