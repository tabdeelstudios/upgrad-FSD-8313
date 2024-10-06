import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HashSetDemo {

    public static void main(String[] args) {
        
        HashSet<String> mySet = new HashSet<>();

        // Converting array to set
        List<String> allFruits = Arrays.asList("Kiwi", "Watermelon", "Pear", "Pear", "Kiwi");
        
        mySet.addAll(allFruits);

        // Inserting items
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Grapes");
        mySet.add("Orange");
        mySet.add("Orange");
        mySet.add("Orange");

        // Checking if a value exists
        System.out.println("Contains banana? -> "+ mySet.contains("Banana"));

        // Iterating through the set
        for(String fruit : mySet){
            System.out.println(fruit);
        }

        // Delete an item
        mySet.remove("Banana");

        // Get the size of the set
        System.out.println("The number of items in the set are: "+mySet.size());

        // Clearing the set
        mySet.clear();
        System.out.println("Is set empty? -> "+ mySet.isEmpty());

    }

}   