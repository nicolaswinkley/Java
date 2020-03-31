package app;

public class App {
    public static void main(String[] args) throws Exception {
        double myValue = 20.00d;
        double mySecondValue = 80.00d;
        double remainder;
        double result;
        boolean isNoRemainder;
        
        result = 100.00 * (mySecondValue + myValue);
        System.out.println("Total value= " + result);
        remainder = result % 40.00;
        System.out.println("Remainder= " + remainder);
        isNoRemainder = (remainder == 0) ? true : false;
        System.out.println("isNoRemainder= " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("There was a remainder");
        }
    }
}