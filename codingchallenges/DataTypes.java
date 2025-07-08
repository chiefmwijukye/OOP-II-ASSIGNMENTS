//Challenge number: 2

public class DataTypes {
    void showInterest(){
        double amount; 
        double rate; 

        amount = 1200.00; // principal amount initialization
        System.out.println("Principal Amount: " + amount);

        rate = 3.00; 
        amount = amount * (amount + rate )/ 100; // calculate interest
        System.out.println("after a year: " + amount); // print the amount after a year

        amount = amount * (100 + rate) / 100; // calculate interest for the next year
        System.out.println("after 2 years: " + amount); // print the amount after 2 years
    }

    public static void main(String[] args) {
        DataTypes dt = new DataTypes(); 
        dt.showInterest(); 
    }
}
