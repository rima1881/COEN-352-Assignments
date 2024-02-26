public class Main {


    public static int[] array = {0,1,5,10,15,23,60,59,58,29,25,14,13,12,11,10,9,7,6,4,3,2,1};

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    public static int[] EvenOddSort(int[] input){

        CustomArray<Integer> result = new CustomArray<>(input.length);

        return EvenOddSort(input,0,result);
    }

    public static CustomArray<Integer> EvenOddSort(int[] input,int index, CustomArray<Integer> result){
        return null;
    }
}