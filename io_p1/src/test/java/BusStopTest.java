import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.projekt.BusStop;

public class BusStopTest {
    private BusStop busStop;
    @BeforeEach
    public void setUp() {
        busStop = new BusStop();
    }
    @Test
    public void testParseBusStopWithValidData() {
          
    }
    @Test
    public void testParseBusStopWithInvalidData() {
          
    }
    @Test
    public void testParseBusStopWithIncompleteData() {
        String data = "";
        assertThrows(IndexOutOfBoundsException.class, () -> busStop.parseBusStop(data));
    }
}
