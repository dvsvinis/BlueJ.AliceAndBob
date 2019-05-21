/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);  // declare scanner
        System.out.println("What is your name? "); //prompt user for name
        String name = in.nextLine();  //reads input and assigns to name
        if (name.equals("Alice") || name.equals("Bob")) {    //conditional
            System.out.print("Greetings " + name);  //print message to screen 
        }
        
    }
}
