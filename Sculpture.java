public class Sculpture extends Exhibit {
    String material;
    String author;
    int year;

    public Sculpture(int lastMaintenanceDate, String name, String description, String material, String author, int year) {
        super(lastMaintenanceDate, name, description);
        this.material = material;
        this.author = author;
        this.year = year;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Type: Sculpture");

    }
}
