public class Artefact extends Exhibit {
    String material;
    int timePeriod;

    public Artefact(int lastMaintenanceDate, String name, String description, String material, int timePeriod) {
        super(lastMaintenanceDate, name, description);
        this.material = material;
        this.timePeriod = timePeriod;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Type: Artefact");

}
    }
