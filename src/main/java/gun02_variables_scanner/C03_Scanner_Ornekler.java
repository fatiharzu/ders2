package gun02_variables_scanner;

public class C03_Scanner_Ornekler {
    public static void main(String[] args) {

        // 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin

        int sayi = 89;
        String isim = "Fatih";
        double sayi2 = 89.5;

        System.out.println(sayi);
        System.out.println(isim);
        System.out.println(sayi2);

        System.out.println("=============================================================");
        /*
        2- isim ve soyisim icin iki variable olusturun ve bunlari

        isminiz : Fatih
        soyisminiz : Arzu
                                        seklinde yazdirin
 */
        String ad = "Fatih";
        String soyAd ="Arzu";

        System.out.println("isminiz : "+ad+"\nsoyisminiz : "+soyAd);

        System.out.println("===================================================");


        // 3- Iki farkli tamsayi data turunde 2 farkli variable olusturun bunlarin toplamini yazdirin

        int sayi3=      15;
        byte sayi4 =    42;

        System.out.println(sayi3+sayi4);//57

        System.out.println("====================================================");


        // 4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin

        int sayi5 = 15;
        double sayi6 =3.14;

        System.out.println(sayi5+sayi6);//18.14
        System.out.println("=====================================================");

        // 5 – char data turunde bir variable olusturun ve yazdirin

        char karakter = '?';
        System.out.println(karakter);

        System.out.println("===================================================");
        // 6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.

        int rakam = 20;
        char chr ='m';

        System.out.println(rakam+chr);

        System.out.println("================================================================");
        char a ='f';
        char b='a';
        char c='t';
        char d='i';
        char e='h';

        System.out.println(a+b+c+d+e);
        //char data turundeki degiskenler matematiksel islermlerde kullanilirsa ASCII tablosu devreye girer
        // Java o karakter yerine ASCII tablosundaki degeri kullanir

    }
}
