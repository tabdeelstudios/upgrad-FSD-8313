// Import HashMap
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        // HashMap<KeyType, ValueType> map = new HashMap<>();   
        HashMap<Integer, String> myMap = new HashMap<>();
        
        // Inserting values
        myMap.put(100, "John");
        myMap.put(101, "Jane");
        myMap.put(102, "Alice");
        myMap.put(103, "Bob");
        myMap.put(104, "Jacb");

        // Getting values by Key
        System.out.println(myMap.get(100));

        // Remove values by key
        myMap.remove(103);

        // Updating a value
        myMap.replace(104, "Jenny");

        // Put if absent
        if( myMap.putIfAbsent(103, "Juliet")==null){
            System.out.println("Key mapped!");
        } else {
            System.out.println("Key already exists!");
        }

        // Checking if key exists
        if(myMap.containsKey(103)){
            System.out.println("Key found!");
        } else {
            System.out.println("Key not found!");
        }

        // Checking if value exists
        if(myMap.containsValue("Jacob")){
            System.out.println("Value found!");
        } else {
            System.out.println("Value not found!");
        }
        
        // Iterating over key-value pairs
        for(Map.Entry<Integer, String> entry : myMap.entrySet()){
            System.out.println(entry.getKey() + ": "+ entry.getValue());
        }

        // Get the size of the map
        System.out.println("The map contains "+ myMap.size()+ " key-value pairs!");

        // Check if the map is empty
        boolean isEmpty = myMap.isEmpty();
        if(isEmpty){
            System.out.println("Map is Empty");
        } else {
            System.out.println("Map is not Empty!");
        }
    }

}