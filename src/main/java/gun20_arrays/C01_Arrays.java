package gun20_arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        //Soru 1: Elemanlari “Ali” , “Veli”, “Ayse” ve “Fatma” olan bir array olusturun ve bu
        //array’i yazdirin.

        String arr[]=new String[4];

        arr[0]= "Ali";
        arr[1]= "Veli";
        arr[2]= "Ayse";
        arr[3]= "Fatma";

        String arr2[] = {"Ali","Veli","Ayse","Fatma"};

        System.out.println(arr);
        System.out.println(arr2[2]);

        // Soru 2: Soru 1’deki elemanlardan “Ali” yerine “Can”, “Ayse” yerine “Gul” atayin

        arr[0]="Can";
        arr2[2]="Gul";

        System.out.println(arr2[2]);

        //  String'deki length() idi, burada sadece length

        System.out.println(arr[arr.length-1]);


        // -- index fazlasi yazdiginmizda hata vermez calistiginda veriri cunku bir run ettigimizde array olusur
        //array in lenght i sonradan degistirilmez
        // --uzunlugu isimle.lenght ile buluyoruz
        //array in tum elemanlari yazdirmak icin
        // 1.loop kullarniriz
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("Arrays  clasindan yardim alarak");
        //2 yol Arrays  clasindan yardim alarak
        System.out.println(Arrays.toString(arr));

        // eger arrayi direk yazdirmak istersek
        // Arrays.toString() methodunu kullanmali  ve parametre olarak arayin ismini yazmaliyiz

        // Array  yeni bir arr = new int [6] dersek onceki 5 iken => bu atama olmaz yeni bir array olur
        // new kleimesinden yeni bir array ousturdugumuzu anlariz



    }
}
