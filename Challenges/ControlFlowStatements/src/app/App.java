package app;

public class App {
    public static void main(String[] args) throws Exception {
        printDayOfTheWeek(-1);
        
    }

    // Create a new switch statement using char instead of int
    // create a new char variable
    // create a switch statement testing for
    // A, B, C, D, or E
    // display a message if any of these are found and then break
    // Add a default which displays a message saying not found

    public static void switchChallenge() {
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
    // Write a method with the name printDayOfTheWeek that has one 
    // parameter of type int and name it day.
    // The method should not return any value (hint: void)
    // Using a switch statement print "Sunday", "Monday", ... ,"Saturday" 
    // if the int parameter "day" is 0, 1, ... , 6 respectively, 
    // otherwise it should print "Invalid day".

    private static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        
            default:
                System.out.println("Invalid Day");
                break;
        }
    }

    // Write a method isLeapYear with a parameter of type int named year. 
    // The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
    // If the parameter is not in that range return false. 
    // Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false. 
    // A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
    // ​NOTE:  The solution to the Leap Year coding exercise earlier in the course created the isLeapYear method. You can use that solution if you wish.

    // Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.
    // If parameter month is < 1 or > 12 return -1. ​
    // If parameter year is < 1 or > 9999 then return -1.
    // This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).
    // You should check if the year is a leap year using the method isLeapYear described above.
    // HINT: Use the switch statement.

    public static boolean isLeapYear(int year) {
        if (year <1 || year > 9999) {
            return false;
        } else if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12)) {
            return -1;
        } else if ((year < 1) || (year > 9999)) {
            return -1;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2: {
                    if (isLeapYear(year)) {
                        return 29;
                    } else {
                        return 28;
                    }
                }
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return -1;

            }
        }
    }

}