import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateConverting {

    public static void main(String[] args) {
        // 1. Convert String to LocalDate (Date only)
        String dateStr = "2026-11-19";
        LocalDate localDate = LocalDate.parse(dateStr);
        System.out.println("String to LocalDate ! : " + localDate);

        // 2. Convert String to LocalDateTime using a custom format
        String dateTimeStr = "19-11-2026 16:21";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeStr, formatter);
        System.out.println("Custom String to LocalDateTime : " + localDateTime);

        // 3. Convert LocalDate back to a custom String format
        DateTimeFormatter customOutputFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        String formattedDate = localDate.format(customOutputFormatter);
        System.out.println("LocalDate to Custom String : " + formattedDate);

        // 4. Convert LocalDateTime to String
        DateTimeFormatter customDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String formattedDateTime = localDateTime.format(customDateTimeFormatter);
        System.out.println("LocalDateTime to Custom String : " + formattedDateTime);
    }
}

