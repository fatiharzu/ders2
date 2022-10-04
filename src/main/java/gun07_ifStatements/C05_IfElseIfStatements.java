package gun07_ifStatements;

import java.util.Scanner;

public class C05_IfElseIfStatements {
    public static void main(String[] args) {
        /*Soru 7) Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin.
50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A”*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sinav notunuzu giriniz");
        int not = scan.nextInt();

        if (not>100 || not<0) {
            System.out.println("Dogru durust bir not yaz");
        }
        else if(not<45){
            System.out.println("Notunuz F dir kaldiniz");
        }
        else if (not<55){
            System.out.println("Notunuz D dir kilpayi gectiniz");
        }
        else if (not<70){
            System.out.println("Notunuz C dir gectiniz");
        }
        else if (not<85){
            System.out.println("Notunuz B dir iyi gectiniz");
        }
        else if (not<=100){
            System.out.println("Notunuz a supersiniz");
        }
        else {
            System.out.println("lütfen adam ol");
        }
    }
}
