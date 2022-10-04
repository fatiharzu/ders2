package gun12_stringManipulations;

public class C05_StringManipulations01 {
    public static void main(String[] args) {
        /*
        Soru 1) String methodlarini kullanarak

        “ Java ogrenmek123 Cok guzel@ ”

         String’ini

         “Java ogrenmek cok guzel.”

          sekline getirin.
         */

//        String verilenStr = " Java ogrenmek123 Cok guzel@ ";

//        String duzenlenenStr = " Java ogrenmek123 Cok guzel@ ";

//        String istenenStr = "Java ogrenmek cok guzel.";




//        System.out.println(istenenStr.equals(verilenStr));

        String str = " Java ogrenmek123 Cok guzel@ ";

        str=str.trim().replaceAll("\\d","").replaceAll("@",".").replace('C','c');


        System.out.println(str);





    }
}
