abstract class B {
    int b;

    B() {
        b = 5;
    }

    abstract void display();
}

class C extends B {
    C() {
        super();
    }

    void display() {
        System.out.println("b = " + b);
    }
}

public class A {
    public static void main(String[] args) {
        C c = new C();
        c.display();
    }
}
