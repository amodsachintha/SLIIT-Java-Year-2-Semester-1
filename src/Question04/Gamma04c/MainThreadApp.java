package Question04.Gamma04c;

public class MainThreadApp {

    public static void main(String[] args) {
        Calculation calculation = new Calculation();

        ParallelThread p1 = new ParallelThread(calculation, 0, 1, 4);
        ParallelThread p2 = new ParallelThread(calculation, 0, 5, 8);

        p1.start();
        p2.start();

        try {
            p1.join();
            p2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(calculation.getSum());
    }

}

class ParallelThread extends Thread {
    private final Calculation calculation;
    private int no;
    private int start;
    private int end;

    ParallelThread(Calculation type, int no, int start, int end) {
        super();
        this.calculation = type;
        this.no = no;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        synchronized (calculation) {
            calculation.computePowerProduct(this.no, this.start, this.end);
        }


    }
}


class Calculation {
    private double powerProduct;
    private static double sum = 0;

    double getSum() {
        return sum;
    }

    void computePowerProduct(int exp, int start, int end) {
        for (int i = start; i <= end; i++) {
            this.powerProduct += pow(i, exp);
        }
        sum += this.powerProduct;
    }

    private double pow(int a, int b) {
        if (b == 0) return 1;
        if (b == 1) return a;
        if (isEven(b))
            return pow(a * a, b / 2);
        else
            return a * pow(a * a, b / 2);
    }

    private boolean isEven(int val) {
        return val % 2 == 0;
    }

}
