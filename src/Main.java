import java.util.Scanner;

public class Main {
    /*
    *
When squirrels get together for a party, they like to have cigars.
* A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
*  Unless it is the weekend, in which case there is no upper bound on the number of cigars.
* Return true if the party with the given values is successful, or false otherwise.


cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true
* */

    public static void main(String[] args) {
        int sc;
        Scanner scanner = new Scanner(System.in);
        sc = scanner.nextInt();

        if ( sc>=40 && sc<=60) {

            System.out.println("party is sexful");
        }
            else if(sc>=50) {
            System.out.println("this ia weekend");
        }else {
                System.out.println("not sexful");

        }
        }
    }
