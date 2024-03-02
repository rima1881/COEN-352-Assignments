import java.util.Random;
public class MyLinkedList {

    private static final Random rand = new Random();

    public MyLinkedList(){
        size = 0;
        first = null;
    }

    public void Shuffle(){

        //zero
        if(size == 0)
            return;


        int i = 0;
        Node current = first;
        while (i < size - 1){
            swapNodes(current , rand.nextInt(size - i++));
            current = current.next;
        }


    }

    //takes one Node and the distance of the second node from the first one
    private void swapNodes(Node first,int distance){

        Node second = first;
        while (distance-- > 0)
            second = second.next;

        int temp = first.number;
        first.number = second.number;
        second.number = temp;

    }


    /*

    *****************************************
    *   The code from here to the end of    *
    *   the file is reused from previous    *
    *   assignment. There maybe some extra  *
    *   unused functions                    *
    *****************************************

    */


    @Override
    public  String toString(){
        StringBuilder res = new StringBuilder();


        for (int i=0;i < size ;i++)
            res.append(getNth(i).getNumber()).append("\t");

        res.append("\nThe list size is: ").append(size);

        return res.toString();
    }

    public void Add(int num){
        first = new Node(num,first);
        size++;
    }


    public boolean remove(int num){

        //check input
        if (size <= num || num < 0)
            return false;

        size--;

        //logic for first one is different
        if(num == 0) {
            first = first.getNext();
            return true;
        }

        Node pointer = getNth(--num);
        pointer.setNext(pointer.getNext().getNext());

        return true;
    }

    public Node getNth(int index){

        if (size <= index || index < 0)
            return null;

        Node Nth = first;

        while (index > 0){
            Nth = Nth.getNext();
            index--;
        }

        return Nth;
    }
    public int getSize() {
        return size;
    }

    private int size;
    private Node first;
    public class Node{

        public Node(int num,Node next){
            number = num;
            this.next = next;
        }
        public int getNumber() {
            return number;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
        private int number;
        private Node next;
    }
}
