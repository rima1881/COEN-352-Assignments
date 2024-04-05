package employee;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class EmployeeList extends HashMap<Integer,Integer> {

    private final int maxBasket;
    private final int minBasket;

    public EmployeeList(int max,int min) {
        maxBasket = max;
        minBasket = min;
    }

    @Override
    public Integer put(Integer id, Integer salary){

        if(salary > maxBasket || salary < minBasket)
            return -1;
        else if(get(id) != null)
            return -1;

        super.put(id,salary);
        return 1;
    }

    @Override
    public String toString(){

        final String[] result = {""};
        forEach(new BiConsumer<Integer, Integer>() {
            @Override
            public void accept(Integer integer, Integer integer2) {
                result[0] += integer + "\t" + integer2 + "\n";
            }
        });

        return result[0];
    }

    public int getMaxBasket(){
        return maxBasket;
    }

    public int getMinBasket(){
        return minBasket;
    }
}
