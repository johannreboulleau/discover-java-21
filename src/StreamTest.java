import java.util.stream.Stream;

public class StreamTest {

    void test() {
        var list = Stream.of("1", "2", "3").map(Integer::parseInt).toList();
        System.out.println("Count: " + list.stream().reduce(0, Integer::sum));
    }
}
