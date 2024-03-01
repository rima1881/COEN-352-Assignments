import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class Main {

    private static Time[] data;
    private static final Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {



        System.out.println("Enter the number of Times to Store:");
        int n = sc.nextInt();

        data = new Time[n];

        sc.nextLine();

        System.out.println("press y for giving times manually");
        String c = sc.nextLine();

        if(c.equals("y"))
            manualTime();
        else
            randomTime();


        System.out.println("Initial Order");
        System.out.println("---------------------------------------------------");
        for(Time t : data) System.out.println(t);
        System.out.println("---------------------------------------------------");



        Arrays.sort(data);


        System.out.println("\nSorted");
        System.out.println("---------------------------------------------------");
        for(Time t : data) System.out.println(t);
        System.out.println("---------------------------------------------------");


    }

    private static void manualTime(){

        for(int i = 0;i < data.length;i++){

            System.out.println("enter hour");
            int hour = sc.nextInt();

            System.out.println("enter minute");
            int minute = sc.nextInt();

            System.out.println("enter second");
            int second = sc.nextInt();

            data[i] = new Time(hour,minute,second);

        }
    }

    private static void randomTime(){

        Random rand = new Random();


        for(int i = 0;i < data.length;i++)
            data[i] = new Time(rand.nextInt(24),rand.nextInt(60),rand.nextInt(60));

    }

}