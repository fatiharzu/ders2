package gun22_arrayList;

import java.util.*;

public class C04_List_Soru02 {

    public static void main(String[] args) {
        // verilen bir array'de tekrar eden elementleri silip
        // tekrarsiz yeni bir array haline getirin

        int arr[] = {1,3,5,2,1,3,7,8,9,5,3,4,6,7,10,11,15};    // lenght 12
//                   1,3,5,2,7,8,9,4              // lenght 8
        // list

        List<Integer> sayirlar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!sayirlar.contains(arr[i])){

                sayirlar.add(arr[i]);
            }
        }
        System.out.println(sayirlar);

        Collections.sort(sayirlar);
        System.out.println(sayirlar);

        //Cevirme methoduyla

        Object yeniaMethodArr[] = sayirlar.toArray();
        System.out.println("Yeni method ile olusturdugumuz Array : "+Arrays.toString(yeniaMethodArr));


        // Loop kullanarak

        int yeniArr[]= new int[sayirlar.size()];

        for (int i = 0; i < yeniArr.length; i++) {
            yeniArr[i]=sayirlar.get(i);
        }
        System.out.println("Yeni tekrarsiz array imiz :" + Arrays.toString(yeniArr));





    }
}
