package gun20_arrays;

import java.util.Arrays;

public class C08_ArraysSplit {
    public static void main(String[] args) {
        // spit()
        // Stringden bir karakter, harf yada rakam seciyoruz, sonra
        // sectigimizin karakterin yada karakterleri  bir virgul koyup ve bosluk birakarak boluyor
        // ve bize bir Array olusturuyor

        String str = "Java, candir";

        // split methodu bize Array doner

        // -ya yazdiririz
        System.out.println(Arrays.toString(str.split(",")));

        // yada assign etmemiz lazim (soz ucar atama kalir)

        String [] arrayaDonmusKelime = str.split(",");

        System.out.println(str);
        System.out.println(Arrays.toString(arrayaDonmusKelime));

        String [] bolunmusKelime = str.split("a");
        System.out.println(Arrays.toString(bolunmusKelime));

        String cumle = "Java ogren, rahat yasa";  // cumlesi kac kelimeden olusur?

        String [] kelimeSayisi = cumle.split(" ");

        System.out.println("Cümledeki kelime sayisi: "+kelimeSayisi.length); //Cümledeki kelime sayisi: 4

        // harf sayisi
        String duzenlenmisCumle = cumle.replaceAll("\\W","");

        String [] harfSayisi = duzenlenmisCumle.split("");
        System.out.println("Harf Sayisi: "+harfSayisi.length);   //Harf Sayisi: 18

    }
}
