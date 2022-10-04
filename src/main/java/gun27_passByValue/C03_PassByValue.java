package gun27_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {

    public static void main(String[] args) {
        	/*
		 Soru3 : Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim.
		 Iki method olusturup list elemanlarini artirmayi deneyelim
		- 1. Method’da elemanlari for each loop kullanarak artirin
		- 2. Method’da elemanlari set method’u kullanarak artirin
		- Method’lari arka arkaya cagirip artislarin kalici olup olmadiklarini kontrol edelim.
		 */

        List<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);

        System.out.println("Olusturdugumuz liste :"+list);

        forLoopIleArtir(list);
        System.out.println("forLoopMethod'undan Sonra List : " + list); // [10, 11, 12]

        setIleArtit(list);
        System.out.println("set Method'undan sonra main method icinde List : " + list);
    }

    private static void setIleArtit(List<Integer> list) {
        // set ile elemanlari arttiralim

        for (int i = 0; i < list.size(); i++){
            list.set(i, list.get(i)+5);
        }
        //loop dan sonra lisetyi yazdiralim
        System.out.println("set methodu icinde arttirdigimiz elamlar : "+list);
    }

    private static void forLoopIleArtir(List<Integer> list) {
        // for each loop ile elamanlari arttiralim
        System.out.print("Foreach loop ile arttirdigimiz elementler : ");
        for (Integer each: list) {
            each+=5;
            System.out.print(each+" ");
        }

        System.out.println("");
        System.out.println("foreach loop'dan sonra list : "+list); // [10, 11, 12]
        // foreach loop'da atama yapamadigim icin listeyi kalici olarak degistiremedim
        // for loop kullanip get method'u ile elementleri cagirinca da atama yapamadim
        // Dolayisiyla for loop ile elementleri kalici olarak degistiremedik

    }

}
