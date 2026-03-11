class CheckedUncheckedDemo {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: Division by zero");
        }

        try {
            Class.forName("Test");
        } catch (ClassNotFoundException e) {
            System.out.println("Checked Exception: Class not found");
        }
    }
}
