package gun04_increment_decrement;

public class C05_Modulus {
    public static void main(String[] args) {
        // 5496 sayisinin rakamlar toplamini bulalim

        int sayi = 5496;
        int rakamlarToplami =0;

        // 1. basamagi elde etmek icin %10 yapariz

        int rakam = sayi%10;

        // 2. rakamimizi rakamlar toplamina ekliyoruz
        rakamlarToplami+=rakam;

        //3. kalan sayimizi yanlizlastiriyoruz sayimizin sn rakamini cikartiyoruz
        sayi/=10;


        // suanda sayimiz     rakam konteynrmiz var  rakamlar toplamimiz
        //    549                         6                      6
        //     54                         9                      15
        //     5                          4                      19
        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;


        rakamlarToplami+=sayi;

        System.out.println(rakamlarToplami);

        System.out.println(sayi);




















    }
}
