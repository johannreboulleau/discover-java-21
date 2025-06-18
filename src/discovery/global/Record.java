package discovery.global;

record UserRecord (String name, int age) {
}

public class Record {

    public void test() {
        UserRecord user = new UserRecord("John", 25);
        System.out.println("getter age" + user.age());
        System.out.println("equals method" + user.equals(null));
        System.out.println("hashCode method" + user.hashCode());
        System.out.println("toString method" + user.toString());
    }
}