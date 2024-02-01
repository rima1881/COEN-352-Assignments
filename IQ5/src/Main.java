public class Main {
    public static void main(String[] args) {


        int[] array = {0,1,5,10,15,23,60,75,30,29,25,14,13,12,11,10,9,7,6,4,3,2,1};

        int pointerIndex = array.length / 2;
        //first log : find the top
        boolean direction = array[pointerIndex] > array[pointerIndex - 1];

    }
}