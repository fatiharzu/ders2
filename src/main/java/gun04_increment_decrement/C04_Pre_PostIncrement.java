package gun04_increment_decrement;

public class C04_Pre_PostIncrement {
    public static void main(String[] args) {

        int sayi1 = 10;

        int sayi2 = ++sayi1;

        System.out.println(sayi2);//11
        System.out.println(sayi1);//11

        sayi2 = sayi1++;

        System.out.println(sayi2);//11
        System.out.println(sayi1);//12

    }
}
