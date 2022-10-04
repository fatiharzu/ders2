package gun22_arrayList;

import java.util.Arrays;
import java.util.List;

public class C08_ListToArray {
    public static void main(String[] args) {
        String arr[] = {"3","5","7"};

        List<String> arrList = Arrays.asList(arr);

        System.out.println("List olarak ="+ arrList);

        arr[1]= "Ali";

        System.out.println("lsit Olarak = " +arrList);



    }
}
