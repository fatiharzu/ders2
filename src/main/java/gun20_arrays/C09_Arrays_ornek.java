package gun20_arrays;

import java.util.Arrays;

public class C09_Arrays_ornek {
    public static void main(String[] args) {

        int [] rondom = { 6, -4, 12, 0, -10 };
        int x = 12;
        int y = Arrays.binarySearch(rondom, x);
        System.out.println(y);
    }
}
