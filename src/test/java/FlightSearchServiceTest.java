import lambda.FlightSearchService;
import lambda.FlightStoreImpl;
import org.junit.Test;

/**
 * Created by Ruchira on 10/16/2020.
 */
public class FlightSearchServiceTest {

    FlightSearchService flightSearchService;

    public FlightSearchServiceTest() {
        flightSearchService = new FlightSearchService(new FlightStoreImpl());
    }

    @Test
    public void testGetAvailableFlights() throws IllegalAccessException {
        flightSearchService.getAvailableFlights("Galle", "Colombo", "15-10-2020", 5);
    }

}
