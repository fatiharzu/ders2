package gun19_scope;

public class C01_Scope {   /// class level
   // 1- main methodun disinda olusturulan variableler CLASS VARIABLE denir
    // --static olmayan variableler
    // -- static olan variableler

    static int variable1 = 16;  //   0
    int variable2 = 12;
    static String isim1;    // null
    String isim2 ="ali";
    boolean usundunMu;
    boolean osurdunMu= true;

    // 2- static olmayan variablelar static alanlardan ulasilamazla
    static boolean anladinizMi;

    // class level de olursturulan variable lar (static olsun yada olmasin)
    // deger atamadan da kullanilir

    // eger biz deger atamazsak kensisi otomatik olarak deger atarlar

    // int = 0 string = null char =' '  boolean = false

    // 3 static olmayan  variableler  static alanlardan ulasilamaz

    public static void main(String[] args) {
        System.out.println(variable1);
        System.out.println();

        System.out.println(anladinizMi);
        int b = 13;
 //       System.out.println(method1);
        System.out.println(method2(12));

        for (int i =0 ; i<10 ; i++){
            System.out.println(i+" ");
        }

        System.out.println(isim1);
        System.out.println("istedigimiz deger "+variable1);

        int sayi1 =12;
        int sayi2;

    }

    public void method1(){
        System.out.println();
        int sayi3 = 15;

        // local variableler deger atamadan olusturabiliriz.......
        // sadece  deger atamamiz gerekir


        int k ;

        k=12;
        System.out.println(k);

        System.out.println(anladinizMi);
    }

    public static int method2(int sayi){
        System.out.println();
        System.out.println();
       // static int a = 12;    local variableler static olamaz

        int j ;

        System.out.println();

        System.out.println();
        return sayi;
    }
}
