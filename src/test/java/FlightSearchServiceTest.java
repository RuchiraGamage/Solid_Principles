import lambda.Flight;
import lambda.FlightSearchService;
import lambda.FlightStoreImpl;
import org.junit.Test;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;


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
        List<Flight> flightList = flightSearchService.getAvailableFlights("Galle", "Colombo", "15-10-2020", 5);

        flightList.stream().map(Flight::getFromDestination).collect(toList());

        assertEquals(4,flightList.size());
    }

}
