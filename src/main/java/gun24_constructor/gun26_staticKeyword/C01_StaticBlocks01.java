package gun24_constructor.gun26_staticKeyword;

public class C01_StaticBlocks01 {
    // ststaic block lar main method dan once calisir
    // class ilk calistirildiginda ilk deger atamasi yapar => bu duruma "initialize" denir

    static int sayi = 10;

    static {
        System.out.println("1.static block calisti");
        sayi=20;
    }

    static {
        System.out.println("1.5 static bloack calisti");
        sayi=30;
    }

    static {
        System.out.println("2.static block calisti");
        sayi=45;
    }

    public static void main(String[] args) {

        System.out.println("main method un ilk satirinda sayi: "+sayi);
    }

    static {
        System.out.println("3. static method calisti");
        sayi=100;
    }

}
