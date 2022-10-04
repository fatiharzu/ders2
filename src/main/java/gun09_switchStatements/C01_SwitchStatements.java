package gun09_switchStatements;

import java.util.Scanner;

public class C01_SwitchStatements {
    public static void main(String[] args) {
        // Soru1 : Kullanicidan haftanin kacinci gunu oldugunu sorun
        // ve gun ismini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kacinci gunde oldugumuzu yaziniz");
        int gun = scan.nextInt();


        switch (gun) {

            case 1 :
                System.out.println("Bugun Pazartesidir");
                break;
            case 2 :
                System.out.println("Bugun Salidir");
                break;
            case 3 :
                System.out.println("Bugun Carsambadir");
                break;
            case 4 :
                System.out.println("Bugun Persembedir");
                break;
            case 5 :
                System.out.println("Bugun CUMADir");
                break;
            case 6 :
                System.out.println("Bugun cUMARTESUir");
                break;
            case 7 :
                System.out.println("Bugun PAZARdir");
                break;
            default:
                System.out.println("Lütfen gecerli gun sayisini giriniz");








        }





    }
}
