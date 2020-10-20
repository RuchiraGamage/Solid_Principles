package nestedClasses;

/**
 * Created by Ruchira on 10/15/2020.
 */
public class Outer {

    public static class Inner {
        private int level;
        private int age;
    }

    public Inner inner = new Inner();

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner platinum = new Outer.Inner();
        platinum.age = 10;
        platinum.level = 3;
        if (outer.inner.level == platinum.level) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}

class X{
    public static void tryToAccessOtherClassesInnerClass(){
        Outer test=new Outer();
        //test.inner.level;  can not access as they are private
    }
}

/*
* non static nested classes are "Inner" classes, static nested classes are "nested" classes
* */


