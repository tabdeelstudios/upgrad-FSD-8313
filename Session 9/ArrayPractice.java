import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int numberOfSubjects = input.nextInt();
        // Create
        int[] marks = new int[numberOfSubjects];
        // marks[0]=96;
        // marks[1]=92;
        // marks[2]=91;
        // marks[3]=89;
        // marks[4]=76;

        // int[] marks = {96,92,91,89,76};
        System.out.println("Enter your marks in 5 subjects:");
        for(int i=0;i<numberOfSubjects;i++){
            marks[i] = input.nextInt();
        }

        // Read
        System.out.println("Your marks are:");
        for(int i=0;i<numberOfSubjects;i++){
            System.out.println(marks[i]);
        }

        // Update
        System.out.println("Enter the index to update:");
        int indexToUpdate = input.nextInt();
        System.out.println("Enter the updated marks:");
        int updatedMarks = input.nextInt();
        marks[indexToUpdate] = updatedMarks;

        input.close();
    }
}