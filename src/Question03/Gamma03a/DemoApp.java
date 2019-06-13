package Question03.Gamma03a;

public class DemoApp {
    public static void main(String[] args) {

        DebitCardValidator debitCardValidator1 = DebitCardValidator.getInstance();
        DebitCardValidator debitCardValidator2 = DebitCardValidator.getInstance();

        System.out.println(debitCardValidator1.validateDebitCard(17));
        System.out.println(debitCardValidator2.validateDebitCard(348));

        if (debitCardValidator1 == debitCardValidator2)
            System.out.println("Both objects refer the same instance");
        else
            System.out.println("Objects are different");
    }
}


class DebitCardValidator {
    private static DebitCardValidator instance = null;

    static DebitCardValidator getInstance() {
        if (instance == null) {
            synchronized (DebitCardValidator.class) {
                instance = new DebitCardValidator();
            }
        }
        return instance;
    }

    boolean validateDebitCard(int pin) {
        return pin % 17 == 0;
    }

}
