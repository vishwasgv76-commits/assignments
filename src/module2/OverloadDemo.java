package module2;

class OverloadDemo {
    void display(int a) {
        System.out.println("Integer: " + a);
    }
    void display(double b) {
        System.out.println("Double: " + b);
    }
    void display(String s) {
        System.out.println("String: " + s);
    }
    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();
        obj.display(10);
        obj.display(3.14);
        obj.display("Vishwas");
    }
}
