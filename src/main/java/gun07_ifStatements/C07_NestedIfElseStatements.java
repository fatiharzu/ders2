package gun07_ifStatements;

import java.util.Scanner;

public class C07_NestedIfElseStatements {
    public static void main(String[] args) {
        /*
        Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.

Kullanicidan bir sifre girmesini isteyin

    Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise
“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.

Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise
“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sifre giriniz");
        char harf = scan.next().charAt(0);

        if (harf>= 'a' && harf <='z'){
            if (harf=='z'){
                System.out.println("gecerli sifre");
            }else {
                System.out.println("gecersiz sifre");
            }

        }else if (harf>='A' && harf<= 'Z') {
            if (harf=='A'){
                System.out.println("gecerli sifre");

            }else {
                System.out.println("gecersiz sifre");
            }

        }






    }
}
