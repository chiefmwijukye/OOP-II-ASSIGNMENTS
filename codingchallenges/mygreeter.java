package codingchallenges;

public class Greeter { // this is a class declaration

    void greet() { //method declaration
        System.out.println("Hello, There!");
    }

    public static void main(String[] args) { // main method declaration
        Greeter greeter = new Greeter(); // create an instance of the class
        greeter.greet(); // call the greet method
        // System.out.println("Hello, There!"); // print a message
    }

}