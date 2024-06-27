import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        // Default format
        System.out.println("Default Format: " + now);

        // Custom format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Custom Format: " + formattedDateTime);

        // Parsing custom formatted date-time
        LocalDateTime parsedDateTime = LocalDateTime.parse("25-03-2022 14:45:30", formatter);
        System.out.println("Parsed Custom Format: " + parsedDateTime);
    }
}

