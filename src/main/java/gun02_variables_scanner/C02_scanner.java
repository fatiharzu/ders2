package gun02_variables_scanner;

import java.util.Scanner;

public class C02_scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adinizi giriniz");

        String isim = scan.next();

        System.out.println(isim);



    }
}
