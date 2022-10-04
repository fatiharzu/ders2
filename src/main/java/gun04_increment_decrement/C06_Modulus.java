package gun04_increment_decrement;

import java.util.Scanner;

public class C06_Modulus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz");
        int rakam = scan.nextInt();

        //  rakam%2==1    rakam tekdir
        //  rakam%2==0    rakam cifttir

        if ( rakam%2==1 ){
            System.out.println("Girdiginiz rakam tekdir");
        }else {
            System.out.println("Girdiginiz rakam cifttir");
        }



    }
}
