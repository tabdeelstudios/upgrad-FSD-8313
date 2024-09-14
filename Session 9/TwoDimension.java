import java.util.Scanner;

public class TwoDimension {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = input.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = input.nextInt();
        int[][] matrix = new int[rows][columns];

        // int[][] matrix = {
        //     {2,3,4},
        //     {5,6,7},
        //     {8,9,10}
        // };

        System.out.println("Enter the data:");
        for(int i=0;i<rows;i++){
            System.out.println("Row:"+i);
            for(int j=0;j<columns;j++){
                System.out.println("Column:"+j);
                matrix[i][j]=input.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            System.out.print("\n");
            for(int j=0;j<columns;j++){
                System.out.print(matrix[i][j]);
                System.out.print("\t");
            }
        }


    }
}
