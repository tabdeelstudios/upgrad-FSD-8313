import java.util.Scanner;

interface Hello {    
    void sayHello();
}

class SayHello implements Hello {
    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}

public class HelloWorld {
    public static void main(String args[]){
    //     SayHello myHello = new SayHello();
    //     myHello.sayHello();
        
    //     try{
    //         System.out.println(10/0);
    //     } catch(Exception e){
    //         // System.out.println("Cannot divide by 0");
    //         System.out.println(e.getMessage());
    //     } finally {
    //         System.out.println("Thanks for being here!");
    //     }
    // }


    // Question: Write a Java program to handle non-integer inputs gracefully during arithmetic operations, ensuring that when a user enters an invalid input, the program catches the NumberFormatException, informs the user of the invalid entry, and prompts them to enter valid integers?
        Scanner myScanner = new Scanner(System.in);
        int userInput = 0;
        boolean validInput = false;

        while(!validInput){
            try{
                System.out.println("Enter the first integer : ");
                userInput = Integer.parseInt(myScanner.nextLine());
                validInput = true;
            } catch(NumberFormatException e){
                System.out.println("Invalid input. Please enter another number.");
            }
        }

        myScanner.close();
    }
}



