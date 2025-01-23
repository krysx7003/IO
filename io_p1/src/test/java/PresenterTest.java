import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import io.projekt.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class PresenterTest {

    DataUpdater dataUpdater;
    User currentUser;
    Route route;
    Presenter presenter;

    @BeforeEach
    void setUp(){
        dataUpdater = mock(DataUpdater.class);
        currentUser = mock(User.class);
        route = mock(Route.class);
        presenter = mock(Presenter.class);
    }

    @ParameterizedTest
    @CsvSource({
            "add, 1, 2, 1, 2",
            "delete, 2, 3, 2, 3",
            "change, 4, 5, 4, 5"
    })
    void testEditRouteAsITEmployee(String operation, int lineID, int routeID,int expectedLineID, int expectedRouteID){
        when(currentUser.getRole()).thenReturn(Role.ITemployee);
        String data = operation + "," + lineID + "," + routeID;

        presenter.editRoute(data);

        if (operation.equals("delete")) {
            verify(dataUpdater).deleteRoute(expectedRouteID, expectedLineID);
        } else if (operation.equals("add")) {
            verify(dataUpdater).addRoute(route, expectedLineID);
        } else if (operation.equals("change")) {
            verify(dataUpdater).updateRoute(route, expectedRouteID, expectedLineID);
        }
    }
    @Test
    void testEditRouteAsNonITEmployee(){
        when(currentUser.getRole()).thenReturn(Role.Driver);
        presenter.editRoute("add,1,2,routeData");

        verify(dataUpdater, never()).addRoute(any(), anyInt());
        verify(dataUpdater, never()).deleteRoute(anyInt(), anyInt());
        verify(dataUpdater, never()).updateRoute(any(), anyInt(), anyInt());
    }

    @Test
    void testEditRouteWithInvalidData() {
        // Setup: ustawiamy rolę na ITemployee
        when(currentUser.getRole()).thenReturn(Role.ITemployee);

        // When: próba wywołania metody editRoute z niekompletnymi danymi
        presenter.editRoute("add,1");  // Brakuje danych o trasie (routeData)

        // Verify: żadna metoda z dataUpdater nie powinna zostać wywołana
        verify(dataUpdater, never()).addRoute(any(), anyInt());
        verify(dataUpdater, never()).deleteRoute(anyInt(), anyInt());
        verify(dataUpdater, never()).updateRoute(any(), anyInt(), anyInt());
    }
}
