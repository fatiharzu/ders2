package gun30_varargs;

import java.util.Scanner;

public class C02_Varargs {
    public static void main(String[] args) {
        // verilen iki sayinin toplamini veren bir method yaziniz


        sayiTopla(2,5);
        sayiTopla(3,6,5,9);
    }

    private static void sayiTopla( int... sayi) {
        int toplam=0;
        for (int i:sayi) {
            toplam+=i;
        }
        System.out.println("sayilarin toplami :"+toplam);
    }
}
