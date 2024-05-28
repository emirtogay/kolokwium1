public class Main {
    public static void main(String[] args) {
        Exhibit exhibit = new Exhibit(20230528, "General Exhibit", "This is a general exhibit.");
        Sculpture sculpture = new Sculpture(20230528, "The Thinker", "A famous sculpture by Auguste Rodin", "Bronze", "Auguste Rodin", 1904);
        Artefact artefact = new Artefact(20230528, "Ancient Vase", "A vase from the Ming Dynasty", "Porcelain", 1400);
        Painting painting = new Painting(2002, "Mona lisa", "asd", "roman", "Leonardo da Vinci", 1600);

        System.out.println("Exhibit Info:");
        exhibit.showInfo();
        System.out.println();

        System.out.println("Sculpture Info:");
        sculpture.showInfo();
        System.out.println();

        System.out.println("Artefact Info:");
        artefact.showInfo();
        System.out.println();

        System.out.println("Painting Info:");
        painting.showInfo();
        System.out.println();

        // Creating a museum instance
        Museum museum = new Museum("123 Museum St", "National Museum");

        // Adding exhibits to the museum
        museum.addExhibit(exhibit);
        museum.removeExhibit(exhibit);

        museum.showLastMaintenanceDate(exhibit);

        // Displaying museum information
        museum.showInfo();
    }


    //Zmienna klasowa (inaczej zmienna statyczna) to zmienna, która jest współdzielona przez wszystkie instancje klasy. Jest zadeklarowana z użyciem słowa kluczowego static.
}   //exhibitCount jest zmienną klasową, ponieważ jest zadeklarowana jako static i jest wspólna dla wszystkich obiektów typu Exhibit.
    //Dziedziczenie to mechanizm w programowaniu obiektowym, który pozwala jednej klasie (klasie pochodnej) przejąć właściwości i metody innej klasy (klasy bazowej).
    //Sculpture dziedziczy właściwości i metody z klasy Exhibit, co oznacza, że może korzystać z jej funkcji oraz dodawać własne.