package gun11_stringManipulations;

import java.util.Scanner;

public class C01_StringManipulations {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir kelime alin,
        // cumlede kelimenin kullanilip kullanilmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cumle ve bir harf giriniz");
        String cumle = scan.nextLine().toLowerCase();
        String kelime = scan.next();

        //  indexOf()

        if (cumle.indexOf(kelime)==-1){
            System.out.println("Giridiniz kelime yoktur");
        }else
        {
            System.out.println("Girdiginiz kelime vardir");
        }

        // contains()

        if (cumle.contains(kelime)){
            System.out.println("kelime vardi");
        }else {
            System.out.println("kelime yoktur");
        }




    }
}
