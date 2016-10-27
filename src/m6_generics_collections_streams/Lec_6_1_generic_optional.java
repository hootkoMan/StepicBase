package m6_generics_collections_streams;

import java.util.Optional;

public class Lec_6_1_generic_optional {
    public void someMethod() {
        // var 1
        Optional<String> str = Optional.of("str");
        str.ifPresent(System.out::println);
        // var 2
        String str1 = "str1";
        if (str1 != null) {
            System.out.println(str1);
        }

        Optional<String> stringOptional = Optional.empty();
        // var 1
        String value = stringOptional.orElse("optional");
        //var2
        String value1 = str1 != null ? str1 : "str1";

        Optional<String> empty = Optional.empty();
        Optional<String> someStr = Optional.of("someStr");
        Optional<String> someStr1 = Optional.ofNullable("someStr1");
        Optional<CharSequence> charSequence = Optional.<CharSequence>ofNullable("charSeq");

    }
}
