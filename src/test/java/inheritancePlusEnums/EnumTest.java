package inheritancePlusEnums;

/**
 * Created by Ruchira on 10/13/2020.
 */
public class EnumTest {

    //use cases of enum is for comparisons

    public static void main(String[] args) {
        FlightCrew f1 = FlightCrew.COPILOT;
        FlightCrew f2 = FlightCrew.PILOT;

        if (f1 == FlightCrew.FLIGHT_ATTENDANT) ;
        //do something

        if (f1 == f2) ;
        //do something
    }

    public void displayResponsibilities(FlightCrew crewMember) {
        switch (crewMember) {
            case PILOT:
                //do something
            case COPILOT:
                //do something
            case FLIGHT_ATTENDANT:
                //do something
            default:
                //do something
        }

    }
}

enum FlightCrew {
    PILOT,
    COPILOT,
    FLIGHT_ATTENDANT
}
