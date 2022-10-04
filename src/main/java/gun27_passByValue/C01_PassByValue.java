package gun27_passByValue;

public class C01_PassByValue {
    // java PassByValue dur
    // locallar arasindan gecis yapildiginda  java variablenin kendisini degil degerini gonderir
    public static void main(String[] args) {
        double fiyat=100;

       // fiyatta %10 indirim yapicam ve yeni fiyati dondurecegim

        System.out.println("methodlcall ie yazdirilan indirimli fiyat :" +indirimYap(fiyat));//90

        System.out.println("method calistiktan sonra fiyat : "+fiyat);//90

        int zamYuzdesi =15;
        zamYap(zamYuzdesi);



    }

    private static void zamYap(int zamYuzdesi) {
        // Javaya bir method olusturtdugumuzda Java bizim main method'da kullandigimiz
        // variable isminde clone/kopya bir variable olusturur
        // bunun amaci kod takibini kolaylastirmaktir
        // bu degiskenin ismini degistirsek de kodumuz problemsiz calisir
    }

    private static double indirimYap(double fiyat) {
        fiyat=fiyat*90/100;
        System.out.println(" methoddaki indirimli fiyat:"+fiyat); //90

        return fiyat;
    }
}
