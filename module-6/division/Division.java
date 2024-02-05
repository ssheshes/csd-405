/*Alexis Yang
 * Module 6 Assignment
 * 4 February 2024
 */

package division;

// Create an abstract Division class 
// with fields for a company's division name and account number
public abstract class Division {
    protected String divisionName;
    protected String accountNumber;

    // Constructor to initialize the Division object
    // with division name and account number.
    public Division(String divisionName, String accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // abstract method to display information about the division.
    // This method will be defined in the subclasses.
    public abstract void display();
}
