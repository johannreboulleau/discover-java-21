import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class VirtualThreadTest {

    void testVirtualVsKernelThread() {

        // 1er implementation
        Runnable printThread = () -> System.out.println(Thread.currentThread());

        ThreadFactory virtualThreadFactory = Thread.ofVirtual().factory();
        ThreadFactory kernelThreadFactory = Thread.ofPlatform().factory();

        Thread virtualThread = virtualThreadFactory.newThread(printThread);
        Thread kernelThread = kernelThreadFactory.newThread(printThread);

        virtualThread.start();
        kernelThread.start();

        // 2e implementation
        try (var threadPool = Executors.newVirtualThreadPerTaskExecutor()) {
            // Now, let's add some tasks to accomplish
            for (int i = 0; i < 10; i++) {
                threadPool.submit(() -> System.out.println("Task accomplished by " + Thread.currentThread()));
            }
            // Don't forget to dismiss the pool once tasks are done!
            threadPool.shutdown();
        }

        // basic implementation
        Thread.ofVirtual().start(() -> System.out.println(Thread.currentThread() + " Hello World !"));
    }
}
