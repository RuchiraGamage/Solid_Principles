package inheritance;

import java.util.Scanner;

/**
 * Created by Ruchira on 10/14/2020.
 */

enum MathOperation {
    ADD,
    SUBSTRACT,
    MULTIPLY,
    DEVIDE
}

public abstract class CalculateBase {
    public int leftVal;
    public int rightVal;

    public CalculateBase() {

    }

    public CalculateBase(int first, int second) {
        leftVal = first;
        rightVal = second;
    }

    public int getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(int leftVal) {
        this.leftVal = leftVal;
    }

    public int getRightVal() {
        return rightVal;
    }

    public void setRightVal(int rightVal) {
        this.rightVal = rightVal;
    }

    public abstract float calculate();
}

class Adder extends CalculateBase {

    Adder(int left, int right) {
        super(left, right);
    }

    @Override
    public float calculate() {
        return leftVal + rightVal;
    }
}

class MathOperationFactory {
    public static void getMAthOperationObject(MathOperation operation, int left, int right) {
        switch (operation) {
            case ADD:
                //return new Adder(left, right);
                break;
            case DEVIDE:
                break;
            case MULTIPLY:
                break;
            case SUBSTRACT:
                break;
            default:
                break;
        }
    }

    public static String[] executeInteractively() {
        System.out.println("Enter operation type and both inputs : ");
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        String[] values = line.split(" ");
        return values;
    }

    public static CalculateBase executeOperation() {
        CalculateBase calculateBase = null;
        String[] values = executeInteractively();
        getMAthOperationObject(MathOperation.valueOf(values[0].toUpperCase()),
                Integer.parseInt(values[1]),
                Integer.parseInt(values[2]));
        return calculateBase;
    }
}

//enum can be classes

enum FlightCrewMember {
    //these are the instances of enum
    PILOT("head"),
    COPILOT("second officer"),
    ATTENDANT("helper");

    private String title;

    public String getTitle() {
        return title.isEmpty() ? "member" : title;
    }

    FlightCrewMember(String title) {
        this.title = title;
    }
}