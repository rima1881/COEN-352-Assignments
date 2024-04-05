package employee;
import java.util.function.BiConsumer;

public class EmployeeController {

    private int maxSalary;
    private int minSalary;

    //EmployeeList is hashset
    private final EmployeeList[] data;

    public EmployeeController(int num,String path) {

        data = new EmployeeList[num];




        try(EmployeeDriver driver = new EmployeeDriver(path,
                (min,max) -> {
                    this.maxSalary = max;
                    this.minSalary = min;
                }))
        {

            int distance = maxSalary - minSalary;
            int groupRange = distance/num;

            for(int i=0;i<num;i++)
                data[i] = new EmployeeList(minSalary + (i+1)*groupRange,minSalary + (i)*groupRange );

            Integer[] employee;
            while ((employee = driver.getEmployee()) != null ) {


                AddEmployee(employee);

            }

        }
        catch (EmployeeException e){
            System.out.println("The file data is corrupted");
            System.out.println("please validate the data and restart the program");
        }
        catch (Exception e){
            System.out.println("There was a problem while extracting data");
            System.out.println("Please restart the program");
            while (true);
        }


    }

    public boolean AddEmployee(Integer[] emp){

        for(EmployeeList list : data)
            if(list.put(emp[0].intValue(), emp[1].intValue()) == 1)
                return true;

        return false;
    }

    public void RemoveEmployee(int id){

        for(EmployeeList list: data)
            list.remove(id);

    }

    public int getBasketNum(){
        return data.length;
    }

    public int getMaxSalary(){
        return maxSalary;
    }

    public int getMinSalary(){
        return minSalary;
    }

    public EmployeeList getNthBasket(int i){
        return data[i];
    }


}
