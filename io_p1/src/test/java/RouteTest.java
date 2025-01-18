import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import io.projekt.Route;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
public class RouteTest {
    private Route route;
    @BeforeEach
    public void setUp() {
        route = new Route();
    }
    @ParameterizedTest
    @CsvSource({
        "1","true","","",
        "2","true","","",
        "3","false","","",
        "4","false","","",
    })
    public void testParseRouteWithValidData(int busID,boolean isActive,String stop1,String stop2) {
          
    }
    @ParameterizedTest
    @MethodSource("invalidDataProvider")
    public void testParseRouteWithInvalidData(int busID,boolean isActive,String stop1,String stop2) {
          
    }
    private static Stream<Arguments> invalidDataProvider() {
        return Stream.of(
            Arguments.of(-1,true,"",""),
            Arguments.of(1,null,"",""),
            Arguments.of(null,true,"",""),
            Arguments.of(null,true,"",""),
            Arguments.of(1,null,"","")
        );
    }
    @Test
    public void testParseRouteWithIncompleteData() {
        ArrayList<String> data = new ArrayList<>();
        assertThrows(IndexOutOfBoundsException.class, () -> route.parseRoute(data));
    }
}
