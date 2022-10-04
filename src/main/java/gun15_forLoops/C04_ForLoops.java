package gun15_forLoops;

import java.util.Scanner;

public class C04_ForLoops {
    public static void main(String[] args) {

        /*

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kelime giriniz");
        String kelime = scan.next();

            String terstenKelime="";

        for (int i = kelime.length() - 1; i >= 0; i--) {

            terstenKelime+= kelime.substring(i, i + 1);

            System.out.println(terstenKelime);

        }


    }
}
