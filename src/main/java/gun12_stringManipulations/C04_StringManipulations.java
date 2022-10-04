package gun12_stringManipulations;

public class C04_StringManipulations {
    public static void main(String[] args) {

        //subString()

        String str = "Java OOP konsepti kullanir";

        System.out.println(str.substring(0));
        System.out.println(str.substring(4));
        System.out.println(str.substring(26));
 //      System.out.println(str.substring(28));

        System.out.println(str.substring(5,9));
        System.out.println(str.substring(1,4));
        System.out.println(str.substring(21,24));
//        System.out.println(str.substring(8,2));
        System.out.println(str.substring(5,6));
        System.out.println(str.substring(5,5));
        System.out.println(str.substring(10,11));

        //trim()


        String str2 = " Java cok kolay ";

        System.out.println(" Java cok kolay ");

        System.out.println(str2.trim());


    }
}
