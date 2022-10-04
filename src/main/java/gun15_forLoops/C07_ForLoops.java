package gun15_forLoops;

import java.util.Scanner;

public class C07_ForLoops {
    public static void main(String[] args) {
       //        Interview Question Kullanicidan 10’dan kucuk bir  tamsayi isteyin
        //           ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 10'dan kucuk bir sayi giriniz...");
        int num = scan.nextInt();

        int faktoriyel = 1 ;
        for (int i =num; i>=1 ; i-- ){
            faktoriyel = faktoriyel*i;
        }
        System.out.println("Yadiginiz sayinin faktoriyeli : "+ faktoriyel );



    }
}
