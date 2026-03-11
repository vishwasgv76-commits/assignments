public class Main7 {

    public static void main(String[] args) {

        Main7 obj1 = new Main7();
        Main7 obj2 = new Main7();

        obj1 = null;
        obj2 = null;

        System.gc();

        System.out.println("Garbage Collection Requested");
    }
}