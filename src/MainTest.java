import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void mediumDateFormatterWithDifferentTimeZone() {
        OffsetDateTime dateTime = Main.getDateTime("2023-03-01T13:00:00+02");
        String result = Main.mediumDateFormatter(dateTime);
        assertEquals("1 mar 2023", result);

    }

    @Test
    void mediumDateFormatterWithDifferentYear() {
        OffsetDateTime dateTime = Main.getDateTime("2075-03-01T13:00:00Z");
        String result = Main.mediumDateFormatter(dateTime);
        assertEquals("1 mar 2075", result);

    }


}