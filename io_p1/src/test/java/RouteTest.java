import io.projekt.Route;

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
public class RouteTest {
    private Route route;
    private ArrayList<String> data;
    private RouteData routeData;
    @BeforeEach
    public void setUp() {
        route = new Route();
        data = new ArrayList<>();
        routeData = new RouteData();
    }
    @ParameterizedTest
    @CsvSource({
        "1,true,abc/1/2025-01-16T13:45:30,efg/2/2024-08-21T08:22:15,0",
        "2,true,efg/3/2023-12-10T18:35:50,abc/4/2026-03-05T23:10:05,1",
        "3,false,qwe/5/2022-07-30T05:55:45,rty/6/2027-09-12T14:40:20,2",
        "4,false,rty/7/2028-04-18T09:12:45,qwe/8/2021-11-25T20:30:10,3",
    })
    public void testParseRouteWithValidData(String busID,String isActive,String stop1,String stop2,int i) {
        data.add(busID);
        data.add(isActive);
        data.add(stop1);
        data.add(stop2);
        route.parseRoute(data);
        assertEquals(routeData.busIds.get(i),route.getBusID());
        assertEquals(routeData.isActives.get(i),route.getActive());
        assertEquals(routeData.busStops.get(i).get(0),route.getBusStop(0).getName());
        assertEquals(routeData.busStops.get(i).get(1),route.getBusStop(1).getName());
    }
    @ParameterizedTest
    @MethodSource("invalidDataProvider")
    public void testParseRouteWithInvalidData(String busID,String isActive,String stop1,String stop2) {
        data.add(busID);
        data.add(isActive);
        data.add(stop1);
        data.add(stop2);
        assertThrows(IllegalArgumentException.class, () -> route.parseRoute(data));
    }
    private static Stream<Arguments> invalidDataProvider() {
        return Stream.of(
            Arguments.of("-1","true","abc/1/2025-01-16T13:45:30","efg/2/2024-08-21T08:22:15"),
            Arguments.of("","true","qwe/5/2022-07-30T05:55:45","rty/6/2027-09-12T14:40:20"),
            Arguments.of("","true","rty/7/2028-04-18T09:12:45","qwe/8/2021-11-25T20:30:10"),
            Arguments.of("1","","rty/7/2028-04-18T09:12:45","qwe/8/2021-11-25T20:30:10")
        );
    }
    @Test
    public void testParseRouteWithIncompleteData() {
        ArrayList<String> data = new ArrayList<>();
        assertThrows(IndexOutOfBoundsException.class, () -> route.parseRoute(data));
    }
}
