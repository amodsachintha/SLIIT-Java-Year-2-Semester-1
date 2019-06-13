package Question03.Gamma03b;

public class SoftwarePackage {

    private String name;

    public SoftwarePackage(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println("Inside " + this.getClass().getSimpleName() + "(" + this.name + "): open()");
    }

    public void close() {
        System.out.println("Inside " + this.getClass().getSimpleName() + "(" + this.name + "): close()");
    }
}
