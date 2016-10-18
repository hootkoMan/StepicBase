package m6_generics_collections_streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lec_6_3_stream {
    public void someMethod() {
        int sum = IntStream.iterate(1, n -> n + 1)
            .filter(n -> n % 5 == 0 && n % 2 != 0)
            .limit(10)
            .map(n -> n * n)
            .sum();
        System.out.println(sum);
    }

    public void receiptStream() throws IOException {
        Set<String> stringSet = new HashSet<>();
        Stream<String> stream1 = stringSet.stream();

        BufferedReader reader = new BufferedReader(new StringReader("str"));
        Stream<String> stream2 = reader.lines(); //поток строк из потока символов

        Path path = Paths.get("/dir/file");
        Stream<Path> stream3 = Files.list(path); // содержимое директории на 1 уровень
        Stream<Path> stream4 = Files.walk(path); // рекурсивный обход поддиректорий

        IntStream chars = "hello".chars(); // stream chars

        DoubleStream randomNumber = DoubleStream.generate(Math::random);

        IntStream intStream = IntStream.iterate(0, n -> n + 1); // итерирование функции

        IntStream intStream1 = IntStream.range(0, 100); // stream 0 - 99

        IntStream intStream2 = IntStream.range(0, 100); // stream 0 - 100

        IntStream concatStream = IntStream.concat(intStream, intStream1);

        IntStream emptyStream = IntStream.empty();

        int[] array = {1, 2, 3, 4,};
        IntStream arrayStream = Arrays.stream(array);

        IntStream streamElements = IntStream.of(2, 3, 4, 5, 6);

    }

}
