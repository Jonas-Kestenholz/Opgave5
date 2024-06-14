import java.time.LocalDate;

// Grundlæggende Plant-klasse
abstract class Plant {
    // Art af planten
    protected String species;
    // Dato, planten blev plantet
    protected LocalDate datePlanted;

    // Konstruktør der initialiserer art og plantningsdato
    public Plant(String species, LocalDate datePlanted) {
        this.species = species;
        this.datePlanted = datePlanted;
    }

    // Metode til at returnere arten af planten
    public String getSpecies() {
        return species;
    }

    // Metode til at returnere plantningsdatoen
    public LocalDate getDatePlanted() {
        return datePlanted;
    }

    // Overskriver toString() for at give en strengrepræsentation af planten
    @Override
    public String toString() {
        return "Plant{" +
                "species='" + species + '\'' +
                ", datePlanted=" + datePlanted +
                '}';
    }
}