// create a new class VipCustomer
// It should have 3 fields: name, credit limit, and email address
// create 3 constructors
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the thrid
// 3rd constructor should save all fields
// create getters only
// test and confirm it works

package app;

public class VipAccount {
    private String name;
    private int creditLimit;
    private String emailAddress;

    // constructor
    public VipAccount() {
        this("Unknown", 500, "Unknown");
        System.out.println("Empty constructor created");
    }

    public VipAccount(String name, int creditLimit) {
        this(name, creditLimit, "Unknown");
    }

    public VipAccount(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }



    public String getName() {
        return name;
    }
    public int getCreditLimit() {
        return creditLimit;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
}