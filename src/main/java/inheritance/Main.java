package inheritance;

/**
 * Created by Ruchira on 10/12/2020.
 */
public class Main {
    public static void main(String[] args) {
        Super sup = new Super();
        System.out.println(sup.getX());

        Sub sub = new Sub();
        System.out.println(sub.getX());

        Super s = new Sub();
        System.out.println(s.getX());
    }
}
