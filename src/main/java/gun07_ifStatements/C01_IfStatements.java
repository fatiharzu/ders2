package gun07_ifStatements;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {
        /*
        Soru 3) Kullanicidan gun ismini alin ve
        haftaici veya hafta sonu oldugunu yazdirin
        Ornek:  	gun=Pazar output = “Hafta sonu”
        gun=Sali output = “Hafta ici”
		 *** String icin equals method’unu kullanin
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Haftanin bir gununu giriniz");

        String gun = scan.next().toLowerCase();
        int flag =0;

        if (gun.equals("pazartesi")||gun.equals("sali")||gun.equals("carsamba")||gun.equals("persembe")||gun.equals("cuma")){
            System.out.println("Girdiginiz gun haftaicidir");
            flag++;
        }
        if (gun.equals("cumartesi")||gun.equals("pazar")){
            System.out.println("Girdininz gun haftasonudur");
            flag++;
        }
        if (flag==0){
            System.out.println("Lütfen gecerli bir gun girniz");
        }



    }
    }
