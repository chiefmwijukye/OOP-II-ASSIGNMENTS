
public class ArrayChallenge {
    public static void main(String[] args) {
        String[] orderIds = {"B123", "C234", "A345", "C15", "B177", "G3003", "C235", "B179", "A355", "B180", "A230", "C326"};

        for (String item : orderIds) {
            //elements starting with B
            if (item.startsWith("B")) {
                System.out.println("Elements starting with B: " + item);
            }

            //elements starting with C
            if (item.startsWith("C")) {
                System.out.println("Elements starting with C: " + item);
            }
            //elements starting with A
            if (item.startsWith("A")) {
                System.out.println("Elemts starting with A: " + item);
            }
            
        }
    }
}
