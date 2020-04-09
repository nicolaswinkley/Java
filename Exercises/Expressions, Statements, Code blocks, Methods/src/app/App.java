package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
    }
    /*
    1. Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour. This method needs to return the rounded value of the 
    calculation of type long.
    If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.
    Otherwise, if it is positive, calculate the value of miles per hour, round it and return it. For conversion and rounding, check the notes in the text below.

    2. Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.
    This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.
    Then it needs to print a message in the format "XX km/h = YY mi/h".
    XX represents the original value kilometersPerHour.
    YY represents the rounded milesPerHour from the kilometersPerHour parameter.
    If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".

    Use method Math.round to round the number of calculated miles per hour(double). The method round returns long.

    */
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h = " 
                + milesPerHour + " mi/h");
        }
    }

    /*
    Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
    The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.
    Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
    XX represents the original value kiloBytes.
    YY represents the calculated megabytes.
    ZZ represents the calculated remaining kilobytes.
    If the parameter kiloBytes is less than 0 then print the text "Invalid Value".
    */
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    System.out.println(kiloBytes < 0 ? "Invalid Value" : kiloBytes 
        + " KB = " + kiloBytes / 1024 + " MB and " + kiloBytes % 1024 
        + " KB");
    }

    // We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
    // Write a method named hasTeen with 3 parameters of type int.
    // The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

    // Write another method named isTeen with 1 parameter of type int.
    // The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

    public static boolean hasTeen(int age1, int age2, int age3) {
        return isTeen(age1) || isTeen(age2) || isTeen(age3);
    }
    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }


}