package gun07_ifStatements;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {
        //Soru 2) Kullanicidan bir karakter girmesini isteyin ve

        // girilen karakterin harf olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char karakter = scan.next().charAt(0);

        if (karakter>='A' && karakter<='Z' || karakter>='a' && karakter<='z'){
            System.out.println("Kullandiginiz karakter bir harftir");
        }
        else {
            System.out.println("Kullandiginiz karakter bir harf degildir.");
        }
    }
}
