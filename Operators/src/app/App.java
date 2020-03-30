// basic operators and intro to if statements, ternary ops
package app;

import sun.nio.cs.ext.JISAutoDetect;

public class App {
    public static void main(String[] args) throws Exception {
        int result = 1+2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;    // 3 - 1
        System.out.println("3 - 1 = " + result);

        result = result * 10;   // 2 * 10
        System.out.println("2 * 10 = " + result);

        result++; // result + 1
        result--; // result - 1
        result += 2; // result + 2
        result *= 10; // result * 10
        result /= 3; // result / 3
        result -= 2; // result - 2
        
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score");
        }

        // AND operator &&
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        // OR operator ||
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        // assignment vs equals to operators
        int newValue = 50;
        if(newValue == 50) {
            System.out.println("This is true");
        }
        // shortcut to see if bool is true, "!isCar" tests if false
        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        // the ternary operator is a shortcut to assigning one of two values to a variable depending on a given condition
        // ternary operator is icCar true, then set wasCar to true, if isCar false, set wasCar to false
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        
    }
}