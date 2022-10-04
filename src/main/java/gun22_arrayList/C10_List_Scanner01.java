package gun22_arrayList;

import java.util.*;

public class C10_List_Scanner01 {
    public static void main(String[] args) {


        /*
		 Kullanicidan isimler isteyin ve bunlari bir list’te depolayin.
		 Kullanici "yeter" yazana kadar isim istemeye devam edin.

       	 Kullanici isim girmeyi bitirdiginde toplam kac isim girdigini
       	 ve bunlardan kac tanesinin asagidaki listede olan isimlerden oldugunu yazdirin

		isimList=Ali , Veli, Ayse, Fatma, Zeki, Kemal

		Not : yeter icin kucuk buyuk harf onemli degil ancak isimler icin onemli
		 */

        Scanner scan = new Scanner(System.in);
        List<String> girilenIsimler = new ArrayList<>();
        String isim;


        do {
            System.out.println("Lütfen Listeye eklemek icin isim giriniz \nLütfen biritmek icin yeter yaziniz");
            isim = scan.nextLine();
            if (!isim.equalsIgnoreCase("yeter")){
                girilenIsimler.add(isim);
            }

        }while (!isim.equalsIgnoreCase("yeter"));

        System.out.println(girilenIsimler);

        String isimler[] = {"Ali" , "Veli", "Ayse", "Fatma", "Zeki", "Kemal"};
        //karsilastirmak istedigimiz listeyi olusturularim
        List<String> isimList = Arrays.asList(isimler);

        System.out.println("Toplam : " + girilenIsimler.size()+" isim girdiniz.");

        int count =0;
        for (int i = 0; i < girilenIsimler.size(); i++) {

            if (isimList.contains(girilenIsimler.get(i))){
            count++;
            }

        }
        System.out.println("Girdiginiz isimlerden "+count+" tanesi benim listemde kayitli");

    }
}
