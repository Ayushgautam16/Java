class Calc {
    public int add(int a, int b) {
        return a + b;  // Fixed: Returning sum instead of printing
    }
}

class AdvCalc extends Calc {
    public int add(int a, int b) {
        return a + b + 2;
    }
}

class A {
    public void show() {
        System.out.println("This is from A");
    }
    
    public void config() {
        System.out.println("Configuration of A");
    }
}

class B extends A {
    public void show() {  // Uncommented and fixed method overriding
        System.out.println("This is from B");
    }

    public void show1() {
        System.out.println("This is from B - show1");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // Uncommented and fixed object creation
        B objB = new B();
        objB.show();    // Output: This is from B
        objB.config();  // Output: Configuration of A
        objB.show1();   // Output: This is from B - show1

        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(3, 4);
        System.out.println(r1); // Output: 9
    }
}
