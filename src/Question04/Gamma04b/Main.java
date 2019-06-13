package Question04.Gamma04b;

public class Main extends Thread {
    public static void main(String[] args) {

        Main object = new Main();
        ThreadOne t1 = new ThreadOne(object, "Thread-1");
        ThreadTwo t2 = new ThreadTwo(object, "Thread-2");

        t1.start();
        t2.start();
    }
}


class ThreadOne extends Thread {
    private Main obj;

    ThreadOne(Main object, String name) {
        super(object, name);
        this.obj = object;
    }

    @Override
    public void run() {
        synchronized (obj) {
            try {
                System.out.println("Started " + Thread.currentThread().getName() + " wait()");
                obj.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}

class ThreadTwo extends Thread {
    private Main obj;

    ThreadTwo(Main object, String name) {
        super(object, name);
        this.obj = object;
    }

    @Override
    public void run() {
        synchronized (obj) {
            System.out.println("Started " + Thread.currentThread().getName() + " notify()");
            obj.notify();
        }
    }
}
