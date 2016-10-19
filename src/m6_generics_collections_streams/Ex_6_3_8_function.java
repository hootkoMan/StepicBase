package m6_generics_collections_streams;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex_6_3_8_function {

    public static <T, U> Function<T, U> ternaryOperator(
        Predicate<? super T> condition,
        Function<? super T, ? extends U> ifTrue,
        Function<? super T, ? extends U> ifFalse) {

        return (a) -> condition.test(a) ? ifTrue.apply(a) : ifFalse.apply(a);

//        return new Function<T, U>() {
//            @Override
//            public U apply(T t) {
//                return condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
//            }
//        };
    }

    public static void main(String[] args) {
        Predicate<Object> condition = Objects::isNull;
        Function<Object, Integer> ifTrue = obj -> 0;
        Function<CharSequence, Integer> ifFalse = CharSequence::length;
        Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);

        System.out.println(safeStringLength.apply("wer")); // 3
    }
}
