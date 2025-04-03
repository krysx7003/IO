import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import io.projekt.BusStop;

public class BusStopTest {
    private BusStop busStop;
    private BusStopData busStopData;
    @BeforeEach
    public void setUp() {
        busStop = new BusStop();
        busStopData = new BusStopData();
    }
    @ParameterizedTest
    @CsvSource({
        "abc/1/2025-01-16T13:45:30,0",
        "efg/3/2023-12-10T18:35:50,1",
        "qwe/5/2022-07-30T05:55:45,2",
        "rty/7/2028-04-18T09:12:45,3"
    })
    public void testParseBusStopWithValidData(String data,int i) {
        busStop.parseBusStop(data);
        assertEquals(busStopData.names.get(i),busStop.getName());
        assertEquals(busStopData.localizations.get(i),busStop.getLocalization());
        assertEquals(busStopData.times.get(i),busStop.getArrivalTime());
    }
    @ParameterizedTest
    @MethodSource("invalidDataProvider")
    public void testParseBusStopWithInvalidData(String data) {
        assertThrows(IllegalArgumentException.class, () -> busStop.parseBusStop(data));
    }
    private static Stream<Arguments> invalidDataProvider() {
        return Stream.of(
            Arguments.of("abc//2025-01-16T13:45:30"),
            Arguments.of("efg/null/2023-12-10T18:35:50"),
            Arguments.of("/5/2022-07-30T05:55:45"),
            Arguments.of("7/2028-04-18T09:12:45")
        );
    }
    @Test
    public void testParseBusStopWithIncompleteData() {
        String data = "";
        assertThrows(IllegalArgumentException.class, () -> busStop.parseBusStop(data));
    }
}
