import java.util.Stack;

public class PlateStack {
    private Stack<String> plates;

    public PlateStack(){
        plates = new Stack<>();
    }

    public void addPlate(String plate){
        plates.push(plate);
        System.out.println("Added plate: "+ plate);
    }

    public void removePlate(){
        if(!plates.isEmpty()){
            String removedPlate = plates.pop();
            System.out.println("Removed plate: "+ removedPlate);
        } else {
            System.out.println("No plates to remove!");
        }
    }

    public void peekPlate(){
        if(!plates.isEmpty()){
            System.out.println("Plate at the top: "+ plates.peek());
        } else {
            System.out.println("No plates in the stack!");
        }
    }

    public boolean isEmpty(){
        return plates.isEmpty();
    }
}


