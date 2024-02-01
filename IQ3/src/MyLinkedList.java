public class MyLinkedList {

    public static int max(Node first){

        int max = 0;
        Node pointer = first;

        while (pointer != null){

            if(pointer.getNumber() > max)
                max = pointer.getNumber();

            pointer = pointer.getNext();
        }

        return max;
    }

    public MyLinkedList(){
        size = 0;
        first = null;
    }

    @Override
    public  String toString(){

        if(size == 0)
            return "empty :(";

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

        private final int number;
        private Node next;
    }
}
