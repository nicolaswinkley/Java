package app;

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
    }
}