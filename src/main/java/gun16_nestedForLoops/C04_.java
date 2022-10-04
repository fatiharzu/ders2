package gun16_nestedForLoops;

import java.util.Scanner;

public class C04_ {
    public static void main(String[] args) {

        //1- unique karakteri yazan bir kod yazin

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir string giriniz");
        String yazi = scan.nextLine();

        for (int i = 0; i< yazi.length(); i++){

            char harf = yazi.charAt(i);

            if (yazi.indexOf(harf)==yazi.lastIndexOf(harf)){
                System.out.print(harf);
            }


        }

        System.out.println(" ");
        // 2- Space i kadirdiktan sonra kelimeyi terse ceviren bir kod yazdirin

            for ( int i = yazi.length()-1 ; i>=0 ; i-- ){

                String  tersYazi = yazi.substring(i,i+1);

                if (tersYazi.contains(" ")){
                  tersYazi.replaceAll("\\s","") ;
                    System.out.print(tersYazi);
                }




            }





    }
}