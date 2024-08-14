// Loop - initialisation, condition, updation, loop body

// for loop
// for(initialisation; condition; updation){ //loop body }

// while loop
    // initialisation;
    // while(condition){
    //  loop body
    //  updation
    // }


// do-while loop
// initialisation;
// do{
//   loop body
//   updation
// } while(condition);


public class LoopDemo {
    public static void main(String args[]){
        for(int i=0;i<10;i++){
            if(i==5){
                // break;
                continue;
            }
            System.out.println(i);
        }

        // int i = 100;
        // while(i<10){
        //     System.out.println(i);
        //     i++;
        // }

        // int i = 100;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i<10);
    }
}
