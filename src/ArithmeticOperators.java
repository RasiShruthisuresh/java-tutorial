public class ArithmeticOperators {
    public static void main(String[] args) {

        // ARITHMETIC OPERATORS
        int x = 10;
        int y = 4;
        int z;

        z = x + y;
        System.out.println("x + y = " + z); // addition -> 14

        z = x - y;
        System.out.println("x - y = " + z); // subtraction -> 6

        z = x * y;
        System.out.println("x * y = " + z); // multiplication -> 40

        z = x / y;
        System.out.println("x / y = " + z); // integer division -> 2 (drops the remainder, doesn't round)

        z = x % y;
        System.out.println("x % y = " + z); // modulus -> 2 (the leftover remainder from division)

        // AUGMENTED ASSIGNMENT OPERATORS
        // these update the variable in place: x += y means x = x + y
        x = 10; // reset before each, so every operator is tested from the same starting point
        x += y;
        System.out.println("x += y -> x = " + x); // 14

        x = 10;
        x -= y;
        System.out.println("x -= y -> x = " + x); // 6

        x = 10;
        x *= y;
        System.out.println("x *= y -> x = " + x); // 40

        x = 10;
        x /= y;
        System.out.println("x /= y -> x = " + x); // 2 (still integer division)

        x = 10;
        x %= y;
        System.out.println("x %= y -> x = " + x); // 2

        // INCREMENT AND DECREMENT OPERATORS
        x = 10; // reset once, then let the operators chain naturally
        x++;
        System.out.println("after x++ -> x = " + x); // 11

        x++;
        System.out.println("after x++ -> x = " + x); // 12

        x--;
        System.out.println("after x-- -> x = " + x); // 11

        x--;
        System.out.println("after x-- -> x = " + x); // 10 — back where we started

        // ORDER OF OPERATIONS [P-E-M-D-A-S]
        double result = 3 + 4 * (7 - 5) / 2.0;
        System.out.println("3 + 4 * (7 - 5) / 2.0 = " + result); // 7.0
    }
}