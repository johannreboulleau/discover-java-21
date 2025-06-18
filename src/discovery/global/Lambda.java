package discovery.global;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda {

    private final String str = "a";

    private final Consumer<String> consumer = (input) -> {
        input = input.toUpperCase();
        System.out.println(input);
    };

    private final Predicate<String> predicate = (input) -> {
        return input.startsWith("a");
    };

    // useful to defer execution
    private final Supplier<String> supplier = () -> {
        return toString().toUpperCase();
    };

    public static String toUpperCaseCustom(Lambda lambda) {
        return lambda.str.toUpperCase();
    }

    public final Function<String, String> function = (input) -> {
        return input.concat(" concatStr");
    };

    public void test(List<String> list) {
        System.out.println("consumer");
        list.forEach(consumer);

        System.out.println("predicate");
        list.stream().filter(predicate).forEach(v -> System.out.println("filter value startWith a: " + v));

        System.out.println("function");
        list.stream().map(function).forEach(System.out::println);
    }

}
