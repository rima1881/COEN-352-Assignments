import java.util.Scanner;  // Import the Scanner class



public class Main {

    public static MyLinkedList mylist = new MyLinkedList();

    public static void main(String[] args) {


        System.out.println("Initial data:\n");

        //custom method just to fill the list
        MakeLinkedList();

        //custom toString method
        System.out.println(mylist);
        System.out.println("\nSelect index to remove (0 - " + (mylist.getSize() - 1) + ")");

        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        //if index is in range
        if(mylist.remove(index))
            System.out.println(mylist);
        else
            System.out.println("index out of range!!!");



    }

    private static void MakeLinkedList(){
        mylist.Add(12);
        mylist.Add(21);
        mylist.Add(13);
        mylist.Add(17);
        mylist.Add(25);
        mylist.Add(1);
        mylist.Add(7);
        mylist.Add(22);
    }
}