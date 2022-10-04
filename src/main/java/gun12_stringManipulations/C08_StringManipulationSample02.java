package gun12_stringManipulations;

import java.util.Scanner;

public class C08_StringManipulationSample02 {
    public static void main(String[] args) {
        //Soru 4) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim = scan.next();
        System.out.println("Lütfen soyisimizi giriniz");
        String soyIsim = scan.next();

        if (isim.length()>soyIsim.length()){
            System.out.println("Isiminiz soyisminizden daha buyuktur");
        }else {
            System.out.println("Soyisminiz isminizden daha buyuktur");
        }
    }
}
