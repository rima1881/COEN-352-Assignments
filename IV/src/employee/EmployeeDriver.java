package employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.BiConsumer;


public class EmployeeDriver implements AutoCloseable {

    private final BufferedReader br;
    public EmployeeDriver(String path, BiConsumer<Integer,Integer> setMaxMin) throws IOException {
        br = new BufferedReader(new FileReader(path));
        setMaxMin.accept(Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()));

    }

    public Integer[] getEmployee() throws IOException {
        String line = br.readLine();

        if(line == null)
            return null;

        String[]  res = line.split("\t");

        return new Integer[]{Integer.parseInt(res[0].replace(" ","")),Integer.parseInt(res[1].replace(" ",""))};

    }

    @Override
    public void close() throws Exception {
        br.close();
    }
}
