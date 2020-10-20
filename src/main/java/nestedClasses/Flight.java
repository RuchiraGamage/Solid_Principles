package nestedClasses;

import sun.security.krb5.internal.PAData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Ruchira on 10/15/2020.
 */
public class Flight implements Comparable<Flight>, Iterable<Passenger> {

    ArrayList<Passenger> passengers=new ArrayList<Passenger>();


    @Override
    public int compareTo(Flight o) {
        return 0;
    }

    @Override
    public Iterator<Passenger> iterator() {
        return passengers.iterator();
    }

    //suppose we need sorted arrayList as a iterator
    //we do this within inner class
    private class FlightIterator implements Iterable<Passenger>{

        @Override
        public Iterator<Passenger> iterator() {
            Passenger[] peoples=new Passenger[passengers.size()];
            passengers.toArray(peoples);
            Arrays.sort(peoples);
            return Arrays.asList(peoples).iterator();
        }
    }

    public Iterator<Passenger>  getSortedIterator(){
        FlightIterator orderedPassengers=new FlightIterator();
        return orderedPassengers.iterator();
    }
}


//if we only needed to use a class in one place we can use autonomous classes
class TestAnonemousClasses{
    ArrayList<Passenger> passengers=new ArrayList<Passenger>();

    public Iterable<Passenger> getSortedPassemgers(){
        return new Iterable<Passenger>(){

            @Override
            public Iterator<Passenger> iterator() {
                Passenger[] peoples=new Passenger[passengers.size()];
                passengers.toArray(peoples);
                Arrays.sort(peoples);
                return Arrays.asList(peoples).iterator();
            }
        };
    }
}