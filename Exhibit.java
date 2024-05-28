public class Exhibit {
    private static int exhibitCount = 1;

    String name;
    String idNumber;
    int lastMaintenanceDate;
    String description;

    public Exhibit(int lastMaintenanceDate, String name, String description){
        this.lastMaintenanceDate = lastMaintenanceDate;
        this.name = name;
        this.description = description;
        this.idNumber = "Exhibit#" + exhibitCount++;
    }

    public void showInfo(){
        System.out.println("Name of the Exhibit: " + name);

    }
}
