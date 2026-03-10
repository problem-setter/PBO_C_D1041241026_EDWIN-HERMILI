/**
* @author Rudy
*/

public class p043IncrementDecrement {
        public static void main(String[] args) {
        int x = 5;
        System.out.println("Nilai awal x: " + x);
        x++;
        System.out.println("Setelah x++: " + x);
        x--;
        System.out.println("Setelah x--: " + x);
        // Compound assignment
        x += 10;
        System.out.println("Setelah x += 10: " + x);
    }
}