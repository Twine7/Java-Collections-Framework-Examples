import java.util.ArrayList;

//Using ArrayList to store and display elements
public class example2  {
    public static void main(String[] args) {
        // Creating and adding elements to the ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Displaying the elements of the ArrayList
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}
