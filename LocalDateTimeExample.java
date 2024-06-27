import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        // Current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time: " + now);

        // Specific date and time
        LocalDateTime specificDateTime = LocalDateTime.of(2020, 1, 1, 10, 30);
        System.out.println("Specific Date and Time: " + specificDateTime);

        // Parsing date and time
        LocalDateTime parsedDateTime = LocalDateTime.parse("2022-03-25T14:45:30");
        System.out.println("Parsed Date and Time: " + parsedDateTime);

        // Manipulating date and time
        LocalDateTime tomorrowSameTime = now.plusDays(1);
        System.out.println("Tomorrow Same Time: " + tomorrowSameTime);

        LocalDateTime nextMonth = now.plusMonths(1);
        System.out.println("Next Month Same Time: " + nextMonth);
    }
}

