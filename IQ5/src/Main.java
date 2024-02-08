import java.util.Scanner;
import java.util.function.BiPredicate;

public class Main {

    //sample array
    public static int[] array = {0,1,5,10,15,23,60,59,58,29,25,14,13,12,11,10,9,7,6,4,3,2,1};

    public static void main(String[] args) {
        
        // first log : finding the top of array
        int topIndex = findTop(0,array.length - 1);

        //has to be removed
        System.out.println(array[topIndex]);

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        BiPredicate<Integer,Integer> AscendingSearch = (a , b) -> a > b;
        BiPredicate<Integer,Integer> DescendingSearch = (a , b) -> a < b;

        // second log & third log : binary search on the first half and second half
        if( binarySearch(0,topIndex,number , AscendingSearch) || binarySearch(topIndex + 1,array.length - 1, number,DescendingSearch) ){
            System.out.println("the given number is in the array :)");
            return;
        }


        System.out.println("the given number is not in the array :(");


    }

    //has to be improved
    public static int findTop(int firstIndex, int lastIndex){

        int distance = lastIndex - firstIndex;

        if(distance == 0)
            return firstIndex;

        else if(array[firstIndex + distance/2] > array[ firstIndex + distance/2 + 1])
            return findTop(firstIndex , firstIndex + distance/2);

        else
            return findTop( firstIndex + (distance/2 + 1) , lastIndex);

    }


    public static boolean binarySearch(int firstIndex,int lastIndex ,int num , BiPredicate<Integer,Integer> searchMethod) {

        int distance = lastIndex - firstIndex;

        if (distance == 0)
            return num == array[lastIndex];
        else if (searchMethod.test( num , array[firstIndex + distance / 2] ))
            return binarySearch(firstIndex + distance / 2 + 1, lastIndex, num, searchMethod);
        else
            return binarySearch(firstIndex, firstIndex + distance / 2, num, searchMethod);

    }

}