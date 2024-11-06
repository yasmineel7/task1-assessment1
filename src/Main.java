//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        //Create a new scanner object
        Scanner input = new Scanner (System.in);

        //Prompt the user to enter his firstName and lastName
        System.out.printf("Please enter your name: ");
        String firstName = input.next();
        String lastName =  input.nextLine();

        //Prompt the user to enter his age
        System.out.printf("Please enter your age: ");
        int age = input.nextInt(); input.nextLine();

        //Prompt the user to enter his gender
        System.out.printf("Please enter your gender: ");
        String gender = input.nextLine();

        //Prompt the user to enter his department
        System.out.printf("Please enter your department: ");
        String department = input.nextLine();

        //Prompt the user to enter the value of PI
        System.out.printf("Please enter the value of PI: ");
        double PI = input.nextDouble();
        input.nextLine();

        //Display the result
        System.out.println("Name: %s" + firstName + lastName + "\n");
        System.out.printf("Age: %d" + age + "\n");
        System.out.printf("Gender: %s" + gender + "\n");
        System.out.printf("Department: %s" + department + "\n");
        System.out.printf("The value of PI is: %.2f" + PI + "\n");

    }

}
