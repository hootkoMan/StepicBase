package m2_syntax;

import java.math.BigInteger;

public class Ex_2_4_8_Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(3));
    }

    public static BigInteger factorial(long value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; i++ ) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
