package app;

public class App {
    public static void main(String[] args) throws Exception {
        // int value = 1;
        // if (value == 1) {
        //     System.out.println("value was 1");
        // } else if (value == 2) {
        //     System.out.println("Value was 2");
        // }

        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("was a 3, 4, or 5");
                break;
            default:
                System.out.println("Was not one or two");
                break;
        }
    }



}