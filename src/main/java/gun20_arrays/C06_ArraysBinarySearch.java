package gun20_arrays;

import java.util.Arrays;

public class C06_ArraysBinarySearch {
    public static void main(String[] args) {


        String [] arr = {"Ali","Mehmet","Fatih","Hasan","Huseyin","Can"};

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //binarysearch

        // binary search u kullnamak icin once sort methodunu uygulamamiz gerek

        System.out.println(Arrays.binarySearch(arr,"Hasan"));   // 3  icerikte varsa bize index i verir
        System.out.println(Arrays.binarySearch(arr,"Ahmet"));   // -1 icerikte yoksa bize sirasini verir(-)
        System.out.println(Arrays.binarySearch(arr,"Hikmet"));  // -5

        int [] arrSayi ={1,5,9,6,2,7};

        Arrays.sort(arrSayi);   // [1, 2, 5, 6, 7, 9]

        System.out.println(Arrays.binarySearch(arrSayi,2)); // 1
        System.out.println(Arrays.binarySearch(arrSayi,7)); // 4
        System.out.println(Arrays.binarySearch(arrSayi,5)); // 2
        System.out.println(Arrays.binarySearch(arrSayi,3)); // -3
        System.out.println(Arrays.binarySearch(arrSayi,8)); // -6
        System.out.println(Arrays.binarySearch(arrSayi,4)); // -3





    }
}
