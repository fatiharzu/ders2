package gun18_doWhileLoop;

import java.util.Queue;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Soru 5 ) Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol
            edin ve sifredeki hatalari yazdirin.
            Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre
            girdiginde “Sifreniz Kabul edilmistir” yazdirin.
                - Sifre kucuk harf icermelidir (method)
                - Sifre buyuk harf icermelidir (method)
                - Sifre ozel karakter icermelidir (method)
                - Sifre en az 8 karakter olmalidir (method)

         */

        Scanner scan = new Scanner(System.in);
        String sifre= "";

        boolean kHk =false;
        boolean bHk =false;
        boolean oKk =false;
        boolean uK  =false;

        do {
            System.out.println("Lütfen bir sifre giriniz");
            sifre =scan.nextLine();
           kHk = kucukHarfKontrolu(sifre);
           bHk = buyukHarfKontrolu(sifre);
           oKk = ozelKarakterKontrolu(sifre);
           uK  = uzunlukKontrolu(sifre);

        }
        while (!kHk || !bHk || !oKk || !uK);

        System.out.println("sifreniz kaydedildi");

    }

    private static boolean uzunlukKontrolu(String sifre) {
        boolean uK = false;

        if (sifre.length()>=8){
            uK=true;
        }else {
            System.out.println("Sifren en az 8 karakter olmalidir");
        }

        return uK;
    }

    public static boolean ozelKarakterKontrolu(String sifre) {
        boolean oKk = false;
        String harfler = "!§$%&()=?´*',.-_#+*/-<>|@;:";
        for (int i =0 ; i<sifre.length();i++){

            if (harfler.contains(sifre.substring(i,i+1))){
                oKk =true;
                break;
            }
        }

        if ((!oKk)){
            System.out.println("Lütfen bi dene bir KARAKTER gir");
        }

        return oKk;
    }

    public static boolean buyukHarfKontrolu(String sifre) {
        boolean bHk = false;

        String harfler = "QWERTZUIOPÜASDFGHJKLÖÄYXCVBNM";
        for (int i =0 ; i<sifre.length();i++){

            if (harfler.contains(sifre.substring(i,i+1))){
                bHk =true;
                break;
            }
        }

        if ((!bHk)){
            System.out.println("Lütfen bi dene boyuk bir harf gir");
        }
        return bHk;
    }

    public static boolean kucukHarfKontrolu(String sifre) {
        boolean kHk =false;

        String harfler = "qwertzuiopüäölkjhgfdsayxcvbnm";

        for (int i =0 ; i<sifre.length();i++){

            if (harfler.contains(sifre.substring(i,i+1))){
                kHk =true;
                break;
            }
        }

        if ((!kHk)){
            System.out.println("Lütfen bi dene kuck bir harf gir");
        }


        return kHk;
    }
}
