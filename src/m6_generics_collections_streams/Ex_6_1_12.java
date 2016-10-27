package m6_generics_collections_streams;

import java.util.Objects;

public class Ex_6_1_12 {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"
        System.out.println(i + " " + s);

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println(mustBeTrue + " " + mustAlsoBeTrue);
    }
}

class Pair<T, R> {
    private final T valueT;
    private final R valueR;

    private Pair(T valueT , R valueR) {
        this.valueT = valueT;
        this.valueR = valueR;
    }

    public static <T, R> Pair<T, R> of(T valueT, R valueR) {
        return new Pair<>(valueT, valueR);
    }

    public T getFirst() {
        return valueT;
    }

    public R getSecond() {
        return valueR;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(valueT, pair.valueT) &&
            Objects.equals(valueR, pair.valueR);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valueT, valueR);
    }
}
