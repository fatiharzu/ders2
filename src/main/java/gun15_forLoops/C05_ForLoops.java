package gun15_forLoops;

import java.util.Scanner;

public class C05_ForLoops {
    public static void main(String[] args) {
        /*
         Soru 9 ) Interview Question Kullanicidan bir String isteyin. Kullanicinin girdigi String’in
                 palindrome olup olmadigini kontrol eden bir program yazin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen tersten yazdirmak icin bir yazi girin...");
        String str = scan.nextLine();

        if(str.equals(terstenCevir(str))){
            System.out.println("Girdiginiz kelime palindrome dur");
        }else {
            System.out.println("Girdiginiz kelime palindrome degildir");
        }


    }

    private static String terstenCevir(String str) {
        String tersProg = "";

        for (int i = str.length()-1; i>=0; i--){
            tersProg+=str.substring(i,i+1);
        }

        return tersProg;
    }


}

