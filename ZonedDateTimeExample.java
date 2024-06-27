import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        // Current date and time with zone
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("Current Date and Time with Zone: " + now);

        // Specific date and time with zone
        ZonedDateTime specificZonedDateTime = ZonedDateTime.of(2020, 1, 1, 10, 30, 0, 0, ZoneId.of("America/New_York"));
        System.out.println("Specific Date and Time with Zone: " + specificZonedDateTime);

        // Parsing date and time with zone
        ZonedDateTime parsedZonedDateTime = ZonedDateTime.parse("2022-03-25T14:45:30+01:00[Europe/Paris]");
        System.out.println("Parsed Date and Time with Zone: " + parsedZonedDateTime);

        // Manipulating date and time with zone
        ZonedDateTime nextWeek = now.plusWeeks(1);
        System.out.println("Next Week Same Time: " + nextWeek);

        ZonedDateTime lastYear = now.minusYears(1);
        System.out.println("Same Time Last Year: " + lastYear);
    }
}
