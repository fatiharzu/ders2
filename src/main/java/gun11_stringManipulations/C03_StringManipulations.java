package gun11_stringManipulations;

import java.util.Scanner;

public class C03_StringManipulations {
    public static void main(String[] args) {


    /*
		 	Soru 2) Kullanicidan bir cumle isteyin.
		 	Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
		 	“kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
		 	iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cumle giriniz");
        String cumle = scan.nextLine();

        if (cumle.contains("buyuk")&&cumle.contains("kucuk")){
            System.out.println("Cumlenizde buyuk ve kucuk kelimesini kullandiniz");
        }
         else if(cumle.contains("kucuk")){
            System.out.println("Cumlenizde kucuk kelimesini kullandiniz");
        }
         else if (cumle.contains("buyuk")){
            System.out.println("Cumlenizde buyuk kelimesini kullandiniz");
        }
        else
        {
            System.out.println("Cumlede ne buyuk ne kuck vardir gardas");
        }

    }

}
