package gun12_stringManipulations;

import java.util.Scanner;

public class C09_StringManipulationsSample03 {
    public static void main(String[] args) {
        //Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 harfli bir kelime giriniz");
        String kelime = scan.next();

        if (kelime.length()!=4){
            System.out.println("Lütfen 4 harfli birkelime giriniz");
        }else {
            System.out.println(kelime.substring(3,4)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1));
        }

       /*
        String terstenKelime = kelime.substring(3,4);

        terstenKelime+=kelime.substring(2,3);
        terstenKelime+=kelime.substring(1,2);
        terstenKelime+=kelime.substring(0,1);
        System.out.println("Kelimenin tersten yazilisi: " terstenKelime);
        */


    }
}
