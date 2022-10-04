package gun12_stringManipulations;

import java.util.Locale;
import java.util.Scanner;

public class C11_StringManipulation05 {
    public static void main(String[] args) {
        /*
        Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
            isim-soyisim : F***** A*******
            kart no : **** **** **** 1234
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Adinizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Lütfen soyadinizi giriniz");
        String soyIsim = scan.nextLine();
        System.out.println("Lütfen 16 haneli kredi karti numaranizi giriniz");
        String kkNo = scan.next();


        String duzenlenmisIsim = isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");

        String duzenlenmisSoyisim = soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w","*");

        String kkNoDuzenlenmis = "**** **** **** "  + kkNo.substring(13);

        System.out.println(duzenlenmisIsim+" " + duzenlenmisSoyisim+" \n"+kkNoDuzenlenmis);





    }
}
