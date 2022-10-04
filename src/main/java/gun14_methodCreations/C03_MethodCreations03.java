package gun14_methodCreations;

import java.util.Scanner;

public class C03_MethodCreations03 {
    public static void main(String[] args) {
        /*
        Soru 3) Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre
        - @ isareti icermiyorsa gecersiz email yazdirin
        - @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
        - @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz”
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen e-mail adresinizi yaziniz");
        String email = scan.next();

        emailKontol(email);



    }

    public static void emailKontol(String email) {
        int lastIndex = email.indexOf("@gmail.com");            //   5
        int firstIndex = email.lastIndexOf("@gmail.com");  // 5       10

        if (!(email.contains("@"))) {
            System.out.println("Email adresinizde @ isareti olmak zorundadir. \nLütfen email adresinizi tekrar giriniz");
        } else if (!(email.contains("@gmail.com"))) {
            System.out.println("Lütfen gmail adresinizi giriniz");

        } else if (!(email.endsWith("@gmail.com"))) {
            System.out.println("Girdiginiz email adresi  gecersizdir");

        }else if (firstIndex!=lastIndex){
            System.out.println("Yazimda hata var lütfen kontrol ediniz");
        }
        else {
            System.out.println("Email adresiniz kaydedildi");
        }
    }

}
