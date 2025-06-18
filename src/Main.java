import forkjoin.ForkJoin;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Record
        Record record = new Record();
        record.test();

        // Switch
        Switch switchTest = new Switch();
        switchTest.test();

        // sealed class
        Bicycle bicycle = new Bicycle();
        SealedClassOrInterface sealedClass = new SealedClassOrInterface();
        sealedClass.test(bicycle);

        System.out.println(bicycle.getClass().getSimpleName());
        System.out.println("isSealed: " + bicycle.getClass().isSealed());
        System.out.println("super class isSealed: " + bicycle.getClass().getSuperclass().isSealed());
        System.out.println("permitted sub class: " + Arrays.toString(bicycle.getClass().getSuperclass().getPermittedSubclasses()));

        // Stream
        StreamTest streamTest = new StreamTest();
        streamTest.test();

        // Foreign Function and Memory API
        ForeignFunctionMemoryAPI foreignFunctionMemoryAPI = new ForeignFunctionMemoryAPI();
        foreignFunctionMemoryAPI.test();

        // Pattern matching switch
        PatternMatchingSwitch patternMatchingSwitch = new PatternMatchingSwitch();
        patternMatchingSwitch.test("a");
        patternMatchingSwitch.test(1);
        patternMatchingSwitch.test("b");

        // Lambda
        Lambda lambda = new Lambda();
        lambda.test(List.of("a", "b", "c"));
        Stream.of(lambda).map(Lambda::toUpperCaseCustom).forEach(System.out::println);

        // Fork Join
        ForkJoin forkJoin = new ForkJoin();
        forkJoin.test();

        // virtual thread
        VirtualThreadTest virtualThreadTest = new VirtualThreadTest();
        virtualThreadTest.testVirtualVsKernelThread();
    }
}