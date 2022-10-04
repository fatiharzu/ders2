package gun07_ifStatements;

import java.util.Scanner;

public class C06_NestedIfStatements {
    public static void main(String[] args) {
        // Kullanicidan cinsiyet ve yas aliniz

        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,

        // calisan erkekse 65 yasindan buyukse emekli olabilir yazdirin

        // emekli olamayacaksa emekli olamazsin daha ... yil calisman lazim yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen erkek icin e kadin icin k harfini girinzi");
        char cins = scan.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (cins=='K'){
            if (yas>=60){
                System.out.println("Bacim emekli olabilirsin");
            }else {
                System.out.println("emekli olmazsin abla \nemekli olmaniza daha "+(60-yas)+" yil vardir");
            }
        }
        else if (cins=='E'){
            if (yas>=65){
                System.out.println("Abi emeklisin yat gari");
            }
            else {
                System.out.println("abicim daha emekli olmana daha "+(65-yas)+" vardir");
            }

        }
        else {
            System.out.println("yanlis karakter lutfen e yada k giriniz");
        }

    }
}
