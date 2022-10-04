package gun25_constructor;

public class C05 {
    public static void main(String[] args) {
        C01 car1 = new C01();

        car1.ilanNo=1007;
        car1.marka="Ford";
        car1.model="C-Max";
        car1.yil=2011;
        car1.fiyat=50000;

        System.out.println(car1.fiyat+", " + car1.ilanNo + ", "+ car1.marka+", "+
                car1.model+", "+ car1.yil);


        C01 car2 = new C01(1008,"Volvo","C40",2016,45000);


        System.out.println(car2.fiyat+", " + car2.ilanNo + ", "+ car2.marka+", "+
                car2.model+", "+ car2.yil);


    }
}
