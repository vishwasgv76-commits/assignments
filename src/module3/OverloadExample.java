package module3;

class OverloadExample {
    void show(int a) {
        System.out.println("Integer: " + a);
    }
    void show(String s) {
        System.out.println("String: " + s);
    }
}

class OverrideBase {
    void display() {
        System.out.println("Base class display");
    }
}

class OverrideDerived extends OverrideBase {
    void display() {
        System.out.println("Derived class display");
    }

    public static void main(String[] args) {
        OverloadExample o = new OverloadExample();
        o.show(10);
        o.show("Hello");

        OverrideBase b = new OverrideDerived();
        b.display();
    }
}
