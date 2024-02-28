import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/*
    I made this class just because I could

        There was several easier ways, but I wanted to try
        myself to see if I could :)

*/



public class CustomArray<E> implements Iterable<E> {
    //constructors
    @SuppressWarnings("unchecked")
    public CustomArray(int size){
        this.size = size;
        this.data = (E[]) new Object[size];
        this.leftPointer = 0;
        this.rightPointer = this.size - 1;
    }

    public CustomArray(E[] data,int leftPointer,int rightPointer) {
        this.size = data.length;
        this.data = Arrays.copyOf(data, data.length);   //deep copy
        this.leftPointer = leftPointer;
        this.rightPointer = rightPointer;
    }


    public CustomArray(CustomArray<E> original){
        this.size = original.size;
        this.data = Arrays.copyOf(original.data , original.size);
        this.leftPointer = original.leftPointer;
        this.rightPointer = original.rightPointer;
    }

    //add methods
    public void AddFromLeft(E element) throws IndexOutOfBoundsException{

        if(leftPointer > rightPointer)
            throw new IndexOutOfBoundsException("Array is full :(");

        data[leftPointer] = element;
        leftPointer++;

    }
    public void AddFromRight(E element) throws IndexOutOfBoundsException{

        if(rightPointer < leftPointer)
            throw new IndexOutOfBoundsException("Array is full :(");

        data[rightPointer] = element;
        rightPointer--;
    }

    public E getIndex(int index){
        return data[index];
    }

    public int getSize(){
        return size;
    }

    //Iterable
    @Override
    public Iterator<E> iterator(){


        return new Iterator<>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return data[currentIndex++];
            }
        };
    }


    private int leftPointer;
    private int rightPointer;
    private final int size;
    private final E[] data;
}
