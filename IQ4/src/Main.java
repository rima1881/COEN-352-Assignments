import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N");
        int n = sc.nextInt();

        System.out.println("Enter M");
        int m = sc.nextInt();

        MyCircleNumbers circle = new MyCircleNumbers(n);

        circle.play(m);

    }
}