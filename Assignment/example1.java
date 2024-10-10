import java.util.ArrayList;

//Creating, adding, removing, and accessing
public class example1 {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Accessing elements in the ArrayList
        System.out.println("First fruit: " + fruits.get(0)); // Output: Apple

        // Removing an element from the ArrayList
        fruits.remove("Orange");

        // Displaying all elements
        System.out.println("Fruits List: " + fruits);
    }
}
