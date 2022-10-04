package gun22_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_List_Soru01 {
    public static void main(String[] args) {


        List<String> harfler = new ArrayList<>();

        harfler.add("A");
        harfler.add("C");
        harfler.add("E");
        harfler.add("F");
        System.out.println(harfler);
        harfler.add("B");
        System.out.println(harfler);
        harfler.add(1,"L");
        System.out.println(harfler);
        harfler.set(3,"D");
        System.out.println(harfler);
        harfler.remove(4);
        System.out.println(harfler);
        Collections.sort(harfler);
        System.out.println(harfler);
        System.out.println(harfler.contains("L"));
        System.out.println(harfler.contains("M"));
        System.out.println(harfler.size());
        harfler.clear();
        System.out.println(harfler);
        System.out.println(harfler.isEmpty());




    }
}
