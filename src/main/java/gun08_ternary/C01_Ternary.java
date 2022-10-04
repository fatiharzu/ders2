package gun08_ternary;

public class C01_Ternary {
    public static void main(String[] args) {
        int a = 12;
        int b = 15;

        String kosul = (a<b)? "buyuktur":"kucuktur";

        System.out.println(kosul);

        System.out.println(a==b?"mamut":"ali");
    }
}
