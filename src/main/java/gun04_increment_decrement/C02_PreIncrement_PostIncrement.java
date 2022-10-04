package gun04_increment_decrement;

public class C02_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        int sayi1 = 20;

        int sayi2 = ++sayi1;

        System.out.println(sayi1);//21
        System.out.println(sayi2);//21

        sayi2 = sayi1++;//
                        //

        System.out.println("sayi2=>"+sayi2);//21
        System.out.println("sayi1=>"+sayi1);//22

        int sayi3 = 10;

        System.out.println("PreIncrement : "+ ++sayi3); //11

        System.out.println("PostIncrement : "+ sayi3++); //11

        System.out.println("post incrementten sonra sayi3"+sayi3);





    }
}
