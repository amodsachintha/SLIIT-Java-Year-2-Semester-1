package Question03.Gamma03b;

public class SoftwarePackageClose implements Command {
    private SoftwarePackage type;

    public SoftwarePackageClose(SoftwarePackage type) {
        this.type = type;
    }

    @Override
    public void execute() {
        this.type.close();
    }
}