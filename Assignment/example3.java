import java.util.HashSet;

// Using hashset
public class example3 {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> uniqueNames = new HashSet<>();

        // Adding elements (duplicates will be ignored)
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Alice"); // Duplicate, will not be added

        // Displaying elements
        System.out.println("Unique Names: " + uniqueNames); // Output: [Alice, Bob]
    }
}
