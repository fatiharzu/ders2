package gun06_relationalOperators_ifStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        int a= 2;

        int b = 3;

        if ( a>b ){
            System.out.println("a, b'den buyuktur");
        }
        if (a==b){
            System.out.println("a b ye esittir");
        }
        if (a<b){
            System.out.println("a kucuktur b den");
        }
        if (a>b || a+b <10){
            System.out.println("Yasasin Java");
        }
        if (a+b < 0 || a/b<20){
            System.out.println("Java hayattir");
        }


    }
}
