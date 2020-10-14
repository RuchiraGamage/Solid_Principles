package inheritance;

/**
 * Created by Ruchira on 10/12/2020.
 */
public class Sub extends Super {
    int x = 12;

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }
}
