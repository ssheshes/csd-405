/*Alexis Yang
 * Module 6 Assignment
 * 4 February 2024
 */

package division;

public class InternationalDivision extends Division {
    private String country;
    private String language;

    // Constructor to initialize the InternationalDivision object
    // with all fields.
    public InternationalDivision(String divisionName, String accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    // Displays information about the international division.
    // Includes the division name, account number, country, and language.
    @Override
    public void display() {
        System.out.println("==International Division==");
        System.out.println("Division Name: " + super.divisionName);
        System.out.println("Account Number: " + super.accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}