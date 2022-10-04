package gun04_increment_decrement;

public class C03_PreIncrement_PsotIncrement {
    public static void main(String[] args) {


        int sayi1 = 20;
        int sayi2 = sayi1--;

        System.out.println(sayi1);//19

        System.out.println(sayi2);//20

        System.out.println("yunus "+ --sayi2);//19

        System.out.println("yasin "+ sayi2--);//19

        System.out.println("fatih "+ sayi2);//18


    }
}
