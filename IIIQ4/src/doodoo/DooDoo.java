package doodoo;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DooDoo {

    private final String path;
    private final List<String> data;
    private Map<Integer,String> sortedData = null;

    public DooDoo(String path){
        this.path = path;
        data = new ArrayList<>();
    }

    public void Read(){

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line;
            while ((line = br.readLine()) != null)
                data.add(line);

        }
        catch (Exception e){
            System.out.println("There was the problem in reading process. please double check the path");
        }

    }

    public void Sort(){
        sortedData = new LinkedHashMap<>(data.size());




    }

    private void SSort(){

    }

    public void UpdateFile(){

    }

    @Override
    public String toString() {

        return String.join("\n", data);
    }
}
