public class PatternMatchingSwitch {

    void test(Object o) {
        switch (o) {
            case String s when s.equals("a") -> System.out.println(s + " is a String and equals a");
            case String s -> System.out.println(s + " is a String and not equals a");
            case Integer i -> System.out.println(i + " is an Integer");
            case Double ignore -> System.out.println(" is a Double");
            default -> System.out.println(o + " is not a String");
        }
    }
}
