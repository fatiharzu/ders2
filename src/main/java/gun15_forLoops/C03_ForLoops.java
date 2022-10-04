package gun15_forLoops;

import jdk.nashorn.api.tree.ImportEntryTree;

import java.util.Scanner;

public class C03_ForLoops {
    public static void main(String[] args) {

        /*
        Soru 7 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kelime giriniz");
        String kelime= scan.next();

        terstenKelimeMethodu(kelime);


    }

    private static void terstenKelimeMethodu(String kelime) {
        for (int i = kelime.length()-1; i >= 0 ; i--) {


            System.out.print(kelime.substring(i,i+1));
        }
    }
}
