package gun20_arrays;

import java.util.Arrays;

public class C07_ArraysEquals {
    public static void main(String[] args) {
        //equals()

        int [] arr1 ={1,8,5,6,4,11};
        int [] arr2 ={5,8,1,6,11,4};

        System.out.println(Arrays.equals(arr1,arr2)); // false


        int [] arr3 ={1,8,5,6,4,11};
        int [] arr4 ={5,8,1,6,12,4};

        Arrays.sort(arr3);
        Arrays.sort(arr4);
        System.out.println(Arrays.equals(arr3,arr4)); // false


        int [] arr5 ={1,8,5,6,4,11};
        int [] arr6 ={5,8,1,6,11,4};

        Arrays.sort(arr5);
        Arrays.sort(arr6);
        System.out.println(Arrays.equals(arr5,arr6)); //true
    }
}
