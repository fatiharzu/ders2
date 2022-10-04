package gun30_varargs;

public class C04_Varargs {
    public static void main(String[] args) {
        // verilen int lerden ilki haric tum sayilari toplayan ve budugunuz toplam ile ilk sayiyi carpip soruyu yazdirin


        islemYap(4,2,6,5,9,15);
        islemYap(0,5,6,1,2,35,365);
    }

    private static void islemYap(int carpilacakSayi, int bolunecekSayi, int... toplanacakSayi) {
        int toplam=0;
        for (int i:toplanacakSayi) {
            toplam+=i;
        }
        System.out.println("sayilarin son hali :"+(carpilacakSayi*toplam)/bolunecekSayi);
    }



}
