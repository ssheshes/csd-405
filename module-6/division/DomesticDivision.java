/*Alexis Yang
 * Module 6 Assignment
 * 4 February 2024
 */

package division;

// The DomesticDivision class represents a domestic division of a company.
// extends the Division class and includes an additional field for state.
public class DomesticDivision extends Division {
    private String state;

    // Constructor to initialize the DomesticDivision object
    // with all fields.
    public DomesticDivision(String divisionName, String accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    // Displays information about the domestic division.
    // It includes the division name, account number, and state.
    @Override
    public void display() {
        System.out.println("==Domestic Division==");
        System.out.println("Division Name: " + super.divisionName);
        System.out.println("Account Number: " + super.accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}