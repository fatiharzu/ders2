package gun22_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_List_add {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        // add() methodu  listeye ekler ama sonuna

        isimler.add("Ali");
        System.out.println(isimler);

        isimler.add("Veli");
        isimler.add("Osman");
        isimler.add("Nurettin");
        isimler.add("Yunus");
        isimler.add("Muhiddin");
        System.out.println(isimler); //[Ali, Veli, Osman, Nurettin, Yunus, Muhiddin]

        isimler.add(1, "Fatih");
        System.out.println(isimler);
   //     isimler.add(8,"Cuma"); ///IndexOutOfBoundsException    indexi astigimizda  siniri asma uyarisi verir
   //     System.out.println(isimler);

        List<String> isimler2 = new ArrayList<>();

        isimler2.add("Hasan");


        isimler2.addAll(isimler);

        System.out.println(isimler2);

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(12);

        //    isimler list  ' e  sayilar list i ekleyebilirmiyim?
        // hayir



    }
}
