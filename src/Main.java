import java.util.Arrays;

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
    }
}