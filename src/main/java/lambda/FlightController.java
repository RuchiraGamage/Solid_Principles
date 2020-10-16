package lambda;

import java.util.List;

/**
 * Created by Ruchira on 10/16/2020.
 */
public class FlightController {
    public static void main(String[] args) throws IllegalAccessException {

        FlightSearchService searchService = new FlightSearchService(new FlightStoreImpl());

        List<Flight> availableFlights = searchService.getAvailableFlights(args[0],args[1],args[2],Integer.parseInt(args[3]));

        if (!availableFlights.isEmpty()) {
            for (Flight flight : availableFlights) {
                System.out.println(flight.getFromDestination() + " to " + flight.getToDestination() + " on " + flight.getDate());
            }
        }
    }
}
