//Shows lengths of Byte, Short, Int, Long
package app;

public class App {
    public static void main(String[] args) throws Exception {
        
        int myValue = 10000;
        if (myValue == 0) {
            
        }
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;
        System.out.println("long Minimum Value = " + myMinlongValue);
        System.out.println("long Maximum Value = " + myMaxlongValue);

        int myTotal = (myMinIntValue / 2);
        if (myTotal == 2) {
            
        }
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        if (myNewByteValue != 0) {
            
        }
    }
}