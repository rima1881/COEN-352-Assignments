public class Main {


    public static int[] array = {0,1,5,10,15,23,60,59,58,29,25,14,13,12,11,10,9,7,6,4,3,2,1};

    public static void main(String[] args) {

        int[] res = EvenOddSort(array);

        //printing req
        for (int re : res) System.out.print(re + "\t");


    }


    public static int[] EvenOddSort(int[] input){

        CustomArray<Integer> result = new CustomArray<>(input.length);

        EvenOddSort(input,0,result);

        for(int i=0;i < input.length;i++)
            input[i] = result.getIndex(i);

        return input;
    }

    public static void EvenOddSort(int[] input,int index, CustomArray<Integer> result){

        if(input[index] % 2 == 0)
            result.AddFromLeft(input[index]);
        else
            result.AddFromRight(input[index]);

        if(index + 1 != input.length)
            EvenOddSort(input,index + 1,result);
    }
}