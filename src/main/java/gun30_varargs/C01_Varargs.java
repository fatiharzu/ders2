package gun30_varargs;

public class C01_Varargs {
    public static void main(String[] args) {
        //method umuzun icine istedigimiz kadar parametre girebiliyoruz 
        //ayni tipte istedigmiz kadar veri girebiliriz.
        // varargs disinda  parametre varsa en sona yailmalidir ... (varargs) sonda olmalidir.
        // bir method da en fazla 1 varargs olmalidir
        add(5,7);
        add(5,7,-15);
        add(5,7,-15,20);
        add(5,7,-15,20,30);

    }
    public  static  void add(int... sayi){
        int toplam=0;
        for (int i:sayi ) {
            toplam+=i;
        }
        System.out.println("girilen sayilarin toplami : "+toplam);
    }
}
