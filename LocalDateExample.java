import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        // Current date
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);

        // Specific date
        LocalDate specificDate = LocalDate.of(2020, 1, 1);
        System.out.println("Specific Date: " + specificDate);

        // Parsing date
        LocalDate parsedDate = LocalDate.parse("2022-03-25");
        System.out.println("Parsed Date: " + parsedDate);

        // Manipulating date
        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Tomorrow's Date: " + tomorrow);

        LocalDate lastWeek = today.minusWeeks(1);
        System.out.println("Date Last Week: " + lastWeek);
    }
}
