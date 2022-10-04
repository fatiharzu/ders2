package gun03_datacasting_incremenet;

public class C03_DataCasting {
    public static void main(String[] args) {

        //Data Casting
        //Auto Widening   --- genisleme
        //Explicit Narrowing - daralma

        byte sayi1 = 17;

        System.out.println("byte ile saiymiz : "+sayi1);

        short say2 = sayi1;

        System.out.println("short ile sayimiz : "+ say2);

        int say3 = say2;

        System.out.println("Integer ile sayimiz : "+say3);

        float say4 = say3;

        System.out.println("Float ile sayimiz : "+say4);

        double say5 = say4;

        System.out.println("Double ile sayimiz : "+say5);

    }
}
