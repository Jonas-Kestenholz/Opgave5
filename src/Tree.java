import java.time.LocalDate;

class Tree extends Plant {
    // Højde på træet
    protected float height;

    // Konstruktør der initialiserer arvede egenskaber og træets højde
    public Tree(String species, LocalDate datePlanted, float height) {
        super(species, datePlanted);
        this.height = height;
    }

    // Metode til at returnere træets højde
    public float getHeight() {
        return height;
    }

    // Overskriver toString() for at give en strengrepræsentation af træet
    @Override
    public String toString() {
        return "Tree{" +
                "species='" + species + '\'' +
                ", datePlanted=" + datePlanted +
                ", height=" + height +
                '}';
    }
}