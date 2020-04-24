package app;

public class Car {

    // fields in a class
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // method is attached to all the objects you create for that class
    // setter
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("porsche") || validModel.equals("holden")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }
    
    // getter
    public String getModel() {
        return this.model;
    }
}