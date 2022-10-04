package gun31_stringBuilder;

public class C01_StringBuilder {
    // kapasite 16   sonra *2  +2   34
    //          34   sonra *2  +2   70
    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder(); // Bos bir StringBuilder

        // 1-append();
        sb1.append("Fatih");
        System.out.println(sb1);//Fatih

        sb1.append(" Hoca");
        System.out.println(sb1);//Fatih Hoca

        sb1.append(" Java").append(" anlatir.");
        System.out.println(sb1);//Fatih Hoca Java anlatir.

        // 2-append ile arka arkaya eklme yapilabilir.

        sb1.append("Java cok guzel",0,4);//-> ekledigmiz zin baslangic index ini ve sonuc indexi haric ekler
        System.out.println(sb1);//Fatih Hoca Java anlatir.Java

        // 3-lenght();
        System.out.println(sb1.length()); //28

        //capacity
        StringBuilder sb = new StringBuilder(5);
        System.out.println(sb.length());//0
        System.out.println(sb.capacity());//5

        sb.append("Kemal");
        System.out.println(sb.length());//5
        System.out.println(sb.capacity());//5

        sb.append(" Can");//Kemal Can
        System.out.println(sb.length());//9
        System.out.println(sb.capacity());//12

        // 4-charAt(); StringBuilder da istenen karakteri indextekini getirir

        // 5-delete(4,7); baslangic degeri dahil bitis degeri dahil olmayan kismi siler

        // 6-deleteCharAt(7); StringBuilder deki istenen karakteri siler

        // 7-equals();   iki StrinBuilder in degerlerni karsilastirir.
//              Not1: equals methodunda parantez icine String yazarsak hata vermez ama false doner
//              Not2: equals methodu == gibi calisir

        // 8-indexOf(); StringBuilder in istenen karakterin indexini verir

        // 9-insert(3,"Java ") StringBuilderda istenen indexden baslayarak istenen karakteri ekler

        // 10-insert(3,"Java ",1,2)  StringBuilder istenen indexden baslayarak verilen Stringin parcasini ekler

        // 11-perlace(3,8,"Ali"); StringBuilderde istenen indexler arasindaki bolumun yerine verilen String i ekler

        // 12-trimToSize(); Fazladan ayrilan kapasiteyi silme

        // 13-insert();

        // 14-compareTo();

        // 15-reverse();

        // 16-subSequence();







    }
}
