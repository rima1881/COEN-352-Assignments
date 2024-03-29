package m2queue;

import javax.management.BadAttributeValueExpException;

public class M2Node<T extends Comparable<T>> {

    public M2Node(Object t){

        if(t == null)
            throw new IllegalArgumentException();

        data = t;
    }

    public void SetLeft(Object t){

        if(t.getClass() != data.getClass())
            throw new IllegalArgumentException();

        leftNode = new M2Node<>(t);

    }

    public void SetRight(Object t){

        if(t.getClass() != data.getClass())
            throw new IllegalArgumentException();


        rightNode = new M2Node<>(t);

    }

    public M2Node<T> GetRight(){
        return rightNode;
    }

    public M2Node<T> GetLeft(){
        return leftNode;
    }

    public boolean hasRight(){
        return rightNode != null;
    }

    public boolean hasLeft(){
        return leftNode != null;
    }

    private final Object data;
    private M2Node<T> leftNode;
    private M2Node<T> rightNode;

}
