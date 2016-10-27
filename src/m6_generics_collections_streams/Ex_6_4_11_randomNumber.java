package m6_generics_collections_streams;

import java.util.stream.IntStream;

public class Ex_6_4_11_randomNumber {

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, s -> s*s / 10 % 1000);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            System.out.print("iter : " + i + " --> ");
            pseudoRandomStream(i).limit(15).mapToObj(x -> " " + x).forEachOrdered(System.out::print);
            System.out.println();
        }
    }
}
