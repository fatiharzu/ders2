package gun06_relationalOperators_ifStatements;

import java.util.Scanner;

public class C05_IfStatements {
    public static void main(String[] args) {
        // Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin
        // ve dikdortgenin kare olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen  iki kenar uzunlugu giriniz \nBir kenar uzunugunu girdikten sonra Enter tusuna basiniz");
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a==b){
            System.out.println("Girdiniginiz uzunluktaki dortgen karedir");
        }
        if (a!=b){
            System.out.println("Girdiginiz dortgen dikdortgen");
        }
    }
}
