package gun12_stringManipulations;

public class C03_StringManipulations {
    public static void main(String[] args) {
        //replaceAll()

        String str = "Java'yi ogrenmek, cok cok kolay. 12345!";
        //* regularexpretions

        System.out.println(str.replaceAll("a","*"));
        System.out.println(str.replaceAll("\\s","*"));
        System.out.println(str.replaceAll("\\S","*"));
        System.out.println(str.replaceAll("\\w","*"));
        System.out.println(str.replaceAll("\\W","*"));
        System.out.println(str.replaceAll("\\d","*"));
        System.out.println(str.replaceAll("\\D","*"));

        //replaceFirst()

        System.out.println(str.replaceFirst("a","*"));
        System.out.println(str.replaceFirst("cok","*"));
        System.out.println(str.replaceFirst("\\w","*"));
        System.out.println(str.replaceFirst("\\s","*"));


    }
}
