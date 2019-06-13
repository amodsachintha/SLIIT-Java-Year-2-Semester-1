package Question04.Gamma04a;

public class MainAppThread {
    public static void main(String[] args) {
        CountDown countDown = new CountDown("CountDown-1");
        String[] cities = new String[10];
        cities[0] = "Galle";
        cities[1] = "Colombo";
        cities[2] = "Anuradhapura";
        cities[3] = "jaffna";
        cities[4] = "Kandy";
        cities[5] = "Matale";
        cities[6] = "Kegalle";
        cities[7] = "Malabe";
        cities[8] = "Kaduwela";
        cities[9] = "Matara";

        DisplayCities displayCities = new DisplayCities(cities);
        Thread rain = new Thread(displayCities, "Rain");
        Thread snow = new Thread(displayCities, "Snow");
        countDown.start();
        try {
            countDown.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            rain.start();
            snow.start();
        }

    }

}

class CountDown extends Thread {

    CountDown(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DisplayCities implements Runnable {
    private String[] cities;

    DisplayCities(String[] cities) {
        super();
        this.cities = cities;
    }

    @Override
    public void run() {
        for (String city : this.cities) {
            System.out.println(Thread.currentThread().getName() + ": " + city);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
