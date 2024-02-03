public class Main {

    //sample array
    public static int[] array = {0,1,5,10,15,23,60,75,30,29,25,14,13,12,11,10,9,7,6,4,3,2,1};

    public static void main(String[] args) {






        // first log : finding the top of array
        int topIndex = findTop(0,array.length - 1);


        System.out.println(topIndex);


        // second log : binary search on the first half
        //meow2


        // third half : binary search on the second half
        //meow3

    }

    //fix me please
    public static int findTop(int firstIndex, int lastIndex){

        int distance = lastIndex - firstIndex;

        if(distance == 0)
            return firstIndex;
        else if(array[firstIndex + distance/2] > array[ firstIndex + distance/2 + 1])
            return findTop(firstIndex , firstIndex + distance/2);
        else
            return findTop(distance/2 + 1 , lastIndex);

    }

}