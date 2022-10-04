package gun04_increment_decrement;

public class C01_Increment {
    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 20;

        sayi1-=5;

        // sayi = sayi-5;
        System.out.println(sayi1);

        sayi2 +=10;

        System.out.println(sayi2);

        sayi1 *= 2;

        sayi1++;
        System.out.println("sayi1 11 olmasi layzim=>"+sayi1);//11
        sayi1--;//10

        double sayi3 =sayi2/sayi1;  //3,0

        System.out.println(sayi3);  //3,0

        System.out.println(sayi1*sayi2); //  300
        System.out.println(sayi1*sayi3); // double ...,0  30,0
    }
}
