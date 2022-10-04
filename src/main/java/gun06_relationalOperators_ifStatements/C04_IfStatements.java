package gun06_relationalOperators_ifStatements;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {
        /*
		Kullanicidan gun isimlerinden birinin ilk harfini isteyin
		ve o harfle baslayan gun isimlerini yazdirin
		Ornek: 	ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
		ilkHarf=S output = “Sali”
		 *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir gun isminin bas harfini girin");
        char harf = scan.next().toUpperCase().charAt(0);

        if (harf=='P'){
            System.out.println("Pazar, Pazartesi veya Persembe");
        }
        if (harf=='S'){
            System.out.println("Sali");
        }
        if (harf=='C'){
            System.out.println("Carsamba, Cuma ve Cumartesi");
        }



    }
}
