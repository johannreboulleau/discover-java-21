package discovery.forkjoin;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class SumAction extends RecursiveTask<Long> {
    private static final int SEQUENTIAL_THRESHOLD = 5;

    private final List<Long> data;

    public SumAction(List<Long> data) {
        this.data = data;
    }

    @Override
    protected Long compute() {
        if (data.size() <= SEQUENTIAL_THRESHOLD) { // base case
            long sum = computeSumDirectly();
            System.out.format("\n" + Thread.currentThread() + " Sum of %s: %d\n", data.toString(), sum);
            return sum;
        } else { // recursive case
            // Calculate new range
            int mid = data.size() / 2;
            SumAction firstSubtask =
                    new SumAction(data.subList(0, mid));
            SumAction secondSubtask =
                    new SumAction(data.subList(mid, data.size()));

            firstSubtask.fork(); // queue the first task
            Long resultTask2 = secondSubtask.compute(); // compute the second task
            System.out.format("\nSum of second task %d\n", resultTask2);

            Long resultTask1 = firstSubtask.join();
            System.out.format("\nSum of first task %d\n", resultTask1);
            return resultTask1 + resultTask2;

            // Or simply call
            //invokeAll(firstSubtask, secondSubtask);
        }
    }

    private long computeSumDirectly() {
        long sum = 0;
        for (Long l: data) {
            sum += l;
        }
        return sum;
    }
}
