package m6_generics_collections_streams;

import java.util.Optional;

public class Ex_6_1_11<String> {
    public void someMethod(Object o) {
        String o1 = (String) o;

        Optional<String> stringOptional = Optional.empty();
    }
}
