package discovery;

import discovery.forkjoin.ForkJoin;
import discovery.global.ForeignFunctionMemoryAPI;
import discovery.global.Lambda;
import discovery.global.PatternMatchingSwitch;
import discovery.global.Record;
import discovery.global.SequencedCollections;
import discovery.global.StreamTest;
import discovery.global.Switch;
import discovery.global.VirtualThreadTest;
import discovery.sealed.Bicycle;
import discovery.sealed.SealedClassOrInterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // discovery.global.Record
        discovery.global.Record record = new Record();
        record.test();

        // discovery.global.Switch
        Switch switchTest = new Switch();
        switchTest.test();

        // discovery.sealed class
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

        // discovery.global.Lambda
        Lambda lambda = new Lambda();
        lambda.test(List.of("a", "b", "c"));
        Stream.of(lambda).map(Lambda::toUpperCaseCustom).forEach(System.out::println);

        // Fork Join
        ForkJoin forkJoin = new ForkJoin();
        forkJoin.test();

        // virtual thread
        VirtualThreadTest virtualThreadTest = new VirtualThreadTest();
        virtualThreadTest.testVirtualVsKernelThread();

        // sequenced collections
        SequencedCollections sequencedCollections = new SequencedCollections();
        sequencedCollections.test();
    }
}