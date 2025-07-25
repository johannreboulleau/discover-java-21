package discovery.global;

enum Event {
    PLAY, PAUSE, STOP
}

public class Switch {

    public void test() {
        var event = Event.PLAY;
        switch (event) {
            case PLAY -> System.out.println("Play");
            case PAUSE, STOP -> System.out.println("Pause or stop");
            default -> System.out.println("Default");
        }
    }
}
