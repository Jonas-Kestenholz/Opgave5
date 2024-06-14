import java.time.LocalDate;

class Flower extends Plant {
    // Farve på blomsten
    private String color;

    // Konstruktør der initialiserer arvede egenskaber og blomstens farve
    public Flower(String species, LocalDate datePlanted, String color) {
        super(species, datePlanted);
        this.color = color;
    }

    // Metode til at returnere blomstens farve
    public String getColor() {
        return color;
    }

    // Overskriver toString() for at give en strengrepræsentation af blomsten
    @Override
    public String toString() {
        return "Flower{" +
                "species='" + species + '\'' +
                ", datePlanted=" + datePlanted +
                ", color='" + color + '\'' +
                '}';
    }
}