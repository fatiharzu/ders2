package gun11_stringManipulations;

import java.util.Scanner;

public class C04_StringManipulations {
    public static void main(String[] args) {
        // lastIndexOf()

        /*
        Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
- Girilen kelime cumlede kullanilmamis.
- Girilen kelime cumlede 1 kere kullanilmis.
- Girilen kelime cumlede 1’den fazla kullanilmis.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cumle ve bir kelime giriniz");
        String cumle = scan.nextLine().toLowerCase();
        String kelime = scan.next();
        if (cumle.indexOf(kelime)==-1){
            System.out.println("kelime cumlede yoktur");
        }
        else if (cumle.indexOf(kelime)==cumle.lastIndexOf(kelime)){
            System.out.println("- Girilen kelime cumlede 1 kere kullanilmis.");
        }
         else {
            System.out.println("- Girilen kelime cumlede 1’den fazla kullanilmis.");
        }


    }
}
