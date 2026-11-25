import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("First 100 numbers of the Fibonacci series:");

        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;

        for (int i = 1; i <= 100; i++) {
            System.out.println(i + ": " + first);

            BigInteger next = first.add(second);
            first = second;
            second = next;
        }
    }
}