import java.util.Scanner;

public class ArrayQuestion {
    public static void main(String[] args) {
        // Create an array that stores the salaries of "n" employees.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        int numberOfEmployees = input.nextInt();
        // Create
        double[] employees = new double[numberOfEmployees];

        // Read the salaries.
        System.out.println("Enter the salaries:");
        for(int i=0;i<numberOfEmployees;i++){
            employees[i] = input.nextDouble();
        }

        // Cut 10% TDS from the salaries;
        for(int i=0;i<numberOfEmployees;i++){
            employees[i] = employees[i] - employees[i]*0.1;
        }

        // Print the final salaries;
        System.out.println("The final salaries are:");
        for(int i=0;i<numberOfEmployees;i++){
            System.out.println(employees[i]);
        }

        input.close();
    }
}
