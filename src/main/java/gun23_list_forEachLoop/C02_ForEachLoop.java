package gun23_list_forEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {




        int arr[]={2,4,5,7,8,1,23};
        int carpim=1;

        for (int each:arr) {

            carpim*=each;

        }

        System.out.println("array elamnlarinin carpimi :"+carpim);
    }
}
