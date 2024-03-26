package Grade;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

final class GradeMap implements Map<String,Double> {

    private final ArrayList<String> keys = new ArrayList<>(Arrays.asList("A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D", "F"));
    private final ArrayList<Double> values = new ArrayList<>(Arrays.asList(4.33, 4.00, 3.67, 3.33, 3.00, 2.67, 2.33, 2.00, 1.67, 1.00, 0.00));

    @Override
    public int size() {
        return 11;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {

        return get(key) != null;
    }

    @Override
    public boolean containsValue(Object value) {

        if (value.getClass() != Double.class)
            return false;

        for (Double check : values)
            if (check.equals(value))
                return true;

        return false;
    }

    @Override
    public Double get(Object key) {

        if (key.getClass() != String.class)
            return null;

        for (int i = 0; i < size(); i++)
            if (keys.get(i).equals(key))
                return values.get(i);

        return null;
    }

    @Override
    public Double put(String key, Double value) {
        throw new UnsupportedOperationException("Modifying the Grades Map is not supported");
    }

    @Override
    public Double remove(Object key) {
        throw new UnsupportedOperationException("Modifying the Grades Map is not supported");
    }

    @Override
    public void putAll(Map<? extends String, ? extends Double> m) {
        throw new UnsupportedOperationException("Modifying the Grades Map is not supported");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Modifying the Grades Map is not supported");
    }

    @Override
    public Set<String> keySet() {
        return new HashSet<>(keys);
    }

    @Override
    public Collection<Double> values() {
        return values;
    }

    @Override
    public Set<Entry<String, Double>> entrySet() {
        return IntStream.range(0,11).mapToObj(
                i -> new SimpleEntry<>(keys.get(i) , values.get(i)))
                .collect(Collectors.toSet());
    }

    @Override
    public String toString() {

        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(2);

        StringBuilder result = new StringBuilder("---------------------\n");

        for(Entry<String,Double> item : entrySet() )
            result.append("|\t").append(item.getKey()).append("\t|\t").append(df.format(item.getValue())).append("\t|\n");

        result.append("---------------------\n");

        return result.toString();
    }
}