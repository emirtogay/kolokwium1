import java.util.ArrayList;

public class Museum {
    String address;
    String name;
    private ArrayList<Exhibit> exhibits = new ArrayList<>();

    public Museum(String address, String name) {
        this.address = address;
        this.name = name;
    }

    public void addExhibit(Exhibit ex) {
        if (exhibits.contains(ex)) {
            try {
                throw new Exception("Already Exists");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            exhibits.add(ex);
        }
    }

    public void removeExhibit(Exhibit ex) {
        if (!exhibits.contains(ex)) {
            try {
                throw new Exception("Doesn't Exist");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            exhibits.remove(ex);
        }
    }

    public void showLastMaintenanceDate(Exhibit ex) {
        if (exhibits.contains(ex)) {
            System.out.println("Last Maintenance Date of " + ex.name + ": " + ex.lastMaintenanceDate);
        } else {
            System.out.println("Exhibit not found in the museum.");
        }
    }

    public void showInfo() {
        System.out.println("Type: Museum");

        }
    }

