package gun14_methodCreations;

public class C05_MethodOverloading01 {
    public static void main(String[] args) {
        // method overloading


        String isim = "Ali";
        String soyIsim= "Can";

        int sayi1 = 2;
        int sayi2 = 3;
        int sayi6 =6;

        byte sayi3 = 4;
        byte sayi4 = 5;

        derlemek(isim,soyIsim);
        derlemek(sayi1,sayi2);
        derlemek(sayi1,sayi2,sayi6);

        derlemek(8,10);
        derlemek("fatih","arzu");
        derlemek(8,10,20);

        int sonuc =bolme(sayi6,sayi2);
        System.out.println(sonuc);



    }

    private static int bolme(int sayi6,int sayi2) {

        return sayi6/sayi2;
    }

    private static void derlemek(int sayi1, int sayi2, int sayi6) {
        System.out.println("int 3 sayi methodu calisti : "+(sayi1+sayi2+sayi6));
    }

    private static void derlemek(int sayi1, int sayi2) {
        System.out.println("int sayi methodu calisti : " +  (sayi1*sayi2));
    }

    private static void derlemek(String isim, String soyIsim) {
        System.out.println("Isim soyisim methodu calisti : ");
    }



}
