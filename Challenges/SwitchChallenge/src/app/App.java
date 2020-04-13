// Create a new switch statement using char instead of int
// create a new char variable
// create a switch statement testing for
// A, B, C, D, or E
// display a message if any of these are found and then break
// Add a default which displays a message saying not found

package app;

public class App {
    public static void main(String[] args) throws Exception {
        char value = 'F';

        switch (value) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':
                System.out.println("Value was C");
                break;
            case 'D':
                System.out.println("Value was D");
                break;
            case 'E':
                System.out.println("Value was E");
                break;

            default:
                System.out.println("Value was not A, B, C, D, or E.");
                break;
        }

        String stringValue = "January";

        switch (stringValue.toLowerCase()) {
            case "january":
                System.out.println("Value was january");
                break;
        
            default:
                System.out.println("Value was not january");
                break;
        }
    }
}