package gun10_stringManipulations;

import java.util.Scanner;

public class C03_StringManipulations {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup
        //olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cumle ve bir harf giriniz");
        String cumle = scan.nextLine().toLowerCase();
        char harf = scan.next().toLowerCase().charAt(0);

        if (cumle.indexOf(harf)==-1){
            System.out.println("Girdiniz cumlede girdiginiz harf bulunmamaktadir");
        }else {
            System.out.println("Girdiniz cumlede girdiginiz harf bulunmaktadir");
        }



    }
}
