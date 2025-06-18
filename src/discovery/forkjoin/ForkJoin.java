package discovery.forkjoin;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class ForkJoin {

    public void test() {
        Random random = new Random();
        List<Long> data = random
                .longs(10, 1, 5)
                .boxed()
                .collect(toList());

        System.out.format("Data: " + data.stream().map(String::valueOf).collect(Collectors.joining(",")));

        SumAction task = new SumAction(data);

        try (var pool = ForkJoinPool.commonPool()) {
            Long result = pool.invoke(task);
            System.out.format("\nSum of sum: %d\n", result);
        }
    }
}
