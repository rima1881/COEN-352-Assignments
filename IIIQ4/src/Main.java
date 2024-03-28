import doodoo.DooDoo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DooDoo myDooDoo = new DooDoo("src/data.txt");

        myDooDoo.Read();


        System.out.println(myDooDoo);

    }
}