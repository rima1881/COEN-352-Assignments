public class Main {

    private static MyLinkedList data;

    public static void main(String[] args) {

        fillData();

        System.out.println("Initial Data");
        System.out.println(data);

        data.Shuffle();

        System.out.println("\n\nShuffled Data");
        System.out.println(data);

    }

    //hard coded data for linked list
    private static void fillData(){
        data = new MyLinkedList();
        data.Add(12);
        data.Add(21);
        data.Add(13);
        data.Add(17);
        data.Add(25);
        data.Add(1);
        data.Add(7);
        data.Add(22);
        data.Add(12);
        data.Add(24);
        data.Add(12);
        data.Add(12);
        data.Add(1);
        data.Add(43);
        data.Add(98);
        data.Add(35);
        data.Add(70);
        data.Add(43);
        data.Add(1531);
        data.Add(43);
        data.Add(4545);
        data.Add(165);
        data.Add(733);
        data.Add(32);
    }

}