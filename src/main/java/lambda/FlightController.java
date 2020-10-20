package lambda;

import com.google.common.base.Preconditions;
import jdk.nashorn.internal.objects.NativeUint8Array;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.Objects.compare;
import static java.util.Objects.requireNonNull;

/**
 * Created by Ruchira on 10/16/2020.
 */
public class FlightController {
    public static void main(String[] args) throws IllegalAccessException, NullPointerException {

        FlightSearchService searchService = new FlightSearchService(new FlightStoreImpl());

        List<Flight> availableFlights = searchService.getAvailableFlights(args[0], args[1], args[2], Integer.parseInt(args[3]));

        if (!availableFlights.isEmpty()) {
            for (Flight flight : availableFlights) {
                System.out.println(flight.getFromDestination() + " to " + flight.getToDestination() + " on " + flight.getDate());
            }
        }

        //we can use google "Guava" library for validation check
        Preconditions.checkNotNull(searchService);

        tryToGetEarliestFlight();

    }

    private static void tryToGetEarliestFlight() throws IllegalAccessException {

        FlightSearchService searchService = new FlightSearchService(new FlightStoreImpl());

        List<Flight> availableFlights = searchService.getAvailableFlights("Galle", "Colombo", "15-10-2020", 20);

        Optional<Flight> flights = availableFlights.stream().
                filter(flight -> flight.getFromDestination().equalsIgnoreCase("galle")).
                min(Comparator.comparing(Flight::getDate));

//        flights.ifPresentOrElse(x -> System.out.println(flights),
//                () -> System.out.println("no any flights found"));

        flights.orElseThrow(NullPointerException::new);//caller should handle this

    }
}
