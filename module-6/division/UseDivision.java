/*Alexis Yang
 * Module 6 Assignment
 * 4 February 2024
 */

package division;

public class UseDivision {

    public static void main(String[] args) {
        // Create an InternationalDivision object
        InternationalDivision SKorea = new InternationalDivision("International",
                "01234", "South Korea", "Korean");
        InternationalDivision China = new InternationalDivision("International",
                "56789", "China", "Chinese");
        SKorea.display();
        China.display();

        // Create a DomesticDivision object
        DomesticDivision California = new DomesticDivision("Domestic",
                "09876", "California");
        DomesticDivision Oklahoma = new DomesticDivision("Domestic",
                "54321", "Oklahoma");
        California.display();
        Oklahoma.display();
    }

}