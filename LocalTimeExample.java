import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        // Current time
        LocalTime now = LocalTime.now();
        System.out.println("Current Time: " + now);

        // Specific time
        LocalTime specificTime = LocalTime.of(10, 30);
        System.out.println("Specific Time: " + specificTime);

        // Parsing time
        LocalTime parsedTime = LocalTime.parse("14:45:30");
        System.out.println("Parsed Time: " + parsedTime);

        // Manipulating time
        LocalTime later = now.plusHours(2);
        System.out.println("Two Hours Later: " + later);

        LocalTime earlier = now.minusMinutes(15);
        System.out.println("15 Minutes Earlier: " + earlier);
    }
}

