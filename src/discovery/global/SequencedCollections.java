package discovery.global;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SequencedCollections {

    public void test() {
        var list = Stream.of("1", "2", "3").collect(Collectors.toList());

        list.forEach(System.out::println);

        System.out.println("---------------------------");
        System.out.println("add first and last elements");
        list.addFirst("0");
        list.addLast("4");
        list.forEach(System.out::println);

        System.out.println("---------------------------");
        System.out.println("remove first and last elements");
        list.removeFirst();
        list.removeLast();
        list.forEach(System.out::println);

        System.out.println("---------------------------");
        System.out.println("reversed");
        list = list.reversed();
        list.forEach(System.out::println);
    }
}
