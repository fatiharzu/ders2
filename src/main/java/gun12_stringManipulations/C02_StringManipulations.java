package gun12_stringManipulations;

public class C02_StringManipulations {
    public static void main(String[] args) {
        // replace()

        String str = "Java ogrenmek cok kolaydir.";

        System.out.println(str.replace("a","x"));// Jxvx ogrenmek cok kolxydir.
        System.out.println(str.replace("Java","x"));
        System.out.println(str.replace("a","xxxxx"));
        System.out.println(str.replace("a",""));
        System.out.println(str.replace('a','x'));

    }
}
