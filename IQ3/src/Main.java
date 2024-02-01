public class Main {

    public static MyLinkedList mylist = new MyLinkedList();

    public static void main(String[] args) {

        System.out.println("Initial data:\n");

        //custom method just to fill the list
        MakeLinkedList();

        //custom toString method
        System.out.println(mylist);

        System.out.println("The maximum is: ");
        System.out.println(MyLinkedList.max(mylist.getNth(0)));

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