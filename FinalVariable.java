package finaldemo;

public class FinalVariable {

    // final instance variable must be initialized
    final int x = 100;

    // static final variable (initialized)
    static final int Y = 100;

    // instance method
    void change() {
        // x = 30; // ❌ final variable cannot be reassigned
        // Y = 200; // ❌ final static variable cannot be reassigned
    }

    // static block
    static {
        // Y = 20; // ❌ cannot reassign final static variable
        System.out.println("Value of Y: " + Y);
    }

    public static void main(String[] args) {
        FinalVariable obj = new FinalVariable();
        System.out.println("Value of x: " + obj.x);
    }
}