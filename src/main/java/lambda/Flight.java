package lambda;

/**
 * Created by Ruchira on 10/16/2020.
 */
public class Flight {
    private String fromDestination;
    private String toDestination;
    private String date;
    private int numOfPassengers;

    Flight(String fromDestination, String toDestination, String date, int numOfPassengers) {
        this.fromDestination = fromDestination;
        this.toDestination = toDestination;
        this.date = date;
        this.numOfPassengers = numOfPassengers;
    }

    public String getFromDestination() {
        return fromDestination;
    }

    public void setFromDestination(String fromDestination) {
        this.fromDestination = fromDestination;
    }

    public String getToDestination() {
        return toDestination;
    }

    public void setToDestination(String toDestination) {
        this.toDestination = toDestination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }
}
