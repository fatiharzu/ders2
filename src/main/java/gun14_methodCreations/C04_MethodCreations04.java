package gun14_methodCreations;

import java.util.Scanner;

public class C04_MethodCreations04 {
    public static void main(String[] args) {
        /*
        Soru 4) Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak kredi karti
numarasini alin. Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak
sekilde, KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde
duzelten 2 method yazin, ve programda kullanabilmek icin duzenlenmis hallerini
geri dondurun.

            -dogum yeri
            -tel no


         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim = scan.next();
        System.out.println("Lütfen soy isminizi giriniz");
        String soyIsim= scan.next();
        System.out.println("Lütfen kredi karti numaranizi giriniz");
        String kkNo = scan.next();
        System.out.println("Lütfen dogumyerinizi giriniz");
        String dogumYeri = scan.next();
        System.out.println("Lütfen telefon numaranizi giriniz 11 haneli olarak giriniz");
        String telNo = scan.next();

        isimDuzelt(isim);
        isimDuzelt(soyIsim);
        kknDuzelt(kkNo);
        isimDuzelt(dogumYeri);
        telNoDuzelt(telNo);
        
        System.out.println("Adiniz Soyadiniz:\n"
                            +isimDuzelt(isim)
                            +" "+isimDuzelt(soyIsim)
                            +"\nKredi karti numaraniz:\n"
                            +kknDuzelt(kkNo)
                            +"\nDogum yeriniz:\n"
                            +isimDuzelt(dogumYeri)
                            +"\nTelefon numaraniz:\n"
                            +telNoDuzelt(telNo));

    }

    private static String telNoDuzelt(String telNo) {

        telNo=telNo.substring(0,1)+" ("+telNo.substring(1,4)+") "+telNo.substring(4,7)+" "+telNo.substring(7);


        return telNo;
    }


    private static String kknDuzelt(String kkNo) {
        kkNo=kkNo.substring(0,4)+" "+kkNo.substring(4,8)+" "+kkNo.substring(8,12)+" "+kkNo.substring(12,16);
        return kkNo;
    }






    public static String isimDuzelt(String isim) {
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        return isim;
    }


}
