package gun06_relationalOperators_ifStatements;

public class C01_RelationalOperators {
    public static void main(String[] args) {

        //   ==         !=          <=                  >=                  &&      ||      ==>   True   False
         //  true       false       kucukesittir       buyukesittir         ve       veya
        //

        int a = 5;
        int b= 7;

       boolean sonuc1 = a==b;
       boolean sonuc2 = a!=b;
        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println("=============================");
        System.out.println(15<14);
        System.out.println(14<15);

        System.out.println(14<=14);

        boolean sonuc3 = 5==5 &&  6<8 ;

        System.out.println(sonuc3);

        boolean sonuc4 = 14%2==0 && 21%2!=1;

        System.out.println(sonuc4);

        // sayi%2==0   => sayi ciftdir
        // sayi%2==1   => sayi tekdir

        boolean sonuc5 = 15%2==1||6>=8;

        System.out.println(sonuc5);

        System.out.println(  5+2>8   ||   9<6   );

        System.out.println(  5+2<8   ||   9<6   );

        System.out.println(  5+2<8   &&   9<6   );

        System.out.println(  5+2<8   &&   9>=6  );

    }
}
