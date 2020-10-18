package lambda;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by Ruchira on 10/16/2020.
 */
public class FlightSearchService {
    private final FlightStore flightStore;

    public FlightSearchService(FlightStore flightStore) {
        this.flightStore = flightStore;
    }

    public List<Flight> getAvailableFlights(String from, String to, String date, int noOfPassengers) throws IllegalAccessException {

        if (from == null || to == null || date == null) {
            String msg = String.format("the values are : from = %s ,to = %s, date = %s ");
            throw new IllegalArgumentException(msg);
        }

        if (from.equalsIgnoreCase(to)) {
            throw new IllegalArgumentException("starting and destination can not be same");
        }

        if (noOfPassengers < 1 || noOfPassengers > 50) {
            throw new IllegalAccessException("invalid number of passengers");
        }

        return flightStore.getAllFlights().stream()
                .filter(flight -> flight.getFromDestination().equals(from))
//                .filter(flight -> flight.getToDestination().equals(to))
//                .filter(flight -> flight.getNumOfPassengers() >= noOfPassengers)
                .collect(toList());
    }
}
