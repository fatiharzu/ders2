package gun22_arrayList;

import java.util.Arrays;
import java.util.List;

public class C09_List_set {
    public static void main(String[] args) {
        String arr[] = {"3","5","7"};

        List<String> arrList = Arrays.asList(arr);

        System.out.println("List olarak ="+ arrList);

        arr[1]= "Ali";

        System.out.println("lsit Olarak = " +arrList);

        arrList.set(0,"Ayse");      ///    set() methodu arrayilist in icindeki elemanlari degistirmek icin kullanirlir

        System.out.println("list ="+arrList);
        System.out.println("array ="+Arrays.toString(arr));
    }
}
