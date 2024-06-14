import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class FruitTree extends Tree {
    // Liste over udbytter for frugttræet
    private List<Float> yields;

    // Konstruktør der initialiserer arvede egenskaber og en tom liste over udbytter
    public FruitTree(String species, LocalDate datePlanted, float height) {
        super(species, datePlanted, height);
        this.yields = new ArrayList<>();
    }

    // Metode til at registrere et nyt udbytte
    public void registerYield(float yield) {
        this.yields.add(yield);
    }

    // Metode til at beregne og returnere det gennemsnitlige udbytte
    public float getAverageYield() {
        float sum = 0;
        for (float yield : yields) {
            sum += yield;
        }
        return yields.isEmpty() ? 0 : sum / yields.size();
    }

    // Overskriver toString() for at give en strengrepræsentation af frugttræet
    @Override
    public String toString() {
        return "FruitTree{" +
                "species='" + species + '\'' +
                ", datePlanted=" + datePlanted +
                ", height=" + height +
                ", yields=" + yields +
                '}';
    }
}