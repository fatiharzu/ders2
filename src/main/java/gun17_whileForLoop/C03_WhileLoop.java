package gun17_whileForLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {

        //Soru 3 ) Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis degeri
        //dahil aradalarindaki tum cift tamsayilari while loop kullanarak ekrana yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir baslagic degeri giriniz");
        int baslangic = scan.nextInt();
        System.out.println("Lütfen bir bitis degeri giriniz.");
        int bitis = scan.nextInt();

        int i = baslangic;

        if (baslangic<bitis) {

            while (i <= bitis) {

                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }

                i++;
            }
        }else {
            System.out.println("Lütfen baslagic degerini bitis degerinden kücük giriniz");

        }


    }
}
