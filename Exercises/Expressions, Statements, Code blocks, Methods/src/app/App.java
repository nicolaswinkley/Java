package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
    }
    
    // 1. Write a method called toMilesPerHour that has 1 parameter of type double with the name 
    // kilometersPerHour. This method needs to return the rounded value of the 
    // calculation of type long.
    // If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to 
    // return -1 to indicate an invalid value.
    // Otherwise, if it is positive, calculate the value of miles per hour, round it and return it.
    // For conversion and rounding, check the notes in the text below.

    // 2. Write another method called printConversion with 1 parameter of type double with the 
    // name kilometersPerHour.
    // This method should not return anything (void) and it needs to calculate milesPerHour from 
    // the kilometersPerHour parameter.
    // Then it needs to print a message in the format "XX km/h = YY mi/h".
    // XX represents the original value kilometersPerHour.
    // YY represents the rounded milesPerHour from the kilometersPerHour parameter.
    // If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".

    // Use method Math.round to round the number of calculated miles per hour(double). The method 
    // round returns long.

    
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

    
    // Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the 
    // name kiloBytes.
    // The method should not return anything (void) and it needs to calculate the megabytes and 
    // remaining kilobytes from the kilobytes parameter.
    // Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
    // XX represents the original value kiloBytes.
    // YY represents the calculated megabytes.
    // ZZ represents the calculated remaining kilobytes.
    // If the parameter kiloBytes is less than 0 then print the text "Invalid Value".
    
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    System.out.println(kiloBytes < 0 ? "Invalid Value" : kiloBytes 
        + " KB = " + kiloBytes / 1024 + " MB and " + kiloBytes % 1024 
        + " KB");
    }

    // We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
    // Write a method named hasTeen with 3 parameters of type int.
    // The method should return boolean and it needs to return true if one of the parameters is 
    // in range 13(inclusive) - 19 (inclusive). Otherwise return false.

    // Write another method named isTeen with 1 parameter of type int.
    // The method should return boolean and it needs to return true if the parameter is in 
    // range 13(inclusive) - 19 (inclusive). Otherwise return false.

    public static boolean hasTeen(int age1, int age2, int age3) {
        return isTeen(age1) || isTeen(age2) || isTeen(age3);
    }
    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }

    // We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
    // Write a method shouldWakeUp that has 2 parameters.
    // 1st parameter should be of type boolean and be named barking it represents if our dog is 
    // currently barking.
    // 2nd parameter represents the hour of the day and is of type int with the name hourOfDay 
    // and has a valid range of 0-23.
    // We have to wake up if the dog is barking before 8 or after 22 hours so in that case 
    // return true.
    // In all other cases return false.
    // If the hourOfDay parameter is less than 0 or greater than 23 return false.
    // NOTE: Do not add a  main method
    
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking && hourOfDay >= 0 && hourOfDay <= 23) {
            if ((barking && hourOfDay < 8 || hourOfDay > 22)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    // Write a method isLeapYear with a parameter of type int named year.
    // The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
    // If the parameter is not in that range return false.
    // Otherwise, if it is in the valid range, calculate if the year is a leap year and return 
    // true if it is a leap year, otherwise return false.

    public static boolean isLeapYear(int year) {
        if (year <= 0 || year > 9999) {
            return false;
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    // Write a method hasEqualSum with 3 parameters of type int.
    // The method should return boolean and it needs to return true if the sum of the first 
    // and second parameter is equal to the third parameter. Otherwise, return false.

    public static boolean hasEqualSum(int num1, int num2, int num3) {
        if (num1 + num2 == num3) {
            return true;
        } else {
            return false;
        }
    }

    //isCatPlaying

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            } else {
            return false;
            }
        } else {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            } else {
                return false;
            }
        }
    }

    //MinutesToYearsandDaysCalculator

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long remainingDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
    
    // IntEquality

    public static void printEqual (int num1, int num2, int num3) {
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Invalid Value");
        } else if (num1 == num2 && num1 == num3 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 != num2 && num1 != num3 && num2 != num3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    // AreEqualByThreeDecimalPlaces

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        if ((int) (num1 * 1000) == (int) (num2 * 1000)) {
            return true;
        } else {
            return false;
        }
    }

    // AreaCalculator

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        } else {
            return radius * radius * Math.PI;
        }
    }
    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        } else {
            return x * y;
        }
    }


}