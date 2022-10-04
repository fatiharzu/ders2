package gun22_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_List_size_isEmpty {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);

        System.out.println(sayilar.size());
        System.out.println(sayilar.isEmpty());
        System.out.println(sayilar);

        sayilar.add(30);
        sayilar.add(40);

        System.out.println(sayilar);

     //   System.out.println(sayilar.remove(2));// 30
        // remove methodunda iki kullanilir
        // 1 silmek istedigimiz elementin index ini yazarak
        // o elementi siler ve o elementi dondurur

        int silinenElement = sayilar.remove(2);

        System.out.println(silinenElement);
        System.out.println(sayilar);

        sayilar.add(silinenElement);
        System.out.println(sayilar);
        // 2 yontemis silmek istedigimiz  degeridirek sildirebilirz


  //      sayilar.remove(20);// icindekini index olarak gorur ve 20. indexi arar bulamaz outofbounds exception vverrirr

        List<String> isimler = new ArrayList<>();
        isimler.add("Ali");
        isimler.add("Ayse");
        isimler.add("Zeki");


        System.out.println(isimler.remove("Zeki"));// True

        System.out.println(isimler);

        boolean sonuc = isimler.remove("Mehmet");

        if (sonuc) {
            System.out.println("Mehmet'i buldum ve sildim");
        } else {
            System.out.println("Mehmet'i bulamadim dolayisla da silemedim");
        }
        isimler.remove(0);
        System.out.println(isimler);
        isimler.add("ali");
        isimler.add("hasan");
        isimler.add("mehmet");

        System.out.println(isimler);

        isimler.removeAll(isimler);
        System.out.println(isimler);

    }
}
