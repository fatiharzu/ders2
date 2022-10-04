package gun05_wrapper_concationation;

public class C01WrapperCalss {
    public static void main(String[] args) {

        String isim = "Mehmet";
        int sayi = 10;

        System.out.println(isim.charAt(0));
        System.out.println(isim.charAt(4));
        System.out.println(isim.length());

        Integer sayi1 = 10;
        System.out.println(sayi1.MAX_VALUE);
        System.out.println(sayi1.MIN_VALUE);

        Double sayi2 = 13.5;

        System.out.println(sayi2.MAX_VALUE);
        System.out.println(sayi2.MIN_VALUE);

        String okulNo = "343";

        System.out.println("Strign olarak okul no :"+okulNo);

        int okulNoSayiOlarak = Integer.parseInt(okulNo);

        System.out.println("Integer olarak okul no :"+okulNoSayiOlarak);

        okulNo= okulNo+3;
        System.out.println(okulNo);

        okulNoSayiOlarak=okulNoSayiOlarak+3;
        System.out.println(okulNoSayiOlarak);

        System.out.println(++okulNoSayiOlarak);
        System.out.println(okulNoSayiOlarak++);

        Character harf = 'a';
        System.out.println(harf.charValue());
        System.out.println(harf);
        System.out.println(Character.toUpperCase('a'));



    }
}
