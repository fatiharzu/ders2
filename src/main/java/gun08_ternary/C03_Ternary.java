package gun08_ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        //Soru2 ) Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sayi giriniz");

        int sayi1 = scan.nextInt();

            String sonuc = sayi1%2==1?"sayi tekdir":"sayi cifttir";
        System.out.println("farkli => "+sonuc);

        System.out.println(sayi1%2==1?"sayi tekdir":"sayi cifttir");
    }
}
