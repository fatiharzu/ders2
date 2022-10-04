package gun20_arrays;

import java.util.Arrays;

public class C05_ArraysSort {
    public static void main(String[] args) {


        //2) Bir Array’in tum elemanlari nasil siralanir?

        // sort()

        int arr[]={5,6,2,1,8};
//
//        System.out.println("siralanmamais hali : "+Arrays.toString(arr));
//
//        Arrays.sort(arr);
//
//        System.out.println("siralanmis hali "+Arrays.toString(arr));
        
        arr=arraySirala(arr);

        System.out.println("Siralanmis hali "+Arrays.toString(arr));

        arr = arrayiTerstenSirala(arr);

        System.out.println("Terse cevrilmis hali "+Arrays.toString(arr));

        
    }

    private static int[] arrayiTerstenSirala(int[] arr) {

        int[] temp = new int[arr.length];

        for (int i = 0; i < temp.length; i++) {
            temp[i]= arr[arr.length-1-i];
        }





     return temp;
    }

    private static int[] arraySirala(int[] arr) {

        Arrays.sort(arr);

        return arr;
    }
}