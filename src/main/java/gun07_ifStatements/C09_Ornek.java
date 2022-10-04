package gun07_ifStatements;

import java.util.Scanner;

public class C09_Ornek {
    public static void main(String[] args) {
        /*kullanıcıdan gün adı alın
        cuma ise müslümanların günü
        cumartesi ise yahudilerin günü
        pazar ise hrisiyanlarin gunu*/

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir gun adi giriniz");
        String gun = input.nextLine();
        if (gun.contains("pazartesi") || gun.equals("sali") || gun.equals("persembe") || gun.equals("carsamba")) {
            System.out.println("dini gun degil");
        } else if (gun.equals("cuma")) {
            System.out.println("muslumanlarin mubarek gunu");
        } else if (gun.equals("cumartesi")) {
            System.out.println("yahudilerin mubarek gunu");
        } else {
            System.out.println("hristiyanlarin mubarek gunu");
        }
    }
}
