public class MyCircleNumbers {

    public MyCircleNumbers(int n){

        size = n;
        link = new Node(--n,null);
        Node last = link;

        while (n > 0)
            link = new Node(--n,link);

        last.setNext(link);

    }

    public void play(int m){
        m--;

        //check if there is only one left
        while (size > 1){

            for(int jump = m - 1; jump > 0;jump--)
                link = link.getNext();

            System.out.print(link.getNext().getNumber() + "\t");
            size--;
            //remove element
            link.setNext(link.getNext().getNext());

            //updating pointer
            link = link.getNext();

        }

        //print the last one
        System.out.print(link.getNumber());

    }

    public Node getLink() {
        return link;
    }

    private Node link;
    private int size;

    public class Node{

        public Node(int number,Node next){
            this.number = number;
            this.next = next;
        }

        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
        public void setNumber(int number) {
            this.number = number;
        }
        public int getNumber() {
            return number;
        }

        private int number;
        private Node next;
    }

}
