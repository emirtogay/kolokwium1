public class Painting extends Exhibit {
    String style;
    String author;
    int year;

    public Painting(int lastMaintenanceDate, String name, String description, String style, String author, int year) {
        super(lastMaintenanceDate, name, description);
        this.style = style;
        this.author = author;
        this.year = year;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Type: Painting");

    }
}
