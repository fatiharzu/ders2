package gun10_stringManipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {

        // 1- cancat();  methodu
        String isim = "Ali";
        String soyIsim = "Can";


        System.out.println("concat ile "+isim.concat(soyIsim));
        System.out.println("toplama ile "+isim+soyIsim);

        // 2-   chatAt()

        String adim = "Abuziddin";

        System.out.println(adim.charAt(7));  //  i
//        System.out.println(adim.charAt(12));   StringIndexOutOfBoundsException

        // 3-   toUpperCase()
        // 4-  toLowerCase()

        System.out.println(adim.toUpperCase()); // ABUZIDDIN
        System.out.println(adim.toLowerCase()); //  abuziddin

        // 5- equals()

        String isim1 = "fatih";
        String isim2 = "Fatih";  //   asdjasd45fa654g
        String isim3 = "fatih"+"";  // sdfasd5454566

        System.out.println(isim1.equals(isim2));
        System.out.println(isim1.equals(isim3));

        String isim4 = isim1 +"";
        System.out.println(isim4);

        System.out.println(isim4);

        System.out.println(isim1.equals(isim4));// true
        System.out.println(isim1==isim4);        // false

        // 6 - equalIgnoreCase()

        String a ="murtaza";
        String b = "MurtAzA";

        System.out.println(a.equalsIgnoreCase(b)); // true


    }
}
