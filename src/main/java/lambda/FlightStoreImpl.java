package lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ruchira on 10/16/2020.
 */
public class FlightStoreImpl implements FlightStore {

    @Override
    public List<Flight> getAllFlights() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Galle", "Colombo", "15-10-2020", 50));
        flights.add(new Flight("Galle", "Matara", "15-10-2020", 20));
        flights.add(new Flight("Galle", "Negambo", "15-10-2020", 30));
        flights.add(new Flight("Galle", "Kandy", "15-10-2020", 10));

        return flights;
    }

}
