import java.util.Scanner;

public class Main {

    //sample array
    public static int[] array = {0,1,5,10,15,23,60,62,61,29,25,14,13,12,11,10,9,7,6,4,3,2,1};

    public static void main(String[] args) {
        
        // first log : finding the top of array
        int topIndex = findTop(0,array.length - 1);

        //has to be removed
        System.out.println(array[topIndex]);

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // second log & third log : binary search on the first half and second half
        if( binarySearchAss(0,topIndex,number) || binarySearchDes(topIndex + 1,array.length - 1, number) ){
            System.out.println("the given number is in the array :)");
            return;
        }


        System.out.println("the given number is not in the array :(");


    }

    //has to be improved
    public static int findTop(int firstIndex, int lastIndex){

        int distance = lastIndex - firstIndex;

        if(distance == 1)
            return array[firstIndex] > array[lastIndex] ? firstIndex : lastIndex;

        else if(array[firstIndex + distance/2] > array[ firstIndex + distance/2 + 1])
            return findTop(firstIndex , lastIndex - distance/2);

        else
            return findTop( firstIndex + (distance/2 + 1) , lastIndex);

    }


    //FIX THIS MESS
    //please make me
    public static boolean binarySearchAss(int firstIndex,int lastIndex ,int num){

        int distance = lastIndex - firstIndex;

        if(distance == 0)
            return num == array[lastIndex];
        else if( (num > array[firstIndex + distance/2]))
            return binarySearchAss(firstIndex + distance/2 + 1 , lastIndex, num);
        else
            return binarySearchAss(firstIndex , firstIndex + distance/2 , num);

    }
    public  static boolean binarySearchDes(int firstIndex,int lastIndex , int num){

        int distance = lastIndex - firstIndex;

        if(distance == 0)
            return num == array[lastIndex];
        else if( (num >= array[firstIndex + distance/2]))
            return binarySearchAss(firstIndex , firstIndex + distance/2 , num);
        else
            return binarySearchAss(firstIndex + distance/2 + 1 , lastIndex, num);


    }

}