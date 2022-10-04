package gun12_stringManipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {
        //endWith()
        //startWith()

        String str = "Java ogrenmek artik cok kolay";

        System.out.println(str.endsWith("olay"));
        System.out.println(str.endsWith("ay"));
        System.out.println(str.endsWith("y"));
        System.out.println(str.endsWith(" kolay"));

        System.out.println(str.startsWith("Java"));
        System.out.println(str.startsWith("J"));
        System.out.println(str.startsWith("Ja"));
        System.out.println(str.startsWith("Java "));

        String str2 = "";
        String str3 = " ";
        String str4 = null;

        System.out.println(str2.isEmpty());   // true
        System.out.println(str3.isEmpty());   // false
 //       System.out.println(str4.isEmpty());   // exception






    }
}
