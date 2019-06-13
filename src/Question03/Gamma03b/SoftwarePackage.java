package Question03.Gamma03b;

class SoftwarePackage {

    private String name;

    SoftwarePackage(String name) {
        this.name = name;
    }

    void open() {
        System.out.println("Inside " + this.getClass().getSimpleName() + "(" + this.name + "): open()");
    }

    void close() {
        System.out.println("Inside " + this.getClass().getSimpleName() + "(" + this.name + "): close()");
    }
}
