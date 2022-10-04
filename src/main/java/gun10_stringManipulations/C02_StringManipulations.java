package gun10_stringManipulations;

import java.util.Scanner;

public class C02_StringManipulations {
    public static void main(String[] args) {

        String isim = "abuziddin";

        System.out.println(isim.toUpperCase());
        // 7 - lenght()

        System.out.println(isim.length()); // 7
        System.out.println(isim.length()-1);



        System.out.println();

        // 8-indexOf()

        System.out.println(isim.indexOf("t")); //  -1

        System.out.println(isim.indexOf("d")); //  5

    }
}
