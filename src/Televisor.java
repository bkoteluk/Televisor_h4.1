public class Televisor {
    boolean on;

    void turnOn() {
        on = true;
    }

    void turnOff() {
        on = false;
    }

    String showStatus() {
        return  ""+on;
    }
}
