package gun12_stringManipulations;

import java.util.Scanner;

public class C10_StringManipulationSample04 {
    public static void main(String[] args) {
        /*
        Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre
        basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir
        sifre girin” yazdirin
- Ilk harf buyuk harf olmali
- Son harf kucuk harf olmali
- Sifre bosluk icermemeli
- Sifre uzunlugu en az 8 karakter olmali
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sifrenizi giriniz");
        String sifre = scan.nextLine();
        int flag =0;

        if (!(sifre.charAt(0)>='A'&&sifre.charAt(0)<='Z')){
            System.out.println("HATA = Lütfen sifrenizin ilk harfini buyuk giriniz");
            flag++;
        }
        if (!(sifre.charAt(sifre.length()-1)>='a'&&sifre.charAt(sifre.length()-1)<='z')){
            System.out.println("HATA = Lütfen sifrenizin son harfini kucuk giriniz");
            flag++;
        }
        if (sifre.contains(" ")){
            System.out.println("HATA = Sifreniz bolsuk icermemelidir.");
            flag++;
        }
        if (sifre.length()<8){
            System.out.println("HATA = Sifreniz en az 8 karakter olmalidir");
            flag++;
        }
        if (flag==0){
            System.out.println("Sifreniz basari ile tanimlanmis");
        }else {
            System.out.println("Lütfen yukaridaki talimatlara uyarak sifrenizi yenien giriniz");
        }


    }
}
