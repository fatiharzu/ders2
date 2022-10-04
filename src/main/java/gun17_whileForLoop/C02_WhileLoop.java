package gun17_whileForLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {


    //Soru 2 ) For loop ve while Loop kullanarak 3 basamakli sayilardan 15, 20 ve 90’na tam
    //bolunebilen sayilari yazdirin   100 =>   999


    for(int i =100; i <=999 ; i++){

        if (i%15==0 && i%20==0 && i%90==0){
            System.out.print(i+" ");
        }
    }

    int i= 100;

    while (i<=999){

        if (i%15==0 && i%20==0 && i%90==0){
            System.out.print(i+" ");
        }

        i++;
    }
    }
}
