/*Alexis Yang
 * Module 5 Assignment
 * 4 February 2024
 * 
 * Program 1: Write a program that uses an ArrayList 
 * filled with a minimum of 10 Strings. 
 * Use a ‘for-each’ loop to print the ArrayList collection. 
 * Then ask a user which element they would like to see again. 
 * Then, attempt printing the element in a try/catch format 
 * which will result in the element being display. 
 * If the element value received is invalid, 
 * display a message that an Exception has been thrown 
 * displaying “Out of Bounds”. In this program, 
 * include the use of Autoboxing/Auto-Unboxing, 
 * working with a user String input.
 */

import java.util.*;

public class yang_assignment5 {

    // Prints the elements of an ArrayList using a for-each loop.
    public static void printArrayList(ArrayList<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Create an ArrayList and add some strings to it
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("0. Apple");
        stringList.add("1. Banana");
        stringList.add("2. Cherry");
        stringList.add("3. Durian");
        stringList.add("4. Elderberry");
        stringList.add("5. Fig");
        stringList.add("6. Grape");
        stringList.add("7. Honeydew");
        stringList.add("8. Iguana");
        stringList.add("9. Jackfruit");

        // Print the ArrayList using the printArrayList method
        System.out.println("Elements in the ArrayList:");
        printArrayList(stringList);

        try (// Ask the user for input
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the index of the element you would like to see again (0-9): ");
            int index = scanner.nextInt();

            // Check if the index is valid
            if (index >= 0 && index < stringList.size()) {
                // Retrieve the element at the specified index
                String selectedElement = stringList.get(index);
                System.out.println("The element at index " + index + " is: " + selectedElement);
            } else {
                System.out.println("Invalid index. Please enter a valid index.");
            }
        } catch (Exception a) {
            System.out.println("Exception: Out of bounds. Enter integer between 0-9.");
        }
    }
}