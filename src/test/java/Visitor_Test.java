import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

public class Visitor_Test {
    Visitor visitor =  new Visitor("Lufuno Madima","Rabe Denga", "Excellent",  LocalDate.now(), LocalTime.now(),18 );
    @Test
    void fileError() {
        Exception exception = assertThrows(Exception.class, () -> {
            visitor.load("no file");
        });
        String actualMessage = exception.getMessage();
        assertFalse(actualMessage.contains("Error when writing the file"));
    }
}
