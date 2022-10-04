package gun07_ifStatements;

import java.util.Scanner;

public class C04_IIfElseIfStatements {
    public static void main(String[] args) {


    /*
    Soru 8) Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap azdirin.
        Teklif 80.000’in uzerinde ise “Kabul ediyorum” ,
        60 – 80.000 arasinda ise “Konusabiliriz”,
        60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin
     */
    Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir yillik maas teklifi yaziniz");
        int maas = scan.nextInt();
        int binlik = 1000;

        if (maas>80){
            System.out.println("Kabul ediyorum\nMaasim yillik : "+maas+".000 dir");
        }
        else if(maas>=60 && 80>=maas){
            System.out.println("Konusabiliriz\nMaasim yillik : "+maas*binlik+".000 dir");
        }
        else {
            System.out.println("Malesef teklifiniz size kalsin\nMaasim yillik : "+maas+".000 dir");
        }

    }
}
