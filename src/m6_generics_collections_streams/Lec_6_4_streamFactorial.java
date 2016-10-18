package m6_generics_collections_streams;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Lec_6_4_streamFactorial {
    public BigInteger factorial(int n) {
        return IntStream.rangeClosed(1, n)
            .mapToObj(i -> BigInteger.valueOf(i))
            .reduce(BigInteger.ONE, BigInteger::multiply);
    }
}
