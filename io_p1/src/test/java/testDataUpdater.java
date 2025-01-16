import org.junit.jupiter.api.Test;

import io.projekt.DataUpdater;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

public class testDataUpdater {

    private DataUpdater dataUpdater;
    @BeforeEach
    public void setUp() {
        dataUpdater = new DataUpdater();
    }
    @Test
    public void testAddRoute(){
        int res = dataUpdater.addRoute(null, 0);
        assertEquals(1,res);
    }
    @Test
    public void deleteRoute(){

    }
    @Test void updateReport(){



    }
}