class ArithmeticJava {
public static void main(String[] args){
    int number1 = 100;
    int number2 = 0;

    try {
        int answer = number1 / number2;
        System.out.println("Answer: " + answer);
    } catch (ArithmeticException e) {

        //handling the exception
        System.out.println("Error: Division by zero is not allowed.");
    }
    finally {
        System.out.println("Program continues to run after the exception.");
 
    }
    
}
}

//Exception in thread "main" java.lang.ArithmeticException: / by zero
//       at ArithmeticJava.main(ArithmeticJava.java:5)
