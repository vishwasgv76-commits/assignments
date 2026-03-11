final class TestClass {
    final int x = 10;

    final void display() {
        System.out.println("Final method called");
    }
}

 class Main5 {
    public static void main(String[] args) {
        TestClass t = new TestClass();
        System.out.println("Final variable value: " + t.x);
        t.display();
    }
}
