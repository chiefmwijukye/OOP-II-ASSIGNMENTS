import java.util.Scanner;

//import static jdk.internal.org.jline.utils.Colors.s;

public class GoodeveningTillStop {
    static Scanner sc = new Scanner(System.in);

    static void showGoodevening() {
        String choice;

        System.out.println("For Goodevening type g, anything else to stop");
        choice = sc.next();

        while ("g".equals(choice)){
            System.out.println("Goodevening");
            choice = sc.next();
        }
    }
    public static void main(String[]args) {
        GoodeveningTillStop obj = new GoodeveningTillStop();

        GoodeveningTillStop.showGoodevening();
    }
}
