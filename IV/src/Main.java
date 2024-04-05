import employee.EmployeeController;

import java.util.Scanner;

public class Main {

    private static Scanner sc;
    private static EmployeeController controller;
    public static void main(String[] args) {

        System.out.println("\n---------------------------------------");
        System.out.println("Welcome to Employee Management program");
        System.out.println("---------------------------------------");

        sc = new Scanner(System.in);

        System.out.println("\nPlease enter the path to database (Press Enter to use default path): ");
        String path = sc.nextLine();

        if(path.isEmpty())
            path = "Database/Employees.txt";

        System.out.println("\nPlease enter how many baskets do you wish to have: ");
        int basketNumber = Integer.parseInt(sc.nextLine());

        if(basketNumber < 1)
            basketNumber = 1;


        controller = new EmployeeController(basketNumber,path);
        System.out.println("The data extracted successfully");


        while (userControl());

    }

    private static boolean userControl(){

        System.out.println("\n\n**********************************************************************");
        System.out.println("Choose Operation");
        System.out.println("1.Show All Baskets");
        System.out.println("2.Show a Basket");
        System.out.println("3.Add an employee");
        System.out.println("4.Remove an employee");
        System.out.println("5.Exit");

        String answer = sc.nextLine();
        switch (answer) {
            case "5" -> {
                return false;
            }
            case "1" -> showBaskets();
            case "2" -> showOneBasket(Integer.parseInt(sc.nextLine()));
            case "3" -> AddEmployee();
            case "4" -> removeEmployee();
        }


        return true;

    }

    private static void removeEmployee(){
        System.out.println("Enter Employee id");
        controller.RemoveEmployee(Integer.parseInt(sc.nextLine()));
    }

    private static void AddEmployee(){
        System.out.println("Enter employee Id:");
        int Id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter employee Salary");

        System.out.println(controller.AddEmployee(new Integer[]{Id,Integer.parseInt(sc.nextLine())}) ? "Employee added" : "The given Employee exist or the salary doesn't match max/min given salary" );

    }

    private static void showBaskets(){
        for(int i=0;i < controller.getBasketNum();i++)
            System.out.println( "------------------------------\n" + "Basket " + i + ":\n" + controller.getNthBasket(i));
    }

    private static void showOneBasket(int i){
        System.out.println(controller.getNthBasket(i));
    }
}