package app;

public class App {
    public static void main(String[] args) throws Exception {
        
    }

    // Write a method called printNumberInWord. The method has one 
    // parameter number which is the whole number. The method needs to 
    // print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int 
    // parameter number is 0, 1, 2, .... 9 or other for any other number 
    // including negative numbers. You can use if-else statement or 
    // switch statement whatever is easier for you.

    // NOTE: Method printNumberInWord needs to be public static for now,
    //  we are only using static methods.

    public static void printNumberInWord(int value) {
        switch (value) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIvE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    // Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.
    // Check that number is > 0, if it is not return false.
    // If number is odd return true, otherwise  return false.

    // Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
    // The method should use a for loop to sum all odd numbers  in that range including the end and return the sum.
    // It should call the method isOdd to check if each number is odd.
    // The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
    // If those conditions are not satisfied return -1 from the method to indicate invalid input. 
    // Example input/output:
    // * sumOdd(1, 100); → should return 2500
    // * sumOdd(-1, 100); →  should return -1
    // * sumOdd(100, 100); → should return 0
    // * sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)
    // * sumOdd(100, -100); → should return -1
    // * sumOdd(100, 1000); → should return 247500
    // TIP: use the remainder operator to check if the number is odd

    public static boolean isOdd(int number) {
        if (number > 0 && number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (end >= start && start > 0 && end > 0) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum = sum + i;
                }
            }
            return sum;
        } else {
            return -1;
        }
    }

    // Write a method with the name sumDigits that has one int parameter called number. 
    // If parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.
    // The numbers from 0-9 have 1 digit so we donÅft want to process them, also we donÅft want to process negative numbers, so also return -1 for negative numbers.
    // For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
    // Calling the method sumDigits(1) should return -1 as per requirements described above.
    // Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid and invalid values passed as arguments.
    // Hint: 
    // 	Use n % 10 to extract the least-significant digit.
    // 	Use n = n / 10 to discard the least-significant digit.
    // 	The method needs to be static like other methods so far in the course.

    public static int sumDigits(int number) {
        int sum = 0;
        if (number >= 10) {
            while (number > 0) {
                // extract least significant digit
                int digit = number % 10;
                sum += digit;
                // drop least significant digit
                number /= 10;
            }
            return sum;
        } else {
            return -1;
        }
    }
}