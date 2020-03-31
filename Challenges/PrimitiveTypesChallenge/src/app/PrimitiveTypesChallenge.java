package app;

public class PrimitiveTypesChallenge {
    public static void main(String[] args) throws Exception {
        byte byteNumber = 10;
        short shortNumber = 20;
        int intNumber = 50;

        long longTotal = (long) (50000 + 10 * (byteNumber + shortNumber + intNumber));
        System.out.println(longTotal);
    }
}