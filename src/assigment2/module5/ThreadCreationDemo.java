class ThreadExample extends Thread {
    public void run() {
        System.out.println("Thread using Thread class");
    }
}

class RunnableExample implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable interface");
    }
}

class ThreadCreationDemo {
    public static void main(String[] args) {

        ThreadExample t1 = new ThreadExample();
        t1.start();

        Thread t2 = new Thread(new RunnableExample());
        t2.start();
    }
}
