package gun27_passByValue;

public class C02_PassByValue {
    // Soru Verilen bir fiyat icin  %10, %20, %25 indirim yapan uc method olsuturun
    // - Method da indirim uygulayip fiyatini main method da yazdirin
    // - Methodlari arka arkaya cagirip calistiklarini kontrol edin

    public static void main(String[] args) {
        double fiyat = 100;


        System.out.println("%10 luk indirimli fiyat: "+indirim10(fiyat));


        System.out.println("%20 lik indirimli fiyat: "+indirim20(fiyat));


        System.out.println("%25 lik indirimli fiyat: "+indirim25(fiyat));

        System.out.println("Gercek fiyat: "+fiyat);
    }

    private static double indirim25(double fiyat) {
        fiyat*=0.75;
        return fiyat;
    }

    private static double indirim20(double fiyat) {
        fiyat*=0.80;
        return fiyat;
    }

    private static double indirim10(double fiyat) {
        fiyat*=0.90;
        return fiyat;
    }


}
