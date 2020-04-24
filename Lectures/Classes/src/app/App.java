package app;

public class App {
    public static void main(String[] args) throws Exception {
        
        // creating object/datatype of type car
        Car porsche = new Car();
        Car holden = new Car();

        // setter: sets model to Carrera in car class
        porsche.setModel("Carrera");

        // getter
        System.out.println("Model is: " + porsche.getModel());
    }
}