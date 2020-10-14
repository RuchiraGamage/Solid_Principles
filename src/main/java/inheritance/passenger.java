package inheritance;

/**
 * Created by Ruchira on 10/14/2020.
 */
public class passenger implements Comparable {
    public int level;
    public int customerPeriod;

    passenger(int level, int customerPeriod) {
        this.level = level;
        this.customerPeriod = customerPeriod;
    }

    @Override
    public int compareTo(Object o) throws ClassCastException {
        passenger passenger;
        if (o instanceof passenger) {
            passenger = (passenger) o;
        } else {
            throw new ClassCastException();
        }

        if (this.level > passenger.level) {
            return 1;
        } else if (this.level == passenger.level) {
            if (this.customerPeriod > passenger.customerPeriod) {
                return 1;
            } else if (this.customerPeriod == passenger.customerPeriod) {
                return 0;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}

//generics are more powerful and uses for strongly typed implementations
//above class with generics

class Passenger implements Comparable<Passenger> {
    public int level;
    public int customerPeriod;

    Passenger(int level, int customerPeriod) {
        this.level = level;
        this.customerPeriod = customerPeriod;
    }

    @Override
    public int compareTo(Passenger p) {
        return 0;
    }
}

//or more generalize implementation

class Person implements Comparable<T> {
    public int level;
    public int customerPeriod;

    Person(int level, int customerPeriod) {
        this.level = level;
        this.customerPeriod = customerPeriod;
    }

    @Override
    public int compareTo(T t) {
        return 0;
    }
}

class T {
}


