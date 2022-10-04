package gun13_methodCreations;

public class C01_MethodCreations {
    public static void main(String[] args) {
        //Bir Methodu olusturmak o methodu  calistirmak icin yeterli degildir.
        //Eger bir methodu calistirmak isterseniz Method Call (methodu cagirmalisiniz)

        //method call yapmak icin varsa adi ve parametreleri yazilmalidir
         //  ==>60
        // sadece method call yaptigimizda method calisir
        // eger methodun icinde bir sey yazdirdigimizda colsole da o yaziyi gorururz

        // anca method umuz  return type a sahipse bir sonuc return edecektir
        // bu sonucu ya direk yazdiririz
        toplama(10,20);//  ===> burda java 30 goruru
        toplama(10,30); // burda java 40 goruru
        System.out.println(toplama(10,40));

        int toplaMethodu = toplama(55,25);
        System.out.println(toplaMethodu);


    }


   public static int toplama(int sayi1, int sayi2){

        return sayi1+sayi2; /// JAVA burda iki sayinin toplanmis halini dondurur
    }



}
