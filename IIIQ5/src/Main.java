import Grade.Grade;
import Grade.BadGradeException;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static Grade[] grades;

    public static void main(String[] args) {

        System.out.println("\nThe Grading System:");
        System.out.println(Grade.PrintingGradingSystem());

        //instead of adding grades each time manually
        fillGrades();

        System.out.println("The average is:");
        System.out.println(calculateAvg());

    }

    private static void fillGrades(){
        grades = new Grade[10];

        try {
            grades[0] = new Grade("A+","Math 203");
            grades[1] = new Grade("B+", "COEN 313");
            grades[2] = new Grade("B+", "COEN 311");
            grades[3] = new Grade("A+","Elec 273");
            grades[4] = new Grade("C+", "Math 205");
            grades[5] = new Grade("B-","Econ 203");
            grades[6] = new Grade("A","COEN 244");
            grades[7] = new Grade("A+","COEN 243");
            grades[8] = new Grade("A-", "Chem 205");
            grades[9] = new Grade("B-","Engr 301");

        }
        catch (BadGradeException e){
            System.out.println("The grade System does not match with your input. please refer to the grade system");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private static Double calculateAvg(){

        Double result = 0.00;

        for(Grade g: grades)
            result += g.getValue();

        return result/grades.length;

    }
}