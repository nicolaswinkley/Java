package app;

public class FloatAndDouble {
    public static void main(String[] args) throws Exception {
        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloat);
        System.out.println("Float maximum value = " + myMaxFloat);
              
        int myInt = 5 / 3;
        float myFloat = 5f / 3f;
        double myDouble = 5d / 3.00;
        System.out.println("MyIntValue= " + myInt);
        System.out.println("MyFloatValue= " + myFloat);
        System.out.println("MyDoubleValue= " + myDouble);
        //double is faster to process than float
        //Java libraries are written to return double, 
        //more precise, can handle larger range of numbers
    }
}