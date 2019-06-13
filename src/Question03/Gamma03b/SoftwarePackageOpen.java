package Question03.Gamma03b;

public class SoftwarePackageOpen implements Command{
    private SoftwarePackage type;

    public SoftwarePackageOpen(SoftwarePackage type) {
        this.type = type;
    }

    @Override
    public void execute() {
        this.type.open();
    }
}
