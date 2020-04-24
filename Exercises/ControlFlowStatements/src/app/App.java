package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, 1000));
        
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

}