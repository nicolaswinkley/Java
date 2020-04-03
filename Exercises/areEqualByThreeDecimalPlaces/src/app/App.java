package app;

public class App {
    public static void main(String[] args) throws Exception {

    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        if ((int) (num1 * 1000) == (int) (num2 * 1000)) {
            return true;
        } else {
            return false;
        }
    }
}