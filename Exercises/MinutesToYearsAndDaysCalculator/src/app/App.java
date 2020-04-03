package app;

public class App {
    public static void main(String[] args) throws Exception {
        printYearsAndDays(1051200);
    }
    public static void printYearsAndDays(long minutes) {
            if (minutes < 0) {
                System.out.println("Invalid value");
            }
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long remainingDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");

        }
}