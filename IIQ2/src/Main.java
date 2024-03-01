import java.util.Scanner;

public class Main {

    public static int[] array = {0,13,5,10,15,96,60,59,58,29,25,14,70,12,11,10,43,7,64,44};


    public static void main(String[] args) {


        int n = array.length;


        Scanner sc = new Scanner(System.in);


        //printing initial Array
        System.out.println("Initial Array:");
        for (int i : array) System.out.print(i + "\t");
        System.out.println("\nArray size is (n):" + n);


        System.out.print("enter m:");
        int size = sc.nextInt();

        //it is mentioned that n is multiply of m
        if (n % size != 0){
            System.out.println("incorrect input!!!");
            return;
        }


        int groupNum = n/size;
        int[][] groups = new int[groupNum][];


        for(int i=0; i < groupNum; i++){

            groups[i] = new int[size];
            for(int j=i*size; j < (i+1) * size ; j++)
                groups[i][j - i * size] = array[j];


            //Selection Sort :O
            SSort(groups[i]);

        }

        int[] result = new int[0];



        for(int i=0;i < groupNum;i++)
            result = MSort(result,groups[i]);



        //printing
        System.out.println("Final Array:");
        for (int i : result) System.out.print(i + "\t");

    }


    //Selection Sort
    private static void SSort(int[] arr){


        int n = arr.length;

        for(int i=0;i < n - 1;i++) {

            int minIndex = i;

            //find the minimum
            for (int j = i + 1; j < n; j++)
                if (arr[minIndex] > arr[j])
                    minIndex = j;

            //swap
            if(minIndex != i) {
                arr[i] += arr[minIndex];
                arr[minIndex] = arr[i] - arr[minIndex];
                arr[i] -= arr[minIndex];
            }

        }

    }


    //Merge Sort
    private static int[] MSort(int[] arr1,int[] arr2){

        int arr1Size = arr1.length, arr2Size = arr2.length, arr1Pointer = 0, arr2Pointer = 0;
        int[] temp = new int[arr1Size + arr2Size];


        for(int i=0; i < arr1Size + arr2Size;i++)
            temp[i] = arr1Pointer==arr1Size ? arr2[arr2Pointer++] :
                    arr2Pointer == arr2Size ? arr1[arr1Pointer++] :
                            arr1[arr1Pointer] > arr2[arr2Pointer] ?
                                    arr2[arr2Pointer++] : arr1[arr1Pointer++];

        return temp;

    }
}
