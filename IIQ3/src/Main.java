public class Main {

    public static int[] array = {0,13,5,10,15,96,60,59,58,29,25,14,70,12,11,10,43,7,64,44};

    public static void main(String[] args) {

        int n = array.length;
        int[] SIndex;

        //printing initial Array
        System.out.println("Initial Array:");
        for (int i : array) System.out.print(i + "\t");
        System.out.println("\nArray size is (n):" + n);

        SIndex = IndirectSort(0, n);


        //printing Index Array
        System.out.println("Index Array:");
        for (int i : SIndex) System.out.print(i + "\t");
        System.out.println("\nArray size is (n):" + n);


        //printing Sorted Array
        System.out.println("Sorted Array:");
        for (int i : SIndex) System.out.print(array[i] + "\t");
        System.out.println("\nArray size is (n):" + n);

    }



    private static int[] IndirectSort(int start,int end){

        if(end - start < 3)
            return  start == end - 1 ?
                    new int[] { start } :
                    array[start] > array[end - 1] ?
                        new int[] { end - 1 , start } :
                        new int[] {start, end - 1};



        int[] arr1 = IndirectSort(start, (end+start)/2);
        int[] arr2 = IndirectSort( (end+start)/2 , end);
        int[] result = new int[end - start];

        int arr1Pointer=0,arr2Pointer = 0, arr1Size = arr1.length,arr2Size = arr2.length;

        for(int i=0;i < arr1Size + arr2Size; i++)
            result[i] = arr1Pointer==arr1Size ? arr2[arr2Pointer++] :
                    arr2Pointer == arr2Size ? arr1[arr1Pointer++] :
                            array[arr1[arr1Pointer]] > array[arr2[arr2Pointer]] ?
                                    arr2[arr2Pointer++] : arr1[arr1Pointer++];


        return result;

    }
}