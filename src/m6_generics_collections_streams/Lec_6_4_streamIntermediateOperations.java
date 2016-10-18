package m6_generics_collections_streams;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Lec_6_4_streamIntermediateOperations {
    public void someStreamMethod() {
        IntStream stream = IntStream.of(467, 1, 200, 3, 57, 6, 72, 200);

        stream.filter(n -> n > 100)          // Predicate
            .mapToObj(Integer::toString)     // Function
            .flatMapToInt(s -> s.chars())    // Function -> Stream -> concat to IntStream
            .peek(System.out::println)       // see element to debug
            .distinct()                      // remove duplicate
            .sorted()
            .skip(2)                         // skip 2 element
            .peek(System.out::println)       // to debug
            .limit(3);                       // max 3 element
    }

    public void terminalOperations() {
        IntStream stream = IntStream.of(2, 4, 6, 8, 9, 2);
        stream.forEach(System.out::println);     // Consumer

        OptionalInt result = stream.findFirst();

        Stream<String> stream1 = new BufferedReader(new StringReader("strwqewqe")).lines();
        boolean b = stream1.allMatch(s -> s.length() > 3); // все элементы удовлетворяют предикату
        boolean b2 = stream1.anyMatch(s -> s.length() > 3); // хотя б то 1
        boolean b3 = stream1.noneMatch(s -> s.length() > 3);  // ни 1

        Optional<String> minString = stream1.min(Comparator.comparing(String::length, Integer::compare));

        long countEl = stream.count();
        int sumEl = stream.sum();

        List<String> list = stream1.collect(toList());
    }
}
