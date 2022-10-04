package gun16_nestedForLoops;

import java.util.Scanner;

public class C01_NestedForLoop {
    public static void main(String[] args) {
     /*
     Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore
        asagidaki sekli cizdirin
            *
            * *
            * * *
            * * * *
      */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 10'dan kucuk bir sayi giriniz...");
        int num = scan.nextInt();

        for (int i =1; i<=num ; i++)
        {
            for (int j =1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println("");

        }


    }
}
