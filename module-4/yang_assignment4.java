
/*Alexis Yang
 *Module 4 Assignment
 27 January 2024
 */
import java.util.*;

class AlexisArrayListTest {

    public static void main(String[] args) {
        // create ArrayList
        List<Integer> myList_01 = new ArrayList<Integer>();

        try (// create Scanner object
                Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter an integer: ");

            // populates arraylist with integer data type received from user input
            while (input.hasNextInt()) {
                int listItem = input.nextInt();

                // value of 0 is entered and assigned to list
                if (listItem == 0) {
                    myList_01.add(new Integer(listItem));
                    break;

                    // adds user input into arraylist
                } else {
                    System.out.print("Your integer has been included. " +
                            "Please enter another integer or 0 to assign and end: ");
                    myList_01.add(new Integer(listItem));
                }
            }

            // display user's list
            System.out.print("Your ArrayList: ");

            for (int i = 0; i < myList_01.size(); ++i) {

                System.out.print(myList_01.get(i) + " ");
            }

            // output largest element in list using the max method
            System.out.println("\nThe largest value in your ArrayList is " +
                    AlexisArrayListTest.max((ArrayList<Integer>) myList_01) + ".");
        }
    }

    // Class to find max value from GeeksForGeeks:
    // https://www.geeksforgeeks.org/finding-maximum-element-of-java-arraylist/
    public static Integer max(ArrayList<Integer> list) {

        // initialize maximum as the first element in the list
        int maximum = (int) list.get(0);

        // loop through the list until current element is greater than variable
        for (int i = 1; i < list.size(); i++) {
            if (maximum < (int) list.get(i))
                maximum = (int) list.get(i);
        }
        return maximum;
    }
}
