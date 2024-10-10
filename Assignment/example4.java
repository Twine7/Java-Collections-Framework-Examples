import java.util.HashMap;

//Using hashmap
public class example4 {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> userMap = new HashMap<>();

        // Adding key-value pairs
        userMap.put(1, "John");
        userMap.put(2, "Jane");
        userMap.put(3, "Mike");

        // Accessing values using keys
        System.out.println("User with ID 1: " + userMap.get(1)); // Output: John

        // Displaying all key-value pairs
        System.out.println("User Map: " + userMap);
    }
}
