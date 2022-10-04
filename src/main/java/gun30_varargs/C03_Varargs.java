package gun30_varargs;

public class C03_Varargs {
    public static void main(String[] args) {
            //birden cok paramaetre kullanacak isek varrargs kullanilir


        // varargs kullanarak Stringleri birlestiren concat() isim li bir method olusturun

        cancat("m","e","r","v","e");

    }

    private static void cancat(String... strings) {
        String s="";
        for (String w:strings) {
            s=s.concat(w);

        }
        System.out.println(s);
    }

}
