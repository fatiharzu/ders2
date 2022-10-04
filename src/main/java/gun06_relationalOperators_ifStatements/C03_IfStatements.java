package gun06_relationalOperators_ifStatements;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

        // // Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi girin");
        int sayi = scan.nextInt();

        if (sayi%2==0){
            System.out.println("Girdiginiz sayi cift sayidir");
        }
        if (sayi%2==1){
            System.out.println("Girdiginiz sayi tekdir");
        }
        if (sayi<0){
            System.out.println("Lütfen pozitif bir tam sayi giriniz");
        }
    }
}
