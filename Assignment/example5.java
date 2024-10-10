public class example5 {
    // Generic method that prints elements of any type
    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        // String array
        String[] strArray = {"Hello", "World"};

        System.out.println("Integer Array:");
        printArray(intArray); // Output: 1 2 3 4 5

        System.out.println("String Array:");
        printArray(strArray); // Output: Hello World
    }
}
