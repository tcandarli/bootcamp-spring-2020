package d2_ClassesAndObjects;

import java.util.jar.JarOutputStream;

public class Overloading {

    public static void main(String[] args) {
        new Overloading(7,4);
    }
    public Overloading() {
        System.out.println("no param");
    }

    public Overloading(int a) {
        System.out.println(a);
    }

    public Overloading (int a, int b) {
        this(a);
        System.out.println(b);
    }
}
