package doodoo;

import java.security.Key;
import java.util.*;

public class DooDooMap<String, Integer> implements Map<String,Integer> {

    private final int size;
    private final LinkedHashMap<String,Integer> data;
    private int[] indexes;
    private int filledIndex;

    private void putIndex(int number,int low,int high){

        int mid = (high + low) / 2;

        if(low > high)
        {



        }





    }


    public DooDooMap(int size){
        this.size = size;
        data =  new LinkedHashMap<>(size);
        indexes = new int[size];
        filledIndex = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return data.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return data.containsValue(value);
    }

    @Override
    public Integer get(Object key) {
        return data.get(key);
    }

    @Override
    public Integer put(String key, Integer value) {

        putIndex((int) value);

        return data.put(key,value);
    }

    @Override
    public Integer remove(Object key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void putAll(Map<? extends String, ? extends Integer> m) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Set<String> keySet() {
        return data.keySet();
    }

    @Override
    public Collection<Integer> values() {
        return data.values();
    }

    @Override
    public Set<Entry<String, Integer>> entrySet() {
        return data.entrySet();
    }
}
