//package inheritance;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//
///**
// * Created by Ruchira on 10/15/2020.
// */
//public class CmparableAndIterator implements Comparable<CmparableAndIterator>, Iterable<Passenger> {
//
//    int flag = 10;
//    private ArrayList<Passenger> passengers = new ArrayList<>();
//
//    @Override
//    public int compareTo(CmparableAndIterator o) {
//        int result = 0;
//        if (this.flag > o.flag) {
//            result = 1;
//        } else if (this.flag == o.flag) {
//            result = 0;
//        } else {
//            result = -1;
//        }
//        return result;
//    }
//
//    @Override
//    public Iterator<Passenger> iterator() {
//        return passengers.iterator();
//    }
//
//    public static void main(String[] args) {
//        CmparableAndIterator obj = new CmparableAndIterator();
//        obj.passengers.add(new Passenger(1, 3));
//        obj.passengers.add(new Passenger(1, 2));
//        obj.passengers.add(new Passenger(1, 5));
//
//        for (Passenger p : obj) {
//            System.out.println(p.level);
//        }
//    }
//}
//
////if we implement interface and add new methods later the earlier classes which implementations that interface
////will be broke
//
////so we can give default implementation for those methods
//
//interface Passengerr {
//    String SEPERATOR = " ";
//
//    public void getMaxLagage();
//
//    default int newMethod() {
//        //give default implementation because other classes may break otherwise
//        return 0;
//    }
//
//}
//
