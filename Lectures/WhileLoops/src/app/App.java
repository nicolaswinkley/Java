package app;

public class App {
    public static void main(String[] args) throws Exception {
        // int count = 1;
        // while (count != 6) {
        //     System.out.println(count);
        //     count++;
        // } 
        // while (true) {
        //     if (count == 5) {
        //         break;
        //     }
        //     System.out.println("Count value is " + count);
        //     count++;
        // }

        // do {
        //     System.out.println("count value was " + count);
        //     count++;
        // } while (count != 6);

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        // modify the while code to record the number of even numbers found
        // and break when 5 even numbers are found
        // display the total number of even numbers found
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("even number " + number);
            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
            
        }
        System.out.println("Total even numbers found: " + evenNumbersFound);
    }
    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is 
    // an even number or not
    // return true if an even number, otherwise return false

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}