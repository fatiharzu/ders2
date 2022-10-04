package gun20_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {


        String arr[]=new String[4];

        arr[0]= "Ali";
        arr[1]= "Veli";
        arr[2]= "Ayse";
        arr[3]= "Fatma";

    // -- index fazlasi yazdiginmizda hata vermez calistiginda veriri cunku bir run ettigimizde array olusur
//        arr[4] ="Mahmut";
//        System.out.println(Arrays.toString(arr));

    //array in lenght i sonradan degistirilmez
    // --uzunlugu isimle.lenght ile buluyoruz

        System.out.println("array in uzunlugunu verir "+arr.length);

    //array in tum elemanlari yazdirmak icin
    // 1.loop kullarniriz
        System.out.println("Loop kullanarak");
        for(int i=0  ;  i<arr.length  ;  i++){
        System.out.print(arr[i]+" ");
    }

        System.out.println("");
        System.out.println("Arrays  clasindan yardim alarak");
    //2 yol Arrays  clasindan yardim alarak
        System.out.println(Arrays.toString(arr));

    // eger arrayi direk yazdirmak istersek
    // Arrays.toString() methodunu kullanmali  ve parametre olarak array in ismini yazmaliyiz

    // Array  yeni bir =>

        int arr2 [] = new int [5]; //  [0,0,0,0,0]
        System.out.println(Arrays.toString(arr2));
        arr2[2]=5;                //    [0,0,5,0,0]
        System.out.println(Arrays.toString(arr2));

         arr2 = new int [6]; //   [0,0,0,0,0,0]
        System.out.println(Arrays.toString(arr2));

        // dersek onceki 5 iken => bu atama olmaz yeni bir array olur
    // new kleimesinden yeni bir array olusturdugumuzu anlariz


//9) Array’in elemanlarina nasil ulasilir ve nasil update edilir ?



    }
}
