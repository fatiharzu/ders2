package gun12_stringManipulations;

import java.util.Scanner;

public class C07_StringManipulationsSample01 {
    public static void main(String[] args) {
        /*
        Soru 3) Kullanicidan isim isteyin. Eger

- isim “a” harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
- isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
- ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim = scan.next();

        if (isim.contains("a") && isim.contains("Z")){
            System.out.println("isim a ve Z harfi iceriyor");
        }else if (isim.contains("a")){
            System.out.println("Isim a harfi iceriyor");
        }else if (isim.contains("Z")){
            System.out.println("Isim Z harfi iceriyor");
        }else{
            System.out.println("Isim a yada Z harfi icermiyor");
        }




    }
}
